package co.edu.unicartagena.poo.excepciones.personalizadas;

public class CuentaBancaria {

    private double saldo = 500.0;

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException(saldo);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso: " + monto);
    }

    public double getSaldo() {
        return saldo;
    }
}
