package El_Buho;

public class Normal extends Rutas{
    private String seleccion_asiento;
    private boolean espacio_maleta;
    private boolean espaciomaleta_extra;
    public Normal(int id,int fecha,String nombre,int edad,double Quito_Guayaquil,double Quito_Puyo,double Quito_Tulcan,double Quito_Riobamba
    ,String seleccion_asiento,boolean espacio_maleta,boolean espaciomaleta_extra){
        super(id,fecha,nombre,edad,Quito_Guayaquil,Quito_Puyo,Quito_Tulcan,Quito_Riobamba);
        this.seleccion_asiento=seleccion_asiento;
        this.espacio_maleta=espacio_maleta;
        this.espaciomaleta_extra=espaciomaleta_extra;
    }

    public String getSeleccion_asiento() {
        return seleccion_asiento;
    }

    public boolean isEspacio_maleta() {
        return espacio_maleta;
    }

    public boolean isEspaciomaleta_extra() {
        return espaciomaleta_extra;
    }


    @Override
    public double calcularcosto() {
        double costo = 0;
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
