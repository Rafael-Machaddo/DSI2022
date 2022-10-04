package br.univille.mydashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.mydashboard.dto.AllowlistDTO;
import br.univille.mydashboard.service.AllowlistService;

@Controller
@RequestMapping("/allowlist")
public class AllowlistController {
    
    @Autowired
    private AllowlistService service;

    @GetMapping
    public ModelAndView index(){
        List<AllowlistDTO> listadeAL = service.getAll();
        return new ModelAndView("allowlist/index","listadeAL", listadeAL);
    }

    @GetMapping("/nova")
    public ModelAndView nova(){
        AllowlistDTO allowlist = new AllowlistDTO();
        return new ModelAndView("allowlist/form","allowlist",allowlist);
    }
    @PostMapping(params = "form")
    public ModelAndView save(AllowlistDTO allowlist){
        service.save(allowlist);
        return new ModelAndView("redirect:/home");
    }
}
