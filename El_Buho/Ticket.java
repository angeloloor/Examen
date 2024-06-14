package El_Buho;

public class Ticket {
    private int id;
    private int fecha;

    public Ticket(int id,int fecha){
        this.id=id;
        this.fecha=fecha;
    }

    public int getId() {
        return id;
    }

    public int getFecha() {
        return fecha;
    }

    public void mostrardatos(){
        System.out.println("El id es :"+getId()+" La fecha es: "+getFecha());
    }
}
