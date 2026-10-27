package co.edu.unicartagena.poo.excepciones.fundamentos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowYThrows {

    static void verificarEdad(int edad) {
        if (edad < 0) {//aqui es el thow en linea
            throw new IllegalArgumentException(
                "Edad inválida: " + edad
            );
        }
        System.out.println("Edad: " + edad);
    }

    static void leerArchivo(String ruta) throws IOException { // aqui el metodo genera una excecion y se captura con throws
        FileReader f = new FileReader(ruta);
        try (BufferedReader br = new BufferedReader(f)) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("   > " + linea);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== throw ===");
        verificarEdad(25);
        try {
            verificarEdad(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("Manejando el error de throw new IllegalArgumentException: " + e.getMessage());
        }

        System.out.println("\n=== throws ===");
        // El que llama debe manejarlo:
        String[] rutas = {"datos.txt", "no_existe.txt"};
        for (String ruta : rutas) {
            
            try {
                System.out.println("entro al try " + ruta + "...");
                leerArchivo(ruta);
            } catch (IOException e) {
                System.out.println("entro en el manejo del throws IOException del metodo  leerArchivo: " + e.getMessage());
            }
        }
    }
}
