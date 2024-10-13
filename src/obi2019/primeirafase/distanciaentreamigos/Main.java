package obi2019.primeirafase.distanciaentreamigos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // valor "infinito"
        final int inf = (int) 1e9 + 10;

        int n = sc.nextInt();

        // inicialmente, maior começa com um valor menor que o mínimo valor possível
        int maior = -inf;

        // resposta do problema
        int ans = -inf;

        for (int i = 1; i <= n; i++) {
            // altura do i-ésimo prédio
            int h = sc.nextInt();

            // atualizamos a resposta
            ans = Math.max(ans, h + i + maior);

            // atualizamos o maior valor (h - i)
            maior = Math.max(maior, h - i);
        }

        // imprimimos a resposta
        System.out.println(ans);
    }

}
