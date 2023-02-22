package fei.upce.cz.cv1_weboveAplikace.controller;

import fei.upce.cz.cv1_weboveAplikace.bodyRequest.SimpleBody;
import org.springframework.web.bind.annotation.*;

//Jedná se o pohodlnou anotaci, která kombinuje @Controller a @ResponseBody,
// což eliminuje potřebu anotovat každou metodu zpracování požadavků třídy kontroleru pomocí @ResponseBody anotace
@RestController
@RequestMapping("/api/v1")
public class HelloController {
    @GetMapping("")
    public String helloWorld() {
        return "Hello world from Spring Boot application.";
    }

    @GetMapping("/path/{message}")
    public String helloPathParams(@PathVariable String message) {
        return "Parameter in path: " + message;
    }

    @GetMapping("/query")
    public String helloQueryParams(@RequestParam String message) {
        return "Hello with query params: " + message;
    }

    @GetMapping("/body")
    public String helloRequestBody(@RequestBody SimpleBody body) {
        return "SimpleBody:  " + body.toString();
    }

}

