package ejercicios;

import java.util.Random;

public class P16Persona {

    //ATTRIBUTES
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    //CONSTRUCTOR
    public P16Persona() {
        //Valores por defecto
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }
    public P16Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        //Valores por defecto
        this.peso = 0;
        this.altura = 0;
    }
    public P16Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    //METHODS

    //Calcula el indice de masa corporal
    public int calcularIMC() {
        int BAJOPESO = -1;
        int NORMAL = 0;
        int SOBREPESO = 1;

        //Math.pow(base, exponent)
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return BAJOPESO;
        } else if (imc >= 20 && imc <= 25) {
            return NORMAL;
        } else {
            return SOBREPESO;
        }

    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public char comprobarSexo(char sexoIngresado) {
        sexoIngresado = Character.toUpperCase(sexoIngresado);
        if (sexoIngresado == 'H') {
            return 'H';
        } else if (sexoIngresado == 'M') {
            return 'M';
        } else {
            return 'H';
        }

    }

    public void generarDNI() {
        int numberDNI = randomNumber();
        char[] lettersDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int moduloNumberDNI = numberDNI % 23;
        // Obtengo una letra del array de caracteres segun el modulo del numero del DNI 0-22
        char letterDNI = lettersDNI[moduloNumberDNI];

        //Concatena el string
        DNI = String.valueOf(letterDNI) + numberDNI;

    }
    public int randomNumber() {
        Random rdm = new Random();
        int number = rdm.nextInt(99999999);
        return number;
    }




    //GETTER && SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }
    /*
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }*/

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //toString
    @Override
    public String toString() {
        return "P16Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
