<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="homepageCSS.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </head>
    <body style="padding-top: 70px;">
        <div class="navbar navbar-inverse navbar-static-top navbar-fixed-top" role="navigation">

            <!-- bottone menù che compare quando la finestra è piccola-->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="home.jsp">DoveCibo</a>
            </div>

            <!-- il contenuto del menù -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav navbar-right">

                    <!-- bottone che puppa la finestrella delle notifiche-->
                    <li><a href="#" data-toggle="modal" data-target="#notifiche"><span class="glyphicon glyphicon-tags"></span> Notifiche</a></li>

                    <!-- Nome e Cognome dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-user"></span> Nome e Cognome <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="profiloUtente.jsp"><span class="glyphicon glyphicon-cog"></span> Profilo</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="aggiungiRistorante.jsp"><span class="glyphicon glyphicon-plus"></span> Aggiungi ristorante</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="ristorante.jsp"><span class="glyphicon glyphicon-eye-open"></span> Vedi il tuo ristorante</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="modificaRistorante.jsp"><span class="glyphicon glyphicon-wrench"></span> Modifica il tuo ristorante</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Esci</a></li>
                        </ul>
                    </li>
                    <!-- bottone che puppa la finestrella per accedere-->
                    <li><a href="#" data-toggle="modal" data-target="#accedi"><span class="glyphicon glyphicon-log-in"></span> Accedi</a></li>
                      

                
                    <!-- registrati -->
                    </a><li style="padding-right: 35px;"><a href="aggiungiUtente.jsp"><span class="glyphicon glyphicon-pencil"></span><b> Registrati </b></a></li>   
                </ul> 
            </div><!-- fine menù -->
        </div><!-- fine navBar -->

        <!-- Modal accedi-->
        <div class="modal fade" id="accedi" role="dialog">
            <div class="modal-dialog modal-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span></button>
                    </div>
                    <div class="modal-body">
                        <div class="row" style="">
                            <div class="col-md-12">
                                <form class="form" action="ServletLogin" method="post">
                                    <div class="form-group">
                                        <div class="input-group">
                                            <div class="input-group-addon"><span class="glyphicon glyphicon-user"></span></div>
                                            <input type="text" class="form-control" name="nickname" placeholder="Nickname">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-group">
                                            <div class="input-group">
                                                <div class="input-group-addon">
                                                    <span class="glyphicon glyphicon-lock"></span>
                                                </div>
                                                <input type="password" class="form-control" name="password" placeholder="Password">
                                            </div>
                                        </div>
                                        <div class="help-block text-right">
                                            <a href="recupero_credenziali.jsp">Password dimenticata ?</a>
                                        </div>
                                    </div>

                                    <button type="reset" class="btn btn-sm btn-warning">Clear</button>
                                    <button type="submit" class="btn btn-success pull-right">Log in</button>
                                    <div class="checkbox">
                                        <label class="pull-right">
                                            <input type="checkbox"> mantieni l'accesso
                                        </label>
                                    </div>   
                                </form>
                            </div>
                        </div>    
                    </div>
                    <div class="modal-footer">
                        <div class="bottom text-center">
                            Prima volta ? <a href="aggiungiUtente.jsp"><span class="glyphicon glyphicon-pencil"></span><b> Registrati !</b></a>
                        </div>
                    </div>
                </div>   
            </div>
        </div> <!-- fine modal accedi -->


        <!-- Modal notifiche-->
        <div class="modal fade" id="notifiche" role="dialog">
            <div class="modal-dialog modal-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span></button>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="bottom">
                                    <p style="color: black; font-size: 18px"><b>Notifiche recenti:</b></p>
                                    <hr align=?left? size=?1? width=?300? style="border-top-color: #e5e5e5;" noshade>
                                    John ha caricato una foto
                                    <hr align=?left? size=?1? width=?300? style="border-top-color: #e5e5e5;" noshade>
                                    John reclama un ristorante
                                    <hr align=?left? size=?1? width=?300? style="border-top-color: #e5e5e5;" noshade>
                                    John chiede l'eliminazione di una foto 
                                </div>
                            </div>
                        </div>   
                    </div>
                    <div class="modal-footer">
                        <div class="bottom text-center">
                            <button class="btn btn-info btn-justified" onclick="window.location.href = 'notifiche.jsp'">Vedi tutte le notifiche</button>
                        </div>
                    </div>
                </div>   
            </div>
        </div> <!-- fine modal notifiche -->

    </body>
    
</html>