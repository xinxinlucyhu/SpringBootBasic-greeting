package com.xinxinhu.welcome.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController
{

    @Autowired
    private GreetingRepository greetingRepository;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model)
    {
        model.addAttribute("name", name);
        return "greeting";
    }

    @PostMapping("/form")
    public String addNewSubscriber(Greeting greeting, Model model)
    {
        greetingRepository.save(new Greeting(greeting.getFirstName(), greeting.getLastName(), greeting.getUserName(), greeting.getSignedUp()));
        model.addAttribute("firstName", greeting.getFirstName());
        model.addAttribute("lasttName", greeting.getFirstName());
        model.addAttribute("userName", greeting.getFirstName());

        return "form";
    }

}