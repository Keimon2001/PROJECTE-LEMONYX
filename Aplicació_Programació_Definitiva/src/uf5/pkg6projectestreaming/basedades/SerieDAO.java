package uf5.pkg6projectestreaming.basedades;

import uf5.pkg6projectestreaming.model.Serie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerieDAO {

    /**
     * Mètode que consulta una serie a la BD a partir d'un ID
     *
     * @param id El ID de la serie que volem consultar
     * @return El objecte serie corresponent amb l'id, o null si no ho troba a
     * la BD
     */
    public Serie consultaSerieBD(int id) {

        Connection con = Conexio.getConnection();

        Serie s = null;

        String sentenciaSql = "SELECT COUNT(e.id_produccio) numcapitols, SUM(e.durada) duradatotal FROM series s, episodis e "
                + "WHERE s.id_produccio = ? AND s.id_produccio = e.id_produccio";

        try ( PreparedStatement ps = con.prepareStatement(sentenciaSql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                s = dadesBDSerie(id, rs);
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return s;
    }

    /**
     * Mètode que crea i configura un objecte serie amb les dades de la BD
     *
     * @param id El ID de la serie
     * @param rs El ResultSet que conté les dades de la serie
     * @return El objecte serie amb les dades obtingudes de la BD
     * @throws SQLException Si hi ha algun error a l'accedir a les dades
     */
    private Serie dadesBDSerie(int id, ResultSet rs) throws SQLException {

        Serie s = new Serie();
        s.setId(id);
        s.setDuradaTotal(rs.getDouble("duradatotal"));
        s.setNumCapituls(rs.getInt("numcapitols"));

        s.afegirCategoria(obtenirCategoria(id));
        s.afegirDirector(obtenirDirector(id));
        s.afegirActor(obtenirActor(id));

        return s;
    }

    /**
     * Mètode que obté la categoria d'una producció a partir del seu ID
     *
     * @param idProduccio El ID de la producció
     * @return El tipus de categoria de la producció obtingut a la BD
     */
    private String obtenirCategoria(int idProduccio) {
        Connection con = Conexio.getConnection();

        String categoria = " ";

        String sentenciaSql = "SELECT nom_categoria FROM pertany pert, categoria cat "
                + "WHERE pert.id_produccio = ? AND pert.id_categoria = cat.id_categoria";

        try ( PreparedStatement ps = con.prepareStatement(sentenciaSql)) {

            ps.setInt(1, idProduccio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                return rs.getString("nom_categoria");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return categoria;
    }

    /**
     * Mètode que obté el nom del director d'una producció a partir del seu ID
     *
     * @param idProduccio El ID de la producció
     * @return El nom del director de la producció obtingut a la BD
     */
    private String obtenirDirector(int idProduccio) {
        Connection con = Conexio.getConnection();

        String director = " ";

        String sentenciaSql = "SELECT nom_director FROM pertany pert, director dir "
                + "WHERE pert.id_produccio = ? AND pert.id_director = dir.id_director";

        try ( PreparedStatement ps = con.prepareStatement(sentenciaSql)) {

            ps.setInt(1, idProduccio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                return rs.getString("nom_director");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return director;
    }

    /**
     * Mètode que obté el nom de l'actor d'una producció a partir del seu ID
     *
     * @param idProduccio El ID de la producció
     * @return El nom del actor de la producció obtingut a la BD
     */
    private String obtenirActor(int idProduccio) {
        Connection con = Conexio.getConnection();

        String actor = " ";

        String sentenciaSql = "SELECT nom_actor FROM pertany pert, actor act "
                + "WHERE pert.id_produccio = ? AND pert.id_actor = act.id_actor";

        try ( PreparedStatement ps = con.prepareStatement(sentenciaSql)) {

            ps.setInt(1, idProduccio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                return rs.getString("nom_actor");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return actor;
    }

}
