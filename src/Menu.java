import java.util.Scanner;

public class Menu {

    private final Scanner scanner;
    private final Inventario inventario;
    private final Validador validador;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.inventario = Inventario.getInstance();
        this.validador = new Validador();
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
        System.out.println("---- INVENTARIO ----");
        java.util.List<Producto> productos = inventario.obtenerProductos();
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        System.out.println("ID | Nombre | Cantidad | Precio");
        for (Producto p : productos) {
            System.out.println(p.getId() + " | " + p.getNombre() + " | " + p.getCantidad() + " | " + p.getPrecio());
        }
    }

    /**
     * Método para agregar un producto (por implementar).
     */
    private void agregarProducto() {
        System.out.println("\n--- AGREGAR NUEVO PRODUCTO ---");
        int id = validador.leerEntero("Ingrese el ID del producto: ");
        String nombre = validador.LeerTexto("Ingrese el nombre del producto: ");
        int cantidad = validador.leerEntero("Ingrese la cantidad: ");
        double precio = validador.leerDouble("Ingrese el precio: ");
        Producto nuevoProducto = new Producto(id, nombre, cantidad, precio);
        boolean agregado = inventario.agregarProducto(nuevoProducto);
        if (agregado) {
            System.out.println("Producto agregado exitosamente.");
        } else {
            System.out.println("Error: Ya existe un producto con ese ID.");
        }
    }

    /**
     * Método para eliminar un producto (por implementar).
     */
    private void eliminarProducto() {
        System.out.println("\n--- ELIMINAR PRODUCTO ---");
        int id = validador.leerEntero("Ingrese el ID del producto a eliminar: ");
        boolean eliminado = inventario.eliminarProducto(id);
        if (eliminado) {
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Error: No se encontro un producto con ese ID.");
        }
    }
}
