package com.lojas.service;

import com.lojas.entity.Funcionario;
import com.lojas.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Transactional
    public Funcionario saveOrUpdate(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> finAll() {
        return funcionarioRepository.getAll();
    }

    public Funcionario getOne(long id) {
        return funcionarioRepository.getOne(id);
    }

    public void delete(long id) {
        funcionarioRepository.deleteById(id);
    }
}

