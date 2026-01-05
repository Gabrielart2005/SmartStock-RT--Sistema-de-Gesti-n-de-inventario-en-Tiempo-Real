import java.util.List;

public class MonitorInventario implements Runnable {
    private int UmbralMinimo;
    private boolean ejecutando;
    private Thread hilo;

    public MonitorInventario(int umbralMinimo) {
        this.UmbralMinimo = umbralMinimo;
        this.ejecutando = false;
    }

    public void iniciar() {
        this.ejecutando = true;
        this.hilo = new Thread(this);
        this.hilo.start();
    }

    public void detener() {
        this.ejecutando = false;
    }

    public void run() {
        while (ejecutando) {
            Inventario inv = Inventario.getInstance();
            List<Producto> bajoStock = inv.obtenerBajoStock(UmbralMinimo);
            if (!bajoStock.isEmpty()) {
                System.out.println("Alerta producto con bajo stock: ");
                for (Producto p : bajoStock) {
                    System.out.println(p.getNombre() + " - " + p.getCantidad() + " unidades");
                }
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                break;
            }

        }
    }
}
