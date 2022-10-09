package com.quadcode.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quadcode.desafio.model.Vendedor;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long>{
    
}
