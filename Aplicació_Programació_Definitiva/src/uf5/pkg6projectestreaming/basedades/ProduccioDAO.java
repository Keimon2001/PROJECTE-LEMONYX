package uf5.pkg6projectestreaming.basedades;

import uf5.pkg6projectestreaming.model.Produccio;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProduccioDAO {

    // PRIMER CONEXIÓ
    /**
     * Mètode que consulta les dades d'una producció a la BD a partir del ID
     *
     * @param Id El ID de la produccio a consultar
     * @return L'objecte produccio amb les dades de la producció consultada, o
     * null si no troba valors a la BD
     */
    public Produccio consultaProduccioBD(int Id) {

        Connection con = Conexio.getConnection();
        System.out.println(con);

        Produccio produccio = null;

        String sentenciaSql = "SELECT id_produccio, nom, nacionalitat, anys, preferit "
                + "FROM produccions WHERE id_produccio = ?";

        try ( PreparedStatement ps = con.prepareStatement(sentenciaSql)) {
            ps.setInt(1, Id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                produccio = dadesBDProduccio(rs);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return produccio;
    }

    /**
     * Mètode que crea un objecte produccio a partir d'un ResultSet que conté
     * les dades
     *
     * @param rs El ResultSet que conté les dades de la producció
     * @return L'objecte produccio creat amb les dades del ResultSet
     * @throws SQLException Si hi ha algun error a l'accedir a les dades
     */
    private Produccio dadesBDProduccio(ResultSet rs) throws SQLException {
        Produccio p = new Produccio();

        p.setId(rs.getInt("id_produccio"));
        p.setNom(rs.getString("nom"));
        p.setAny(rs.getInt("anys"));
        p.setNacionalitat(rs.getString("nacionalitat"));
        p.setFavorit(rs.getInt("preferit"));

        return p;

    }

    /**
     * Mètode que estableix les dades d'una producció en un PreparedStatement
     *
     * @param ps El PreparedStatement on establirem les dades
     * @param p L'objecte producció que conté les dades
     * @throws SQLException Si hi ha algun error a l'establir les dades
     */
    private void dadesProduccioBD(PreparedStatement ps, Produccio p) throws SQLException {

        ps.setInt(1, p.getId());
        ps.setString(2, p.getNom());
        ps.setString(3, p.getNacionalitat());
        ps.setInt(4, p.getAny());
        ps.setInt(5, p.getFavorit());

    }
}
