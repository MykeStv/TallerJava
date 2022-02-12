package ejercicios;

import java.util.Scanner;

public class P9ReemplazaTexto {
    Scanner sc = new Scanner(System.in);

    private String text;
    private String newText;

    public P9ReemplazaTexto(String text) {
        this.text = text;
        System.out.println("Ingresa el texto a concatenar: ");
        newText = sc.nextLine();
    }

    public String replaceAforE() {
        return text.replace('a', 'e');
    }

    public void finalText() {
        String textReemplazado = replaceAforE();
        System.out.println(textReemplazado + ". " + newText);
    }
}
