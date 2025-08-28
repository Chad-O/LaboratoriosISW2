package inicial.isp;

public class Gerente implements Trabajador {
    @Override
    public void cobrarSalario() {
        System.out.println("El gerente cobra salario");
    }

    @Override
    public void limpiar() {
        System.out.println("El gerente no limpia");
    }

    @Override
    public void gestionarProyecto() {
        System.out.println("El gerente gestiona el proyecto");
    }
}