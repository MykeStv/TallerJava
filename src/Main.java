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

        switch (choice) {
            case 1:
                // Verifica cual de los siguientes numeros es mayor o si son iguales
                P1NumeroMayor numeroMayor = new P1NumeroMayor(15, 15);
                numeroMayor.devuelveNumeroMayor();
                break;

            case 2:
                System.out.println("Hello world");
                break;
            case 3:
                // hola
                break;

        }







    }
}
