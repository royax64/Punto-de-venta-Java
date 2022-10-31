/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author ferri
 */
public class Doctor {
    private String nombre = null;
    private Integer num_Cedula = 0;
    private Boolean esta_activo = false;
    private String password = null;

    public Doctor(String nombre, String password, Integer num_Cedula, Boolean esta_activo) {
        this.nombre = nombre;
        this.num_Cedula = num_Cedula;
        this.password = password;
        this.esta_activo = esta_activo;
    }

    public void desactivar(Boolean esta_activo) {
        esta_activo = false;
    }

    public void reactivar(Boolean esta_activo) {
        esta_activo = true;
    }

    public void cambiar_contraseña(String password) {
        this.setPassword(password);
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNum_Cedula() {
        return num_Cedula;
    }

    public Boolean getEsta_activo() {
        return esta_activo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return num_Cedula + "\t\t" + nombre + "\t\t\t" + esta_activo + "\n";
    }
    
    
}