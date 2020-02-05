/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import Conexion.Conexion;
import Modelo.Tab.localiza;
import Modelo.Tab.localiza1;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author almoreno
 */
public class iLocaliza1 extends Conexion {

    PreparedStatement ps = null;
    ResultSet rs = null;
    String max = "";
    Connection con = null;

    public boolean conectado() {
        try {
            String estado;
            Connection c = getCondb1();
            if (c.isValid(500)) {
                System.out.println("Conectado");
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return false;
    }

    public List<localiza1> lista() throws SQLException {

        String md = "CREATE TABLE #t(\n" +
                    "idPostcosecha int	,\n" +
                    "Postcosecha varchar(max)	,\n" +
                    "idBodega int	,\n" +
                    "Bodega varchar(max)	,\n" +
                    "FechaPrimerIngreso date	,\n" +
                    "HoraIngresoBodega time,\n" +
                    "YearSemana int	,\n" +
                    "Semana int	,\n" +
                    "Serial varchar(max)	,\n" +
                    "idProducto int	,\n" +
                    "Producto varchar(max)	,\n" +
                    "idVariedad int	,\n" +
                    "Variedad varchar(max)	,\n" +
                    "idColorAgrupado int	,\n" +
                    "ColorAgrupado varchar(max)	,\n" +
                    "idColor int	,\n" +
                    "Color varchar(max)	,\n" +
                    "idGrado int	,\n" +
                    "Grado varchar(max)	,\n" +
                    "IdGradoMaestro int	,\n" +
                    "GradoMaestro varchar(max)	,\n" +
                    "idTipoCorte int	,\n" +
                    "TipoCorte varchar(max)	,\n" +
                    "TallosporRamo int	,\n" +
                    "RamosSaldo int	,\n" +
                    "TallosSaldo int	,\n" +
                    "TotalTallos int	,\n" +
                    "TallosClasificados int	,\n" +
                    "ProductoMaestro varchar(max)	,\n" +
                    "TipoEmpaque varchar(max)	,\n" +
                    "Marca varchar(max)	,\n" +
                    "Finca varchar(max)	,\n" +
                    "Ubicacion varchar(max)	,\n" +
                    "Pedido int	,\n" +
                    "Item int	,\n" +
                    "idReceta int	,\n" +
                    "Cliente varchar(max)	,\n" +
                    "indModificado varchar(max)	,\n" +
                    "BodegaDestino int	,\n" +
                    "PostcosechaEtiqueta varchar(max)	,\n" +
                    "FechaIngresoTunel datetime	,\n" +
                    "idTipoMovimiento_Ult varchar(max)\n" +
                    " ); \n" +
                    "\n" +
                    "INSERT INTO #t exec [FDIM].[INV].[PA_ReporteInventario] '342','2','0','0','0','-999','-999',null ;\n" +
                    "\n" +
                    "\n" +
                    "select Producto, Variedad, FechaPrimerIngreso Ingreso, Ubicacion, count(distinct Serial) Seriales, sum(TotalTallos) Tallos\n" +
                    "from #t \n" +
                    "group by Producto, Variedad, FechaPrimerIngreso, Ubicacion\n" +
                    "order by Producto, Variedad, FechaPrimerIngreso;\n" +
                    "\n" +
                    "drop table #t;";

        List<localiza1> data = new ArrayList<>();

        Connection cn = getCondb1();
        //cn.setAutoCommit(false);
        try {
            ps = getCondb1().prepareStatement(md);
            rs = ps.executeQuery();
            if (rs != null) {

                while (rs.next()) {
                    data.add(convertirLocaliza(rs));
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }

        // cn.commit();
        ps.close();
        cn.close();
        return data;
    }

    public localiza1 convertirLocaliza(ResultSet rs) throws SQLException {
        localiza1 l = new localiza1();
        l.setProducto(rs.getString("Producto"));
        l.setColor(rs.getString("Variedad"));
        l.setIngreso(rs.getDate("Ingreso"));
        l.setUbicacion(rs.getString("Ubicacion"));
        l.setSeriales(rs.getInt("Seriales"));
        l.setTallos(rs.getInt("Tallos"));

        return l;
    }

}
