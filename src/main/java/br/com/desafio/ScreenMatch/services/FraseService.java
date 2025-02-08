package br.com.desafio.ScreenMatch.services;

import br.com.desafio.ScreenMatch.dto.FraseDTO;
import br.com.desafio.ScreenMatch.repositories.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {

    @Autowired
    FraseRepository repository;

    public FraseDTO find(){
        return repository.findB
    }

    public List<FraseDTO> findAll(){
        return repository.findAll().stream()
                .map(FraseDTO::new).collect(Collectors.toList());
    }


}
