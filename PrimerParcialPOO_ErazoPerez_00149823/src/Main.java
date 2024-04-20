import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<ArticulosElectronicos> listaDeArticulos = new ArrayList<ArticulosElectronicos>();

        System.out.println("Bienvenido al menu de ElectroMart: \n");

        public static void main(String[] args) {
            menuPrincipal();
        }


        private static void menuPrincipal() {
            Scanner sc = new Scanner(System.in);
            int opcion;
            while(true){
                try {
                    imprimirMenu();
                    opcion = sc.nextInt();
                    sc.nextLine();

                    if(opcion == 0){
                        System.out.println("\n Saliendo del menu. ");
                        break;
                    }

                    switch (opcion){
                        case 1:
                            agregarArticulo();
                            break;
                        case 2:
                            modificarArticulo();
                            break;

                        case 3:
                            consultarListado();
                            break;
                        case 4:
                            mostrarListaArticulos();
                        default:
                            System.out.println("Por favor seleccione una opcion valida\n");
                            break;
                    }
                } catch (InputMismatchException e){
                    System.out.println("Por favor ingrese un dato valido\n");
                    sc.nextLine();
                }
            }
        }

    }

    private static void mostrarListaArticulos() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el modelo del articulo a mostrar:");
            String modelo = sc.nextLine();

            for (int i = 0; i < listaDeArticulos.size(); i++) {

                if (listaDeArticulos.get(i).getModelo().equals(modelo)){
                    ArticulosElectronicos art = listaDeArticulos.get(i);

                    System.out.println("Nombre del articulo: "+art.getNombre());
                    System.out.println("Modelo del articulo: "+art.getModelo());
                    System.out.println("Marca del articulo: "+art.getMarca());
                    System.out.println("Descripcion del articulo: "+art.getDescripcion());
                    System.out.println("Precio del articulo : "+art.getPrecio());

                    return;
                }
            }

    }

    private static void consultarListado() {

        Scanner sc = new Scanner(system.in);
        System.out.println("Nombre,  Modelo,  Descricpcion, Marca,  Precio");
        for (int i = 0; i < listaDeArticulos.size(); i++) {
            ArticulosElectronicos articulo = listaDeArticulos.get(i);
            System.out.println( (i + 1) + " , "+ articulo.getNombre() +  " , " + articulo.getModelo() + " , " + articulo.getDescripcion() + " , " + articulo.getMarca() + " , " + articulo.getPrecio());
        }
        System.out.println("\n");
    }




    private static void menuPrincipal() {

    }

    private static void imprimirMenu() {

        System.out.println("Menu: \n");
        System.out.println("1.Agregar articulo: \n");
        System.out.println("2.Modificar articulo \n");
        System.out.println("3.Consultar listado de articulos \n");
        System.out.println("4.Mostrar lista de articulos: \n");
        System.out.println("0.Salir \n");
        System.out.print("Ingrese opcion: \n ");

    }

    private static void agregarArticulo() {
    Scanner sc = new Scanner(System.in);

        String nombre;
        String modelo;
        String descripcion;
        String marca;
        float precio;

        System.out.println("Ingrese el nombre del articulo:");
        nombre = sc.nextLine();
        System.out.println("Ingrese el modelo del articulo");
        modelo = sc.nextLine();
        System.out.println("Ingrese la descripcion del articulo");
       descripcion = sc.nextLine();
        System.out.println("Ingrese la marca del articulo");
        marca = sc.nextLine();
        System.out.println("Ingrese el precio del articulo");
        precio = sc.nextFloat();
        sc.nextLine();


    }
    private static void modificarArticulo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el modelo del articulo a modificar:");
        String modelo = sc.nextLine();

        for (int i = 0; i < listaDeArticulos.size(); i++) {

            if (listaDeArticulos.get(i).getModelo().equals(modelo)){
                System.out.print("Ingrese el nuevo modelo de "+listaDeArticulos.get(i).getModelo());
                String modelo = sc.nextLine();

                listaDearticulos.get(i).setModelo(nuevoModelo);

                System.out.println("Modelo de "+listaDeArticulo.get(i).getNombre()+" actualizado exitosamente...\n");

                return;
    }

