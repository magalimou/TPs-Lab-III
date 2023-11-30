import modelo.Boleto;
import modelo.Cliente;
import modelo.Mex;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner teclado;
    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        Mex miMaquina = new Mex();

        int seguir = 1;

        do{

        System.out.println("Menu principal\n");
        System.out.println("1- Comprar Tickets");
        System.out.println("2- Ver Saldo");
        System.out.println("3- Funciones Tecnicas");
        System.out.println("Ingrese el numero de la opcion:");
        int opcion = teclado.nextInt();


            switch (opcion) {
                case 1: {

                    System.out.println("Ingrese su nombre:");
                    teclado.nextLine();
                    String nom = teclado.nextLine();

                    System.out.println("Ingrese dni:");
                    int dni = teclado.nextInt();

                    System.out.println("Seleccione forma de pago");
                    System.out.println("1- efectivo \n2- tarjeta\n3-Cuenta DNI");
                    int forma = teclado.nextInt();

                    System.out.println("Ingrese el numero que corresponda");
                    System.out.println("1- Jubilado\n2- Estudiante\n3- Ninguna");
                    int tipo = teclado.nextInt();

                    Cliente cliente = new Cliente(nom, dni, tipo,forma);

                    System.out.println("\nValor actual del ticket: " + miMaquina.getPrecioActual());

                    System.out.println("Ingrese la cantidad de dinero");
                    float dinero = teclado.nextFloat();

                    int aux = 1;

                    while ((dinero + miMaquina.getSaldo()) < miMaquina.getPrecioActual() && aux == 1) {
                        System.out.println("Cantidad de dinero insuficiente para comprar ticket, su saldo es de " + (dinero + miMaquina.getSaldo()));
                        System.out.println("Desea agregar mas dinero? \ningrese 1 para si, 2 para no");
                        aux = teclado.nextInt();

                        if (aux == 1) {
                            System.out.println("Ingrese cantidad de dinero");
                            float agregado = teclado.nextFloat();

                            dinero = dinero + agregado;
                        }
                    }

                    int cantBoletos = miMaquina.comprarBoleto(dinero);

                    imprimirBoleto(cantBoletos, miMaquina, cliente);

                    System.out.println("\nSaldo Restante: " + miMaquina.getSaldo());

                    break;
                }

                case 2:
                    System.out.println("\nSaldo Restante: " + miMaquina.getSaldo());
                    break;

                case 3: {
                    String contra = "pochoclossalados";

                    System.out.println("Ingrese contraseña: ");
                    teclado.nextLine();
                    String aux = teclado.nextLine();

                    if (aux.equals(contra)) {
                        System.out.println("Ingreso de sesion exitoso");
                        System.out.println("1- Cambiar precio actual \n2- Cambiar tope de boletos \n3- Ver recaudacion \n4- Vaciar Recaudacion");
                        int op = teclado.nextInt();

                        switch (op) {
                            case 1: {
                                System.out.println("Ingrese nuevo precio del ticket");
                                float nuevoPrecio = teclado.nextFloat();
                                miMaquina.setPrecioActual(nuevoPrecio);
                                break;
                            }

                            case 2: {
                                System.out.println("Ingrese nuevo tope de boletos:");
                                int nuevoTope = teclado.nextInt();
                                miMaquina.setTopeBoletos(nuevoTope);
                                break;
                            }

                            case 3: {
                                System.out.println("Recaudacion: " + miMaquina.getRecaudacion());
                                break;
                            }

                            case 4: {
                                miMaquina.vaciarRecaudacion();
                                System.out.println("Recaudacion vaciada exitosamente");
                            }
                        }

                    } else {
                        System.out.println("Contraseña incorrecta ");
                    }

                    break;
                }

            }
            System.out.println("\nVolver al menu? \n1-si \n2-no");
            seguir = teclado.nextInt();

        }while (seguir == 1);

    }

    public static void imprimirBoleto(int cantidad, Mex maquina, Cliente client)
    {
        Boleto boleto = new Boleto(maquina.getPrecioActual());
        int numTicket = 1;

        while(cantidad > 0)
        {
            System.out.println("\nTicket Nª "+numTicket);
            System.out.println("Nombre: "+client.getNombre());
            System.out.println("DNI:"+client.getDni());

            if(client.getMedioPago() == 1)
            {
                System.out.println("Medio de pago: Efectivo");
            }else if(client.getMedioPago() == 2)
            {
                System.out.println("Medio de pago: Tarjeta");
            }else
            {
                System.out.println("Medio de pago: Cuenta DNI");
            }

            if(client.getTipoCliente() == 1)
            {
                System.out.println("Tipo cliente: Jubilad@");
            }else if(client.getTipoCliente() == 2)
            {
                System.out.println("Tipo cliente: Estudiante");
            }else
            {
                System.out.println("Tipo cliente: Ninguna");
            }

            System.out.println("Precio Emitido: "+boleto.getPrecioEmitido());
            System.out.println("Fecha: "+boleto.getFechaEmision());
            cantidad--;
            numTicket++;
        }

    }

}