package autocompletamento;

import database.DB_Coordinate;
import database.DB_GestioneRestaurant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import restaurants.Restaurant;

/**
 *
 * @author postal
 */
@WebServlet(name = "ServletGetAutoC", urlPatterns = {"/ServletGetAutoC"})
public class ServletGetAutoC extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //RICERCA DB
            ArrayList <Restaurant> ALR = new ArrayList<Restaurant>();
            HashSet <String> auto = new HashSet<String>();
            
            if ( new DB_GestioneRestaurant().tuttiRistoranti(ALR)) {
                for (Restaurant rest : ALR){
                    if ( ! new DB_Coordinate().cercaCoordinate_perId(rest.getCordinate()))
                        request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);
               
                    auto.add(rest.getName());
                    auto.add(rest.getCordinate().getAdrers());
                    auto.add(rest.getCordinate().getCity());
                    auto.add(rest.getCordinate().getNazione());
                }
            } else
                request.getRequestDispatcher("erroreConnessione.jsp").forward(request, response);
            
            request.setAttribute("auto", auto);
            request.getRequestDispatcher("autocompletamento.jsp").forward(request, response);
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
    }
}