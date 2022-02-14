package ejercicios;

public class P17SubLavadora extends P17Electrodomestico{
    private int carga = 5;

    //CONSTRUCTORS
    public P17SubLavadora() {
    }

    public P17SubLavadora(double precio, int peso) {
        super(precio, peso);
    }

    public P17SubLavadora(double precio, String color, char consumoEnergetico, int peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    //METHODS


    @Override
    public void precioFinal() {
        super.precioFinal();
        // Si la carga es mayor a 30kg entonces aumenta el precio en $50
        if (carga > 30) {
            precio += 50;
        }
    }

    //GETTER
    public int getCarga() {
        return carga;
    }
}
