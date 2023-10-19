package com.rafaelcitario.javasimplerestapi.repositories;

import com.rafaelcitario.javasimplerestapi.entities.LivrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivrosEntity, Long> {
}
