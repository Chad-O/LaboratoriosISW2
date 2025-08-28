package inicial.ocp;

public class Main {
    public static void main(String[] args) {

        // Instanciamos por tipo de empleado
        Empleado empleadoAsalariado = new Empleado("Asalariado");
        Empleado empleadoPorHora = new Empleado("PorHora");

        // Calculamos y mostramos salario
        System.out.println("Salario del empleado asalariado: " + empleadoAsalariado.calcularSalario());
        System.out.println("Salario del empleado por hora: " + empleadoPorHora.calcularSalario());
    }
}