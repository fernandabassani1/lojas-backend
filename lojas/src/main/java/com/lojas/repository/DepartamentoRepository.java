package com.lojas.repository;

import com.lojas.entity.Departamento;
import com.lojas.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

    @Query("SELECT d FROM Departamento d ")
    List<Departamento> getAll();

    @Query("SELECT d FROM Departamento d where d.id = :id")
    Departamento getOne(@Param(value = "id") long id);
}


