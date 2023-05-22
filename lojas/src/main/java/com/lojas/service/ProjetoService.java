package com.lojas.service;

import com.lojas.entity.Projeto;
import com.lojas.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;
    @Transactional
    public Projeto saveOrUpdate(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public List<Projeto> finAll() {
        return projetoRepository.getAll();
    }

    public Projeto getOne(long id) {
        return projetoRepository.getOne(id);
    }

    public void delete(long id) {
        projetoRepository.deleteById(id);
    }
}
