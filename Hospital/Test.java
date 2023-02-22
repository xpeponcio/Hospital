package Hospital;

public class Test {
    public static void main(String[] args) {
        
        Trabajador t1 = new Trabajador("Juan", "P76Y", 4500);
        Medico m1 = new Medico("Lucas", "PUHG", 4100, "cirujano", "398476536", 10);
        TrabajadorNoMedico tnm1 = new TrabajadorNoMedico("Paco", "POK7", 1400, "recepcionista");

        System.out.println(m1);
        System.out.println(t1);
        System.out.println(tnm1);
    }
}
