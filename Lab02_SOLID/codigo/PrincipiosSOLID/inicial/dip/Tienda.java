package inicial.dip;

public class Tienda {
    private ProveedorConcreto proveedor;

    public Tienda() {
        this.proveedor = new ProveedorConcreto();
    }

    public void abastecer() {
        proveedor.suministrar();
    }
}
