package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DoveCiboPK.User;
import java.util.ArrayList;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navBar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>DoveCibo</title>\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                background-image: url('img/img (1)big.jpeg');\r\n");
      out.write("                background-repeat: no-repeat;\r\n");
      out.write("                background-attachment: fixed;\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("            }\r\n");
      out.write("            h1 {\r\n");
      out.write("                /* text-shadow: 5px 5px 13px black; */\r\n");
      out.write("            }\r\n");
      out.write("            .ombra {\r\n");
      out.write("                /* box-shadow: 5px 5px 13px black; */\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            form#search-form{\r\n");
      out.write("   position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form#search-form ul{\r\n");
      out.write("   position: absolute;\r\n");
      out.write("   top: 0;\r\n");
      out.write("   left: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   max-height: 200px;\r\n");
      out.write("   overflow: auto;\r\n");
      out.write("   z-index: 1;\r\n");
      out.write("   border: 1px solid #DDDDDD;\r\n");
      out.write("   border-radius: 6px;\r\n");
      out.write("}\r\n");
      out.write("span.ui-helper-hidden-accessible{\r\n");
      out.write("   display: none !important;\r\n");
      out.write("}\r\n");
      out.write(".ui-state-focus{\r\n");
      out.write("   color: #ffffff;\r\n");
      out.write("   background-color: #428bca;\r\n");
      out.write("}\r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("            $(function(){\r\n");
      out.write("   \r\n");
      out.write("   var availableTags=[\"action\",\"test\"];\r\n");
      out.write("\r\n");
      out.write("   $(\"#spotlight\").autocomplete({\r\n");
      out.write("      source: availableTags,\r\n");
      out.write("      appendTo: $(\"form:first\")\r\n");
      out.write("   });\r\n");
      out.write("\r\n");
      out.write("   $(\"spotlight\").data(\"ui-autocomplete\" )._renderMenu = function(ul, items){\r\n");
      out.write("      var that = this;\r\n");
      out.write("      ul.attr(\"class\", \"nav nav-pills nav-stacked\");\r\n");
      out.write("      $.each(items, function(index, item){that._renderItemData(ul, item);\r\n");
      out.write("      });\r\n");
      out.write("   };\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.12.3.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.12/js/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"padding-top: 70px;\">\r\n");
      out.write("        <div class=\"navbar navbar-inverse navbar-static-top navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("\r\n");
      out.write("            <!-- bottone menù che compare quando la finestra è piccola-->\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"home.jsp\">DoveCibo</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- il contenuto del menù -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    ");

                        if(session.isNew()){
                            
      out.write("\r\n");
      out.write("                            <!-- registrati -->\r\n");
      out.write("</a><li style=\"padding-right: 15px;\" ><a href=\"aggiungiUtente.jsp\"><span class=\"glyphicon glyphicon-pencil\"></span><b> Registrati </b></a></li>\r\n");
      out.write("<!-- bottone che puppa la finestrella per accedere-->\r\n");
      out.write("<li><a href=\"#\" data-toggle=\"modal\" data-target=\"#accedi\" style=\"padding-right: 35px;\"><span class=\"glyphicon glyphicon-log-in\"></span> Accedi</a></li>     \r\n");
      out.write("</ul> \r\n");
      out.write("</div><!-- fine menù -->\r\n");
      out.write("</div><!-- fine navBar -->\r\n");
      out.write("                    ");
        
                        }else{
                        Cookie cookies[] = request.getCookies();
                        if (cookies != null && cookies.length > 1) {   
                            for(int i = 0; i < cookies.length ;i++){
                                if (cookies[i].getValue().equals("1")) { 
                                        
                                                        
      out.write("\r\n");
      out.write("                    <!-- bottone che puppa la finestrella delle notifiche-->\r\n");
      out.write("                    <li><a href=\"#\" data-toggle=\"modal\" data-target=\"#notifiche\" style=\"padding-right: 15px;\"><span class=\"glyphicon glyphicon-tags\"></span> Notifiche</a></li>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Nome e Cognome dropdown -->\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"padding-right: 35px;\"><span class=\"glyphicon glyphicon-user\"></span> ");
      out.print(session.getAttribute("user_name") );
      out.write(' ');
      out.print(session.getAttribute("user_surname") );
      out.write(" <span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            <li><a href=\"profiloUtente.jsp\"><span class=\"glyphicon glyphicon-cog\" disabled></span> Profilo</a></li>\r\n");
      out.write("                            <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                            <form class=\"form\" action=\"ExitProfilo\" method=\"post\">\r\n");
      out.write("                                <div class=\"row text-center\">\r\n");
      out.write("                                <li><button href=\"home.jsp\" type=\"submit\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-log-out\"></span> Esci </button></li>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul> \r\n");
      out.write("            </div><!-- fine menù -->\r\n");
      out.write("        </div><!-- fine navBar -->\r\n");
      out.write("        ");

            }
 if (cookies[i].getValue().equals("2")) {
        
      out.write("\r\n");
      out.write("        <!-- bottone che puppa la finestrella delle notifiche-->\r\n");
      out.write("    <li><a href=\"#\" data-toggle=\"modal\" data-target=\"#notifiche\"><span class=\"glyphicon glyphicon-tags\" style=\"padding-right: 15px;\"></span> Notifiche</a></li>\r\n");
      out.write("    <!-- Ristorante dropdown -->\r\n");
      out.write("    <li class=\"dropdown\">\r\n");
      out.write("        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"padding-right: 15px;\"><span class=\"glyphicon glyphicon-cutlery\"></span> Ristorante <span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"aggiungiRistorante.jsp\"><span class=\"glyphicon glyphicon-plus\"></span> Aggiungi ristorante</a></li>\r\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("            <form action=\"VisualizzaRistorantiUtente2\" method=\"post\">\r\n");
      out.write("                <div class=\"row text-center\">\r\n");
      out.write("                    <li><button type=\"submit\" class=\"btn btn-info\"><span class=\"glyphicon glyphicon-eye-open\"></span> Vedi i tuoi ristoranti</button></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("            <form action=\"VisualizzaRistoranti\" method=\"post\">\r\n");
      out.write("                <div class=\"row text-center\">\r\n");
      out.write("                    <li><button type=\"submit\" class=\"btn btn-info\"><span class=\"glyphicon glyphicon-eye-open\"></span> Vedi i ristoranti inseriti</button></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("    <!-- Nome e Cognome dropdown -->\r\n");
      out.write("    <li class=\"dropdown\">\r\n");
      out.write("        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"padding-right: 35px;\"><span class=\"glyphicon glyphicon-user\"></span> ");
      out.print(session.getAttribute("user_name") );
      out.write(' ');
      out.print(session.getAttribute("user_surname") );
      out.write(" <span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"profiloUtente.jsp\"><span class=\"glyphicon glyphicon-cog\"></span> Profilo</a></li>\r\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("            <form class=\"form\" action=\"ExitProfilo\" method=\"post\">\r\n");
      out.write("                <div class=\"row text-center\">\r\n");
      out.write("                <li><button href=\"home.jsp\" type=\"submit\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-log-out\"></span> Esci </button></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("</ul> \r\n");
      out.write("</div><!-- fine menù -->\r\n");
      out.write("</div><!-- fine navBar -->\r\n");

    }
 if (cookies[i].getValue().equals("3") && session.getAttribute("user_res").equals("yes") ) {


      out.write("\r\n");
      out.write("<!-- Ristorante dropdown -->\r\n");
      out.write("    <li class=\"dropdown\">\r\n");
      out.write("        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"padding-right: 15px;\"><span class=\"glyphicon glyphicon-cutlery\"></span> Ristorante <span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"aggiungiRistorante.jsp\"><span class=\"glyphicon glyphicon-plus\"></span> Aggiungi ristorante</a></li>\r\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("            <form action=\"VisualizzaRistoranti\" method=\"post\">\r\n");
      out.write("                <div class=\"row text-center\">\r\n");
      out.write("                    <li><button type=\"submit\" class=\"btn btn-info\"><span class=\"glyphicon glyphicon-eye-open\"></span> Vedi i ristoranti inseriti</button></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("<!-- Nome e Cognome dropdown -->\r\n");
      out.write("\r\n");
      out.write("<li class=\"dropdown\">\r\n");
      out.write("    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"padding-right: 35px;\"><span class=\"glyphicon glyphicon-user\"></span>  ");
      out.print(session.getAttribute("user_name") );
      out.write(' ');
      out.print(session.getAttribute("user_surname") );
      out.write(" <span class=\"caret\"></span></a>\r\n");
      out.write("    <ul class=\"dropdown-menu\">\r\n");
      out.write("        <li><a href=\"profiloUtente.jsp\"><span class=\"glyphicon glyphicon-cog\"></span> Profilo</a></li>\r\n");
      out.write("        <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("        <form class=\"form\" action=\"ExitProfilo\" method=\"post\">\r\n");
      out.write("            <div class=\"row text-center\">\r\n");
      out.write("                <li><button href=\"home.jsp\" type=\"submit\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-log-out\"></span> Esci </button></li>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </ul>\r\n");
      out.write("</li>\r\n");
      out.write("</ul> \r\n");
      out.write("</div><!-- fine menù -->\r\n");
      out.write("</div><!-- fine navBar -->\r\n");
      out.write("\r\n");

        }
 if (cookies[i].getValue().equals("3")  && session.getAttribute("user_res").equals("no")){

      out.write("\r\n");
      out.write("  <!-- Ristorante dropdown -->\r\n");
      out.write("    <li class=\"dropdown\">\r\n");
      out.write("        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"padding-right: 15px;\"><span class=\"glyphicon glyphicon-cutlery\"></span> Ristorante <span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"aggiungiRistorante.jsp\"><span class=\"glyphicon glyphicon-plus\"></span> Aggiungi ristorante</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("<!-- Nome e Cognome dropdown -->\r\n");
      out.write("\r\n");
      out.write("<li class=\"dropdown\">\r\n");
      out.write("    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"padding-right: 35px;\"><span class=\"glyphicon glyphicon-user\"></span> ");
      out.print(session.getAttribute("user_name") );
      out.write(' ');
      out.print(session.getAttribute("user_surname") );
      out.write(" <span class=\"caret\"></span></a>\r\n");
      out.write("    <ul class=\"dropdown-menu\">\r\n");
      out.write("        <li><a href=\"profiloUtente.jsp\"><span class=\"glyphicon glyphicon-cog\"></span> Profilo</a></li>\r\n");
      out.write("        <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("        <form class=\"form\" action=\"ExitProfilo\" method=\"post\">\r\n");
      out.write("            <div class=\"row text-center\">\r\n");
      out.write("                <li><button href=\"home.jsp\" type=\"submit\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-log-out\"></span> Esci </button></li>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </ul>\r\n");
      out.write("</li>\r\n");
      out.write("</ul> \r\n");
      out.write("</div><!-- fine menù -->\r\n");
      out.write("</div><!-- fine navBar -->\r\n");

        }
}
}else{


      out.write("\r\n");
      out.write("<!-- registrati -->\r\n");
      out.write("</a><li style=\"padding-right: 15px;\" ><a href=\"aggiungiUtente.jsp\"><span class=\"glyphicon glyphicon-pencil\"></span><b> Registrati </b></a></li>\r\n");
      out.write("<!-- bottone che puppa la finestrella per accedere-->\r\n");
      out.write("<li><a href=\"#\" data-toggle=\"modal\" data-target=\"#accedi\" style=\"padding-right: 35px;\"><span class=\"glyphicon glyphicon-log-in\"></span> Accedi</a></li>     \r\n");
      out.write("</ul> \r\n");
      out.write("</div><!-- fine menù -->\r\n");
      out.write("</div><!-- fine navBar -->\r\n");

}
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal accedi-->\r\n");
      out.write("<div class=\"modal fade\" id=\"accedi\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\"></span></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"row\" style=\"\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <form class=\"form\" action=\"ServletLogin\" method=\"post\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <div class=\"input-group-addon\"><span class=\"glyphicon glyphicon-user\"></span></div>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nickname\" placeholder=\"Nickname\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                        <div class=\"input-group-addon\">\r\n");
      out.write("                                            <span class=\"glyphicon glyphicon-lock\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"help-block text-right\">\r\n");
      out.write("                                    <a href=\"recupero_credenziali.jsp\">Password dimenticata ?</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <button type=\"reset\" class=\"btn btn-sm btn-warning\">Clear</button>\r\n");
      out.write("                            <button href=\"home.jsp\" type=\"submit\" class=\"btn btn-success pull-right\">Log in</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>    \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <div class=\"bottom text-center\">\r\n");
      out.write("                    Prima volta ? <a href=\"aggiungiUtente.jsp\"><span class=\"glyphicon glyphicon-pencil\"></span><b> Registrati !</b></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>   \r\n");
      out.write("    </div>\r\n");
      out.write("</div> <!-- fine modal accedi -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal notifiche-->\r\n");
      out.write("<div class=\"modal fade\" id=\"notifiche\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\"></span></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div class=\"bottom\">\r\n");
      out.write("                            <p style=\"color: black; font-size: 18px\"><b>Notifiche recenti:</b></p>\r\n");
      out.write("                            <hr align=?left? size=?1? width=?300? style=\"border-top-color: #e5e5e5;\" noshade>\r\n");
      out.write("                            John ha caricato una foto\r\n");
      out.write("                            <hr align=?left? size=?1? width=?300? style=\"border-top-color: #e5e5e5;\" noshade>\r\n");
      out.write("                            John reclama un ristorante\r\n");
      out.write("                            <hr align=?left? size=?1? width=?300? style=\"border-top-color: #e5e5e5;\" noshade>\r\n");
      out.write("                            John chiede l'eliminazione di una foto \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>   \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <div class=\"bottom text-center\">\r\n");
      out.write("                    <button class=\"btn btn-info btn-justified\" onclick=\"window.location.href = 'notifiche.jsp'\">Vedi tutte le notifiche</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>   \r\n");
      out.write("    </div>\r\n");
      out.write("</div> <!-- fine modal notifiche -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\" style=\"margin-top: 25%;\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3\"></div>\r\n");
      out.write("                <div class=\"col-md-6\" style=\"background-color: rgba(255, 255, 255, 0.80); border-radius: 5px;\">\r\n");
      out.write("                    <form action=\"CercaRistorantiHome\" method=\"post\">\r\n");
      out.write("                        <h1 style=\"color: black; font-size: 50px; padding-top: 5%; \">Cerca un ristorante</h1>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"input-group input-group-lg ombra\" style=\"padding-bottom: 5%; \">\r\n");
      out.write("                            <input type=\"text\" name=\"go\" class=\"form-control\" placeholder=\"Cerca un ristorante\" required>\r\n");
      out.write("                            <span class=\"input-group-btn\">\r\n");
      out.write("                                <!-- questo bottone submitta la ricerca, per ora linka solo la pagina dei ristoranti -->\r\n");
      out.write("                                <button class=\"btn btn-success\" type=\"submit\">Go!</button> \r\n");
      out.write("                        </div> \r\n");
      out.write("                    </form>                                 \r\n");
      out.write("                </div> \r\n");
      out.write("                <div class=\"col-md-3\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br><br><br><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("   <div class=\"col-sm-6 col-md-6\">\r\n");
      out.write("      <form id=\"search-form\" role=\"form\">\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <label for=\"spotlight\">cerca</label>\r\n");
      out.write("            <input type=\"email\" class=\"form-control\" id=\"spotlight\" placeholder=\"cerca\">\r\n");
      out.write("         </div>\r\n");
      out.write("      </form>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
