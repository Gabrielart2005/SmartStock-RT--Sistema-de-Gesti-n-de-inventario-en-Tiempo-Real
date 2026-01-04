import java.util.Scanner;

public class Validador {
    private final Scanner scanner;

    public Validador() {
        this.scanner = new Scanner(System.in);
    }

    public int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("Entrada vacía. Por favor, ingrese un número entero.");
                continue;
            }
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
            }
        }
    }

    public double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("Entrada vacía. Por favor, ingrese un precio válido (ej. 12.50).");
                continue;
            }
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un precio válido (ej. 12.50).");
            }
        }
    }

    public String LeerTexto(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = scanner.nextLine().trim();
            if (!texto.isEmpty()) {
                return texto;
            } else {
                System.out.println("Entrada vacía. Por favor, ingrese un texto válido.");
            }
        }
    }
}
