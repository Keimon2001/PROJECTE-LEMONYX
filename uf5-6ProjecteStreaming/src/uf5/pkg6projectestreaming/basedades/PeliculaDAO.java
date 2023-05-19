package uf5.pkg6projectestreaming.basedades;

import uf5.pkg6projectestreaming.model.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeliculaDAO {

    /**
     * Mètode que consulta una pelicula a la BD a partir d'un ID
     *
     * @param id El ID de la pelicula que volem consultar
     * @return El objecte pelicula corresponent amb l'id, o null si no ho troba
     * a la BD
     */
    public Pelicula consultaPeliculaBD(int id) {

        Connection con = Conexio.getConnection();

        Pelicula p = null;

        String sentenciaSql = "SELECT durada FROM pel·licules WHERE id_produccio = ? ";

        try ( PreparedStatement ps = con.prepareStatement(sentenciaSql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                p = dadesBDPelicula(id, rs.getDouble("durada"));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return p;

    }

    /**
     * Mètode que crea i configura un objecte pelicula amb les dades de la BD
     *
     * @param id El ID de la pelicula
     * @param durada La duració de la pelicula
     * @return El objecte pelicula amb les dades obtingudes de la BD
     */
    private Pelicula dadesBDPelicula(int id, double durada) {
        Pelicula p = new Pelicula();

        p.setDurada(durada);

        p.afegirCategoria(obtenirCategoria(id));
        p.afegirDirector(obtenirDirector(id));
        p.afegirActor(obtenirActor(id));

        return p;
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

        String sentenciaSql = "SELECT d.nom_director FROM dirigeix_pelicula dp, director d "
                + "WHERE dp.id_director = ? AND dp.id_director = d.id_director";

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
     * Mètode que obté la categoria d'una producció a partir del seu ID
     *
     * @param idProduccio El ID de la producció
     * @return El tipus de categoria de la producció obtingut a la BD
     */
    private String obtenirCategoria(int idProduccio) {
        Connection con = Conexio.getConnection();

        String categoria = " ";

        String sentenciaSql = "SELECT d.nom_categoria FROM categoria dp, categoria d "
                + "WHERE dp.id_categoria = ? AND dp.id_categoria = d.id_categoria";

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
     * Mètode que obté el nom de l'actor d'una producció a partir del seu ID
     *
     * @param idProduccio El ID de la producció
     * @return El nom del actor de la producció obtingut a la BD
     */
    private String obtenirActor(int idProduccio) {
        Connection con = Conexio.getConnection();

        String actor = " ";

        String sentenciaSql = "SELECT d.nom FROM actor dp, actor d "
                + "WHERE dp.id_actor = ? AND dp.id_actor = d.id_actor";

        try ( PreparedStatement ps = con.prepareStatement(sentenciaSql)) {

            ps.setInt(1, idProduccio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                return rs.getString("nom");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return actor;
    }
}
