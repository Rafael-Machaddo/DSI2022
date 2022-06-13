package br.univille.mydashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.mydashboard.dto.UsuarioDTO;
import br.univille.mydashboard.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;

    @GetMapping
    public ModelAndView index(){
        List<UsuarioDTO> listaUsuarios = service.getAll();
        return new ModelAndView("usuario/index","listaUsuarios", listaUsuarios);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        UsuarioDTO usuario = new UsuarioDTO();
        return new ModelAndView("usuario/form","usuario",usuario);
    }
    @PostMapping(params = "form")
    public ModelAndView save(UsuarioDTO usuario){
        service.save(usuario);
        return new ModelAndView("redirect:/usuario");
    }
}
