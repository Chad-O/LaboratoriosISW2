package inicial.lsp;

public class PatoDeGoma extends Pato {
    @Override
    public void volar() {
        throw new UnsupportedOperationException("El pato de goma no puede volar");
    }

    @Override
    public void nadar() {
        System.out.println("El pato de goma está flotando en la bañera");
    }

    @Override
    public void cuack() {
        System.out.println("El pato de goma hace cuack");
    }
}