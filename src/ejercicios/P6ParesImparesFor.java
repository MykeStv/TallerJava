package ejercicios;

public class P6ParesImparesFor {

    public void mostrarParesImpares() {
        System.out.print("Números impares: ");
        for (int num = 1; num <= 100 ; num++){

            if (num % 2 != 0) {
                if (num == 99) {
                    System.out.println(num);
                } else {
                    System.out.print(num + ", ");
                }
            }
        }

        System.out.print("Números pares: ");
        for (int num = 1; num <= 100 ; num++){

            if (num % 2 == 0) {
                if (num == 100) {
                    System.out.println(num);
                } else {
                    System.out.print(num + ", ");
                }
            }
        }

    }
}
