
package Veterinaria;


public class Servicios_Principales extends Servicios{
    
    private Float precio_por_dias = 0f;
    private Float precio_por_peso = 0f;
    
    
    public Servicios_Principales (Integer id_serv, Float precio, String servicio, Float precio_por_dias, Float precio_por_peso) {
        super(id_serv,precio, servicio);
        this.precio_por_dias=precio_por_dias;
        this.precio_por_peso=precio_por_peso;
    }

    public Float getPrecio_por_dias() {
        return precio_por_dias;
    }

    public void setPrecio_por_dias(Float precio_por_dias) {
        this.precio_por_dias = precio_por_dias;
    }

    public Float getPrecio_por_peso() {
        return precio_por_peso;
    }

    public void setPrecio_por_peso(Float precio_por_peso) {
        this.precio_por_peso = precio_por_peso;
    }
    
    
    public String toString (Servicios aux){
        return aux.getId_serv()+"\t"+aux.getServicio()+"\t"+aux.getPrecio()+"\t"+precio_por_dias+"\t"+precio_por_peso+"\n";
    }
    
}
