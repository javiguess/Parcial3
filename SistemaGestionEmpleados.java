import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        Empleados empleados = new Empleados();
        empleados.darAlta(new Empleado("Juan", "Gerente", 5000));
        empleados.darAlta(new Empleado("Ana", "Desarrolladora", 4000));
        empleados.darAlta(new Empleado("Luis", "Diseñador", 3500));


        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensajes.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        scanner.close();
    }
}
