/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoveCiboPK;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author postal
 */
public class ProvaGetRistorante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       
        
        
        //PIGLIARE ID RISTORANTE
        Integer idR = 1; //MOMENTANEO
        Restaurant rest = new Restaurant(idR);
        
        
        DB_Manager dbm = new DB_Manager();
            
            if( new DB_Manager().cercaRistorante_perId(rest)){

                    if( ! new DB_Manager().cercaUser_perId(rest.getOwner()))
                        System.out.println("ERROE1");
                    
                    if( ! new DB_Manager().cercaUser_perId(rest.getCreator()))
                        System.out.println("ERROE2");
                    
                    if( ! new DB_Manager().setOrariPerRistorante(rest))
                          System.out.println("ERROE3");
                    
                    if( ! new DB_Manager().cercaPriceRange_perId(rest.getPrice_range()))
                        System.out.println("ERROE4");
                    
                    if( ! new DB_Manager().cercaCoordinate_perId(rest.getCordinate()))
                        System.out.println("ERROE5");
                    
                    if( ! new DB_Manager().setCommenti_perRistorante(rest))
                        System.out.println("ERROE6");

                    System.out.println("ID r " + rest.getId());
                    System.out.println("nik ow " + rest.getOwner().getNickname());
                    System.out.println("nik cr " + rest.getCreator().getNickname());
                    System.out.println("end m mar " + rest.getWeek_hours().getWeek()[1].getEndM());
                    System.out.println("coordinate " + rest.getCordinate().getAdrers());
                    System.out.println("Commento " + rest.getReviews().get(0).getName());
                
                
            }else{
                System.out.println("ERROE555");
            }
        
        
        
    }
    
}