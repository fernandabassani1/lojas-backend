package com.lojas.repository;

import com.lojas.entity.Departamento;
import com.lojas.entity.Projeto;
import com.lojas.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    @Query("SELECT p FROM Projeto p ")
    List<Projeto> getAll();

    @Query("SELECT p FROM Projeto p where p.id = :id")
    Projeto getOne(@Param(value = "id") long id);
}
