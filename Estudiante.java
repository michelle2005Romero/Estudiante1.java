import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

/**
 * La clase Estudiante representa a un estudiante con su nombre, fecha de nacimiento y notas de asignaturas.
 */
public class Estudiante {

    private String nombre;
    private Date fechaDeNacimiento;
    private double notaAsignatura1;
    private double notaAsignatura2;
    private double notaAsignatura3;

    /**
     * Constructor para crear un objeto Estudiante con nombre y fecha de nacimiento.
     * @param nombre           El nombre del estudiante.
     * @param fechaDeNacimiento     La fecha de nacimiento del estudiante.
     */
    public Estudiante(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.notaAsignatura1 = 0.0;
        this.notaAsignatura2 = 0.0;
        this.notaAsignatura3 = 0.0;
    }

    /**
     * Constructor alternativo que permite al usuario ingresar el nombre y la fecha de nacimiento.
     * Utiliza la entrada estándar para obtener los datos.
     */
    public Estudiante() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        this.nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (yyyy-MM-dd): ");
        String fechaNacimientoStr = scanner.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
        this.fechaDeNacimiento = Date.from(fechaNacimiento.atStartOfDay(ZoneId.systemDefault()).toInstant());

        scanner.close();
    }

    /**
     * Calcula la edad del estudiante en años.
     * @return La edad del estudiante en años.
     */
    public int getEdad() {
        LocalDate fechaNacimiento = fechaDeNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    /**
     * Calcula el promedio de las notas de asignaturas.
     * @return El promedio de las notas.
     */
    public double getPromedio() {
        double sumaNotas = notaAsignatura1 + notaAsignatura2 + notaAsignatura3;
        return sumaNotas / 3;
    }

    /**
     * Establece la nota de la asignatura 1.
     * @param notaAsignatura1 La nota de la asignatura 1.
     */
    public void setNotaAsignatura1(double notaAsignatura1) {
        this.notaAsignatura1 = notaAsignatura1;
    }

    /**
     * Establece la nota de la asignatura 2.
     * @param notaAsignatura2 La nota de la asignatura 2.
     */
    public void setNotaAsignatura2(double notaAsignatura2) {
        this.notaAsignatura2 = notaAsignatura2;
    }

    /**
     * Establece la nota de la asignatura 3.
     * @param notaAsignatura3 La nota de la asignatura 3.
     */
    public void setNotaAsignatura3(double notaAsignatura3) {
        this.notaAsignatura3 = notaAsignatura3;
    }

    /**
     * Obtiene el nombre del estudiante.
     * @return El nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la fecha de nacimiento del estudiante.
     * @return La fecha de nacimiento del estudiante.
     */
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * Obtiene la nota de la asignatura 1.
     * @return La nota de la asignatura 1.
     */
    public double getNotaAsignatura1() {
        return notaAsignatura1;
    }

    /**
     * Obtiene la nota de la asignatura 2.
     * @return La nota de la asignatura 2.
     */
    public double getNotaAsignatura2() {
        return notaAsignatura2;
    }

    /**
     * Obtiene la nota de la asignatura 3.
     * @return La nota de la asignatura 3.
     */
    public double getNotaAsignatura3() {
        return notaAsignatura3;
    }

    /**
     * Método principal para probar la clase Estudiante.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Fecha de Nacimiento: " + estudiante.getFechaDeNacimiento());
        System.out.println("Edad: " + estudiante.getEdad() + " años");
    }
}
