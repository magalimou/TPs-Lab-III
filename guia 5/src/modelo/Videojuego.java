package modelo;

public class Videojuego extends Entretenimiento{


    private int horas; //por defecto 10
    private String compania;

    //Un constructor por defecto.
    public Videojuego()
    {
        super();
        horas = 10;
        compania = "";
    }

    //Un constructor con el titulo y horas estimadas. El resto por defecto.
    public Videojuego(String titulo, int horas)
    {
        super(titulo);
        this.horas = horas;
        compania = "";
    }

    //Un constructor con todos los atributos, excepto de entregado.
    public Videojuego(String titulo, int horas, String genero, String compania)
    {
        super(titulo, genero);
        this.horas = horas;
        this.compania = compania;
    }

    //Métodos set de todos los atributos, excepto de entregado.

    public void setHoras(int horas) {
        this.horas = horas;
    }


    public void setCompania(String compania) {
        this.compania = compania;
    }

    //Métodos get de todos los atributos, excepto de entregado.

    public int getHoras() {
        return horas;
    }

    public String getCompania() {
        return compania;
    }

    //Sobrescribe los métodos toString.


    @Override
    public String toString() {
        return  super.toString() + "Videojuego{" +
                "horas=" + horas +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object a) {

        int resultado = 0;
        if(a instanceof Videojuego)
        {
            Videojuego otroJuego = (Videojuego) a;
            resultado = Double.compare(this.horas, otroJuego.horas);

        }
        return resultado;
        //devuelve un 0 si son iguales, < 0 si el primer parámetro es menor que el segundo y
        // > 0 si el primer parámetro es mayor que el segundo.
    }
}
