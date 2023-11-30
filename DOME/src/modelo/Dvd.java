package modelo;

public class Dvd extends Elemento{


    private String productor;
    private String director;
    private String estudio;

    public Dvd(String titulo, String genero, String idioma, int anioEmision) {
        super(titulo, genero, idioma, anioEmision);
        productor = "";
        director = "";
        estudio = "";
    }

    public void setProductor(String productor)
    {
        this.productor = productor;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getProductor()
    {
        return productor;
    }

    public String getDirector() {
        return director;
    }

    public String getEstudio() {
        return estudio;
    }

    public void imprimir()
    {
        System.out.println("\n\n-------------------DVD-----------------------");
        super.imprimir();
        System.out.println("Director: "+director);
        System.out.println("Productor: "+productor);
        System.out.println("Estudio: "+estudio);
        System.out.println("\n---------------------------------------------");
    }
}
