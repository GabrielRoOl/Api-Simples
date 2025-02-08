package br.com.desafio.ScreenMatch.controllers;

import br.com.desafio.ScreenMatch.dto.FraseDTO;
import br.com.desafio.ScreenMatch.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    FraseService service;

    @GetMapping(value = "/series/frases")
    public FraseDTO findById(){
        return service.findById();
    }

}
