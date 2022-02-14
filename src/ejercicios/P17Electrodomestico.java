package ejercicios;

public class P17Electrodomestico {

    protected double precio = 100;
    protected String color = "blanco";
    protected char consumoEnergetico = 'F';
    protected int peso = 5;


    public P17Electrodomestico() {
    }

    public P17Electrodomestico(double precio, int peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public P17Electrodomestico(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    //METHODS
    public char comprobarConsumoEnergetico(char letra) {

        char[] letras = {'A','B','C','D','E','F'};

        letra = Character.toUpperCase(letra);
        boolean letraComprobada = false;
        for (char l : letras) {
            if (letra == l) {
                letraComprobada = true;
            }
        }
        if (letraComprobada == false) {
            letra = 'F';
            return letra;
        } else {
            return letra;
        }
    }

    public String comprobarColor(String color){
        String[] colorArray = {"blanco", "negro", "rojo", "azul", "gris"};
        color = color.toLowerCase();
        boolean aux = false;

        for (String word : colorArray) {
            if (color.equals(word)) {
                return color;
            }
        }
        return colorArray[0];

    }

    public void precioFinal() {
        //Segun consumo y tamaño aumentara el precio
        double aumentoPorConsumo = 0;
        double aumentoPorTamaño = 0;

        if (consumoEnergetico == 'A') {
            aumentoPorConsumo = 100;
        } else if (consumoEnergetico == 'B'){
            aumentoPorConsumo = 80;
        } else if (consumoEnergetico == 'C'){
            aumentoPorConsumo = 60;
        } else if (consumoEnergetico == 'D'){
            aumentoPorConsumo = 50;
        } else if (consumoEnergetico == 'E'){
            aumentoPorConsumo = 30;
        } else {
            aumentoPorConsumo = 10;
        }

        if (peso >= 0 && peso <= 19){
            aumentoPorTamaño = 10;
        } else if (peso >= 20 && peso <= 49){
            aumentoPorTamaño = 50;
        } else if (peso >= 50 && peso <= 79){
            aumentoPorTamaño = 80;
        } else if (peso >= 80){
            aumentoPorTamaño = 100;
        }

        precio = precio + aumentoPorConsumo + aumentoPorTamaño;
    }

    // GETTERS
    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    //toString

    @Override
    public String toString() {
        return "P17Electrodomestico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
