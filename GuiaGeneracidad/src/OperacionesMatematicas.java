public class OperacionesMatematicas<T extends Number>
{

    public OperacionesMatematicas()
    {

    }

    public T suma(T a, T b)
    {
        double rta = a.doubleValue() + b.doubleValue();
        Double rta2 = Double.valueOf(rta);
        return (T) rta2;
    }

    public T resta(T a, T b)
    {
        double rta = a.doubleValue() - b.doubleValue();
        Double rta2 = Double.valueOf(rta);
        return (T) rta2;
    }

    public T multiplicacion(T a, T b)
    {
        double rta = a.doubleValue() * b.doubleValue();
        Double rta2 = Double.valueOf(rta);
        return (T) rta2;
    }

    public T division(T a, T b) throws IllegalArgumentException
    {
        if(b.doubleValue() <= 0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            double rta = a.doubleValue() / b.doubleValue();
            Double rta2 = Double.valueOf(rta);
            return (T) rta2;
        }
    }
}


