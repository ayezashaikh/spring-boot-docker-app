package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello/{name}")
    String getMessage(@PathVariable("name") String name) {
        return name + "welcome to Ashok it";
    }


}
