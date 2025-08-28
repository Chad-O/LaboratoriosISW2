package inicial.isp;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Limpiador limpiador = new Limpiador();

        gerente.cobrarSalario();
        gerente.gestionarProyecto();
        limpiador.cobrarSalario();
        limpiador.limpiar();

        gerente.limpiar();
        limpiador.gestionarProyecto();
    }
}
