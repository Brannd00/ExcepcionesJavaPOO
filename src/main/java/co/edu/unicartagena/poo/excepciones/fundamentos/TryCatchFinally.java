package co.edu.unicartagena.poo.excepciones.fundamentos;

import java.util.Scanner;


public class TryCatchFinally {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int n = Integer.parseInt(sc.nextLine());
            int res = 100 / n;
            System.out.println("Entra al try Resultado: " + res);

        } catch (NumberFormatException e) {
            System.out.println("Entra al NumberFormatException  no es un número.");
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Entra al ArithmeticException División por cero.");

        } finally {
      
            System.out.println("Entra al finally  y SIEMPRE se ejecuta, haya o no excepción");
            sc.close();
        }
    }
}
