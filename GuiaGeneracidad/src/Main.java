public class Main {
    public static void main(String[] args) {

        //ejercicio 1
       /* Almacenamiento<Integer> inventario = new Almacenamiento<>();

       inventario.agregar(5);
        inventario.agregar(8);
        inventario.agregar(2);

        System.out.printf(inventario.toString());*/

        Almacenamiento<String> inventario = new Almacenamiento<>();

        inventario.agregar("pepe");
        inventario.agregar("pochoclos");
        inventario.agregar("caramelo");

        String encontrado = inventario.buscar("caramelo");
        System.out.println(""+encontrado);

        System.out.println(inventario.toString());

        inventario.eliminar("pochoclos");
        System.out.println(inventario.toString());


        Pila<Integer>miPilita = new Pila<>();

        miPilita.agregar(1);
        miPilita.agregar(6);
        miPilita.agregar(8);
        miPilita.agregar(3);
        miPilita.agregar(9);

        System.out.printf(miPilita.toString());

        miPilita.eliminar();

        System.out.printf(miPilita.toString());

        System.out.println("PILA VACIA? = "+miPilita.pilaVacia());
        System.out.println("CANTIDAD DE ELEMENTOS: "+miPilita.cantElemento());


        OperacionesMatematicas<Number> operacion = new OperacionesMatematicas<>();
        Number rta = null;

        rta = operacion.suma(5,5);
        System.out.println("SUMA: "+rta);

        rta = operacion.resta(5,5);
        System.out.println("SUMA: "+rta);

        rta = operacion.multiplicacion(5,5);
        System.out.println("SUMA: "+rta);

        try
        {
            rta = operacion.division(5,0);
            System.out.println("SUMA: "+rta);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("ERROR, DIVISION POR 0");
        }


        ListaOrdenada<Integer>lista = new ListaOrdenada();

        lista.agregar(1);
        lista.agregar(6);
        lista.agregar(2);

        lista.OrdenAscendentePorEdad();

        System.out.printf(""+lista.toString());






    }
}