package fei.upce.cz.cv1_weboveAplikace.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Jedná se o pohodlnou anotaci, která kombinuje @Controller a @ResponseBody,
// což eliminuje potřebu anotovat každou metodu zpracování požadavků třídy kontroleru pomocí @ResponseBody anotace
@RestController
@RequestMapping("/api/v1")
public class HelloController {
}
