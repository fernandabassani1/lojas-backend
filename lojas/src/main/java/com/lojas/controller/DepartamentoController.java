package com.lojas.controller;

import com.lojas.entity.Departamento;
import com.lojas.entity.Departamento;
import com.lojas.service.DepartamentoService;
import com.lojas.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lojas/v1")
public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoService;

    @PostMapping("/departamento")
    public ResponseEntity<Departamento> save (@RequestBody Departamento departamento) {
        Departamento dep = departamentoService.saveOrUpdate(departamento);
        return new ResponseEntity<>(dep, HttpStatus.CREATED);
    }

    @GetMapping("/departamento")
    public ResponseEntity<List<Departamento>> getAll () {
        List<Departamento> departamentos = departamentoService.getAll();
        return new ResponseEntity<>(departamentos, HttpStatus.OK);
    }

    @GetMapping("/departamento/{id}")
    public ResponseEntity<Departamento> getOne (@PathVariable("id") long id) {
        Departamento departamento = departamentoService.getOne(id);
        return new ResponseEntity<>(departamento, HttpStatus.OK);
    }

    @PutMapping("/departamento")
    public ResponseEntity<Departamento> update (@RequestBody Departamento departamento) {
        Departamento dep = departamentoService.saveOrUpdate(departamento);
        return new ResponseEntity<>(dep, HttpStatus.OK);
    }

    @DeleteMapping("/departamento/{id}")
    public ResponseEntity<Void> delete (@PathVariable("id") long id) {
        departamentoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
