
package Veterinaria;


public class Servicios {
    private Integer id_serv;
    private Float precio = 0f;
    private String servicio;

    public Servicios (Integer id_serv, Float precio, String servicio){
    this.id_serv=id_serv;
    this.precio=precio;
    this.servicio=servicio;
}
    
    public Float getPrecio() {
        return precio;
    }

   
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    
    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Integer getId_serv() {
        return id_serv;
    }

    public void setId_serv(Integer id_serv) {
        this.id_serv = id_serv;
    }
    
    

    
}