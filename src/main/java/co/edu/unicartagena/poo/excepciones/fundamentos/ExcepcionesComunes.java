package co.edu.unicartagena.poo.excepciones.fundamentos;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcepcionesComunes {

    public static void main(String[] args) {

        // 1. NullPointerException: acceder a un objeto null
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            mostrar("Acceder a un objeto null", e);
        }

        // 2. ArrayIndexOutOfBoundsException: índice fuera del arreglo
        try {
            int[] numeros = {10, 20, 30};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            mostrar("Índice fuera del arreglo", e);
        }

        // 3. ArithmeticException: división por cero
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            mostrar("División por cero", e);
        }

        // 4. NumberFormatException: convertir texto no numérico
        try {
            int numero = Integer.parseInt("abc");
            System.out.println(numero);
        } catch (NumberFormatException e) {
            mostrar("Convertir texto no numérico", e);
        }

        // 5. FileNotFoundException: archivo no encontrado (verificada)
        try {
            FileReader f = new FileReader("archivo_que_no_existe.txt");
            f.close();
        } catch (FileNotFoundException e) {
            mostrar("Archivo no encontrado", e);
        } catch (java.io.IOException e) {
            mostrar("Error de E/S al cerrar", e);
        }

        System.out.println("\nEl programa NO se detuvo: todas las excepciones fueron capturadas.");
    }

    private static void mostrar(String caso, Exception e) {
        System.out.println("-- " + caso);
        System.out.println("   Tipo   : " + e.getClass().getSimpleName());
        System.out.println("   Mensaje: " + e.getMessage());
    }
}
