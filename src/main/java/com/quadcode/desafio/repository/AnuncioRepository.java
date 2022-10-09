package com.quadcode.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quadcode.desafio.model.Anuncio;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Long>{
    
}
