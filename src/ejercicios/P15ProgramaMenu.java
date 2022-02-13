package ejercicios;

import java.util.Scanner;

public class P15ProgramaMenu {

    public void menu() {

        Scanner sc = new Scanner(System.in);
        Boolean running = true;
        int choice = 0;

        while (running){
            System.out.println("\n****** GESTION CINEMATOGRÁFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6-VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");
            try {
                System.out.print("Escriba el número del menu: ");
                choice = sc.nextInt();

                /* if (choice < 1 && choice > 8) {
                    System.out.println("No es un elemento del menu. Vuelva a ingresar el numero!");
                    continue;
                } */
                switch (choice) {
                    case 1:
                        System.out.println("\nSeleccionado 1. NUEVO ACTOR");
                        break;
                    case 2:
                        System.out.println("\nSeleccionado 2. BUSCAR ACTOR");
                        break;
                    case 3:
                        System.out.println("\nSeleccionado 3. ELIMINAR ACTOR");
                        break;
                    case 4:
                        System.out.println("\nSeleccionado 4. MODIFICAR ACTOR");
                        break;
                    case 5:
                        System.out.println("\nSeleccionado 5. VER TODOS LOS ACTORES");
                        break;
                    case 6:
                        System.out.println("\nSeleccionado 6. VER PELICULAS DE LOS ACTORES");
                        break;
                    case 7:
                        System.out.println("\nSeleccionado 7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                        break;
                    case 8:
                        System.out.println("\nSeleccionado 8. SALIR");
                        running = false;
                        break;
                    default:
                        System.out.println("\nOPCION INCORRECTA");
                }

            } catch (Exception e) {
                System.out.println("No se ingresó un número válido");
                sc.nextLine();

            }




        }

    }

}
