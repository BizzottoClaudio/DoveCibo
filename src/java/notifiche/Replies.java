package notifiche;

import java.sql.Date;
import users.User;

/**
 * Contiene i metodi per la gestione delle risposte ai commenti
 *
 * @author stefano
 */
public class Replies {
    private Integer id;
    private Integer idReview;
    private String description;
    private Date date_creation;
    private Date date_validation;
    private User validator;
    private User owner;

    /**
     * Costruttore risposta 
     *
     * @param description testo della risposta del risoratore
     */
    public Replies(String description) {
        this.description = description;
    }

    /**
     * Costruttore risposta
     * 
     * @param id id della risposta del risoratore
     * @param description testo della risposta del risoratore
     * @param date_creation data di creazione della risposta del risoratore
     * @param date_validation data di validazione della risposta del risoratore
     * @param validator admin che ha validato la risposta del risoratore
     * @param owner ristoratore che ha creato la risposta
     * @param idReview id della recensione a cui il ristoratore risponde
     */
    public Replies(Integer id, String description, Date date_creation, Date date_validation, User validator, User owner, Integer idReview) {
        this.id = id;
        this.description = description;
        this.date_creation = date_creation;
        this.date_validation = date_validation;
        this.validator = validator;
        this.owner = owner;
        this.idReview = idReview;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public Date getDate_validation() {
        return date_validation;
    }

    public String getDescription() {
        return description;
    }

    public Integer getId() {
        return id;
    }
    
    public Integer getIdReview() {
        return idReview;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public User getOwner() {
        return owner;
    }
}
