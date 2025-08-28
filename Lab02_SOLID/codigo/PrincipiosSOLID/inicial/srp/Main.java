package inicial.srp;

public class Main {
    public static void main(String[] args) {

        Informe informe = new Informe("Informe de rendimiento trimestral");
        informe.generarInforme();
        informe.enviarPorCorreo();
    }
}
