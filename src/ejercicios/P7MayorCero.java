package ejercicios;

import java.util.Scanner;

public class P7MayorCero {

    Scanner sc = new Scanner(System.in);

    public void calcularMayorACero() {

        boolean ciclo = true;
        do {
            // Si no se ingresa un número valido se reinicia el ciclo
            try {
                System.out.print("Ingrese un numero mayor o igual a 0: ");
                int num = sc.nextInt();

                //Si el numero es menor a 0, entonces se vuelve a pedir el numero
                if (num < 0) {
                    System.out.println("Vuelve a ingresar el número");
                } else {
                    System.out.println("El numero ingresado es: " + num);
                    if (num == 0) {
                        System.out.println(num + " es igual a 0");
                    } else {
                        System.out.println(num + " es mayor que 0");
                    }
                    // Se termina el ciclo
                    ciclo = false;
                }
            } catch (Exception e) {
                System.out.println("No se ingresó un número entero válido");
                sc.nextLine();
            }

        } while(ciclo);
    }

}
