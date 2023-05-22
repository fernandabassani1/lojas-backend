package com.lojas.controller;

import com.lojas.entity.Funcionario;
import com.lojas.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lojas/v1")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping("/funcionario")
    public ResponseEntity<Funcionario> save (@RequestBody Funcionario funcionario) {
        Funcionario func = funcionarioService.saveOrUpdate(funcionario);
        return new ResponseEntity<>(func, HttpStatus.CREATED);
    }

    @GetMapping("/funcionario")
    public ResponseEntity<List<Funcionario>> getAll () {
        List<Funcionario> funcionarios = funcionarioService.finAll();
        return new ResponseEntity<>(funcionarios, HttpStatus.OK);
    }

    @GetMapping("/funcionario/{id}")
    public ResponseEntity<Funcionario> getOne (@PathVariable("id") long id) {
        Funcionario funcionario = funcionarioService.getOne(id);
        return new ResponseEntity<>(funcionario, HttpStatus.OK);
    }

    @PutMapping("/funcionario")
    public ResponseEntity<Funcionario> update (@RequestBody Funcionario funcionario) {
        Funcionario func = funcionarioService.saveOrUpdate(funcionario);
        return new ResponseEntity<>(func, HttpStatus.OK);
    }

    @DeleteMapping("/funcionario/{id}")
    public ResponseEntity<Void> delete (@PathVariable("id") long id) {
           funcionarioService.delete(id);
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
}
