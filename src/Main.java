import ejercicios.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ingresar data
        Scanner sc = new Scanner(System.in);

        System.out.println("TALLER DE JAVA - MAYCOL RINCON");
        System.out.println("Selecciona un problema: (ingresando el numero entero)\n");
        System.out.println("1. Número mayor, igual o menor");
        System.out.println("2. Ingresa dos números, verifica el mayor");
        System.out.println("3. Calcula el área de un circulo");
        System.out.println("4. Precio con IVA");
        System.out.println("5. Números impares y pares 1-100 [while loop]");
        System.out.println("6. Números impares y pares 1-100 [for loop]");

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
                // Calcula el area del circulo, ingresando un double

                try {
                    System.out.print("Radio del circulo: ");
                    double num = Double.parseDouble(sc.next());
                    P3AreaCirculo areaCirculo = new P3AreaCirculo(num);
                    System.out.println("El area del circulo es: " + areaCirculo.calcularAreaCirculo());

                } catch (Exception e) {
                    System.out.println("No se ingresó un double!");
                }
                break;

            case 4:
                // Calcula el precio total con IVA del 21%

                try {
                    System.out.print("Precio del producto: ");
                    double precioProducto = Double.parseDouble(sc.next());
                    P4Iva productoConIva = new P4Iva(precioProducto);
                    double precioFinal = productoConIva.calcularPrecioIva();
                    System.out.println("El precio del producto con IVA es: $" + precioFinal);

                } catch (Exception e) {
                    System.out.println("No se ingresó un double correctamente!");
                }

                break;

            case 5:
                // Muestra los numeros pares y los impares del 1 al 100 con el ciclo While
                System.out.println("Numeros pares e impares, ciclo while");
                P5ParesImparesWhile paresImparesWhile = new P5ParesImparesWhile();
                paresImparesWhile.muestraParesImpares();

                break;

            case 6:
                // Muestra los numeros pares y los impares del 1 al 100 con el ciclo "for"
                System.out.println("Numeros pares e impares, ciclo for");
                P6ParesImparesFor paresImparesFor = new P6ParesImparesFor();
                paresImparesFor.mostrarParesImpares();
                break;

        }




    }
}
