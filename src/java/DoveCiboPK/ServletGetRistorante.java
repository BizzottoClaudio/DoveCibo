package DoveCiboPK;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author postal
 */
@WebServlet(name = "ServletGetRistorante", urlPatterns = {"/ServletGetRistorante"})
public class ServletGetRistorante extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

        //PIGLIARE ID RISTORANTE
        Integer idR = Integer.parseInt( request.getParameter("idR") );
        Restaurant rest = new Restaurant(idR);
        
        DB_Manager dbm = new DB_Manager();
        if( new DB_Manager().cercaRistorante_perId(rest)){
            if(!new DB_Manager().cercaOwners_perRistoranti(rest))
                request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);

            for (User u : rest.getOwners()){
                if( ! new DB_Manager().cercaUser_perId(u))
                    request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);
            }

            if( ! new DB_Manager().cercaUser_perId(rest.getCreator()))
                request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);

            if( ! new DB_Manager().cercaDay_hours_perId(rest.getDay_hours()))
                  request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);

            if( ! new DB_Manager().cercaPriceRangeId(rest.getPrice_range()))
                request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);

            if( ! new DB_Manager().cercaCoordinate_perId(rest.getCordinate()))
                request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);

            if( ! new DB_Manager().setCommenti_perRistorante(rest))
                request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);     

            if( ! new DB_Manager().cercaCusines_perRistoranye(rest))
                request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);                    

            if( ! new DB_Manager().cercaPhotos_perRistorante(rest, 0))
                request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);

            for (Review rew : rest.getReviews()) {                        
                if (! new DB_Manager().cercaUser_perId(rew.getCreator()))
                    request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);
                
                if(! new DB_Manager().setRepli_perRew(rew))
                    request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);
            }    
        }else{
            request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);
        }    
            //creo l'oggetto QR
            QR_generator qr = new QR_generator(rest);
            //ottengo la stringa descrittiva da inserire nel QR
            String qrCode = qr.qr_Gen();
            
            request.setAttribute("ristorante", rest);
            request.setAttribute("qrCode", qrCode);
            request.getRequestDispatcher("ristorante.jsp").forward(request, response);

        } catch (Exception ex) {
            request.setAttribute("error", ex.toString());
            request.getRequestDispatcher("errore.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}