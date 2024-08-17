package com.app.academia.controller;

import com.app.academia.model.dto.AvaliacaoFisicaForm;
import com.app.academia.model.entity.AvaliacaoFisica;
import com.app.academia.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private IAvaliacaoFisicaService service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return service.getAll();
    }
}
