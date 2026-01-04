import java.util.List;

public class ReporteConsola {
    
    private static final String FORMATO_REPORTE = "| %-5s | %-20s | %-10s | %-10s |%n";

    private static final String SEPARADOR = "+-------+----------------------+------------+------------+";

    public void generarReporte(List<Producto> productos) {
        if (productos == null || productos.isEmpty()) {
            System.out.println("\n+-------------------------------------------------------------+");
            System.out.println("|           El inventario está vacío o sin productos.         |");
            System.out.println("+-------------------------------------------------------------+\n");
            return;
        }
        imprimirTabla(productos);
    }

    private void imprimirTabla(List<Producto> productos) {
        System.out.println(SEPARADOR);
        System.out.printf(FORMATO_REPORTE, "ID", "Nombre", "Cantidad", "Precio");
        System.out.println(SEPARADOR);
        for (Producto producto : productos) {
            System.out.printf(FORMATO_REPORTE,
                    producto.getId(),
                    producto.getNombre(),
                    producto.getCantidad(),
                    producto.getPrecio());
        }
        System.out.println(SEPARADOR);
    }
}