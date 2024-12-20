package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entidade.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

}

