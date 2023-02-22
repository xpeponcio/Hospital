package Hospital;

public class Medico extends Trabajador{
    
    private enum especialidad{cardiologo, pediatra, cirujano};
    private especialidad puesto;
    private String numeroColegiado;
    private int numeroPacientes;

    Medico(String nombre, String numeroIdentificacion, double sueldo, String puesto, String numeroColegiado, int numeroPaciente){
        super(nombre, numeroIdentificacion, sueldo);
        this.puesto = especialidad.valueOf(puesto);
        this.numeroColegiado = numeroColegiado;
        this.numeroPacientes = numeroPaciente;
    }

    public void setPuesto(String puesto) {
        this.puesto = especialidad.valueOf(puesto);
    }

    public especialidad getPuesto() {
        return puesto;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroPacientes(int numeroPacientes) {
        this.numeroPacientes = numeroPacientes;
    }

    public int getNumeroPacientes() {
        return numeroPacientes;
    }

    @Override
    public String toString(){
        return "El nombre es: " + this.getNombre() + "\nSu puesto es: " + getPuesto() + "\nA tendido a " + getNumeroPacientes() + " pacientes";
    }
}
