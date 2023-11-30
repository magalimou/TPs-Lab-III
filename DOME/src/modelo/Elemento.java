package modelo;

public abstract class Elemento {

    private String titulo;
    private int duracion;
    private String comentario;
    private boolean loTengo;
    private String genero;
    private int anioEmision;
    private int puntaje; //personal del 1 a 5
    private String idioma;

    public Elemento(String titulo, String genero, String idioma, int anioEmision)
    {
        this.titulo = titulo;
        this.genero = genero;
        this.idioma = idioma;
        this.anioEmision = anioEmision;
        duracion = 0;
        comentario = "";
        loTengo = false;
        puntaje = 0;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setLoTengo(boolean loTengo) {
        this.loTengo = loTengo;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getAnioEmision() {
        return anioEmision;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public String getComentario() {
        return comentario;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public boolean isLoTengo() {
        return loTengo;
    }

    public void imprimir()
    {
        System.out.println("Titulo: "+titulo);
        System.out.println("Genero: "+genero);
        System.out.println("Año de emision: "+anioEmision);
        System.out.println("Duracion: "+duracion);
        System.out.println("Puntaje: "+puntaje);
        System.out.println("Idioma: "+idioma);
        System.out.println("Comentario: "+comentario);
        System.out.println("Lo tengo: "+loTengo);
    }
}
