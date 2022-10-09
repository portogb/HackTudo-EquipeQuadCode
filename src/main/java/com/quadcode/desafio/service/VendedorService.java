package com.quadcode.desafio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quadcode.desafio.model.Vendedor;
import com.quadcode.desafio.repository.VendedorRepository;

@Service
public class VendedorService {
    
    @Autowired
    private VendedorRepository vendedorRepository;

    public List<Vendedor> buscarTodos(){
        return vendedorRepository.findAll();
    }

    public Optional<Vendedor> buscarPorId(Long id){
       Optional<Vendedor> vendedor = vendedorRepository.findById(id);
       return vendedor;
    }

    public Vendedor adicionar(Vendedor vendedor){
        return vendedorRepository.save(vendedor);
    }

    public void deletar(Long id){
        vendedorRepository.deleteById(id);
    }

    public Vendedor alterar(Long id, Vendedor vendedor){
        vendedor.setId(id);
        return vendedorRepository.save(vendedor);
    }
}
