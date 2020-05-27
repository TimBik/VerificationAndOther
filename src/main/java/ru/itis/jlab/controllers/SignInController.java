package ru.itis.jlab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SignInController {

    //    @PreAuthorize("permitAll()")
    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public ModelAndView signIn() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("signIn");
        return modelAndView;
    }

}
