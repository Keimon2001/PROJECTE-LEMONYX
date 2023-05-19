
package Aplicacio;

import javafx.application.Application;
import javafx.stage.Stage;
import uf5.pkg6projectestreaming.vista.AplicacioVista;



public class PlataformaStreamingMVC extends Application{

    /**
     * Mètode principal per iniciar l'aplicació
     * @param args Arguments de la linia de comandes
     */
    public static void main(String[] args){
        launch(args);
    }
    
    /**
     * Mètode que s'executa a l'iniciar l'aplicaicó
     * @param escenari Objecte que representa la finestra de l'aplicació
     * @throws Exception Si hi ha alguna excepció durant l'execució del mètode
     */
    @Override
    public void start(Stage escenari) throws Exception {
        AplicacioVista apVista = new AplicacioVista();
        apVista.inici(escenari);
    }
    
    
}
