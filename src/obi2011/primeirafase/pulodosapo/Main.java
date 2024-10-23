package obi2011.primeirafase.pulodosapo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdPedras = sc.nextInt();
		int qtdSapos = sc.nextInt();
		int trilha[] = new int[qtdPedras+1];
		int distanciaPulo[] = new int[qtdPedras+1];
		
		for (int i = 0; i < qtdSapos; i++) {
			int p = sc.nextInt();
			int d = sc.nextInt();
			int modPporD = p%d;
			trilha[modPporD] = 1;
			distanciaPulo[modPporD] = d;
		}
		
		for (int i = 0; i <= qtdPedras; i++) {
			System.out.print(trilha[i]+" ");
			System.out.println(distanciaPulo[i]);
		}

	}

}
