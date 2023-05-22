package com.lojas.controller;

import com.lojas.entity.Projeto;
import com.lojas.entity.Projeto;
import com.lojas.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lojas/v1")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @PostMapping("/projeto")
    public ResponseEntity<Projeto> save (@RequestBody Projeto projeto) {
        Projeto proj = projetoService.saveOrUpdate(projeto);
        return new ResponseEntity<>(proj, HttpStatus.CREATED);
    }

    @GetMapping("/projeto")
    public ResponseEntity<List<Projeto>> getAll () {
        List<Projeto> projeto = projetoService.finAll();
        return new ResponseEntity<>(projeto, HttpStatus.OK);
    }

    @GetMapping("/projeto/{id}")
    public ResponseEntity<Projeto> getOne (@PathVariable("id") long id) {
        Projeto projeto = projetoService.getOne(id);
        return new ResponseEntity<>(projeto, HttpStatus.OK);
    }

    @PutMapping("/projeto")
    public ResponseEntity<Projeto> update (@RequestBody Projeto projeto) {
        Projeto func = projetoService.saveOrUpdate(projeto);
        return new ResponseEntity<>(func, HttpStatus.OK);
    }

    @DeleteMapping("/projeto/{id}")
    public ResponseEntity<Void> delete (@PathVariable("id") long id) {
        projetoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
