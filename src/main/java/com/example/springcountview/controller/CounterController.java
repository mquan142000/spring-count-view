package com.example.springcountview.controller;

import com.example.springcountview.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter")
public class CounterController {

    @ModelAttribute("counter")
    public Counter getCounter() {
        return new Counter(0);
    }

    @GetMapping
    public String get(@ModelAttribute("counter") Counter counter){
        counter.increment();
        return "/index";
    }
}
