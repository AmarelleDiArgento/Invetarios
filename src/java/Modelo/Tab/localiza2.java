/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tab;

/**
 *
 * @author almoreno
 */
import java.io.*;
import java.sql.Date;

public class localiza2 implements Serializable {

    private String producto;
    private String variedad;
    private String grado;
    private Date ingreso;
    private String ubicacion;
    private int seriales;
    private int tallos;

    public localiza2() {
    }

    public localiza2(String producto, String variedad, String grado, Date ingreso, String ubicacion, int seriales, int tallos) {
        this.producto = producto;
        this.variedad = variedad;
        this.grado = grado;
        this.ingreso = ingreso;
        this.ubicacion = ubicacion;
        this.seriales = seriales;
        this.tallos = tallos;
    }

    

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }
    
    

    /**
     * @return the color
     */
    public String getGrado() {
        return grado;
    }

    /**
     * @param color the color to set
     */
    public void setGrado(String grado) {
        this.grado = grado;
    }

    /**
     * @return the ingreso
     */
    public Date getIngreso() {
        return ingreso;
    }

    /**
     * @param ingreso the ingreso to set
     */
    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the seriales
     */
    public int getSeriales() {
        return seriales;
    }

    /**
     * @param seriales the seriales to set
     */
    public void setSeriales(int seriales) {
        this.seriales = seriales;
    }

    /**
     * @return the tallos
     */
    public int getTallos() {
        return tallos;
    }

    /**
     * @param tallos the tallos to set
     */
    public void setTallos(int tallos) {
        this.tallos = tallos;
    }

    @Override
    public String toString() {
        return "localiza{" + "producto=" + producto + ", grado=" + grado + ", variedad=" + variedad + ", ingreso=" + ingreso + ", ubicacion=" + ubicacion + ", seriales=" + seriales + ", tallos=" + tallos + '}';
    }

}
