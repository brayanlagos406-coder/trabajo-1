import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5);
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 2);
        Libro libro3 = new Libro("1984", "George Orwell", 1);

        while (true) {

            System.out.println("\n=== BIBLIOTECA ===");
            System.out.println("1. Seleccionar libro");
            System.out.println("2. Salir");
            int opcionPrincipal = sc.nextInt();

            if (opcionPrincipal == 2) {
                System.out.println("Saliendo del sistema...");
                break;
            }

            if (opcionPrincipal == 1) {

                System.out.println("\nSeleccione un libro:");
                System.out.println("1. Cien años de soledad");
                System.out.println("2. El principito");
                System.out.println("3. 1984");

                int opcionLibro = sc.nextInt();

                Libro libroSeleccionado = null;

                if (opcionLibro == 1) {
                    libroSeleccionado = libro1;
                } else if (opcionLibro == 2) {
                    libroSeleccionado = libro2;
                } else if (opcionLibro == 3) {
                    libroSeleccionado = libro3;
                } else {
                    System.out.println("Opción inválida");
                    continue;
                }

                System.out.println("\n¿Qué desea hacer?");
                System.out.println("1. Mostrar información");
                System.out.println("2. Prestar libro");
                System.out.println("3. Agregar copias");

                int accion = sc.nextInt();

                if (accion == 1) {
                    libroSeleccionado.mostrarInformacion();

                } else if (accion == 2) {

                    System.out.println("¿Cuántas copias desea prestar?");
                    int cantidad = sc.nextInt();

                    boolean resultado = libroSeleccionado.prestarLibro(cantidad);

                    if (resultado) {
                        System.out.println("Préstamo realizado con éxito");
                    } else {
                        System.out.println("No hay suficientes copias");
                    }

                } else if (accion == 3) {

                    System.out.println("¿Cuántas copias desea agregar?");
                    int cantidad = sc.nextInt();

                    libroSeleccionado.agregarCopias(cantidad);
                    System.out.println("Copias agregadas correctamente");
                }
            }
        }

        sc.close();
    }
}