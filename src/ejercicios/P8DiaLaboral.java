package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class P8DiaLaboral {

    Scanner sc = new Scanner(System.in);

    public void mostrarDiaLaboral() {

        System.out.print("Escribe un dia de la semana: ");
        String dia = sc.next();
        String diaString = null;

        switch (dia.toUpperCase()) {
            case "LUNES":
            case "MARTES":
                //System.out.println(dia + " es un dia laboral");
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                diaString = "es un día Laboral";
                break;
            case "SABADO":
            case "DOMINGO":
                diaString = "NO es un día laboral";
                break;
            default:
                diaString = "no es un día de la semana";
        }
        System.out.println(dia + " " + diaString);



    }

}
