package ejercicios;

public class P18Serie implements P18Entregable {
    //ATTRIBUTES
    private String titulo;
    private int numeroTemporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    //CONSTRUCTOR
    public P18Serie() {
    }

    public P18Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public P18Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    //METHODS
    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    //@Override
    public int compareTo(P18Serie serie) {
        int value = 0;
        if (this.numeroTemporadas > serie.numeroTemporadas){
            value = 1;
        } else if (this.numeroTemporadas == serie.numeroTemporadas){
            value = 0;
        } else if (this.numeroTemporadas < serie.numeroTemporadas){
            value = -1;
        }
        return value;
    }

    //GETTER && SETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    //toString
    @Override
    public String toString() {
        return "P18Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }


}
