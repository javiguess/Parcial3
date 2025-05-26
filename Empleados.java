/**
 * Gestiona una lista de empleados y operaciones sobre ellos.
 */
public class Empleados {
    /** Lista de empleados */
    private Empleado[] lista = new Empleado[3];
    /** Contador de empleados dados de alta */
    private int contador = 0;

    /**
     * Establece la lista de empleados.
     * @param lista Nuevo arreglo de empleados.
     */
    public void setLista(Empleado[] lista) {
        this.lista = lista;
    }

    /**
     * Obtiene la lista de empleados.
     * @return Arreglo de empleados.
     */
    public Empleado[] getLista() {
        return lista;
    }

    /**
     * Da de alta un nuevo empleado.
     * @param nombre Nombre del empleado.
     * @param cargo Cargo del empleado.
     * @param salario Salario del empleado.
     */
    public void darAlta(String nombre, String cargo, double salario){
        if (contador < lista.length) {
            lista[contador] = new Empleado(nombre, cargo, salario);
            contador++;
        } else {
            System.out.println(Mensajes.LIMITE_EMPLEADOS);
        }
    }

    /**
     * Muestra la lista de empleados por pantalla.
     */
    public void MostrarEmpleados(){
        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : lista){
            System.out.println(empleado);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
}