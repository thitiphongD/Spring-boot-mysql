package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main(String[] args) {
        ApplicationContext context;
        context = SpringApplication.run(Initialize.class);
    }
}

@SpringBootApplication
class Initialize { }

@RestController
class Helloworld {
    @RequestMapping("/sayhello")
    String say() {
        return "Hello, world!";
    }
}