package ch.maxant.demo.springboottests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = {"ch.maxant.demo.springboottests"})
public class Example {

    @Autowired
    SomeService someService;

    @RequestMapping("/")
    String doSomething() {
        return someService.doSomething("John");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}