package com.backend.livre.repos;

import com.backend.livre.entities.Livre;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository <Livre, Long>{
    
}