package primo247;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // Chamada da função que verifica se o número é primo
        if (isPrimo(N)) {
            System.out.println("S"); // N é primo
        } else {
            System.out.println("N"); // N não é primo
        }
        
        scanner.close();
    }
    
    public static boolean isPrimo(int n) {
        // Casos especiais
        if (n < 2) return false; // N < 2 não é primo
        if (n == 2) return true;  // 2 é primo
        if (n % 2 == 0) return false; // N par e > 2 não é primo
        
        // Testa divisores ímpares de 3 até a raiz quadrada de N
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // Encontrou um divisor, não é primo
            }
        }
        
        return true; // Se não encontrou divisores, é primo
    }
}
