package El_Buho;

public class Rutas extends Pasajero{
    private double Quito_Guayaquil;
    private double Quito_Puyo;
    private double Quito_Tulcan;
    private double Quito_Riobamba;
    public Rutas(int id,int fecha,String nombre,int edad,double Quito_Guayaquil,double Quito_Puyo,double Quito_Tulcan,double Quito_Riobamba){
        super(id,fecha,nombre,edad);
        this.Quito_Guayaquil=20;
        this.Quito_Puyo=15;
        this.Quito_Tulcan=17.50;
        this.Quito_Riobamba=17.50;
    }

    public double getQuito_Guayaquil() {
        return Quito_Guayaquil;
    }

    public double getQuito_Puyo() {
        return Quito_Puyo;
    }

    public double getQuito_Tulcan() {
        return Quito_Tulcan;
    }

    public double getQuito_Riobamba() {
        return Quito_Riobamba;
    }
    public double calcularcosto(){
        return 0;
    }
}
