import java.util.ArrayList;
import java.util.List;

public class Pila<T> {

    private List<T> pila;
    private int tope;

    public Pila()
    {
        pila = new ArrayList<>();
        tope = 0;
    }

    public void agregar(T algo)
    {
        pila.add(algo);
        tope = (pila.size()-1) ;
    }

    public void eliminar()
    {
        if(tope != 0)
        {
            pila.remove(tope);
            tope = (pila.size()-1);
        }
    }

    public boolean pilaVacia()
    {
        boolean rta = false;
        if(tope == 0)
        {
            rta = true;
        }
        return rta;
    }

    @Override
    public String toString() {
        return "Pila{" +
                "pila=" + pila +
                ", tope=" + pila.get(tope) +
                '}';
    }

    public int cantElemento()
    {
        return pila.size();
    }
}
