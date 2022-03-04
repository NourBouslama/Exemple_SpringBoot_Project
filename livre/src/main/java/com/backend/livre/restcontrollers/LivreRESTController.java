package com.backend.livre.restcontrollers;

import java.util.List;

import com.backend.livre.entities.Livre;
import com.backend.livre.service.LivreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
@CrossOrigin
public class LivreRESTController {

    @Autowired
    LivreService livreService;

    @RequestMapping(method = RequestMethod.GET)
public List<Livre> getAllLivres() {
return livreService.getAllLivres();
}

@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Livre getLivreById(@PathVariable("id") Long id) {
return livreService.getLivre(id);
 }

 @RequestMapping(method = RequestMethod.POST)
 public Livre createLivre(@RequestBody Livre livre) {
 return livreService.saveLivre(livre);
 }

 @RequestMapping(method = RequestMethod.PUT)
public Livre updateLivre(@RequestBody Livre livre) {
return livreService.updateLivre(livre);
}

@RequestMapping(value="/{idL}",method = RequestMethod.DELETE)
public void deleteLivre(@PathVariable("idL") Long id)
{
    livreService.deleteLivreById(id);
}
 
/*@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
public List<Livre> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
return produitService.findByCategorieIdCat(idCat);
}*/



    

    
}
