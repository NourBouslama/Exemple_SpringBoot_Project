package com.backend.livre.service;

import java.util.List;

import com.backend.livre.entities.Livre;
import com.backend.livre.repos.LivreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivreServiceImpl implements LivreService {

    @Autowired
    LivreRepository livreRepository;

    @Override
    public Livre saveLivre(Livre p) {
        return livreRepository.save(p);
    }

    @Override
    public Livre updateLivre(Livre p) {
        return livreRepository.save(p);
    }

    @Override
    public void deleteLivre(Livre p) {
        livreRepository.delete(p);
        
    }

    @Override
    public void deleteLivreById(Long id) {
        livreRepository.deleteById(id);
        
    }

    @Override
    public Livre getLivre(Long id) {
        return livreRepository.findById(id).get();
    }

    @Override
    public List<Livre> getAllLivres() {
       
        return livreRepository.findAll();
    }
    
}
