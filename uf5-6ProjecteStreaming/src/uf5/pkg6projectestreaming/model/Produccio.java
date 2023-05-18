/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5.pkg6projectestreaming.model;

/**
 *
 * @author DAM
 */
public class Produccio {
        private int id;
    private String nom;
    private String nacionalitat;
    private int any;
    private int favorit;
    
    public Produccio(){
        
    }
    
    public Produccio(String nom, int any, String genere, String categoria, String director, String actor){
        this.nom = nom;
        this.any = any;
    }
    
    public Produccio(int id, String nom, int any, String genere, String categoria, String director, String actor){
        this.id = id;
        this.nom = nom;
        this.any = any;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int getFavorit() {
        return favorit;
    }

    public void setFavorit(int favorit) {
        this.favorit = favorit;
    }
    
    
}
