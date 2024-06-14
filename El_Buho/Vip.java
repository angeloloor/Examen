package El_Buho;

public class Vip extends Rutas{
    private String servicios;
    private boolean espacio2maletas;
    private boolean espaciomaleta_extra;

    public Vip(int id,int fecha,String nombre,int edad,double Quito_Guayaquil,double Quito_Puyo,double Quito_Tulcan,double Quito_Riobamba
    ,String servicios,boolean espacio2maletas,boolean espaciomaleta_extra){
        super(id,fecha,nombre,edad,Quito_Guayaquil,Quito_Puyo,Quito_Tulcan,Quito_Riobamba);
        this.servicios=servicios;
        this.espacio2maletas=espacio2maletas;
        this.espaciomaleta_extra=espaciomaleta_extra;
    }





    @Override
    public double calcularcosto() {
        double costo = 30%calcularcosto();
        if (espaciomaleta_extra) {
            costo += 10 * getQuito_Guayaquil();
        }
        if (espaciomaleta_extra){
            costo += 10 * getQuito_Puyo();
        }
        if (espaciomaleta_extra){
            costo += 10 * getQuito_Tulcan();
        }
        if (espaciomaleta_extra) {
            costo += 10 * getQuito_Riobamba();
        }
        return costo;
    }
}
