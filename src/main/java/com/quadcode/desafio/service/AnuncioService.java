package com.quadcode.desafio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quadcode.desafio.model.Anuncio;
import com.quadcode.desafio.repository.AnuncioRepository;


@Service
public class AnuncioService {
    
    @Autowired
    private AnuncioRepository anuncioRepository;

    public List<Anuncio> buscarTodos(){
        return anuncioRepository.findAll();
    }

    public Optional<Anuncio> buscarPorId(Long id){
        Optional<Anuncio> anuncio = anuncioRepository.findById(id);
        return anuncio;
    }

    public Anuncio adicionar(Anuncio anuncio){
        return anuncioRepository.save(anuncio);
    }

    public void deletar(Long id){
        anuncioRepository.deleteById(id);
    }

    public Anuncio alterar(Long id, Anuncio anuncio){
        anuncio.setId(id);
        return anuncioRepository.save(anuncio);
    }   
}
