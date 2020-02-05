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

public class localiza1 implements Serializable {

    private String producto;
    private String color;
    private Date ingreso;
    private String ubicacion;
    private int seriales;
    private int tallos;

    public localiza1() {
    }

    public localiza1(String producto, String color, Date ingreso, String ubicacion, int seriales, int tallos) {
        this.producto = producto;
        this.color = color;
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

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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
        return "localiza{" + "producto=" + producto + ", color=" + color + ", ingreso=" + ingreso + ", ubicacion=" + ubicacion + ", seriales=" + seriales + ", tallos=" + tallos + '}';
    }

}
