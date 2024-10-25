package fibonacci257;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // Casos base
        if (N == 0 || N == 1) {
            System.out.println(1);
        } else {
            int fib1 = 1;  // fib(0)
            int fib2 = 1;  // fib(1)
            int fibN = 0;
            
            for (int i = 2; i <= N; i++) {
                fibN = fib1 + fib2; // fib(n) = fib(n-1) + fib(n-2)
                fib1 = fib2;        // Atualiza fib(n-1) para o próximo ciclo
                fib2 = fibN;        // Atualiza fib(n) para o próximo ciclo
            }
            
            System.out.println(fibN);
        }
        
        scanner.close();
    }
}