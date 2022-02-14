package ejercicios;

public class P17SubTelevision extends P17Electrodomestico {
    private double resolucion = 20; // resolucion en in
    private boolean sintonizadorTDT = false;

    //CONSTRUCTOR
    public P17SubTelevision() {
    }

    public P17SubTelevision(double precio, int peso) {
        super(precio, peso);
    }

    public P17SubTelevision(double precio, String color, char consumoEnergetico, int peso, double resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //METHODS


    @Override
    public void precioFinal() {
        super.precioFinal();
        if(sintonizadorTDT) {
            precio += 50;
        }
        if (resolucion >= 40) {
            precio = precio * 1.3;
        }
    }

    //GETTER
    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
}
