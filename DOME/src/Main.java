import modelo.Cd;
import modelo.Dome;
import modelo.Dvd;
import modelo.Elemento;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Dome miDome = new Dome();
        int seguir;

        do {

            menu();
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1: //agregar cd
                {
                    System.out.println("Ingrese titulo:");
                    teclado.nextLine();
                    String titulo = teclado.nextLine();

                    System.out.println("Ingrese genero:");
                    String genero = teclado.nextLine();

                    System.out.println("Ingrese idioma:");
                    String idioma = teclado.nextLine();

                    System.out.println("Ingrese año:");
                    int anio = teclado.nextInt();

                    Elemento eNuevo = new Cd(titulo, genero, idioma,anio);

                    System.out.println("Ingrese Comentario");
                    teclado.nextLine();
                    String com = teclado.nextLine();
                    eNuevo.setComentario(com);

                    System.out.println("Lo tengo? ");
                    boolean tengo = teclado.nextBoolean();
                    eNuevo.setLoTengo(tengo);

                    Cd unCd = (Cd) eNuevo;

                    System.out.println("Ingrese nombre artista");
                    teclado.nextLine();
                    String artista = teclado.nextLine();
                    unCd.setArtista(artista);

                    System.out.println("Ingrese cantidad de temas");
                    int cant = teclado.nextInt();
                    unCd.setCantTemas(cant);

                    System.out.println("ingrese discografica");
                    teclado.nextLine();
                    String discografica = teclado.nextLine();
                    unCd.setDiscografica(discografica);

                    miDome.agregarElemento(unCd);
                    unCd.imprimir();

                    break;
                }

                case 2: //agregar dvd
                {
                    System.out.println("Ingrese titulo:");
                    teclado.nextLine();
                    String titulo = teclado.nextLine();

                    System.out.println("Ingrese genero:");
                    String genero = teclado.nextLine();

                    System.out.println("Ingrese idioma:");
                    String idioma = teclado.nextLine();

                    System.out.println("Ingrese año:");
                    int anio = teclado.nextInt();

                    Elemento eNuevo = new Dvd(titulo, genero, idioma, anio);
                    Dvd unDvd = (Dvd) eNuevo;

                    System.out.println("Ingrese productor:");
                    teclado.nextLine();
                    String productor = teclado.nextLine();
                    unDvd.setProductor(productor);

                    System.out.println("Ingrese director: ");
                    String director = teclado.nextLine();
                    unDvd.setDirector(director);

                    System.out.println("Ingrese Estudio:");
                    String estudio = teclado.nextLine();
                    unDvd.setEstudio(estudio);

                    miDome.agregarElemento(unDvd);
                    unDvd.imprimir();

                    break;
                }

                case 3: //buscar por titulo
                {
                    System.out.println("Ingrese el titulo que desea buscar:");
                    teclado.nextLine();
                    String titulo = teclado.nextLine();
                    Elemento encontrado = miDome.buscarPorTitulo(titulo);
                    if(encontrado != null)
                    {
                        encontrado.imprimir();

                    }else
                    {
                        System.out.println("No se encontro ningun elemento con el titulo "+titulo);
                    }


                    break;
                }

                case 4: //buscar por idioma
                {
                    System.out.println("Ingrese el idioma a buscar");
                    teclado.nextLine();
                    String idioma = teclado.nextLine();
                    miDome.buscarPorIdioma(idioma);
                    break;
                }

                case 5: //mostrar todos los dvd
                {
                    System.out.println("MOSTRANDO TODOS LOS DVD's....\n");
                    miDome.mostrarDvds();
                    break;
                }

                case 6: //mostrar todos los cd
                {
                    System.out.println("MOSTRANDO TODOS LOS CD's....\n");
                    miDome.mostrarCds();

                    break;
                }

            }

            System.out.println("\n\nDesea seguir en el menu? Ingrese un numero \n1- si \n2-no");
            seguir = teclado.nextInt();

        }while(seguir == 1);



        teclado.close();


    }

    public static void menu()
    {
        System.out.println("Menu");
        System.out.println("1- Agregar CD");
        System.out.println("2- Agregar Dvd");
        System.out.println("3- Buscar por titulo");
        System.out.println("4- Buscar por idioma");
        System.out.println("5- Ver todos los DVD's");
        System.out.println("6- Ver todos los CD's");
        System.out.println("Ingrese el numero de la opcion: ");
    }


}

