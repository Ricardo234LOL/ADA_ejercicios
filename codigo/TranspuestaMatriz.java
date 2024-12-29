import java.util.Random;
import java.util.Scanner;

public class TranspuestaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la dimension de la matriz (n): ");
        int dimension = scanner.nextInt();

        int[][] matriz = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] matrizTranspuesta = transponerMatriz(matriz);

        System.out.println("Matriz transpuesta:");
        imprimirMatriz(matrizTranspuesta);
    }

    public static int[][] transponerMatriz(int[][] matriz) {
        int dimension = matriz.length;
        int[][] transpuesta = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
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
