import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada <T extends Comparable>
{
    private List<T> listaAlgo;

    public ListaOrdenada() {
        listaAlgo = new ArrayList<>();
    }

    public void agregar(T algo)
    {
        listaAlgo.add(algo);
    }
    @Override
    public String toString() {
        return "Almacenamiento{" +
                "lista=" + listaAlgo +
                '}';
    }

    public void OrdenAscendentePorEdad()
    {
        Collections.sort(listaAlgo);

    }
}
