package ejercicio02;

public class ProductoFisico extends Producto {
    private double peso;

    public ProductoFisico(String nombre, double precio, int stock, double peso) {
        super(nombre, precio, stock);
        this.peso = peso;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Producto Físico: " + nombre + " | Precio: S/ " + precio + " | Peso: " + peso + "kg | Stock: " + stock);
    }
}
