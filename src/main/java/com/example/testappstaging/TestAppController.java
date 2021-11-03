package com.example.testappstaging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAppController {

    @GetMapping("/home")
    public String getHome(){
        return "This is staging website";
    }
}
