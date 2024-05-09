package com.example.simpleapigradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jslim
 */
@RestController
public class TestController {

    @GetMapping
    String test(){
        return "hello world";
    }
}
