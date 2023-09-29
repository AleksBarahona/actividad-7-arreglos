import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese el entero(" + (i + 1) + "): ");
            numeros[i] = teclado.nextInt();
        }

        for(int x = 0; x < numeros.length; x++){
            System.out.printf("El elemento %d tiene el valor: %d\n" +
                    "Su cuadrado es: %f\n" +
                    "Su cubo es: %f\n" +
                    "------------------\n",
                        (x + 1), numeros[x], Math.pow(numeros[x], 2), Math.pow(numeros[x], 3));
        }
    }
}
