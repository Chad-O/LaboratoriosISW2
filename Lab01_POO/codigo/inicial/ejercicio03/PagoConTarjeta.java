package ejercicio03;

import java.util.Scanner;

public class PagoConTarjeta extends MetodoPago {

    public PagoConTarjeta(double monto) {
        super(monto);
    }

    @Override
    public boolean realizarPago(double monto) {
        // TODO: Solicitar número de tarjeta y validar
        return false;
    }
}
