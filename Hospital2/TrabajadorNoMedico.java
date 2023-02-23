package Hospital2;

public class TrabajadorNoMedico extends Trabajador{   

    TrabajadorNoMedico(String nombre, String numeroIdentificacion, double sueldo){
        super(nombre, numeroIdentificacion, sueldo);
    }

    public double calcularSueldo(){
        return this.getSueldo();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
