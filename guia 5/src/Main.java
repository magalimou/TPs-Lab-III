import modelo.*;

import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args)
    {
       /* //Pide por teclado el nombre, la edad, sexo, peso y altura.
        System.out.printf("Ingrese nombre");
        String nombre = teclado.nextLine();

        System.out.printf("Ingrese edad");
        int edad = teclado.nextInt();

        System.out.printf("Ingrese sexo (M/F)");
        teclado.nextLine();
        String aux = teclado.nextLine();
        char sexo = aux.charAt(0);

        System.out.printf("Ingrese peso");
        float peso = teclado.nextFloat();

        System.out.println("Ingrese altura");
        float altura = teclado.nextFloat();

        //Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables
        //pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y
        // la altura y el último por defecto, para este último utiliza los métodos set para darle a
        // los atributos un valor.
        Persona persona1 = new Persona(nombre, edad, sexo, altura, peso);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setAltura((float) 1.80);
        persona3.setNombre("Juan");
        persona3.setEdad(22);
        aux = "M";
        sexo = aux.charAt(0);
        persona3.setSexo(sexo);
        persona3.setPeso((float) 43.6);

        //Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo
        //de su peso ideal con un mensaje.
        int imc1 = persona1.calcularIMc();
        int imc2 = persona2.calcularIMc();
        int imc3 = persona3.calcularIMc();

        comprobarImc(imc1);
        comprobarImc(imc2);
        comprobarImc(imc3);

        //Indicar para cada objeto si es mayor de edad.
        boolean edad1 = persona1.esMayorEdad();
        comprobarMayorEdad(edad1);
        boolean edad2 = persona2.esMayorEdad();
        comprobarMayorEdad(edad2);
        boolean edad3 = persona3.esMayorEdad();
        comprobarMayorEdad(edad3);

        //mostrar informacion de cada objeto
        persona1.toString();
        persona2.toString();
        persona3.toString();


        //PUNTO 3
        //Crea un array de Passwords con el tamaño que tu le indiques por teclado.
        Password[] arregloPasswords = new Password[8];

        //Indica también por teclado la longitud de los Passwords (antes de bucle).
        int longitudPasswords = 10;
        //Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
        boolean[] fuerte = new boolean[longitudPasswords];

        //Crea un bucle que cree un objeto para cada posición del array.
        for(int i = 0; i < arregloPasswords.length; i++)
        {
            arregloPasswords[i] = new Password(longitudPasswords);

            fuerte[i] = arregloPasswords[i].esFuerte();
            if(fuerte[i])
            {
                System.out.println("Contraseña nª" +i+ " Es fuerte");
            }else
            {
                System.out.println("Contraseña nª" +i+" No es fuerte");
            }
        }

        //Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior).


        //EJERCICIO 4
        //Crea un array de Electrodomesticos de 10 posiciones.
        Electrodomestico[] arreglo = new Electrodomestico[10];

        //Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
        for(int i =0; i < arreglo.length; i++)
        {
            if(i %2 == 0)
            {
                arreglo[i] = new Lavadora(200, 23);
            }else
            {
                arreglo[i] = new Television();
            }
        }

        //Ahora, recorre este array y ejecuta el método precioFinal().
        double sumaPreciosFinales = 0;

        for(int i = 0; i < arreglo.length; i++)
        {
            arreglo[i].precioFinal(arreglo[i].getConsumo());
            sumaPreciosFinales = sumaPreciosFinales + arreglo[i].getPrecioFinal();

            // Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado,
            // el de las lavadoras por otro
            if(arreglo[i] instanceof Television)
            {
                System.out.printf("\nTelevision precio final: "+arreglo[i].getPrecioFinal());
            }else
            {
                System.out.printf("\nLavadora precio final: "+arreglo[i].getPrecioFinal());
            }
        }

        //y la suma de todos los electrodomesticos
        System.out.printf("\nSuma de todos los precios finales de los electrodomesticos: "+sumaPreciosFinales);


        //EJERCICIO 5
        //Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
        Entretenimiento[] arreglo = new Entretenimiento[10];
        for(int i = 0; i < arreglo.length; i++)
        {
            if(i < 5)
            {
                arreglo[i] = new Serie();
            }else
            {
                arreglo[i] = new Videojuego();
            }
        }

        //cargando series
        arreglo[0].setTitulo("The last of us");
        Serie posCero = (Serie) arreglo[0];
        posCero.setNumTemporada(1);


        arreglo[1].setTitulo("The walking dead");
        Serie posUno = (Serie) arreglo[1];
        posUno.setNumTemporada(11);
        posUno.setGenero("Apocaliptico");

        //cargando juegos
        Videojuego juegoCero = (Videojuego) arreglo[6];
        juegoCero.setHoras(50);
        juegoCero.setTitulo("Fornite");

        Videojuego juegoUno = (Videojuego) arreglo[7];
        juegoUno.setTitulo("Counter Strike");
        juegoUno.setHoras(45);

        Videojuego juegoDos = (Videojuego) arreglo[8];
        juegoDos.setTitulo("Minecraft");
        juegoDos.setHoras(130);
        juegoDos.setGenero("Aventura");


        //Entrega algunos Videojuegos y Series con el método entregar().
        arreglo[2].entregar();
        arreglo[1].entregar();
        arreglo[6].entregar();
        arreglo[8].entregar();
        arreglo[9].entregar();

        //Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
        int cantJuegosEntregados = 0;
        int cantSeriesEntregadas = 0;

        for(int i = 0; i < arreglo.length; i++)
        {
            if(arreglo[i] instanceof Serie)
            {
                if(arreglo[i].isEntregado())
                {
                    cantSeriesEntregadas++;
                    arreglo[i].devolver();
                }
            }else
            {
                if(arreglo[i].isEntregado())
                {
                    cantJuegosEntregados++;
                    arreglo[i].devolver();
                }
            }
        }

        System.out.printf("CANTIDAD DE ENTREGADOS:");
        System.out.printf("\nJUEGOS: "+cantJuegosEntregados);
        System.out.printf("\nSERIES: "+cantSeriesEntregadas);


        //Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas.
        int mayorHora = 0;
        Videojuego mayorJuego = new Videojuego();
        mayorJuego = (Videojuego) arreglo[5];

        int mayorTemporadas = 0;
        Serie mayorSerie = new Serie();
        mayorSerie = (Serie) arreglo[0];

        for(int i = 0; i < arreglo.length; i++)
        {
            if(arreglo[i] instanceof Videojuego)
            {
                int rta = mayorJuego.compareTo(arreglo[i]);
                if( rta < 0 )
                {
                    mayorHora = ((Videojuego) arreglo[i]).getHoras();
                    mayorJuego = (Videojuego) arreglo[i];
                }
            }else
            {
                int rta = mayorSerie.compareTo(arreglo[i]);
                if(rta < 0)
                {
                    mayorTemporadas = ((Serie) arreglo[i]).getNumTemporada();
                    mayorSerie = (Serie) arreglo[i];
                }
            }
        }

        // Muestralos en pantalla con toda su información (usa el método toString()).
        System.out.println("\n\nSERIE CON MAS TEMPORADAS:");
        System.out.println(mayorSerie.toString());

        System.out.println("\nVIDEOJUEGO CON MAS HORAS");
        System.out.println(mayorJuego.toString());

        */

        //EJERCICIO 6












    }

    public static void comprobarImc(int i)
    {
        if(i == -1)
        {
            System.out.println("Devolvio -1");

        }else if(i == 0)
        {
            System.out.println("Debajo del peso ideal");

        }else if(i == 1)
        {
            System.out.println("Sobrepeso");

        }

    }

    public static void comprobarMayorEdad(boolean i)
    {
        if(i)
        {
            System.out.println("Es mayor de edad");
        }else
        {
            System.out.println("No es mayor de edad");
        }
    }
}