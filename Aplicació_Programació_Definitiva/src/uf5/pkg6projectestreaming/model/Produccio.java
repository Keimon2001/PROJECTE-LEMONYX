package uf5.pkg6projectestreaming.model;

public class Produccio {

    private int id;
    private String nom;
    private String nacionalitat;
    private int any;
    private int favorit;

    /**
     * Constructor per defecte de la classe producció
     */
    public Produccio() {

    }

    /**
     * Constructor de la classe produccio que permet establir diferents
     * paràmetres
     *
     * @param nom El nom de la producció
     * @param any L'any de la producció
     * @param genere El genere de la producció
     * @param categoria La categoria de la producció
     * @param director El director de la producció
     * @param actor L'actor de la producció
     */
    public Produccio(String nom, int any, String genere, String categoria, String director, String actor) {
        this.nom = nom;
        this.any = any;
    }

    /**
     * Constructor de la classe produccio que permet establir diferents
     * paràmetres
     *
     * @param id L'ID de la producció
     * @param nom El nom de la producció
     * @param any L'any de la producció
     * @param genere El genere de la producció
     * @param categoria La categoria de la producció
     * @param director El director de la producció
     * @param actor L'actor de la producció
     */
    public Produccio(int id, String nom, int any, String genere, String categoria, String director, String actor) {
        this.id = id;
        this.nom = nom;
        this.any = any;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
