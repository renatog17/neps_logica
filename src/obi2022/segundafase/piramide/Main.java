package obi2022.segundafase.piramide;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int[][] piramide = new int[N][N];

        for (int camada = 1; camada <= (N + 1) / 2; camada++) {
            int inicio = camada - 1;
            int fim = N - camada;

            for (int i = inicio; i <= fim; i++) {
                for (int j = inicio; j <= fim; j++) {
                    piramide[i][j] = camada;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(piramide[i][j] + " ");
            }
            System.out.println();
        }
    }
}
