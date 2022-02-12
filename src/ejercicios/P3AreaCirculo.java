package ejercicios;

public class P3AreaCirculo {
    final double PI_NUMBER = Math.PI;
    private double num;

    //CONSTRUCTOR
    public P3AreaCirculo(double num) {
        this.num = num;
    }

    //METHODS
    public double calcularAreaCirculo() {
        return PI_NUMBER * Math.pow(num, 2);
    }

    //GETTER && SETTER
    public double getPI_NUMBER() {
        return PI_NUMBER;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
}
