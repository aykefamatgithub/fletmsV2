package com.aykefam.fletms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @RequestMapping("/index")
    public String home(){
        return "index";
    }
}
