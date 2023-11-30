public class Perros implements Comparable
{
    private String nombre;
    private int edad;

    @Override
        public int compareTo(Object o) {
        int rta = 0; // iguales
        if(edad < ((Perros)o).edad)
        {
            rta = 1; //el mayor es el que NO llama a compareTO
        }
        else if (edad >((Perros)o).edad)
        {
            rta = -1 ; // el mayor es el que llama el parametro
        }
        return rta;
    }

}


