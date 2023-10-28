package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@RestController
public class Controller {

    Logger logger = LogManager.getLogManager().getLogger("");
    @GetMapping("/hello/{name}")
    String getMessage(@PathVariable("name") String name) {
        return name + " Welcome to Ashok IT ";
    }


}
