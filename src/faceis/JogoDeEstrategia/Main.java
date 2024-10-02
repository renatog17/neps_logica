package faceis.JogoDeEstrategia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int r = sc.nextInt();
		int[] pontuacao = new int[j];
		
		for (int i = 0; i < r ; i++) {
			for (int k = 0; k < j; k++) {
				pontuacao[k] = sc.nextInt()+pontuacao[k];
			}
		}
		
		int pontVencedor = 0;
		int vencedor = 0;
		for (int k = 0; k < pontuacao.length; k++) {
			if(pontuacao[k]>=pontVencedor) {
				pontVencedor = pontuacao[k];
				vencedor = k;
			}
		}
		System.out.println(vencedor+1);
	}

}
