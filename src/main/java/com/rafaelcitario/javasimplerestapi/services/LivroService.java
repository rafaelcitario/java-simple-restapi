package com.rafaelcitario.javasimplerestapi.services;

import com.rafaelcitario.javasimplerestapi.entities.LivrosEntity;
import com.rafaelcitario.javasimplerestapi.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    LivroRepository livroRepository;


    public List<LivrosEntity> create(LivrosEntity livro) {
        this.livroRepository.save(livro);
        return this.listAll();


    }

    public List<LivrosEntity> listAll() {
        Sort sort = Sort.by("title").ascending();
        return this.livroRepository.findAll(sort);

    }

    public List<LivrosEntity> update(long id, LivrosEntity livro) {
        if (this.livroRepository.existsById(id)) {
            this.livroRepository.save(livro);
        }

        return this.listAll();
    }

    public List<LivrosEntity> delete(long id) {
        this.livroRepository.deleteById(id);
        return this.listAll();
    }

    public Optional<LivrosEntity> findSpecificBook(long id) {
        return this.livroRepository.findById(id);
    }

}
