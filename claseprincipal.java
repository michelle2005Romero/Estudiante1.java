import java.util.Date;

public class claseprincipal {
    public static void main(String[] args) {
        Date fechaNacJuan = new Date(2005, 7, 1); // El constructor Date toma años desde 1900, así que 100 representa el año 2000
        Estudiante juan = new Estudiante("Juan", fechaNacJuan);
        juan.setNotaAsignatura1(4.5);
        juan.setNotaAsignatura2(3.1);
        juan.setNotaAsignatura3(3.9);
        System.out.println("Nota Asignatura 1: " + juan.getNotaAsignatura1());
        System.out.println("Nota Asignatura 2: " + juan.getNotaAsignatura2());
        System.out.println("Nota Asignatura 3: " + juan.getNotaAsignatura3());

        int edadJuan = juan.getEdad();
        System.out.println("Edad de Juan: " + edadJuan + " años");

        double promedioJuan = juan.getPromedio();
        System.out.println("Promedio de Juan: " + promedioJuan);
    }
}
