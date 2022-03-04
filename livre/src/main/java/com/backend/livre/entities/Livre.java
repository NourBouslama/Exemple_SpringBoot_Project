package com.backend.livre.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livre {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idL;
    private String nomL;
    private long prix;
    private String description;
    public Livre(String nomL, long prix, String description) {
        super();
        this.nomL = nomL;
        this.prix = prix;
        this.description = description;
    }
    public Livre() {
        super();
    }
    public long getIdL() {
        return idL;
    }
    public void setIdL(long idL) {
        this.idL = idL;
    }
    public String getNomL() {
        return nomL;
    }
    public void setNomL(String nomL) {
        this.nomL = nomL;
    }
    public long getPrix() {
        return prix;
    }
    public void setPrix(long prix) {
        this.prix = prix;
    }
    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "livre [idL=" + idL + ", description=" + description + ", nomL=" + nomL + ", prix=" + prix + "]";
    }


    
}
