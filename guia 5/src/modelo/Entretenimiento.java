package modelo;

public abstract class Entretenimiento {

    private boolean entregado; //por defecto falso
    private String titulo;
    private String genero;

    public Entretenimiento()
    {
        entregado = false;
        titulo = "";
        genero = "";
    }

    public Entretenimiento(String titulo)
    {
        entregado = false;
        this.titulo = titulo;
        genero = "";
    }

    public Entretenimiento (String titulo, String genero)
    {
        entregado = false;
        this.titulo = titulo;
        this.genero = genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }
    public void entregar() //cambia el atributo prestado a true.
    {
        entregado = true;
    }

    public void devolver() //cambia el atributo prestado a false.
    {
        entregado = false;
    }

    public boolean isEntregado()//devuelve el estado del atributo prestado.
    {
        return entregado;

    }

    //Método compareTo (Object a), compara las horas estimadas en los videojuegos y en las series el numero de temporadas. Como parámetro que tenga un objeto, no es necesario que implementes la interfaz Comparable. Recuerda el uso de los casting de objetos.
    public abstract int compareTo(Object a);

    @Override
    public String toString() {
        return "Entretenimiento{" +
                "entregado=" + entregado +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
