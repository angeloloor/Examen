package El_Buho;

public class Vip extends Rutas{
    private String servicios;
    private boolean espacio2maletas;
    private boolean espaciomaletaextra;

    public Vip(int id,int fecha,String nombre,int edad,double Quito_Guayaquil,double Quito_Puyo,double Quito_Tulcan,double Quito_Riobamba
    ,String servicios,boolean espacio2maletas,boolean espaciomaletaextra){
        super(id,fecha,nombre,edad,Quito_Guayaquil,Quito_Puyo,Quito_Tulcan,Quito_Riobamba);
        this.servicios=servicios;
        this.espacio2maletas=espacio2maletas;
        this.espaciomaletaextra=espaciomaletaextra;
    }

    public String getServicios() {
        return servicios;
    }

    public boolean isEspacio2maletas() {
        return espacio2maletas;
    }

    public boolean isEspaciomaletaextra() {
        return espaciomaletaextra;
    }

    @Override
    public double calcularcosto() {
        double costovip = 0.30;
        if (espaciomaletaextra) {
            costovip += 10 * getQuito_Guayaquil();
        }
        if (espaciomaletaextra){
            costovip += 10 * getQuito_Puyo();
        }
        if (espaciomaletaextra){
            costovip += 10 * getQuito_Tulcan();
        }
        if (espaciomaletaextra) {
            costovip += 10 * getQuito_Riobamba();
        }
        return costovip * calcularcosto();
    }
}
