package Hospital2 ;

public class Medico extends Trabajador{
    
    private String numeroColegiado;
    private int numeroPacientes;

    Medico(String nombre, String numeroIdentificacion, double sueldo, String numeroColegiado, int numeroPaciente){
        super(nombre, numeroIdentificacion, sueldo);
        this.numeroColegiado = numeroColegiado;
        this.numeroPacientes = numeroPaciente;
    }

    public double calcularSueldo(){
        double bonificacion = 10;
        double sueldoTotal = this.getSueldo() + (bonificacion * this.getNumeroPacientes());
        return sueldoTotal;
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
        return "El nombre es: " + this.getNombre() + "\nA tendido a " + getNumeroPacientes() + " pacientes";
    }
}
