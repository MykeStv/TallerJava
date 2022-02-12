package ejercicios;

import java.util.Scanner;

public class P12ComparaPalabras {

    private String word1;
    private String word2;

    public P12ComparaPalabras() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba una palabra: ");
        word1 = sc.next();
        sc.nextLine();
        System.out.print("Escriba otra palabra a comparar: ");
        word2 = sc.next();

        //System.out.println(word1 + " " + word2);
    }

    public void metodoComparaPalabras() {

        if (word1.toUpperCase().equals(word2.toUpperCase())) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras son diferentes [las letras distintas se remarcan con mayusculas]");
            char[] chWord1 = word1.toLowerCase().toCharArray();
            char[] chWord2 = word2.toLowerCase().toCharArray();

            for (int i=0; i < chWord1.length && i < chWord2.length; i++) {
                if (chWord2[i] != chWord1[i]) {
                    chWord2[i] = Character.toUpperCase(chWord2[i]);
                }
            }
            if (chWord2.length > chWord1.length) {
                for (int i=chWord1.length; i < chWord2.length; i++){
                    chWord2[i] = Character.toUpperCase(chWord2[i]);
                }
            }
            System.out.println(String.valueOf(chWord1) +" != "+ String.copyValueOf(chWord2));

        }
    }
}
