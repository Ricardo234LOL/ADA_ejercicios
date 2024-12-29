import java.util.Random;
import java.util.Scanner;

public class VerificarSimetria {
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

        System.out.println("Matriz generada:");
        imprimirMatriz(matriz);

        if (esSimetrica(matriz)) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }

    public static boolean esSimetrica(int[][] matriz) {
        int dimension = matriz.length;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
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
