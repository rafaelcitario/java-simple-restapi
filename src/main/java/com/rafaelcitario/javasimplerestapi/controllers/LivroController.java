package com.rafaelcitario.javasimplerestapi.controllers;

import com.rafaelcitario.javasimplerestapi.entities.LivrosEntity;
import com.rafaelcitario.javasimplerestapi.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/livros")
public class LivroController {
    @Autowired
    LivroService livroService;

    @PostMapping(value = "/")
    public List<LivrosEntity> create(@RequestBody LivrosEntity livro) {
        return this.livroService.create(livro);
    }

    @GetMapping(value = "/")
    public List<LivrosEntity> list() {
        return this.livroService.listAll();
    }


    @PutMapping(value = "/{id}")
    public List<LivrosEntity> update(@PathVariable("id") long id, @RequestBody LivrosEntity livro) {
        return this.livroService.update(id, livro);
    }

    @DeleteMapping(value = "/{id}")
    public List<LivrosEntity> delete(@PathVariable("id") long id) {
        return this.livroService.delete(id);
    }

    @GetMapping("/{id}")
    public Optional<LivrosEntity> findSpecificBook(@PathVariable("id") long id) {
        return this.livroService.findSpecificBook(id);
    }
}
