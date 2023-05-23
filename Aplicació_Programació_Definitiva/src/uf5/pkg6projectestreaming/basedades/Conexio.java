package uf5.pkg6projectestreaming.basedades;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexio {

    static private Connection conn = null;

    /**
     * Mètode que fa una connexió a la BD.
     *
     * @return La connexió a la BD
     */
    public static Connection getConnection() {
        try {
            if (conn == null) {
                
                String url = "jdbc:mysql://localhost:3307/projectelemonyx";
                String driver = "com.mysql.cj.jdbc.Driver";
                String user = "root";
                String password = "camonDAM1!";

                Class.forName(driver);
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connectat");
            }
            
        } catch (Exception e) {
            System.out.println("No s'ha pogut conectar a la BD");
            System.out.println(conn);
        }
        return conn;
    }
}
