package com.backend.livre.service;

import java.util.List;

import com.backend.livre.entities.Livre;

public interface LivreService {
    Livre saveLivre(Livre p);
    Livre updateLivre(Livre p);
void deleteLivre(Livre p);
 void deleteLivreById(Long id);
 Livre getLivre(Long id);
List<Livre> getAllLivres();
    
}
