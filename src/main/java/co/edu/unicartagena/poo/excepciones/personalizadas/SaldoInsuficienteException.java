package co.edu.unicartagena.poo.excepciones.personalizadas;


public class SaldoInsuficienteException extends Exception {

    private final double saldoActual;

    public SaldoInsuficienteException(double saldo) {
        super("Saldo insuficiente. Saldo actual: " + saldo);
        this.saldoActual = saldo;
    }

    public double getSaldoActual() {
        return saldoActual;
    }
}
