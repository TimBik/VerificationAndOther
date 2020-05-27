package ru.itis.jlab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.jlab.dto.SignUpDto;
import ru.itis.jlab.services.SignService.SignUpService;

import javax.validation.Valid;

@Controller
public class SignUpController {
    @Autowired
    private SignUpService signUpService;

    //    @PreAuthorize("permitAll()")
    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public ModelAndView signUp(Authentication authentication) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("signUp");
        modelAndView.addObject("signUpDto", new SignUpDto());
        return modelAndView;
    }


    //    @PreAuthorize("permitAll()")
    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public ModelAndView signUp(@Valid SignUpDto signUpDto, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        if(!bindingResult.hasErrors()) {
            signUpService.loadUserFromParameters(signUpDto);
            modelAndView.setViewName("redirect:/signIn");
        }else {
            modelAndView.addObject("signUpDto",signUpDto);
            modelAndView.setViewName("signUp");
        }
        return modelAndView;
    }
}
