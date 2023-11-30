import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {




        ejercicios ej = new ejercicios();

        try
        {
            ej.dividr(2,0);
        }
        catch(ArithmeticException e)
        {
            System.out.printf("ERROR DIVISION POR 0");
        }


        try
        {
            int a = ej.longitud("holahola20");

        }
        catch(NumberFormatException a)
        {
            System.out.println("ERROR: NUMERO EN CADENA");
        }


        try
        {
            int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
            int num = ej.fueraLimite(11,arreglo);
            System.out.printf("numero: " + num);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ERROR INDICE FUERA DE LIMITE");

        }

        try {
            double area = ej.radioneg(-1);
            System.out.printf("Area: "+area);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("ERROR RADIO NEGATIVO");
        }



        try
        {
            Cuenta miCuenta = new Cuenta(1,300);
            miCuenta.retirarDinero(400);
        }
        catch(SaldoInsuficienteException e)
        {
            System.out.println(e.getMensajeError());
        }

        teclado.close();

        try {

            System.out.printf("Factorial = "+ej.calcularFactorialRec(-2));
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("ERROR NUMERO NEGATIVO");

        }

        String fechaString = "31/02/2023";
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate fecha = LocalDate.parse(fechaString, formatoFecha);
            System.out.println("La fecha " + fecha + " es válida");
        } catch (DateTimeParseException ex) {
            System.out.println("La fecha " + fechaString + " es inválida");
        }


        Usa usa = new Usa();
        Categoria categ1 = new Categoria("ELECTRONICA",100);
        Categoria categ2 = new Categoria("INDUMENTARIO",50);
        usa.agregarCategoria(categ1);
        usa.agregarCategoria(categ2);

        try
        {
            usa.comprarPorCategoria("ELECTRONICA");
            System.out.println("USA COSTOS: "+usa.getTotal());
        }
        catch (InvalidCategoryException e)
        {
            System.out.printf(""+e.getMensajeError());

        }

        try
        {
            ej.contra("matematAA");

        }
        catch(InvalidPasswordException e)
        {
            System.out.printf(""+e.getMensajeError());
        }


    }

}