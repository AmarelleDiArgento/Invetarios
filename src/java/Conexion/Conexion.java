/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Modelo.Tab.localiza;
import java.sql.*;
import java.util.List;

/**
 *
 * @author almoreno
 */
public abstract class Conexion {

    Connection con = null;

    public Conexion() {
    }

    public Connection getCondb1() throws SQLException {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection("jdbc:sqlserver://elt-db1-fca;databaseName=FDIM;integratedSecurity=true");
        } catch (ClassNotFoundException ex) {
            System.out.print("Class for name: " + ex);
        }

        return con;
    }

}
