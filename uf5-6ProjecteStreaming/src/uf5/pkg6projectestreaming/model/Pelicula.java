/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5.pkg6projectestreaming.model;

import java.util.ArrayList;

/**
 *
 * @author DAM
 */
public class Pelicula extends Produccio {
    
    private double durada;
    
    private ArrayList<String> categories;
    private ArrayList<String> directors;
    private ArrayList<String> actors;
    
    
    public Pelicula(){
        this.actors = new ArrayList();
        this.directors = new ArrayList();
        this.categories = new ArrayList();
    }

    public Pelicula(double durada,  String nom, int any, String genere, String categoria, String director, String actor) {
        super(nom, any, genere, categoria, director, actor);
        this.durada = durada;
        this.categories = new ArrayList();
        this.directors = new ArrayList();
        this.actors = new ArrayList();
        
        this.categories.add(categoria);
        this.directors.add(director);
        this.actors.add(actor);
    }

    public double getDurada() {
        return durada;
    }

    public void setDurada(double durada) {
        this.durada = durada;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public ArrayList<String> getDirectors() {
        return directors;
    }

    public void setDirectors(ArrayList<String> directors) {
        this.directors = directors;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }
    
    
    
    
    
    
}
