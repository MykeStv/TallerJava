package ejercicios;

public class P4Iva {
    final double IVA = 0.21;
    private double precioProducto;

    public P4Iva(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    //METHODS
    public double calcularPrecioIva() {
        return precioProducto * (1 + IVA);
    }


    //GETTER && SETTER
    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
}
