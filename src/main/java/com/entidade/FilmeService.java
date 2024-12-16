package com.entidade;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    private final FilmeRepository filmeRepository;

    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public Filme saveFilme(Filme filme) {
        return filmeRepository.save(filme);
    }

    public List<Filme> getAllFilmes() {
        return filmeRepository.findAll();
    }
}