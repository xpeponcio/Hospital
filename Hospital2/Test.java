package Hospital2;

public class Test {
    public static void main(String[] args) {
        
        /*Medico m1 = new Medico("Lucas", "PUHG", 4100, "398476536", 10);
        TrabajadorNoMedico tnm1 = new TrabajadorNoMedico("Paco", "POK7", 1400);

        System.out.println(m1);
        System.out.println(tnm1);*/

        Cardiologo c1 = new Cardiologo("Paco", "PUGH", 1400, "23452342545", 5);
        Pediatra p1 = new Pediatra("Juan", "JJKU", 1500, "234543521", 20);
        Enfermero  e1 = new Enfermero("Lucas", "234543524", 3000);

        System.out.println(e1.calcularSueldo());
        System.out.println(c1.calcularSueldo());
        System.out.println(p1.calcularSueldo());

    }
}
