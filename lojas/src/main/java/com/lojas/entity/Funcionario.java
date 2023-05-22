package com.lojas.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "fk_departamento")
    private Departamento departamento;

    @ManyToOne
    @JoinColumn(name = "fk_projeto")
    private Projeto projeto;


}
