package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.HttpServlet;
import restaurant_photos.Photo;
import restaurants.Restaurant;
import users.User;

/**
 * Gestisce le informazioni sulle foto dei ristoranti nel database
 *
 * @author michael
 */
public class DB_RestaurantPhoto extends HttpServlet {
    /**
     * Gestisce le informazioni sulle foto dei ristoranti nel database
     */
    private String errore = "";
    DB_Manager connessione;

    /**
     * Costruttore
     *
     * @throws SQLException se c'e' stato un problema di connessione al db
     */
    public DB_RestaurantPhoto() throws SQLException {
        connessione = new DB_Manager ();
    }
    
    /**
     * Ritorna messaggio di errore
     *
     * @return stringa con messaggio di errore
     */
    public String getErrore() { return errore; }
    
    /**
     * Aggiungi foto a un ristorante
     *
     * @param p foto
     * @param id_restourant id ristorante
     * @return true se la procedura e' andata a buon fine, false altrimenti
     * @throws SQLException se c'e' stato un problema di connessione al db
     */
    public Boolean inserisciPhoto(Photo p, Integer id_restourant) throws SQLException {
        PreparedStatement sp = null;
        String query = null;
        Boolean r = null;
 
        try {
            query = "INSERT INTO photos(id, name, description, id_restaurant, path, id_owner, validation)"
                    + "VALUES(DEFAULT,?,?,?,?,?,?)";
            sp = connessione.con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            sp.setString(1, p.getName());
            sp.setString(2, p.getDescription());
            sp.setInt(3, id_restourant);
            sp.setString(4, p.getPath());
            sp.setInt(5, p.getOwner().getId());
            sp.setInt(6, 2);
            sp.executeUpdate();
            
            ResultSet generatedKeys = sp.getGeneratedKeys();
            if (generatedKeys.next())
                p.setId(generatedKeys.getInt(1));
 
            r = true;
        } catch (SQLException e) {
            System.out.println("Possibile causa: " + e.getMessage());
            r = false;
        } finally {
            sp.close();
            connessione.con.close();
            return r;
        }
    }
    
    /**
     * Cerca foto di un ristorante
     *
     * @param res ristorante
     * @param val validazione
     * @return true se la procedura e' andata a buon fine, false altrimenti
     * @throws SQLException se c'e' stato un problema di connessione al db
     */
    public Boolean cercaPhotos_perRistorante(Restaurant res, Integer val) throws SQLException {
        PreparedStatement sp = null;
        String query = null;
        Boolean r = null;
 
        try {
            query = "SELECT  * FROM photos WHERE id_restaurant = ? AND validation = ?";
            sp = connessione.con.prepareStatement(query);
            sp.setInt(1, res.getId());
            sp.setInt(2, val);
 
            ResultSet rs = sp.executeQuery();
            while (rs.next()) {
                res.setPhoto(new Photo(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getString("path"),
                        new User(rs.getInt("id_owner")),
                        rs.getInt("validation"),
                        rs.getDate("date_creation"),
                        rs.getInt("id_restaurant")
                ));
            }
            
            r = true;
        } catch (SQLException e) {
            System.out.print(e.getMessage());
            System.out.println("Accesso fallito");
            System.out.println("Possibile causa: " + e.getMessage());
            r = false;
        } finally {
            sp.close();
            connessione.con.close();
            return r;
        }
    }
    
    /**
     * Cerca tutte le foto validate
     *
     * @param ALP arraylist foto
     * @param val validazone
     * @return true se la procedura e' andata a buon fine, false altrimenti
     * @throws SQLException se c'e' stato un problema di connessione al db
     */
    public Boolean cercaPhotos(ArrayList <Photo> ALP, Integer val) throws SQLException {
        PreparedStatement sp = null;
        String query = null;
        Boolean r = null;
 
        try {
            query = "SELECT  * FROM photos WHERE validation = ?";
            sp = connessione.con.prepareStatement(query);
            sp.setInt(1, val);
 
            ResultSet rs = sp.executeQuery();
            while (rs.next()) {
                ALP.add(new Photo(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getString("path"),
                        new User(rs.getInt("id_owner")),
                        rs.getInt("validation"),
                        rs.getDate("date_creation"),
                        rs.getInt("id_restaurant")
                ));
            }
            
            r = true;
        } catch (SQLException e) {
            System.out.print(e.getMessage());
            System.out.println("Accesso fallito");
            System.out.println("Possibile causa: " + e.getMessage());
            r = false;
        } finally {
            sp.close();
            connessione.con.close();
            return r;
        }
    }
    
    /**
     * Aggiorna valizaione foto
     *
     * @param idPh id foto
     * @param val validazione
     * @param u utente
     * @return true se la procedura e' andata a buon fine, false altrimenti
     * @throws SQLException se c'e' stato un problema di connessione al db
     */
    public Boolean updatePhotoVal(Integer idPh, Integer val, User u) throws SQLException {
        PreparedStatement sp = null;
        String query = null;
        Boolean r = null;
        
        try {
            query = "UPDATE PHOTOS SET VALIDATION = ?, ID_OWNER = ? WHERE ID = ?";
            sp = connessione.con.prepareStatement(query);
            sp.setInt(1, val);
            sp.setInt(2, u.getId());
            sp.setInt(3, idPh);
            sp.executeUpdate();
            r = true;
        } catch (SQLException e) {
            System.out.println("Possibile causa: " + e.getMessage());
            errore = e.toString();
            r = false;
        } finally {
            sp.close();
            connessione.con.close();
            return r;
        }
    }
}
