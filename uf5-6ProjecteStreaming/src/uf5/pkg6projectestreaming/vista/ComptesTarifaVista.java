
package uf5.pkg6projectestreaming.vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import uf5.pkg6projectestreaming.basedades.CompteDAO;
import uf5.pkg6projectestreaming.model.Compte;


public class ComptesTarifaVista {
    
    private TableView tblContractes;
    
    public VBox visualitzarContractesTarifa(){
        
        System.out.println("visualitzarContractesTarifa");
        
        VBox vb = new VBox();
        
        Label lblContractes = new Label ("VISUALITZACIÓ DE CONTRACTES PER MODALITAT");
        lblContractes.setFont(new Font("ArialBold", 40));
        lblContractes.setTextFill(Color.RED);
        
        MenuItem menuItemGR = new MenuItem("Gratuïta");
        MenuItem menuItemBA = new MenuItem("Bàsica");
        MenuItem menuItemPR = new MenuItem("Premium");
        MenuItem menuItemTO = new MenuItem("Totes");
        
        
        MenuButton menuButton = new MenuButton("Modalitats", null, menuItemGR, menuItemBA, menuItemPR, menuItemTO);
        
        menuItemGR.setOnAction(event -> visualitzarContractesTarifaDades(1));
        menuItemBA.setOnAction(event -> visualitzarContractesTarifaDades(2));
        menuItemPR.setOnAction(event -> visualitzarContractesTarifaDades(3));       
        menuItemTO.setOnAction(event -> visualitzarContractesTarifaDades(0));
        
        tblContractes = new TableView();
        
        TableColumn<Compte, Integer> colIdCompte = new TableColumn<>("Id Compte");
        colIdCompte.setCellValueFactory(new PropertyValueFactory("Id Compte"));
        
        TableColumn<Compte, Integer> colIdClient = new TableColumn<>("IdClient");
        colIdClient.setCellValueFactory(new PropertyValueFactory("IdClient"));
        
            
        TableColumn<Compte, Integer> colCliDNI = new TableColumn<>("DNI");
        colCliDNI.setMinWidth(11);
        colCliDNI.setCellValueFactory(new PropertyValueFactory("DNI"));
        
        TableColumn<Compte, Integer> colCliNom = new TableColumn<>("Nom");
        colCliNom.setCellValueFactory(new PropertyValueFactory("nomCli"));
        
        TableColumn<Compte, Integer> colDataAlta = new TableColumn<>("D.alta");
        colDataAlta.setCellValueFactory(new PropertyValueFactory("dataAlta"));
        
        TableColumn<Compte, Integer> colModalitat = new TableColumn<>("Modalitat");
        colModalitat.setCellValueFactory(new PropertyValueFactory("Modalitat"));
        
        tblContractes.getColumns().addAll(colIdCompte, colIdClient, colCliDNI, colCliNom, colDataAlta, colModalitat );
        
        tblContractes.setMinHeight(100);
        tblContractes.setMinWidth(600);
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(30);
        vb.setPadding(new Insets(20, 20, 20, 20));
        
        vb.getChildren().addAll(lblContractes, menuButton, tblContractes);
        
        return vb;
        
        
    }
    
    private void visualitzarContractesTarifaDades(int modalitat){
        CompteDAO compteDAO = new CompteDAO();
        
        ArrayList<Compte> comptesTarifa =  compteDAO.obtenirComptesModalitatBD(modalitat);
        
    }
}
