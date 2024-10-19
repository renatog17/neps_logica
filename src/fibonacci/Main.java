package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número N (0 ≤ N ≤ 30): ");
        int N = scanner.nextInt();
        
        if (N < 0 || N > 30) {
            System.out.println("O número deve estar entre 0 e 30.");
        } else {
            int resultado = fibonacci(N);
            System.out.println("O " + N + "º número de Fibonacci é: " + resultado);
        }
        
        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1; // fib(0) = fib(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
