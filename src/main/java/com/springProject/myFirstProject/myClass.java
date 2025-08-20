package com.springProject.myFirstProject;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class myClass {
    @GetMapping("/")
    public Map<String, String> sayHello(){
        // Spring will automatically convert this Map to a JSON object
        return Map.of("message", "chal raha hai", "status", "success");
    }

}
