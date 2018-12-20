package com.eric.ex1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExController {
    @RequestMapping("/")
    public String gretter(){
        return "Hello Ex1";
    }

    @RequestMapping("/gohome")
    public String bye(){
        return "bye bey";
    }
}
