package com.rafaelcitario.javasimplerestapi.repositories;

import com.rafaelcitario.javasimplerestapi.entities.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

}
