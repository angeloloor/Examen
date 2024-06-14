package El_Buho;

public class Pasajero extends Ticket{
    private String nombre;
    private int edad;
    public Pasajero(int id,int fecha,String nombre,int edad){
        super(id,fecha);
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public void mostrardatos() {
        super.mostrardatos();
        System.out.println("Nombre pasajero: "+getNombre()+" Edad pasajero: "+getEdad());
    }
}
