import java.util.Random;
import java.util.Scanner;

public class PerimetroMatriz {
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

        System.out.println("Matriz generada:");
        imprimirMatriz(matriz);

        int sumaPerimetro = calcularSumaPerimetro(matriz);

        System.out.println("Suma de los elementos en el perímetro: " + sumaPerimetro);
    }

    public static int calcularSumaPerimetro(int[][] matriz) {
        int dimension = matriz.length;
        int suma = 0;

        for (int i = 0; i < dimension; i++) {
            suma += matriz[0][i]; // Borde superior
            suma += matriz[dimension - 1][i]; // Borde inferior
            suma += matriz[i][0]; // Borde izquierdo
            suma += matriz[i][dimension - 1]; // Borde derecho
        }

        // Restar las esquinas que se han contado dos veces
        suma -= (matriz[0][0] + matriz[0][dimension - 1] + matriz[dimension - 1][0] + matriz[dimension - 1][dimension - 1]);

        return suma;
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
