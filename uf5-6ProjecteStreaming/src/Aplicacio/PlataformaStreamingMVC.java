
package Aplicacio;

import javafx.application.Application;
import javafx.stage.Stage;
import uf5.pkg6projectestreaming.vista.AplicacioVista;



public class PlataformaStreamingMVC extends Application{

    public static void main(String[] args){
        launch(args);
    }
    
    
    @Override
    public void start(Stage escenari) throws Exception {
        AplicacioVista apVista = new AplicacioVista();
        apVista.start(escenari);
    }
    
    
}
