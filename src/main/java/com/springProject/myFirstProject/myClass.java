package com.springProject.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class myClass {
    @GetMapping("abc")
    public String sayHello(){
        return "chal raha hai";
    }

}
