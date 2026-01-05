
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            LOGGER.info("Iniciando el sistema...");
            System.out.println("Bienvenido al sistema de SmartStock RT...\n");

            MonitorInventario monitor = new MonitorInventario();
            monitor.iniciarMonitoreo();

            Menu menu = new Menu();
            menu.mostrarOpciones();

            monitor.detenerMonitoreo();

            LOGGER.info("Sistema finalizado.");
            System.out.println("SmartStock RT finalizado correctamente.");
        } catch (Exception e) {
            LOGGER.severe("Ocurrió un error: " + e.getMessage());
            System.out.println("Ha ocurrido un error inesperado. Por favor, intente nuevamente.");
        }
    }
}
