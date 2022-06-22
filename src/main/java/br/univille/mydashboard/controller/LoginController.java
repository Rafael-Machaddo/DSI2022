package br.univille.mydashboard.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"/login"})
public class LoginController {

    @GetMapping()
    public ModelAndView form(Map<String, ?> login){
        return new ModelAndView("login/form",login);
    }
}
