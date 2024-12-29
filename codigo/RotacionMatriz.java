import java.util.Scanner;
import java.util.Random;

public class RotacionMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la dimension de la matriz (d): ");
        int dimension = scanner.nextInt();

        int[][] matriz = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] matrizRotada = rotarMatriz(matriz);

        System.out.println("Matriz rotada 90 en el sentido de las agujas del reloj:");
        imprimirMatriz(matrizRotada);
    }

    public static int[][] rotarMatriz(int[][] matriz) {
        int dimension = matriz.length;
        int[][] rotada = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                rotada[j][dimension - 1 - i] = matriz[i][j];
            }
        }
        return rotada;
    }

    public static void imprimirMatriz(int[][] matriz) {
        int dimension = matriz.length;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
