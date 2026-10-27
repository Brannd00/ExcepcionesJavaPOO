package co.edu.unicartagena.poo.excepciones.personalizadas;

public class DemoCuentaBancaria {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        try {
            cuenta.retirar(700);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
            System.out.println("Dato extra de la excepción -> getSaldoActual(): "
                    + e.getSaldoActual());
        }

        try {
            cuenta.retirar(200);
            System.out.println("Saldo restante: " + cuenta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
