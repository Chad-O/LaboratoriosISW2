package inicial.lsp;

public class Main {
    public static void main(String[] args) {
        Pato patoReal = new Pato();
        Pato patoDeGoma = new PatoDeGoma();

        patoReal.nadar();
        patoReal.cuack();
        patoDeGoma.nadar();
        patoDeGoma.cuack();

        patoReal.volar();
        patoDeGoma.volar();
    }
}
