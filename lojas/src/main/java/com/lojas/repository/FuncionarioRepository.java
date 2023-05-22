package com.lojas.repository;

import com.lojas.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    @Query("SELECT f FROM Funcionario f inner join f.departamento dep inner join f.projeto")
    List<Funcionario> getAll();

    @Query("SELECT f FROM Funcionario f where f.id = :id")
    Funcionario getOne(@Param(value = "id") long id);
}
