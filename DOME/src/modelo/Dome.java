package modelo;

public class Dome {

    private Elemento[] e;
    private int validos;

    public Dome ()
    {
        e = new Elemento[1000];
        validos = 0;
    }

    public void agregarElemento(Elemento unElemento)
    {
        if(validos < 1000)
        {
            e[validos] = unElemento;
            validos++;
        }
    }

    public Elemento buscarPorTitulo(String titulo)
    {
        for(int i = 0; i < validos; i++)
        {
            if(e[i].getTitulo().equals(titulo))
            {
                return e[i];
            }
        }
        return null;
    }

    public void mostrarCds()
    {
        for(int i = 0; i<validos; i++)
        {
            if(e[i] instanceof Cd)
            {
                e[i].imprimir();
            }
        }
    }
    public void mostrarDvds()
    {
        for(int i = 0; i<validos; i++)
        {
            if(e[i] instanceof Dvd)
            {
                e[i].imprimir();
            }
        }
    }

    public void buscarPorIdioma(String idioma)
    {
        for(int i = 0; i <validos; i++)
        {
            if(e[i].getIdioma().equals(idioma))
            {
                e[i].imprimir();
            }
        }
    }




}
