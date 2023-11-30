package modelo;

public class Cd extends Elemento {

    private String artista;
    private int cantTemas;
    private String discografica;

    public Cd(String titulo, String genero, String idioma, int anioEmision) {
        super(titulo, genero, idioma, anioEmision);
        artista = "";
        cantTemas = 0;
        discografica = "";
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setCantTemas(int cantTemas) {
        this.cantTemas = cantTemas;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public int getCantTemas() {
        return cantTemas;
    }

    public String getArtista() {
        return artista;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void imprimir()
    {
        System.out.println("\n------------------CD----------------------");
        super.imprimir();
        System.out.println("Artista: "+artista);
        System.out.println("Cantidad de temas: "+cantTemas);
        System.out.println("Discografica: "+discografica);
        System.out.println("\n---------------------------------------------");

    }


}

