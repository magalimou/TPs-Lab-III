import java.util.ArrayList;
import java.util.List;

public class Almacenamiento<T>  {

    private List<T> lista;

    public Almacenamiento()
    {
        lista = new ArrayList<>();
    }

    public void agregar(T algo)
    {
        lista.add(algo);
    }

    public void eliminar (T algo)
    {
        for(int i = 0; i < lista.size(); i++)
        {
            T elemento = lista.get(i);
            if(algo.equals(elemento))
            {
                lista.remove(i);
            }
        }
    }

    public T buscar (T algo)
    {
        T rta = null;
        for(int i = 0; i < lista.size(); i++)
        {
            T elemento = lista.get(i);
            if(algo.equals(elemento))
            {
                rta =lista.get(i);
            }
        }
        return rta;
    }

    @Override
    public String toString() {
        return "Almacenamiento{" +
                "lista=" + lista +
                '}';
    }
}


