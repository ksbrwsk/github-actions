package de.ksbrwsk.gh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebFluxTest
class HelloWorldControllerTest {

    @Autowired
    WebTestClient webTestClient;

    @Test
    void index() {
        this.webTestClient
                .get()
                .uri("/index")
                .exchange()
                .expectStatus()
                .isOk()
                .expectBody(String.class)
                .value(msg -> assertEquals(msg, "Hello World!"));
    }
}