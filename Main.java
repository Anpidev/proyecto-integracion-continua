import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido al Proyecto de Integración Continua!");
        System.out.println("Esta es una prueba de configuración con Git, GitHub y Jenkins.");
        System.out.println("===============================================");
        
        // Solicitar números al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        // Realizar la suma
        int resultado = sumar(num1, num2);
        
        // Mostrar el resultado
        System.out.println("El resultado de la suma entre " + num1 + " y " + num2 + " es: " + resultado);
        
        scanner.close();
    }

    /**
     * Método para sumar dos números.
     * @param a Primer número.
     * @param b Segundo número.
     * @return Suma de los números.
     */
    public static int sumar(int a, int b) {
        return a + b;
    }
}
