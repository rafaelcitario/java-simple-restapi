package com.rafaelcitario.javasimplerestapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class LivroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}