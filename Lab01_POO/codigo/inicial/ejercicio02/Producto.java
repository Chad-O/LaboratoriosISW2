package ejercicio02;
public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(String nombre, double precio, int stock) {
        // TODO: Validar e inicializar atributos
    }

    // TODO: Agregar métodos para controlar stock si es necesario
    
    public abstract void mostrarInfo();
    
}
