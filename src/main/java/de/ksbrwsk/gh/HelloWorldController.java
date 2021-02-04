package de.ksbrwsk.gh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloWorldController {

    @GetMapping({"", "/index"})
    Mono<String>  helloWorld() {
        return Mono.just("Hello World!");
    }
}
