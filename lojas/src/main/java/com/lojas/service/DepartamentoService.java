package com.lojas.service;

import com.lojas.entity.Departamento;
import com.lojas.entity.Funcionario;
import com.lojas.repository.DepartamentoRepository;
import com.lojas.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentoService {
    @Autowired
    private DepartamentoRepository departamentoRepository;
    @Transactional
    public Departamento saveOrUpdate(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public List<Departamento> getAll() {
        return departamentoRepository.getAll();
    }

    public Departamento getOne(long id) {
        return departamentoRepository.getOne(id);
    }

    public void delete(long id) {
        departamentoRepository.deleteById(id);
    }
}
