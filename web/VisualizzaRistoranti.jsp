<%@page import="restaurants.Cusine"%>
<%@page import="restaurants.Restaurant"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--
    Mostra i ristoranti inseriti nel database di cui l’utente è proprietario
--%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">        
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="/DoveCiboGit/css/visualizzaRistoranti.css" />
        
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>      
        <script src="http://code.jquery.com/jquery-1.12.3.js"></script>
        <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.12/js/dataTables.bootstrap.min.js"></script>
        <script type="text/javascript" src="/DoveCiboGit/script/datatable.js"></script>
        <script type="text/javascript" src="/DoveCiboGit/script/datatable2.js"></script>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body style="padding-top: 70px;">
        <%@ include file="navBar.jsp" %>
        <div class="container">        
            <div class="row row-centered">
                <table id="DataTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
                    <thead>
                        <tr style="background-color: rgba(198, 239, 255, 1);">
                            <th>NOME</th>
                            <th>VALUTAZIONE</th>
                            <th>RANK</th>
                            <th>COMMENTI</th>
                            <th>CUCINA</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Nome</th>
                            <th>Valutazione</th>
                            <th>Rank</th>
                            <th>Review</th>
                            <th>Cucine</th>
                        </tr>
                    </tfoot>
                    <tbody style="background-color: white;">
                        <%                            
                           ArrayList <Restaurant> ALR = (ArrayList <Restaurant>) request.getAttribute("RistorantiProprietario");
                           ArrayList <Integer> classifica = (ArrayList <Integer>) request.getAttribute("classifica");
                           for (Restaurant rest : ALR) {
                        %>
                        <tr>
                            <td>
                                <!-- bottone SUBMIT che contiene il nome del ristorante -->
                                <div class="bottom text-center">
                                    <b><a href='/DoveCiboGit/ServletGetRistorante?idR=<%= rest.getId() %> ' style="color: blue"><%= rest.getName().substring(0, 1).toUpperCase()+rest.getName().substring(1) %></a></b>
                                </div>
                                <br>
                                <div class="bottom text-center">
                                    <button class="btn btn-info btn-justified" onclick="window.location.href='/DoveCiboGit/ServletGetRistoranteProprietario?idR=<%=rest.getId()%>'">Modifica</button>
                                </div>
                            </td>
                            <%  BigDecimal roundfinalPrice = new BigDecimal(rest.getGlobal_value()).setScale(1,BigDecimal.ROUND_HALF_UP); %>
                            <td><%= roundfinalPrice %></td>
                            <td> <%= classifica.indexOf(rest.getId())+1 %> </td>
                            <td><%= rest.getN_reviews() %></td>
                            <td>                                                
                                <%
                                    int size = rest.getCusines().size();
                                    for(Cusine c : rest.getCusines()){
                                        if(size > 1){
                                %>
                                        <%=c.getName()+", "%>
                                <%
                                        }else{
                                %>
                                            <%=c.getName()%>
                                <%
                                        }
                                        size-=1;
                                    }
                                %>
                            </td>
                        </tr>
                            <%
                                }
                            %>
                    </tbody>
                </table>           
            </div>
        </div>       
    </body>
</html>
