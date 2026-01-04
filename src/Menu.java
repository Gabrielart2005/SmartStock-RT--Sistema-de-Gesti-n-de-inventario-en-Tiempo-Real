import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Muestra el menú principal y gestiona la selección del usuario.
     */
    public void mostrarOpciones() {
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            String opcion = scanner.nextLine().trim();
            switch (opcion) {
                case "1":
                    mostrarInventario();
                    break;
                case "2":
                    agregarProducto();
                    break;
                case "3":
                    eliminarProducto();
                    break;
                case "4":
                    salir = true;
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.\n");
            }
        }
    }

    /**
     * Muestra las opciones disponibles en el menú.
     */
    private void mostrarMenu() {
        System.out.println("\n==============================");
        System.out.println("      MENÚ PRINCIPAL");
        System.out.println("==============================");
        System.out.println("1. Ver inventario");
        System.out.println("2. Agregar producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Método para mostrar el inventario (por implementar).
     */
    private void mostrarInventario() {
        System.out.println("Mostrando inventario...");
        // TODO: Implementar lógica para mostrar inventario
    }

    /**
     * Método para agregar un producto (por implementar).
     */
    private void agregarProducto() {
        System.out.println("Agregando producto...");
        // TODO: Implementar lógica para agregar producto
    }

    /**
     * Método para eliminar un producto (por implementar).
     */
    private void eliminarProducto() {
        System.out.println("Eliminando producto...");
        // TODO: Implementar lógica para eliminar producto
    }
}
