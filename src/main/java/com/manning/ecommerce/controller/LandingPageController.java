package com.manning.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class LandingPageController {

    @GetMapping("/")
    public ModelAndView getLandingPage(Map<String, Object> model) {
        return new ModelAndView("index", model);
    }


}
