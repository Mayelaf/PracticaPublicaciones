package ejemplo.publicaciones;

import java.util.Scanner;

public class PublicacionCte {

    static Scanner sc = new Scanner(System.in);
    static Object []tienda = new Object[20];

    public static void main(String[] args) {
        int opcion = 0;
        do{
            System.out.println("===========MENU=============");
            System.out.println("1) Alta de publicacion");
            System.out.println("2) Consultar publicaciones");
            System.out.println("3) Salir");
            opcion = Integer.parseInt(sc.nextLine());
            evaluaOpcion(opcion);
        }while (opcion != 3);
    }

    public static void evaluaOpcion(int opcion) {
        switch (opcion) {
            case 1:
                altaPublicacion();
                break;
            case 2:
                consultaPublicaciones();
                break;
            case 3:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opcion no reconocida, Inserte opcion valida");
        }
    }

    public static void altaPublicacion() {
        int opcion = 0;
        do {
            System.out.println("Inserte opcion del Alta deseada");
            System.out.println("1) Libro");
            System.out.println("2) Revista");
            System.out.println("3) Periodico");
            System.out.println("4) Cancelar");
            opcion = Integer.parseInt(sc.nextLine());
            evaluaAlta(opcion);
        } while (opcion < 1 || opcion > 4);
    }

    public static void consultaPublicaciones() {
        for (int i = 0; i < tienda.length; i++) {
            if (tienda[i] == null) {
                break;
            }
            if (tienda[i] instanceof Libro) {
                Libro libro = (Libro)tienda[i];
                System.out.println("----LIBRO----");
                System.out.println("ISBN " + libro.getISBN());
                System.out.println("TITULO " + libro.getTitulo());
                System.out.println("AUTOR " + libro.getAutor());
                System.out.println("EDICION " + libro.getEdicion());
                System.out.println("PRECIO " + libro.getPrecio());
                System.out.println("EXTENSION " + libro.getExtension());
            }
            if (tienda[i] instanceof Revista) {
                Revista revista = (Revista)tienda[i];
                System.out.println("----REVISTA----");
                System.out.println("ISSN " + revista.getISSN());
                System.out.println("TITULO " + revista.getTitulo());
                System.out.println("AUTOR " + revista.getAutor());
                System.out.println("PERIODICIDAD " + revista.getPeriodicidad());
                System.out.println("NUMERO " + revista.getNumero());
                System.out.println("PRECIO " + revista.getPrecio());
                System.out.println("EXTENSION " + revista.getExtension());
            }
            if (tienda[i] instanceof Periodico) {
                Periodico periodico = (Periodico) tienda[i];
                System.out.println("----PERIODICO----");
                System.out.println("EDICION " + periodico.getEdicion());
                System.out.println("TITULO " + periodico.getTitulo());
                System.out.println("AUTOR " + periodico.getAutor());
                System.out.println("NOTICIA PRINCIPAL " + periodico.getNoticiaPrincipal());
                System.out.println("FECHA " + periodico.getFecha());
                System.out.println("PRECIO " + periodico.getPrecio());
                System.out.println("EXTENSION " + periodico.getExtension());
            }
        }
    }

    public static void evaluaAlta(int opcion) {
        switch (opcion) {
            case 1:
                Libro nuevoLibro = crearLibro();
                agregaTienda(nuevoLibro);
                break;
            case 2:
                Revista nuevaRevista = crearRevista();
                agregaTienda(nuevaRevista);
                break;
            case 3:
                Periodico nuevoPeriodico = crearPeriodico();
                agregaTienda(nuevoPeriodico);
                break;
            case 4:
                System.out.println("cancelando alta");
                break;
            default:
                System.out.println("Opcion no reconocida, Inserte opcion valida");
        }
    }

    public static Libro crearLibro() {
        Libro libro = new Libro();

        System.out.println("Inserte ISBN del libro:");
        String ISBN = sc.nextLine();
        libro.setISBN(ISBN);

        System.out.println("Inserte Titulo del libro:");
        String titulo = sc.nextLine();
        libro.setTitulo(titulo);

        System.out.println("Inserte Autor del libro:");
        String autor = sc.nextLine();
        libro.setAutor(autor);

        System.out.println("Inserte Edicion del libro:");
        String edicion = sc.nextLine();
        libro.setEdicion(edicion);

        System.out.println("Inserte Precio del libro:");
        int precio = Integer.parseInt(sc.nextLine());
        libro.setPrecio(precio);

        System.out.println("Inserte Extension del libro:");
        int ext = Integer.parseInt(sc.nextLine());
        libro.SetExtension(ext);

        return libro;
    }

    public static Revista crearRevista() {
        Revista revista = new Revista();

        System.out.println("Inserte ISSN de la revista:");
        String ISSN = sc.nextLine();
        revista.setISSN(ISSN);

        System.out.println("Inserte Titulo de la revista:");
        String titulo = sc.nextLine();
        revista.setTitulo(titulo);

        System.out.println("Inserte Autor de la revista:");
        String autor = sc.nextLine();
        revista.setAutor(autor);

        System.out.println("Inserte Numero de la revista:");
        int numero = Integer.parseInt(sc.nextLine());
        revista.setNumero(numero);

        System.out.println("Inserte Periodicidad de la revista:");
        String perio = sc.nextLine();
        revista.setPeriodicidad(perio);

        System.out.println("Inserte Precio de la revista:");
        int precio = Integer.parseInt(sc.nextLine());
        revista.setPrecio(precio);

        System.out.println("Inserte Extension de la revista:");
        int ext = Integer.parseInt(sc.nextLine());
        revista.SetExtension(ext);

        return revista;
    }

    public static Periodico crearPeriodico() {
        Periodico periodico = new Periodico();

        System.out.println("Inserte Edicion del periodico:");
        String edicion = sc.nextLine();
        periodico.setEdicion(edicion);

        System.out.println("Inserte Titulo del periodico:");
        String titulo = sc.nextLine();
        periodico.setTitulo(titulo);

        System.out.println("Inserte Autor del periodico:");
        String autor = sc.nextLine();
        periodico.setAutor(autor);

        System.out.println("Inserte Fecha del periodico:");
        String fecha = sc.nextLine();
        periodico.setFecha(fecha);

        System.out.println("Inserte Noticia principal del periodico:");
        String nPrincipal = sc.nextLine();
        periodico.setNoticiaPrincipal(nPrincipal);

        System.out.println("Inserte Precio del periodico:");
        int precio = Integer.parseInt(sc.nextLine());
        periodico.setPrecio(precio);

        System.out.println("Inserte Extension del periodico:");
        int ext = Integer.parseInt(sc.nextLine());
        periodico.SetExtension(ext);

        return periodico;
    }

    public static void agregaTienda(Publicacion nuevaPublicacion) {
        boolean agregado = false;
        for (int i = 0; i < tienda.length; i++) {
            if (tienda[i] == null) {
                tienda[i] = nuevaPublicacion;
                agregado = true;
                break;
            }
        }
        if (!agregado) {
            System.out.println("La nueva publicacion no puede ser agregada porque la tienda esta llena.");
        }
    }

}