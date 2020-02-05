package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Tab.localiza;
import Modelo.iLocaliza;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <!--Import Google Icon Font-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <!--Import materialize.css-->\r\n");
      out.write("        <link href=\"css/materialize.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/datatable/jquery.dataTables.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Inventarios Bqt</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"image/inventario-icono-png.png\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/materialize.min.js\"></script>\r\n");
      out.write("        <script src=\"js/init.js\"></script>\r\n");
      out.write("        <script src=\"js/datatable/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("                $('#datos thead tr').clone(true).appendTo('#datos thead');\r\n");
      out.write("                $('#datos thead tr:eq(1) th').each(function (i) {\r\n");
      out.write("                    var title = $(this).text();\r\n");
      out.write("                    $(this).html('<input type=\"text\" class=\"blue-grey lighten-5 center center-align\" placeholder=\"Buscar ' + title + '\" />');\r\n");
      out.write("\r\n");
      out.write("                    $('input', this).on('keyup change', function () {\r\n");
      out.write("                        if (table.column(i).search() !== this.value) {\r\n");
      out.write("                            table\r\n");
      out.write("                                    .column(i)\r\n");
      out.write("                                    .search(this.value)\r\n");
      out.write("                                    .draw();\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("                var table = $('#datos').DataTable({\r\n");
      out.write("                    pageLength: 25,\r\n");
      out.write("                    orderCellsTop: true,\r\n");
      out.write("                    fixedHeader: true,\r\n");
      out.write("\r\n");
      out.write("                    \"language\": {\r\n");
      out.write("                        \"decimal\": \",\",\r\n");
      out.write("                        \"thousands\": \".\",\r\n");
      out.write("                        \"sProcessing\": \"Procesando...\",\r\n");
      out.write("                        \"sLengthMenu\": \"Mostrar _MENU_ registros\",\r\n");
      out.write("                        \"sZeroRecords\": \"No se encontraron resultados\",\r\n");
      out.write("                        \"sEmptyTable\": \"Ningún dato disponible en esta tabla\",\r\n");
      out.write("                        \"sInfo\": \"Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros\",\r\n");
      out.write("                        \"sInfoEmpty\": \"Mostrando registros del 0 al 0 de un total de 0 registros\",\r\n");
      out.write("                        \"sInfoFiltered\": \"(filtrado de un total de _MAX_ registros)\",\r\n");
      out.write("                        \"sInfoPostFix\": \"\",\r\n");
      out.write("                        \"sSearch\": \"Buscar:\",\r\n");
      out.write("                        \"sUrl\": \"\",\r\n");
      out.write("                        \"sInfoThousands\": \",\",\r\n");
      out.write("                        \"sLoadingRecords\": \"Cargando...\",\r\n");
      out.write("                        \"oPaginate\": {\r\n");
      out.write("                            \"sFirst\": \"Primero\",\r\n");
      out.write("                            \"sLast\": \"Último\",\r\n");
      out.write("                            \"sNext\": \"Siguiente\",\r\n");
      out.write("                            \"sPrevious\": \"Anterior\"\r\n");
      out.write("                        },\r\n");
      out.write("                        \"oAria\": {\r\n");
      out.write("                            \"sSortAscending\": \": Activar para ordenar la columna de manera ascendente\",\r\n");
      out.write("                            \"sSortDescending\": \": Activar para ordenar la columna de manera descendente\"\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                $(\"select\").val('25');\r\n");
      out.write("                $('select').addClass(\"browser-default input-field col s12 m4 l8 center center-align\");\r\n");
      out.write("                $('select').material_select();\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"col s12 center center-align\">\r\n");
      out.write("                <h1> \r\n");
      out.write("                    Inventarios\r\n");
      out.write("                </h1>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

                List<localiza> lista = new ArrayList<>();
                try {
                    iLocaliza iL = new iLocaliza();
                    lista = iL.lista();

                } catch (Exception e) {
                    System.out.print("Conexion: " + e.toString());
            
      out.write("\r\n");
      out.write("            <h5 style=\"color: #8b1014\">\r\n");
      out.write("                ");
      out.print("Error: " + e);
      out.write("\r\n");
      out.write("            </h5>\r\n");
      out.write("            ");

                }

                if (!lista.isEmpty()) {
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <table class=\"centered striped\" id=\"datos\" class=\"display\" cellspacing=\"0\" width=\"100%\" >\r\n");
      out.write("                <thead class=\"blue-grey lighten-4\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Producto</th>\r\n");
      out.write("                        <th>Color</th>\r\n");
      out.write("                        <th>Ingreso</th>\r\n");
      out.write("                        <th>Ubicacion</th>\r\n");
      out.write("                        <th>Seriales</th>\r\n");
      out.write("                        <th>Tallos</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    ");
                    for (localiza l : lista) {
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print( l.getProducto());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( l.getColor());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( l.getIngreso());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( l.getUbicacion());
      out.write("</td>\r\n");
      out.write("                        <td class=\"center center\">");
      out.print( l.getSeriales());
      out.write("</td>\r\n");
      out.write("                        <td class=\"center center\">");
      out.print( l.getTallos());
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("            ");

            } else {
            
      out.write("\r\n");
      out.write("            <h1 >\r\n");
      out.write("                No hay datos\r\n");
      out.write("            </h1>\r\n");
      out.write("            ");

                }


            
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--  Scripts-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
