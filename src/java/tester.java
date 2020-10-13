
import Modelo.Tab.localiza;
import Modelo.Tab.localiza1;
import Modelo.iLocaliza;
import Modelo.iLocaliza1;
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
            iLocaliza1 iL = new iLocaliza1();
            List<localiza1> lista = iL.lista();
            for (localiza1 l : lista) {
                System.out.println(l.getProducto());
            }
        } catch (SQLException ex) {
            Logger.getLogger(tester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
