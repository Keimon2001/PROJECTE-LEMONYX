package uf5.pkg6projectestreaming.basedades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import uf5.pkg6projectestreaming.model.Compte;

public class CompteDAO {

    /**
     * Mètode que obté un objecte compte de la BD amb la modalitat corresponent
     * al ID
     *
     * @param id ID del compte que volem obtenir
     * @return L'objecte compte amb la modalitat corresponent al ID, o null si
     * no ho troba a la BD
     */
    public ArrayList<Compte> obtenirComptesModalitatBD(int id) {

        Connection con = Conexio.getConnection();
        
        ArrayList<Compte> comptes = new ArrayList();
        
        String sentenciaSql = null;

        if (id == 0){
            sentenciaSql = "SELECT co.id_compte, cl.id_client, cl.Nom, cl.DNI, co.data_alta, co.id_modalitat "
                          + "FROM compte co, clients cl WHERE co.id_client = cl.id_client";
        }else{
            sentenciaSql = "SELECT co.id_compte, cl.id_client, cl.Nom, cl.DNI, co.data_alta, co.id_modalitat "
                        + "FROM compte co, clients cl WHERE co.id_modalitat = ? AND co.id_client = cl.id_client";
                    
        }

        try ( PreparedStatement ps = con.prepareStatement(sentenciaSql)) {
            if(id != 0) ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Compte c = new Compte();
                c.setIdCompte(rs.getInt("co.id_compte"));
                c.setIdClient(rs.getInt("cl.id_client"));
                c.setDNI(rs.getString("cl.DNI"));
                c.setDataAlta(rs.getDate("co.data_alta").toLocalDate());
                c.setNomCli(rs.getString("cl.Nom"));
                c.setIdModalitat(rs.getInt("co.id_modalitat"));
                comptes.add(c);
            }
            
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return comptes;

    }
}

