package com.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entidade.Filme;
import com.service.FilmeService;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private final FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @PostMapping
    public ResponseEntity<Filme> createFilme(@RequestBody Filme filme) {
        return ResponseEntity.ok(filmeService.saveFilme(filme));
    }

    @GetMapping
    public ResponseEntity<List<Filme>> getAllFilmes() {
        return ResponseEntity.ok(filmeService.getAllFilmes());
    }
}