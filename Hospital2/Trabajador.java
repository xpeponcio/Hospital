package Hospital2;

abstract class Trabajador {
    private String nombre;
    private String numeroIdentificacion;
    private double sueldo;

    Trabajador(String nombre, String numeroIdentificacion, double sueldo){
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.sueldo = sueldo;
    }

    public abstract double calcularSueldo();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Su nombre es: " + this.nombre + "\nSu sueldo es: " + this.sueldo;
    }
}
