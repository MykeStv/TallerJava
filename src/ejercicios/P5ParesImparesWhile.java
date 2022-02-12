package ejercicios;

public class P5ParesImparesWhile {
    private int num;

    public P5ParesImparesWhile() {
        this.num = 1;
    }
    public void muestraParesImpares() {

        System.out.print("Números impares: ");
        while (num <= 100) {
            if (num % 2 != 0) {
                if (num == 99) {
                    System.out.println(num);
                } else {
                    System.out.print(num + ", ");
                }
            }
            num++;
        }
        //Reinicia el número
        num = 1;
        System.out.print("Números pares: ");
        while (num <= 100) {
            if (num % 2 == 0) {
                if (num == 100) {
                    System.out.println(num);
                } else {
                    System.out.print(num + ", ");
                }
            }
            num++;
        }
    }

}
