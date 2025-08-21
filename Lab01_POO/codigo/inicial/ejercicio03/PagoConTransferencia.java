package ejercicio03;
import java.util.Scanner;

public class PagoConTransferencia extends MetodoPago {

    public PagoConTransferencia(double monto) {
        super(monto);
    }

    @Override
    public boolean realizarPago(double monto) {
        // TODO: Solicitar código de transferencia y validar
        return false;
    }
}
