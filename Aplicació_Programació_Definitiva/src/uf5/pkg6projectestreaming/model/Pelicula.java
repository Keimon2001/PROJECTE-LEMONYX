package uf5.pkg6projectestreaming.model;

import java.util.ArrayList;

public class Pelicula extends Produccio {

    private double durada;

    private ArrayList<String> categories;
    private ArrayList<String> directors;
    private ArrayList<String> actors;

    /**
     * Constructor per defecete de la classe pelicula que inicialitza les llistes
     * d'actors, directors i categories
     */
    public Pelicula() {
        this.actors = new ArrayList();
        this.directors = new ArrayList();
        this.categories = new ArrayList();
    }

    /**
     * Constructor de la classe pelicula que permet establir diferents
     * parametres
     *
     * @param durada La duració de la pelicula
     * @param nom El nom de la pelicula
     * @param any L'any de la peliucla
     * @param genere El genere de la pelicula
     * @param categoria La categoria de la pelicula
     * @param director El director de la pelicula
     * @param actor L'actor de la pelicula
     */
    public Pelicula(double durada, String nom, int any, String genere, String categoria, String director, String actor) {
        super(nom, any, genere, categoria, director, actor);
        this.durada = durada;
        this.categories = new ArrayList();
        this.directors = new ArrayList();
        this.actors = new ArrayList();

        this.categories.add(categoria);
        this.directors.add(director);
        this.actors.add(actor);
    }

    public String getDirector(int pos) {
        if (pos <= directors.size() - 1) {
            return this.directors.get(pos);
        }
        return "";
    }

    public String getActor(int pos) {
        if (pos <= actors.size() - 1) {
            return this.actors.get(pos);
        }
        return "";
    }

    public String getCategoria(int pos) {
        if (pos <= categories.size() - 1) {
            return this.categories.get(pos);
        }
        return "";
    }

    /**
     * Mètode que afegeix un director
     *
     * @param director El director a afegir
     */
    public void afegirDirector(String director) {
        this.directors.add(director);
    }

    /**
     * Mètode que afegeix un actor
     *
     * @param actor L'actor a afegir
     */
    public void afegirActor(String actor) {
        this.actors.add(actor);
    }

    /**
     * Mètode que afegeix una categoria
     *
     * @param categoria La categoria a afegir
     */
    public void afegirCategoria(String categoria) {
        this.categories.add(categoria);
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
