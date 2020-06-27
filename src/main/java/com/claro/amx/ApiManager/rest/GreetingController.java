package com.claro.amx.ApiManager.rest;

import com.claro.amx.ApiManager.pojo.Greeting;
import com.claro.amx.ApiManager.pojo.PojoHolaMundo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name + "new release"));
    }

    @GetMapping("/test")
    public PojoHolaMundo test(@RequestParam(value = "nombre", defaultValue = "World") String value) {
        return new PojoHolaMundo(value);
    }
}