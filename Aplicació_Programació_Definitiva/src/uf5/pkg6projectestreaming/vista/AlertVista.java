package uf5.pkg6projectestreaming.vista;

import javafx.scene.control.Alert;

public class AlertVista {

    /**
     * Mètode que mostra una alerta Warning
     *
     * @param msg El missatge de l'alerta
     */
    public static void alertWarning(String msg) {

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setTitle("Avis");
        alert.setContentText(msg);
        alert.showAndWait();
    }

    /**
     * Mètode que mostra una alerta d'informació
     *
     * @param msg El missatge de l'alerta
     */
    public static void alertInformacio(String msg) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Informacio");
        alert.setContentText(msg);
        alert.showAndWait();
    }

    /**
     * Mètode que mostra una alerta d'error
     *
     * @param msg El missatge de l'alerta
     */
    public static void alertError(String msg) {

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(msg);
        alert.showAndWait();
    }

    /**
     * Mètode que mostra una alerta de confirmació
     *
     * @param msg El missatge de l'alerta
     */
    public static void alertConfirmació(String msg) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmació");
        alert.setContentText(msg);
        alert.showAndWait();
    }

}
