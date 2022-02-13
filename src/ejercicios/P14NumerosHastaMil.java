package ejercicios;

import java.util.Scanner;

public class P14NumerosHastaMil {
    private int num;

    public P14NumerosHastaMil() {

    }

    public void mostrarNumerosHastaMil() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero menor a 1000: ");
        try {
            num = sc.nextInt();

            System.out.println("\nNúmeros: ");
            while (num <= 1000) {
                System.out.print(num + ", ");
                num += 2;
                if (num == 1001) {
                    System.out.print(1000);
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("No se ingresó un numero valido");
        }

    }

}
