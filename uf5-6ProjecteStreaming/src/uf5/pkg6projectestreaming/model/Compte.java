
package uf5.pkg6projectestreaming.model;

import java.time.LocalDate;

public class Compte {
    
    private int idCompte;
    private String usuari;
    private LocalDate dataAlta;
    private int idClient;
    private String DNI;
    private String nomCli;
    private int idModalitat;

    public int getIdCompte() {
        return idCompte;
    }



    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(LocalDate dataAlta) {
        this.dataAlta = dataAlta;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public int getIdModalitat() {
        return idModalitat;
    }

    public void setIdModalitat(int idModalitat) {
        this.idModalitat = idModalitat;
    }

    @Override
    public String toString() {
        return "Compte{" + "idCompte=" + idCompte + ", usuari=" + usuari + ", dataAlta=" + dataAlta + ", idClient=" + idClient + ", DNI=" + DNI + ", nomCli=" + nomCli + ", idModalitat=" + idModalitat + '}';
    }
   
}
