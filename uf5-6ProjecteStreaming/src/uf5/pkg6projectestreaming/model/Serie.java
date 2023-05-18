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
public class Serie extends Produccio {
    
    private int numCapituls;
    private double duradaTotal;
    
    private ArrayList<String> categories;
    private ArrayList<String> directors;
    private ArrayList<String> actors;
    
    public Serie(){
        this.actors = new ArrayList();
        
    }
    
    
}
