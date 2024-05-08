package co.edu.sena.security_app_2902093.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")

public class TestAuthController {

    @GetMapping("/hello")
    public String hello(){
        return  "Hello, Spring";
    }
    @GetMapping("/hello-secured")
    public String helloSecured(){
        return  "Hello, Spring Secured";
    }
}
