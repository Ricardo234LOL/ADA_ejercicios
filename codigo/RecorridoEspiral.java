import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RecorridoEspiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matriz generada:");
        imprimirMatriz(matriz);

        List<Integer> recorrido = recorrerEspiral(matriz);

        System.out.println("Recorrido en espiral: " + recorrido);
    }

    public static List<Integer> recorrerEspiral(int[][] matriz) {
        List<Integer> resultado = new ArrayList<>();
        if (matriz == null || matriz.length == 0) return resultado;

        int filaInicial = 0;
        int filaFinal = matriz.length - 1;
        int columnaInicial = 0;
        int columnaFinal = matriz[0].length - 1;

        while (filaInicial <= filaFinal && columnaInicial <= columnaFinal) {
            for (int i = columnaInicial; i <= columnaFinal; i++) {
                resultado.add(matriz[filaInicial][i]);
            }
            filaInicial++;

            for (int i = filaInicial; i <= filaFinal; i++) {
                resultado.add(matriz[i][columnaFinal]);
            }
            columnaFinal--;

            if (filaInicial <= filaFinal) {
                for (int i = columnaFinal; i >= columnaInicial; i--) {
                    resultado.add(matriz[filaFinal][i]);
                }
            }
            filaFinal--;

            if (columnaInicial <= columnaFinal) {
                for (int i = filaFinal; i >= filaInicial; i--) {
                    resultado.add(matriz[i][columnaInicial]);
                }
            }
            columnaInicial++;
        }
        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
