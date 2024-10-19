package buscasimplesnovetor395;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean vetor[] = new boolean[101];
		
		for (int i = 0; i < 10; i++) {
			vetor[sc.nextInt()] = true;
		}
		
		if(vetor[sc.nextInt()]) System.out.println("SIM");
		else System.out.println("NAO");
	}
}
