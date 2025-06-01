package com.newapk.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMessage {
    @GetMapping("/message")
    public String GetMessage(){
        return "My name is Mahendra";
    }
}
