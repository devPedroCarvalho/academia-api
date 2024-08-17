package com.app.academia.controller;


import com.app.academia.model.dto.MatriculaForm;
import com.app.academia.model.entity.Matricula;
import com.app.academia.service.IMatriculaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/matriculas")
public class MatriculaController {

    @Autowired
    private IMatriculaService service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
        return service.getAll(bairro);
    }

}
