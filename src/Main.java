// MAYCOL STEVEN RINCON BAYONA
import ejercicios.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
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
        System.out.println("7. Número igual o mayor a 0");
        System.out.println("8. Muestra si el día ingresado es laboral o no");
        System.out.println("9. Reemplaza el texto y concatena mensaje adicional");
        System.out.println("10. Remueve espacios de texto ingresado");
        System.out.println("11. Longitud de la frase y vocales que contiene");
        System.out.println("12. Compara dos palabras si son iguales");
        System.out.println("13. Fecha y hora actual");
        System.out.println("14. Números de 2 en 2 hasta 1000");
        System.out.println("15. Programa menú de opciones");
        System.out.println("16. Persona");
        System.out.println("17. Electrodomesticos");
        System.out.println("18. Serie y Videojuegos");
        //System.out.println("0. SALIR");

        System.out.print("\nProblema: ");
        int choice;
        try {
            choice = sc.nextInt();
        } catch (Exception e){
            choice = 0;
        }

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

            case 7:
                // Ingresa un numero y muestra si es mayor o igual a 0

                P7MayorCero mayorCero = new P7MayorCero();
                mayorCero.calcularMayorACero();
                break;

            case 8:
                // Ingresa un día de la semana, muestra si es laboral o no
                P8DiaLaboral diaLaboral = new P8DiaLaboral();
                diaLaboral.mostrarDiaLaboral();
                break;

            case 9:
                //Cambia las letras 'a' por 'e' del texto: “La sonrisa sera la mejor arma contra la tristeza”
                // y concatena con mensaje adicional
                String text = "La sonrisa sera la mejor arma contra la tristeza";
                P9ReemplazaTexto reemplazaTexto = new P9ReemplazaTexto(text);
                reemplazaTexto.finalText();
                break;

            case 10:
                // Ingresa un texto y remueve sus espacios
                P10RemoveSpaces removeSpaces = new P10RemoveSpaces();
                removeSpaces.removeSpacesFromText();
                break;

            case 11:
                // Ingresa una frase y cuenta su longitud. Tambien cuenta el numero de vocales en la frase
                P11LongitudCantidadVocales longitudCantidadVocales = new P11LongitudCantidadVocales();
                longitudCantidadVocales.mostrarLongitudVocales();

                break;

            case 12:
                // Compara dos palabras si son iguales, y si no son iguales muestra la diferencia
                P12ComparaPalabras comparaPalabras = new P12ComparaPalabras();
                comparaPalabras.metodoComparaPalabras();
                break;

            case 13:
                // Devuelve la fecha y la hora actual
                P13FechaHoraActual fechaHoraActual = new P13FechaHoraActual();
                fechaHoraActual.formatearFechaHora();

                break;

            case 14:
                //Ingresa un número y devuelve numeros a partir de este de 2 en 2 hasta el 1000
                P14NumerosHastaMil numerosHastaMil = new P14NumerosHastaMil();
                numerosHastaMil.mostrarNumerosHastaMil();
                break;

            case 15:
                // Programa que muestra el menu de opciones
                P15ProgramaMenu programaMenu = new P15ProgramaMenu();
                programaMenu.menu();
                break;

            case 16:
                // Llama a la clase persona y sus metodos

                System.out.print("Ingrese el nombre: ");
                String nombre = sc.next();
                System.out.print("Ingrese la edad: ");
                int edad = sc.nextInt();
                System.out.print("Ingrese el sexo [H / M]: ");
                //Recibe el primer elemento ingresado como un char
                char sexo = sc.next().charAt(0);
                sc.nextLine();
                System.out.print("Ingrese el peso en kg: ");
                double peso = sc.nextDouble();
                System.out.print("Ingrese la altura en m: ");
                double altura = sc.nextDouble();

                P16Persona persona1 = new P16Persona(nombre, edad, sexo, peso, altura);
                P16Persona persona2 = new P16Persona(nombre, edad, sexo);
                P16Persona persona3 = new P16Persona();

                persona3.setNombre("Jennifer");
                persona3.setSexo('M');
                persona3.setEdad(21);
                persona3.setPeso(55);
                persona3.setAltura(1.68);

                persona1.esMayorDeEdad();
                persona2.esMayorDeEdad();
                persona3.esMayorDeEdad();

                persona1.calcularIMC();
                persona2.calcularIMC();
                persona3.calcularIMC();

                persona1.generarDNI();
                persona2.generarDNI();
                persona3.generarDNI();

                System.out.println("");
                System.out.println(persona1.toString());
                System.out.println(persona2.toString());
                System.out.println(persona3.toString());

                break;

            case 17:
                //P17Electrodomestico electrodomestico = new P17Electrodomestico(200, "azul", 'a', 10);
                //System.out.println(electrodomestico.toString());
                P17Electrodomestico[] electrodomesticos = new P17Electrodomestico[10];
                electrodomesticos[0] = new P17SubLavadora(100, "azul",'A', 20, 40);
                electrodomesticos[0].precioFinal();
                electrodomesticos[1] = new P17SubTelevision(200, "rojo", 'b', 10, 45, true);
                electrodomesticos[1].precioFinal();
                electrodomesticos[2] = new P17SubTelevision(100, "purpura", 'C', 5, 30, false);
                electrodomesticos[2].precioFinal();
                electrodomesticos[3] = new P17SubLavadora(200, "blanco", 'B', 30, 50);
                electrodomesticos[3].precioFinal();
                electrodomesticos[4] = new P17SubLavadora(100, "gris", 'E', 20, 20);
                electrodomesticos[4].precioFinal();
                electrodomesticos[5] = new P17SubTelevision(300, "rojo", 'C', 20, 60, true);
                electrodomesticos[5].precioFinal();
                electrodomesticos[6] = new P17SubLavadora(200, "azul", 'D', 30, 30);
                electrodomesticos[6].precioFinal();
                electrodomesticos[7] = new P17SubTelevision(300, "negro", 'A', 15, 70, true);
                electrodomesticos[7].precioFinal();
                electrodomesticos[8] = new P17SubLavadora(150, "gris", 'B', 32, 48);
                electrodomesticos[8].precioFinal();
                electrodomesticos[9] = new P17SubTelevision(250, "gris", 'D', 17, 55, false);
                electrodomesticos[9].precioFinal();

                double precioElectrodomesticos = 0;
                double precioTelevision = 0;
                double precioLavadora = 0;

                for (int i=0; i < electrodomesticos.length; i++){
                    System.out.println(electrodomesticos[i].toString());
                    precioElectrodomesticos += electrodomesticos[i].getPrecio();

                    if (electrodomesticos[i] instanceof P17SubTelevision){
                        precioTelevision += electrodomesticos[i].getPrecio();
                    } else if (electrodomesticos[i] instanceof P17SubLavadora) {
                        precioLavadora += electrodomesticos[i].getPrecio();
                    }

                }

                System.out.println("\nPrecio total Electrodomesticos: $" + precioElectrodomesticos);
                System.out.println("Precio total Televisión: $" + precioTelevision);
                System.out.println("Precio total Lavadora: $" + precioLavadora);

                break;


            case 18:
                //Instancia las clases series y videojuegos
                P18Serie[] series = new P18Serie[5];
                P18VideoJuego[] videoJuegos = new P18VideoJuego[5];

                series[0] = new P18Serie("The Witcher", 2, "Fantasia", "Netflix");
                series[1] = new P18Serie("El rey Arturito", "Imaginario");
                series[2] = new P18Serie("Mr. Robot", 4, "Drama", "Sam Esmail");
                series[3] = new P18Serie();
                series[4] = new P18Serie("Breaking Bad", 5, "Crimen", "Vince Gilligan");

                videoJuegos[0] = new P18VideoJuego("The Witcher 3", 150, "Rol de accion", "CD Project");
                videoJuegos[1] = new P18VideoJuego("Dark Souls 3", 90, "Rol de accion", "FromSoftware");
                videoJuegos[2] = new P18VideoJuego("Halo Reach", 51, "Shooter", "Bungie");
                videoJuegos[3] = new P18VideoJuego("Far Cry 3", 40, "Shooter", "Ubisoft");
                videoJuegos[4] = new P18VideoJuego("Darkest Dungeon", 106, "Role", "Red Hook Studies");

                videoJuegos[2].entregar();
                series[0].entregar();
                videoJuegos[4].entregar();
                series[2].entregar();
                videoJuegos[1].entregar();

                int seriesEntregadas = 0;
                int videoJuegosEntregados = 0;

                for (int i=0; i<series.length; i++){
                    if (series[i].isEntregado()) {
                        seriesEntregadas++;
                    }
                }
                for (int i=0; i<videoJuegos.length; i++){
                    if (videoJuegos[i].isEntregado()) {
                        videoJuegosEntregados++;
                    }
                }
                System.out.println("Las series entregadas son: " + seriesEntregadas + "\n" +
                        "Los videojuegos entregados son: " + videoJuegosEntregados);

                //Compara las series y videojuegos
                System.out.println("");
                int juego1 = 1;
                int juego2 = 4;
                int mayorHVideojuegos = videoJuegos[juego1].compareTo(videoJuegos[juego2]);

                switch (mayorHVideojuegos) {
                    case 1:
                        System.out.println("El videojuego " + videoJuegos[juego1].getTitulo() +
                                " tiene más horas de juego que el videojuego " + videoJuegos[juego2].getTitulo());
                        break;
                    case 0:
                        System.out.println("El videojuego " + videoJuegos[juego1].getTitulo() +
                                " tiene las mismas horas de juego que el videojuego " + videoJuegos[juego2].getTitulo());
                        break;
                    case -1:
                        System.out.println("El videojuego " + videoJuegos[juego1].getTitulo() +
                                " tiene menos horas de juego que el videojuego " + videoJuegos[juego2].getTitulo());
                        break;
                }

                int serie1 = 2;
                int serie2 = 0;
                int mayorTSeries = series[serie1].compareTo(series[serie2]);

                switch (mayorTSeries) {
                    case 1:
                        System.out.println("La serie "+ series[serie1].getTitulo() +
                                " tiene mas temporadas que la serie "+ series[serie2].getTitulo());
                        break;
                    case 0:
                        System.out.println("La serie "+ series[serie1].getTitulo() +
                                " tiene las mismas temporadas que la serie "+ series[serie2].getTitulo());
                        break;
                    case -1:
                        System.out.println("La serie "+ series[serie1].getTitulo() +
                                " tiene menos temporadas que la serie "+ series[serie2].getTitulo());
                        break;
                }

                break;

            default:
                System.out.println("No se ingresó un valor válido del menu de problemas");

        }



    }
}
