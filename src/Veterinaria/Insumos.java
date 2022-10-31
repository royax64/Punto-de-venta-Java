/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterinaria;

/**
 *
 * @author ferri
 */
public class Insumos {
    private Integer clave = 0;
    private String nombre;
    private Integer cantidad;
    private Float preciocu;
    private Boolean activo = true;

    public Insumos(Integer clave, String nombre, Integer cantidad, Float preciocu, Boolean activo) {
        this.clave  = clave;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.preciocu = preciocu;
        this.activo = true;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPreciocu() {
        return preciocu;
    }

    public void setPreciocu(Float preciocu) {
        this.preciocu = preciocu;
    }

    @Override
    public String toString() {
        return clave + "\t" + nombre + "\t" + cantidad + "\t" + preciocu + "\n";
    }
    
    
}