<%@page import="users.User"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--
    Landing page del sito
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">        
        <link rel="stylesheet" type="text/css" href="/DoveCiboGit/css/home.css" />
        
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>      
        <script src="http://code.jquery.com/jquery-1.12.3.js"></script>
        <script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyC2yRPFE60Fp4Q05ezqySYocW9zpmqeIwI" async defer></script>
        <script type="text/javascript" src="/DoveCiboGit/script/home_geo.js"></script>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%@ include file="navBar.jsp" %>
        <div class="container">
            <!-- Menù bottoni per show/hide pannelli di ricerca -->
            <div class="row" style="margin-top: 15%;">
                <div class="col-md-3"></div>
                <div class="col-md-6" style="background-color: rgba(255, 255, 255, 0.80); border-radius: 5px;">
                    <h2 style="color: black; font-size: 30px;">Scegli la tipologia di ricerca</h2>
                    <div class="row">
                        <div class="col-md-12">
                        <button class="btn btn-default" onClick="showGeneral()">Generale</button>
                        <button class="btn btn-default" onClick="showTypeNearby()">Posizione e Tipologia</button>
                        <button class="btn btn-default" onClick="showStatsNearby()">Posizione e Classifica</button> 
                        </div>
                    </div> 
                    <br>
                </div> 
                <div class="col-md-3"></div>
            </div>
            
            <br>
            <!-- Pannello di ricerca generale -->
            <div class="row" id="General">
                <div class="col-md-3"></div>
                <div class="col-md-6">
                <iframe width="100%" src="ServletGetAutoC" height="300" allowtransparency="true" id="iframe"></iframe>
                </div>
                <div class="col-md-3"></div>
            </div>
          
            <!-- Pannello di ricerca per Tipologia cucina e vicinanza -->
            <div class="row" id="TypeNearby" style="display: none;">
                <div class="col-md-3"></div>
                <div class="col-md-6" style="background-color: rgba(255, 255, 255, 0.80); border-radius: 5px;">
                    <h2 style="color: black; font-size: 30px;">Ricerca per posizione e tipologia</h2>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="input-group input-group-md" style="padding-bottom: 5%; ">
                                <input type="text"  id="indirizzo" class="form-control" placeholder="Zona" >
                                <span class="input-group-btn">
                                    <button class="btn btn-info" onclick="genCooInd()" >Genera coordinate</button>
                            </div>
                        </div>
                    </div>
                    <p class="text-center"><b>Oppure</b></p>
                    <div class="row">
                        <div class="col-md-12">
                            <button class="btn btn-group-justified btn-info" onclick="genCooGeo()" >Genera coordinate tramite GPS</button>
                        </div>
                    </div>
                    <form action="ServletGetRistorantiHomeCucine" method="post">
                        <div class="row">
                            <br>
                            <div class="col-md-6">
                                <label>Latitudine:</label>
                                <input type="text" id="inlat" name="lat" class="form-control" placeholder="12.123" required readonly="readonly">
                            </div>
                            <div class="col-md-6">
                                <label>Longitudine:</label>
                                <input type="text" id="inlng" name="lng" class="form-control" placeholder="12.123" required readonly="readonly">
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="input-group-md" style="padding-bottom: 5%; ">
                                    <div class="form-group ">
                                        <!-- <label class="sr-only" for="exampleInputAmount">Amount (in dollars)</label> -->
                                        <div class="input-group input-group-lg">
                                            <div class="input-group-addon">Tipologia: </div>
                                            <select class="form-control" id="sel1" name="cucina">
                                                <option>Pizzeria</option>
                                                <option>Trattoria</option>
                                                <option>Ristorante</option>
                                                <option>Disco Restaurant</option>
                                                <option>Straniera</option>
                                                <option>Altro</option>
                                            </select>
                                            <span class="input-group-btn">
                                                <button class="btn btn-lg btn-success" type="submit">Go!</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-3"></div>
            </div>
                 
            <!-- Pannello di ricerca per vicinanza e classifica -->
            <div class="row" id="StatsNearby" style="display: none;">
                <div class="col-md-3"></div>
                <div class="col-md-6" style="background-color: rgba(255, 255, 255, 0.80); border-radius: 5px;">
                    <h2 style="color: black; font-size: 30px;">Ricerca per posizione e classifica</h2>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="input-group input-group-md" style="padding-bottom: 5%; ">
                                <input type="text"  id="indirizzo2" class="form-control" placeholder="Zona" >
                                <span class="input-group-btn">
                                    <button class="btn btn-info" onclick="genCooInd2()" >Genera coordinate</button>
                            </div>
                        </div>
                    </div>
                    <p class="text-center"><b>Oppure</b></p>
                    <div class="row">
                        <div class="col-md-12">
                            <button class="btn btn-group-justified btn-info" onclick="genCooGeo2()" >Genera coordinate tramite GPS</button>
                        </div>
                    </div>
                    <form action="ServletGetRistorantiHomeValue" method="post">
                        <div class="row">
                            <br>
                            <div class="col-md-6">
                                <label>Latitudine:</label>
                                <input type="text" id="inlat2" name="lat" class="form-control" placeholder="12.123" required readonly="readonly">
                            </div>
                            <div class="col-md-6">
                                <label>Longitudine:</label>
                                <input type="text" id="inlng2" name="lng" class="form-control" placeholder="12.123" required readonly="readonly">
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-md-12">
                                <button class="btn btn-success btn-lg pull-right " type="submit">Go!</button>
                            </div>
                        </div> 
                    </form>
                    <div class="row"><p> </p></div>
                </div>
                <div class="col-md-3"></div>
            </div>
            <br><br>
    </body>
</html>