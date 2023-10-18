package com.rafaelcitario.javasimplerestapi.controllers;

import com.rafaelcitario.javasimplerestapi.entities.LivroEntity;
import com.rafaelcitario.javasimplerestapi.repositories.LivroRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class LivroController {

    @Autowired
    LivroRepository livroRepository;

    @PostMapping(path = "/add")
    private @NotNull LivroEntity creste(@Validated @RequestBody LivroEntity l) {
        return livroRepository.save(l);
    }

    @GetMapping(value = "/biblioteca")
    private @NotNull List<LivroEntity> read() {
        return livroRepository.findAll();
    }

}
