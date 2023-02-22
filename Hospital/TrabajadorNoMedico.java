package Hospital;

public class TrabajadorNoMedico extends Trabajador{   

    private enum especialidad{enfermero, recepcionista, limpiadore};
    private especialidad puesto;

    TrabajadorNoMedico(String nombre, String numeroIdentificacion, double sueldo, String puesto){
        super(nombre, numeroIdentificacion, sueldo);
        this.puesto = especialidad.valueOf(puesto);
    }

    public void setPuesto(String puesto) {
        this.puesto = especialidad.valueOf(puesto);
    }

    public especialidad getPuesto() {
        return puesto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSu puesto es: " + this.puesto;
    }
}
