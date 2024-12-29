import java.util.Random;
import java.util.Scanner;

public class SumaDiagonales {
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

        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        for (int i = 0; i < dimension; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
            sumaDiagonalSecundaria += matriz[i][dimension - 1 - i];
        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);
    }
}
