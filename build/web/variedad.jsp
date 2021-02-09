<%@page import="Modelo.iLocaliza1"%>
<%@page import="Modelo.Tab.localiza1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Tab.localiza"%>
<%@page import="Modelo.iLocaliza"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link href="css/materialize.min.css" rel="stylesheet">
        <link href="css/datatable/jquery.dataTables.min.css" rel="stylesheet">

        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta charset="UTF-8">
        <title>Inventarios Bqt</title>
        <link rel="shortcut icon" type="image/png" href="image/inventario-icono-png.png">

        <script src="js/jquery.min.js"></script>
        <script src="js/materialize.min.js"></script>
        <script src="js/init.js"></script>
        <script src="js/datatable/jquery.dataTables.min.js"></script>

        <script>
            $(document).ready(function () {

                $('#datos thead tr').clone(true).appendTo('#datos thead');
                $('#datos thead tr:eq(1) th').each(function (i) {
                    var title = $(this).text();
                    $(this).html('<input type="text" class="blue-grey lighten-5 center center-align" placeholder="Buscar ' + title + '" />');

                    $('input', this).on('keyup change', function () {
                        if (table.column(i).search() !== this.value) {
                            table
                                    .column(i)
                                    .search(this.value)
                                    .draw();
                        }
                    });
                });
                var table = $('#datos').DataTable({
                    pageLength: 25,
                    orderCellsTop: true,
                    fixedHeader: true,

                    "language": {
                        "decimal": ",",
                        "thousands": ".",
                        "sProcessing": "Procesando...",
                        "sLengthMenu": "Mostrar _MENU_ registros",
                        "sZeroRecords": "No se encontraron resultados",
                        "sEmptyTable": "Ningún dato disponible en esta tabla",
                        "sInfo": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
                        "sInfoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
                        "sInfoFiltered": "(filtrado de un total de _MAX_ registros)",
                        "sInfoPostFix": "",
                        "sSearch": "Buscar:",
                        "sUrl": "",
                        "sInfoThousands": ",",
                        "sLoadingRecords": "Cargando...",
                        "oPaginate": {
                            "sFirst": "Primero",
                            "sLast": "Último",
                            "sNext": "Siguiente",
                            "sPrevious": "Anterior"
                        },
                        "oAria": {
                            "sSortAscending": ": Activar para ordenar la columna de manera ascendente",
                            "sSortDescending": ": Activar para ordenar la columna de manera descendente"
                        }
                    }
                });
                $("select").val('25');
                $('select').addClass("browser-default input-field col s12 m4 l8 center center-align");
                $('select').material_select();

            });
        </script>
        
    </head>
    <body>

        <div class="container">
            <div class="col s12 center center-align">
                <h1> 
                    Inventarios
                </h1>

                <div class="container">
                    <ul id="nav-mobile" className="right hide-on-med-and-down">
                        <li><a href="index.jsp" class="btn blue darken-1">color</a>
                        <a href="variedad.jsp" class="btn  black">variedad</a>
                        <a href="grado.jsp" class="btn  blue darken-1">grado</a></li>
                    </ul>
                </div>

                
            </div>
            <%
                List<localiza1> lista = new ArrayList<>();
                try {
                    iLocaliza1 iL = new iLocaliza1();
                    lista = iL.lista();

                } catch (Exception e) {
                    System.out.print("Conexion: " + e.toString());
            %>
            <h5 style="color: #8b1014">
                <%="Error: " + e%>
            </h5>
            <%
                }

                if (!lista.isEmpty()) {
            %>

            <table class="centered striped" id="datos" class="display" cellspacing="0" width="100%" >
                <thead class="blue-grey lighten-4">
                    <tr>
                        <th>Producto</th>
                        <th>Variedad</th>
                        <th>Ingreso</th>
                        <th>Ubicacion</th>
                        <th>Seriales</th>
                        <th>Tallos</th>
                    </tr>
                </thead>

                <tbody>
                    <%
                    for (localiza1 l : lista) {
                    %>


                    <tr>
                        <td><%= l.getProducto()%></td>
                        <td><%= l.getColor()%></td>
                        <td><%= l.getIngreso()%></td>
                        <td><%= l.getUbicacion()%></td>
                        <td class="center center"><%= l.getSeriales()%></td>
                        <td class="center center"><%= l.getTallos()%></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>

            <%
            } else {
            %>
            <h1 >
                No hay datos
            </h1>
            <%
                }


            %>

        </div>
    </body>
</html>
