package ejercicios;

public class P1NumeroMayor {
    private int num1;
    private int num2;

    // CONSTRUCTOR
    public P1NumeroMayor() {

    }
    public P1NumeroMayor(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // METHODS
    public void devuelveNumeroMayor() {
        if (this.num1 == this.num2) {
            System.out.println("Los números "+ num1 + " y "+ num2 + " son iguales.");
        } else if(this.num1 >= this.num2) {
            System.out.println("El número "+ this.num1 +" es mayor que "+ this.num2 +".");
        } else {
            System.out.println("El número "+ this.num2 +" es mayor que "+ this.num1 +".");
        }
    }


    //GETTER && SETTER
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
