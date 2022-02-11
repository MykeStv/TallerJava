import ejercicios.P1NumeroMayor;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ingresar data
        Scanner sc = new Scanner(System.in);

        System.out.println("TALLER DE JAVA - MAYCOL RINCON");
        System.out.println("Selecciona un problema: (ingresando el numero entero)\n");
        System.out.println("1. Número mayor, igual o menor");
        System.out.println("2. Ingresa dos números, verifica el mayor");
        System.out.println("3. ");

        System.out.print("\nProblema: ");
        int choice = sc.nextInt();
        System.out.println("");

        switch (choice) {
            case 1:
                // Verifica cual de los siguientes numeros es mayor o si son iguales
                P1NumeroMayor numeroMayor = new P1NumeroMayor(15, 15);
                numeroMayor.devuelveNumeroMayor();
                break;

            case 2:
                // Metodo que calcula cual es el numero mayor de los numeros ingresados
                int num1;
                int num2;

                System.out.print("Ingrese el numero 1: ");
                try {
                    num1 = sc.nextInt();
                } catch (Exception e) {
                    //Si no se ingresa un numero, termina el switch
                    System.out.println("No escribio un número entero");
                    break;
                }

                System.out.print("Ingrese el numero 2: ");
                try {
                    num2 = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("No escribio un número entero");
                    break;
                }

                //Instancia la clase que calcula el numero mayor
                P1NumeroMayor p2NumeroMayor = new P1NumeroMayor(num1, num2);
                p2NumeroMayor.devuelveNumeroMayor();
                break;
            case 3:
                // hola
                break;

        }







    }
}
