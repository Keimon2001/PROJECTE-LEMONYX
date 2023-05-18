
package Aplicacio;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.sql.Connection;
import uf5.pkg6projectestreaming.basedades.Conexio;
import static uf5.pkg6projectestreaming.basedades.Conexio.getConnection;


public class AplicacioStreaming extends Application {
    
    TextField tf1 = new TextField();
    
    public static void main(String[] args) {

        Application.launch(args);
      
        
    }

    @Override
    public void start(Stage escenari) throws Exception {
        
       Connection con = Conexio.getConnection();
          
       BorderPane bp = new BorderPane();
       bp.setTop(top());
       bp.setCenter(center());
       bp.setLeft(left());
       
        // Creem node
       Label lblSaluda = new Label("Benvingut a JavaFX");
       TextField txtMsg = new TextField(); 
       
       
       // Creem Contenidor
       VBox vb = new VBox();
       
       // Afegim node al contenidor
       vb.getChildren().addAll(lblSaluda, txtMsg);
       
       //Creem una escena amb un contenidor
       Scene escena = new Scene(bp);
       
       escenari.setScene(escena);
       escenari.setMinHeight(1000);
       escenari.setMinWidth(1000);
       escenari.setTitle("Lemonyx");
       escenari.show();
        
    }
    
    private HBox top(){
        
        HBox hb = new HBox();
        
        Label titol = new Label("Aplicacio Lemonyx");
        
        titol.setFont(new Font("ArialBold",40));
        titol.setTextFill(Color.YELLOW);
        
        hb.getChildren().add(titol);
        hb.setSpacing(30);
        hb.setPadding(new Insets(10,10,10,10));
        
        hb.setBackground(new Background(new BackgroundFill(Color.GREY, CornerRadii.EMPTY,Insets.EMPTY)));
        hb.setMinHeight(200);
        hb.setAlignment(Pos.CENTER);
        
        
        return hb;
    }
    
    private VBox left(){
        VBox vb = new VBox();
        Label t1 = new Label("GESTIO PRODUCCIONS");
        
        Button b1 = new Button("Gestió Pelicules/Series");
        Label t2 = new Label("ESTADISTIQUES");
        Button b2 = new Button("Contractes clients Tarifa");
        Button b3 = new Button("Produccions favorites");
        
        vb.getChildren().addAll(t1,b1,t2,b2,b3);
        
        t1.setFont(new Font("ArialBold",20));
        t2.setFont(new Font("ArialBold",20));
     
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(30);
        vb.setPadding(new Insets(10,10,10,10));
        vb.setMinSize(100,100);
        vb.setBackground(new Background(new BackgroundFill(Color.LIGHTGREY, CornerRadii.EMPTY,Insets.EMPTY)));
        return vb;
    }
    
    private VBox center(){
        VBox vb = new VBox();
        
        //Creem els nodes necessaris
        Label t1 = new Label("GESTIO PRODUCCIONS");
        
        Label id = new Label("ID");
        
        
        Label nom = new Label("Nom");
        TextField tf2 = new TextField();
        
        Label any = new Label("Any");
        TextField tf3 = new TextField();
        
        Label nacionalitat = new Label ("Nacionalitat");
        TextField tf4 = new TextField();
        
        Label cat = new Label ("Categoria");
        TextField tf5 = new TextField();
        
        Label dir = new Label ("Director");
        TextField tf6 = new TextField();
        
        Label actor = new Label("Actor");
        TextField tf7 = new TextField();
        
        Label fav = new Label("Favorit");
        TextField tf8 = new TextField();
        
        RadioButton rb = new RadioButton("Pel·licula");
        RadioButton rb1 = new RadioButton("Serie");
        
        // Afegir botons per a que no es seleccionin tots
        ToggleGroup rgroup = new ToggleGroup();
        rb.setToggleGroup(rgroup);
        rb1.setToggleGroup(rgroup);
        
       
        
        // Afegim GridPane i tots els nodes a les columnes i files corresponents
        GridPane gp = new GridPane();
        
        gp.add(t1, 0, 0);
        gp.add(id,0,1);
        gp.add(tf1, 1, 1);
        gp.add(nom,0,2);
        gp.add(tf2,1,2);
        gp.add(any, 0, 3);
        gp.add(tf3,1,3);
        gp.add(nacionalitat,0,4);
        gp.add(tf4,1,4);
        gp.add(cat,0,5);
        gp.add(tf5,1,5);
        gp.add(dir,0,6);
        gp.add(tf6,1,6);
        gp.add(actor,0,7);
        gp.add(tf7,1,7);
        gp.add(fav,0,8);
        gp.add(tf8,1,8);
        gp.add(rb,0,9);
        gp.add(rb1,1,9);
        
        // Centrem i fiquem pading
        gp.setAlignment(Pos.CENTER);
        gp.setPadding(new Insets(10,10,10,10));
        gp.setMinSize(100,100);
        t1.setFont(new Font("ArialBold",15));
        t1.setTextFill(Color.RED);
        
        // Creem Hbox i nodes i els afegim
        HBox hb = new HBox();
        
        
        Button b1 = new Button("Consulta");
        Button b2 = new Button("Alta");
        Button b3 = new Button("Modificació");
        Button b4 = new Button("Baixa");
        Button b5 = new Button("Inicialitza");
        
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                consultarProduccio();
            }
         });
       
         //PROGRAMEM ELS BOTONS
         
         
        
   
         
        hb.getChildren().addAll(b1,b2,b3,b4,b5);
        
        // Centrem i fiquem pading
        
        hb.setAlignment(Pos.CENTER);
        hb.setSpacing(15);
        hb.setPadding(new Insets(10,10,10,10));
        hb.setMinSize(100,100);
        
        //Finalment afegim el GP i el HB al VB 
        vb.getChildren().addAll(gp,hb);
        vb.setAlignment(Pos.CENTER);

        return vb;
    }
    
    private void alertWarning(String msg){
        
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setTitle("Warning en l'aplicació");
        alert.setContentText(msg);
        alert.showAndWait();
        
    }
    
        private void alertInformation(String msg){
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Information");
        alert.setContentText(msg);
        alert.showAndWait();
        
    }
        
        private void consultarProduccio(){
            if(tf1.getText().equals("")){
                alertWarning("Has d'introduir un id");
            } else{
                // Els camps de la pantalla son text, cal convertir els que son numerics
                
                int id = Integer.parseInt(tf1.getText());
                
                
            }
        }
        
        
        
        
}
