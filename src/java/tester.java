
import Modelo.Tab.localiza;
import Modelo.iLocaliza;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author almoreno
 */
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            iLocaliza iL = new iLocaliza();
            List<localiza> lista = iL.lista();
            for (localiza l : lista) {
                System.out.println(l.getProducto());
            }
        } catch (SQLException ex) {
            Logger.getLogger(tester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
