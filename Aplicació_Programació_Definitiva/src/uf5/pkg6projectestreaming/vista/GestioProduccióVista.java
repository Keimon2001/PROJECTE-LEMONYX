/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5.pkg6projectestreaming.vista;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import uf5.pkg6projectestreaming.basedades.PeliculaDAO;
import uf5.pkg6projectestreaming.basedades.ProduccioDAO;
import uf5.pkg6projectestreaming.basedades.SerieDAO;
import uf5.pkg6projectestreaming.model.Pelicula;
import uf5.pkg6projectestreaming.model.Produccio;
import uf5.pkg6projectestreaming.model.Serie;

public class GestioProduccióVista {

    Label lblID;
    TextField txtID;

    Label lblNom;
    TextField txtNom;

    Label lblNacionalitat;
    TextField txtNacionalitat;

    Label lblAny;
    TextField txtAny;

    Label lblCategoria;
    TextField txtCategoria;

    Label lblDirector;
    TextField txtDirector;

    Label lblActor;
    TextField txtActor;

    Label lblFavorit;
    TextField txtFavorit;

    Label lblDurada;
    TextField txtDurada;

    Label lblNumCapituls;
    TextField txtNumCapituls;

    Label lblDuradaTotal;
    TextField txtDuradaTotal;

    RadioButton rb1;
    RadioButton rb2;

    /**
     * Mètode que genera la part central de la interfície de la gestió de
     * produccions
     *
     * @return Un VBox que conté els diferents elements
     */
    public VBox centerGestioProduccio() {
        VBox vb = new VBox();

        Label lblPelis = new Label("GESTIÓ PRODUCCIONS");
        lblPelis.setFont(new Font("ArialBold", 30));
        lblPelis.setTextFill(Color.RED);

        VBox vbElem = dadesProduccio();

        HBox hbBotons = botonsGestio();
        hbBotons.setSpacing(10);
        hbBotons.setAlignment(Pos.CENTER);

        vb.getChildren().addAll(lblPelis, vbElem, hbBotons);
        vb.setAlignment(Pos.CENTER);

        vb.setSpacing(10);

        return vb;

    }

    /**
     * Mètode que conté les dades d'una producció
     *
     * @return Un VBox que conté els diferents elements amb les dades de les
     * produccions
     */
    private VBox dadesProduccio() {

        VBox vb = new VBox();

        Label lblProduccions = new Label("GESTIO PRODUCCIONS");

        lblID = new Label("ID");
        txtID = new TextField();

        lblNom = new Label("Nom");
        txtNom = new TextField();

        lblAny = new Label("Any");
        txtAny = new TextField();

        lblNacionalitat = new Label("Nacionalitat");
        txtNacionalitat = new TextField();

        lblCategoria = new Label("Categoria");
        txtCategoria = new TextField();

        lblDirector = new Label("Director");
        txtDirector = new TextField();

        lblActor = new Label("Actor");
        txtActor = new TextField();

        lblFavorit = new Label("Favorit");
        txtFavorit = new TextField();

        rb1 = new RadioButton("Pel·licula");
        rb2 = new RadioButton("Serie");

        ToggleGroup rgroup = new ToggleGroup();
        rb1.setToggleGroup(rgroup);
        rb2.setToggleGroup(rgroup);

        // Afegim GridPane i tots els nodes a les columnes i files corresponents
        GridPane gp = new GridPane();

        gp.add(lblID, 0, 0, 1, 1);
        gp.add(txtID, 1, 0, 1, 1);
        gp.add(lblNom, 0, 1, 1, 1);
        gp.add(txtNom, 1, 1, 1, 1);
        gp.add(lblAny, 0, 2, 1, 1);
        gp.add(txtAny, 1, 2, 1, 1);

        gp.add(lblNacionalitat, 0, 3, 1, 1);
        gp.add(txtNacionalitat, 1, 3, 1, 1);

        gp.add(lblCategoria, 0, 4, 1, 1);
        gp.add(txtCategoria, 1, 4, 1, 1);
        gp.add(lblDirector, 0, 5, 1, 1);
        gp.add(txtDirector, 1, 5, 1, 1);
        gp.add(lblActor, 0, 6, 1, 1);
        gp.add(txtActor, 1, 6, 1, 1);
        gp.add(lblFavorit, 0, 7, 1, 1);
        gp.add(txtFavorit, 1, 7, 1, 1);
        gp.add(rb1, 0, 8, 1, 1);
        gp.add(rb2, 1, 8, 1, 1);

        // Centrem i fiquem pading
        gp.setAlignment(Pos.CENTER);

        gp.setHgap(10);
        gp.setVgap(10);

        GridPane gpps = new GridPane();

        lblDurada = new Label("Durada");
        lblDurada.setVisible(false);
        txtDurada = new TextField();
        txtDurada.setVisible(false);

        lblNumCapituls = new Label("Numero Capitols");
        lblNumCapituls.setVisible(false);
        txtNumCapituls = new TextField();
        txtNumCapituls.setVisible(false);

        lblDuradaTotal = new Label("Durada Total");
        lblDuradaTotal.setVisible(false);
        txtDuradaTotal = new TextField();
        txtDuradaTotal.setVisible(false);

        gpps.add(lblDurada, 0, 0, 1, 1);
        gpps.add(txtDurada, 1, 0, 1, 1);
        gpps.add(lblNumCapituls, 0, 1, 1, 1);
        gpps.add(txtNumCapituls, 1, 1, 1, 1);
        gpps.add(lblDuradaTotal, 0, 2, 1, 1);
        gpps.add(txtDuradaTotal, 1, 2, 1, 1);

        rgroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> x, Toggle anterior, Toggle actual) {

                if (rb1.isSelected()) {
                    lblDurada.setVisible(true);
                    txtDurada.setVisible(true);
                    lblNumCapituls.setVisible(false);
                    txtNumCapituls.setVisible(false);
                    lblDuradaTotal.setVisible(false);
                    txtDuradaTotal.setVisible(false);
                } else {

                    lblDurada.setVisible(false);
                    txtDurada.setVisible(false);
                    lblNumCapituls.setVisible(true);
                    txtNumCapituls.setVisible(true);
                    lblDuradaTotal.setVisible(true);
                    txtDuradaTotal.setVisible(true);
                }
            }

        });

        gpps.setAlignment(Pos.CENTER);
        gpps.setHgap(10);
        gpps.setVgap(10);
        gpps.setPadding(new Insets(20, 20, 20, 20));

        vb.setSpacing(20);
        vb.getChildren().addAll(gp, gpps);
        vb.setAlignment(Pos.CENTER);

        return vb;
    }

    /**
     * Mètode que genera un HBox que conté els diferents botons de gestió
     *
     * @return Un Hbox que conté els botons
     */
    private HBox botonsGestio() {

        Button btnConsulta = new Button("Consulta");
        Button btnAlta = new Button("Alta");
        Button btnModificacio = new Button("Modificació");
        Button btnBaixa = new Button("Baixa");
        Button btnInicialitza = new Button("Inicialitza");

        btnConsulta.setOnAction(e -> consultaProduccio());

        btnAlta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Alta Peli...");
                AlertVista.alertInformacio("Opció no implementada");

            }

        });

        btnModificacio.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AlertVista.alertInformacio("Opcio no implementada");
                System.out.println("Modificant pel·licula...");
            }
        });

        btnInicialitza.setOnAction((e -> inicialitzarCampsPantallaProduccio()));

        HBox hbBotons = new HBox(btnConsulta, btnAlta, btnModificacio, btnBaixa, btnInicialitza);

        return hbBotons;
    }

    /**
     * Mètode que fa una consulta d'una producció
     */
    private void consultaProduccio() {

        if (txtID.getText().equals("")) {
            AlertVista.alertWarning("L'identificador ha de tenir un valor");
        } else {

            int id = Integer.parseInt(txtID.getText());

            inicialitzarCampsPantallaProduccio();

            ProduccioDAO prodDAO = new ProduccioDAO();

            Produccio produccio = prodDAO.consultaProduccioBD(id);
            System.out.println(produccio);
            if (produccio == null) {
                AlertVista.alertInformacio("No existeix aquest identificador de produccio");
            } else {
                dadesProduccioAPantalla(produccio);
                PeliculaDAO peliDAO = new PeliculaDAO();
                Pelicula peli = peliDAO.consultaPeliculaBD(id);
                System.out.println(peli);
                if (peli != null) {
                    dadesPeliculaAPantalla(peli);
                } else {
                    SerieDAO serieDAO = new SerieDAO();
                    Serie serie = serieDAO.consultaSerieBD(id);
                    dadesSerieAPantalla(serie);
                }
            }
        }
    }

    /**
     * Mètode que inicialitza els camps de la pantalla producció
     */
    void inicialitzarCampsPantallaProduccio() {

        txtID.setText("");
        txtNom.setText("");
        txtAny.setText("");
        txtCategoria.setText("");
        txtDirector.setText("");
        txtActor.setText("");
        txtNacionalitat.setText("");
        txtFavorit.setText("");

        rb1.setSelected(false);
        rb2.setSelected(false);

        lblDurada.setVisible(false);
        txtDurada.setVisible(false);

        lblDuradaTotal.setVisible(false);
        txtDuradaTotal.setVisible(false);
        lblNumCapituls.setVisible(false);
        txtNumCapituls.setVisible(false);

    }

    /**
     * Mètode que estableix les dades de la producció a la pantalla
     *
     * @param p La producció de la que s'obtenen les dades
     */
    private void dadesProduccioAPantalla(Produccio p) {

        txtID.setText(String.valueOf(p.getId()));
        txtNom.setText(p.getNom());
        txtNacionalitat.setText(p.getNacionalitat());
        txtAny.setText(String.valueOf(p.getAny()));
        txtFavorit.setText(String.valueOf(p.getFavorit()));
    }

    /**
     * Mètode que estableix les dades d'una pelicula a la pantalla
     *
     * @param p La pelicula de la que s'obtenen les dades
     */
    private void dadesPeliculaAPantalla(Pelicula p) {
        rb1.setSelected(true);
        txtDurada.setText(String.valueOf(p.getDurada()));
        txtCategoria.setText(p.getCategoria(0));
        txtDirector.setText(p.getDirector(0));
        txtActor.setText(p.getActor(0));

    }

    /**
     * Mètode que estableix les dades d'una serie a la pantalla
     *
     * @param s La serie de la que s'obtenen les dades
     */
    private void dadesSerieAPantalla(Serie s) {

        rb2.setSelected(true);
        txtDuradaTotal.setText(String.valueOf(s.getDuradaTotal()));
        txtNumCapituls.setText(String.valueOf(s.getNumCapituls()));
        txtCategoria.setText(s.getCategoria(0));
        txtDirector.setText(s.getDirector(0));
        txtActor.setText(s.getActor(0));
        txtDuradaTotal.setVisible(true);
        txtNumCapituls.setVisible(true);

    }

}
