package ejercicio03;
import java.util.Scanner;

public class PagoConTransferencia extends MetodoPago {

    public PagoConTransferencia(double monto) {
        super(monto);
    }

    @Override
    public boolean realizarPago(double monto) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese código de confirmación de transferencia: ");
        String codigo = sc.nextLine();
        if (!codigo.isEmpty()) {
            System.out.println("Transferencia confirmada. Pago exitoso.");
            return true;
        } else {
            System.out.println("Código inválido. Pago fallido.");
            return false;
        }
    }
}
