package com.app.academia.controller;

import com.app.academia.model.entity.Aluno;
import com.app.academia.model.dto.AlunoForm;
import com.app.academia.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


import java.util.List;

@RestController
@RequestMapping("/v1/alunos")
public class AlunoController {

    @Autowired
    private IAlunoService service;

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Aluno> getAll(
            @RequestParam(value = "dataDeNascimento", required = false) String dataDeNacimento){
        return service.getAll(dataDeNacimento);
    }

    /*
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }




     */


}