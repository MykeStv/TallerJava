package ejercicios;

import java.util.Scanner;

public class P11LongitudCantidadVocales {
    private String phrase;

    public P11LongitudCantidadVocales() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        phrase = sc.nextLine();
    }

    public int calculaLongitud() {
        return phrase.length();
    }
    public int contarVocales(char vowel) {
        // busca los caracteres del string, filtra el caracter y lo cuenta
        return (int) phrase.chars().filter(ch -> ch == vowel).count();
    }

    public void mostrarLongitudVocales() {
        System.out.println("La frase tiene una longitud de: " + calculaLongitud() + " caracteres");
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("La cantidad de vocales es: ");

        for (char vowel : vowels) {
            System.out.println(vowel + " : " + contarVocales(vowel));
        }

    }
}
