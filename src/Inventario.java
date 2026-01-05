import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private static Inventario instancia;
    private List<Producto> productos;

    private Inventario() {
        this.productos = new ArrayList<Producto>();
    }

    public static Inventario getInstance() {
        if (instancia == null) {
            instancia = new Inventario();
        }
        return instancia;
    }

    public boolean agregarProducto(Producto producto) {
        for (Producto p : productos) {
            if (p.getId() == producto.getId()) {
                return false;
            }
        }
        productos.add(producto);
        return true;
    }

    public Producto buscarProducto(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean venderProducto(int id, int cantidad) {
        Producto producto = buscarProducto(id);
        if (producto == null) {
            return false;
        }
        if (producto.getCantidad() < cantidad) {
            return false;
        }
        int nuevaCantidad = producto.getCantidad() - cantidad;
        producto.setCantidad(nuevaCantidad);
        return true;
    }

    public List<Producto> obtenerProductos() {
        return productos;
    }

    public List<Producto> obtenerBajoStock(int umbral) {
        List<Producto> bajosStock = new ArrayList<Producto>();
        for (Producto p : productos) {
            if (p.getCantidad() < umbral) {
                bajosStock.add(p);
            }
        }
        return bajosStock;
    }

    public boolean eliminarProducto(int id) {
        Producto producto = buscarProducto(id);
        if (producto == null) {
            return false;
        }
        productos.remove(producto);
        return true;
    }
}
