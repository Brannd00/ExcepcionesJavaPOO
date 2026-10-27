/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;
import java.util.Scanner;

/**
 *
 * @author brann
 */
public class CalculadoraP {
 
    public static void main(String[]arg){
     Scanner sc = new Scanner(System.in);
     
       try {
            System.out.print("Ingrese el primer numero: ");
            int a = Integer.parseInt(sc.nextLine().trim());
            
            System.out.print("Ingrese el segundo numero: ");
            int b = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Ingrese la operacion: ");
            String operacion = sc.nextLine().trim();

            int resultado = calcular(a, b, operacion);
            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar solo numeros enteros.");
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        } catch (OperacionInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Scanner cerrado.");
        }
    }

    public static int calcular(int a, int b, String operacion) throws OperacionInvalidaException {
        switch (operacion) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b; 
            default:
                throw new OperacionInvalidaException(
                    "La operacion '" + operacion + "' no es valida.");
        }
    }
}
