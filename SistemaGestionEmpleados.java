import java.util.Scanner;

/**
 * Clase principal que gestiona la ejecución del sistema de empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * Método principal. Da de alta empleados, solicita un porcentaje de aumento y muestra los resultados.
     * @param args Argumentos de la línea de comandos (no se usan).
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados();
        empleados.darAlta("Juan", "Gerente", 5000);
        empleados.darAlta("Ana", "Desarrolladora", 4000);
        empleados.darAlta("Luis", "Diseñador", 3500);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensajes.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        empleados.MostrarEmpleados();

        scanner.close();
    }
}