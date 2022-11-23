package br.univille.mydashboard.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.mydashboard.dto.AllowlistDTO;
import br.univille.mydashboard.service.AllowlistService;



@RestController
@RequestMapping("/api/v1/Allowlists")
public class AllowlistControllerAPI {
    @Autowired
    private AllowlistService service;
    @GetMapping
    public ResponseEntity<List<AllowlistDTO>> getAll(){
        var listaAllowlist = service.getAll();
        return new ResponseEntity<>(listaAllowlist,HttpStatus.OK);
    }
}
