package ejercicios;

import java.util.Scanner;

public class P10RemoveSpaces {
    private String text;

    public P10RemoveSpaces() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un texto: ");
        this.text = sc.nextLine();
    }

    public void removeSpacesFromText() {
        System.out.println("Texto sin espacios: ");
        System.out.println(text.replace(" ", ""));
    }
}
