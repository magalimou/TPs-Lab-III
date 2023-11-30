package modelo;

public class Serie extends Entretenimiento{
    private int numTemporada; //por defecto 3
    private String creador;


    //Un constructor por defecto.
    public Serie()
    {
        super();
        numTemporada = 3;
        creador = "";
    }

    //Un constructor con el titulo y creador. El resto por defecto.
    public Serie(String titulo, String creador)
    {
        super(titulo);
        this.creador = creador;
        numTemporada = 3;
    }

    //Un constructor con todos los atributos, excepto de entregado.
    public Serie(String titulo, String creador, String genero, int numTemporada)
    {
        super(titulo, genero);
        this.creador = creador;
        this.numTemporada = numTemporada;
    }

    //Métodos get de todos los atributos, excepto de entregado.

    public int getNumTemporada() {
        return numTemporada;
    }


    public String getCreador() {
        return creador;
    }

    //Métodos set de todos los atributos, excepto de entregado.

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    //Sobrescribe los métodos toString.

    @Override
    public String toString() {
        return super.toString() + "Serie{" +
                "numTemporada=" + numTemporada +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object a) {

        int resultado = 0;
        if(a instanceof Serie)
        {
            Serie otraSerie = (Serie) a;
            resultado = Double.compare(this.numTemporada, otraSerie.numTemporada);
        }

        return resultado;
    }
}
