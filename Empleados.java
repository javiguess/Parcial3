public class Empleados {
    private Empleado[] lista = new Empleado[3];
    private int contador = 0;

    public void setLista(Empleado[] lista) {
        this.lista = lista;
    }

    public Empleado[] getLista() {
        return lista;
    }

    public void darAlta(Empleado empleado) {
        if (contador < lista.length) {
            lista[contador] = empleado;
            contador++;
        } else {
            System.out.println(Mensajes.LIMITE_EMPLEADOS);
        }
    }

    public void MostrarEmpleados(){
        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : lista){
            System.out.println(empleado);
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
}
