package modelo;


import java.util.Random;

public class Persona {

    private String constante = "M";
    private String nombre;
    private int edad;
    private double dni;
    private char sexo;
    private float altura;
    private float peso;

    //Un constructor por defecto.
    //Un constructor con el nombre, edad y sexo, el resto por defecto.
    //Un constructor con todos los atributos como parámetro.
    public Persona()
    {
        nombre = "";
        dni = generaDni();
        edad = 0;
        sexo = constante.charAt(0);
        altura = 0;
        peso = 0;
    }

     public Persona(String nombre, int edad, char sexo)
     {
         this.nombre = nombre;
         this.edad = edad;
         this.sexo = sexo;
         dni = generaDni();
         altura = 0;
         peso = 0;
     }

     public Persona(String nombre, int edad, char sexo, float altura, float peso)
     {
         this.nombre = nombre;
         this.edad = edad;
         this.sexo = sexo;
         this.dni = dni;
         this.altura = altura;
         this.peso = peso;
     }

     public double generaDni()
     {
         return Math.random();

     }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }


    public void setConstante(String constante) {
        this.constante = constante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    //calcularIMC(): calcula si la persona está en su peso ideal (peso en kg/(altura^2  en m)),
    // si esta fórmula devuelve un valor menor que 20, la función devuelve un -1,
    // si devuelve un número entre 20 y 25 (incluidos), significa que está por debajo de su peso ideal
    // la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso,
    // la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
    public int calcularIMc()
    {
        double pesoIdeal = peso/(Math.pow(altura, 2));
        int numero = 3;

        if(pesoIdeal < 20)
        {
            numero = -1;

        }else if(pesoIdeal > 20 && pesoIdeal < 25)
        {
            numero = 0;

        }else if(pesoIdeal > 25)
        {
            numero = 1;
        }

        return numero;
    }

    //esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    public boolean esMayorEdad()
    {
        if(edad >= 18)
        {
            return true;
        }else
        {
            return false;
        }
    }

    //comprobarSexo(char sexo): comprueba que el sexo introducido es correcto.
    // Si no es correcto, será H. No será visible al exterior
    public boolean comprobarSexo(char sexo)
    {
        if(this.sexo == sexo)
        {
            return true;
        }else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "constante='" + constante + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
