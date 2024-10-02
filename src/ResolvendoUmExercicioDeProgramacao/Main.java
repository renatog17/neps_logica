package ResolvendoUmExercicioDeProgramacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê os valores de P e R
        int P = scanner.nextInt();
        int R = scanner.nextInt();
        
        // Verifica o caminho da bolinha
        if (P == 0) {
            System.out.println("C");
        } else {
            if (R == 0) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
        
        scanner.close();
    }
}