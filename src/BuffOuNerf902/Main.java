package BuffOuNerf902;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int N = sc.nextInt();  
        int D = sc.nextInt();  
        int M = sc.nextInt();  
        int P = sc.nextInt();  
        
        int danoInicial = N * D;
        int danoFinal = M * P;
        
        if (danoFinal > danoInicial) {
            System.out.println("BUFF");
        } else {
            System.out.println("NERF");
        }

        sc.close();
    }
}