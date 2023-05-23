package uf5.pkg6projectestreaming.model;

import java.util.ArrayList;


public class Serie extends Produccio {

    private int numCapituls;
    private double duradaTotal;

    private ArrayList<String> categories;
    private ArrayList<String> directors;
    private ArrayList<String> actors;

    /**
     * Constructor per defecete de la classe serie que inicialitza les llistes
     * d'actors, directors i categories
     */
    public Serie() {
        this.actors = new ArrayList();
        this.directors = new ArrayList();
        this.categories = new ArrayList();

    }

    /**
     * Constructor de la classe serie que permet establir diferents paràmetres
     *
     * @param numCapituls El numero de capitols de la serie
     * @param duradaTotal La durada total de la serie
     * @param nom El nom de la serie
     * @param any L'any de la serie
     * @param genere El genere de la serie
     * @param categoria La categoria de la serie
     * @param director El director de la serie
     * @param actor L'actor de la serie
     */
    public Serie(int numCapituls, double duradaTotal, String nom, int any, String genere, String categoria, String director, String actor) {
        super(nom, any, genere, categoria, director, actor);
        this.numCapituls = numCapituls;
        this.duradaTotal = duradaTotal;
        this.categories = new ArrayList();
        this.directors = new ArrayList();
        this.actors = new ArrayList();
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

    public int getNumCapituls() {
        return numCapituls;
    }

    public void setNumCapituls(int numCapituls) {
        this.numCapituls = numCapituls;
    }

    public double getDuradaTotal() {
        return duradaTotal;
    }

    public void setDuradaTotal(double duradaTotal) {
        this.duradaTotal = duradaTotal;
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
