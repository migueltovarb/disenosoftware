import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    static Map<String, Double> destinos = new HashMap<>();

    static {
        destinos.put("Ciudad A", 30.0);
        destinos.put("Ciudad B", 50.0);
        destinos.put("Ciudad C", 45.0);
    }


    public static String seleccionarDestino() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Destinos disponibles:");
        for (Map.Entry<String, Double> destino : destinos.entrySet()) {
            System.out.println(destino.getKey() + ": $" + destino.getValue());
        }

        System.out.print("Selecciona tu destino: ");
        String seleccion = scanner.nextLine();

        if (destinos.containsKey(seleccion)) {
            return seleccion;
        } else {
            System.out.println("Destino no válido.");
            return seleccionarDestino();  
        }
    }


    public static boolean validarTarjetaYpin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu número de tarjeta: ");
        String tarjeta = scanner.nextLine();
        
        System.out.print("Introduce tu PIN: ");
        String pin = scanner.nextLine();

      
        if (pin.length() == 4) {
            System.out.println("Tarjeta y PIN validados.");
            return true;
        } else {
            System.out.println("PIN incorrecto.");
            return false;
        }
    }


    public static boolean procesarPago(double precio) {
        System.out.println("Procesando el pago de $" + precio + "...");
      
        return true;
    }

  
    public static void expedirBoleto(String destino) {
        System.out.println("Boleto emitido para " + destino + ". ¡Buen viaje!");
    }

   
    public static void sistemaExpedicionBoletos() {
        String destino = seleccionarDestino();
        double precio = destinos.get(destino);

        if (validarTarjetaYpin()) {
            if (procesarPago(precio)) {
                expedirBoleto(destino);
            } else {
                System.out.println("Error en el pago.");
            }
        } else {
            System.out.println("Validación de tarjeta fallida.");
        }
    }

    
    public static void main(String[] args) {
        sistemaExpedicionBoletos();
    }
}
