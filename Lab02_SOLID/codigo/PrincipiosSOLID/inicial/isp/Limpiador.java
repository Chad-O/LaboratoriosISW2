package inicial.isp;

public class Limpiador implements Trabajador {
    @Override
    public void cobrarSalario() {
        System.out.println("El limpiador cobra salario");
    }

    @Override
    public void limpiar() {
        System.out.println("El limpiador está limpiando");
    }

    @Override
    public void gestionarProyecto() {
        System.out.println("El limpiador no gestiona proyectos");
    }
}
