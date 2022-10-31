
package Veterinaria;

public class OtrosServ extends Servicios{
    private Float bonus_de_malcomportamiento = 0f;
    
    public OtrosServ (Integer id_serv, Float precio, String servicio, Float bonus_de_malcomportamiento){
        super(id_serv,precio, servicio);
        this.bonus_de_malcomportamiento=bonus_de_malcomportamiento;
    }

    public Float getBonus_de_malcomportamiento() {
        return bonus_de_malcomportamiento;
    }

    public void setBonus_de_malcomportamiento(Float bonus_de_malcomportamiento) {
        this.bonus_de_malcomportamiento = bonus_de_malcomportamiento;
    }

    public String toString (Servicios aux){
        return aux.getId_serv()+"\t"+aux.getServicio()+"\t"+aux.getPrecio()+"\t"+bonus_de_malcomportamiento+"\n";
    }
}