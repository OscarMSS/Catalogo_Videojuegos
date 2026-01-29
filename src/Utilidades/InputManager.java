package Utilidades;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {
    //CLASE PARA LA VALIDACIÓN DE ENTRADAS
    //INICIALIZACIÓN DEL SCANNER
    Scanner entrada = new Scanner(System.in);

    //METODO CONSTRUCTOR DE LA CLASE, VACÍO.
    public InputManager() {
    }

    //VALIDACIÓN DE NÚMEROS ENTEROS
    public int validarInt() {
        //CICLO DE VALIDACIÓN, SE EJECUTA MIENTRAS EL NÚMERO SEA ENTERO
        while (true) {
            try {
                int dato = entrada.nextInt();
                entrada.nextLine();
                return dato;
            } catch (InputMismatchException e) {
                System.out.println("El dato solo puede ser un número entero, por favor inténtelo de nuevo.");
                entrada.next();
            }
        }
    }

    //VALIDACIÓN DE NÚMEROS DECIMALES
    public double validarDouble() {
        while (true) {
            try {
                double dato = entrada.nextDouble();
                entrada.nextLine();
                return dato;
            } catch (InputMismatchException e) {
                System.out.println("El dato solo puede ser un número decimal, por favor intentelo de nuevo.");
                entrada.next();
            }
        }
    }

    //VALIDACIÓN DE STRINGS
    public String validarString() {
        while (true) {
            String texto = entrada.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("El texto no puede estar vacío. Inténtelo de nuevo.");
                continue;
            }
            // Validar patrón
            if (texto.matches("^[A-Za-zÁÉÍÓÚáéíóúÑñ0-9 -]+$")) {
                return texto;
            } else {
                System.out.println("El dato solo puede contener letras, espacios, guiones y números. Inténtelo de nuevo.");
            }
        }
    }


}
