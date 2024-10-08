package obi2018.terceiraFase.bolas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String saida = "S";
		int ns[] = new int[10];
		for (int i = 0; i < 8; i++) {
			ns[sc.nextInt()]++;
		}	
		
		for (int i = 0; i < ns.length; i++) {
			if(ns[i]>4) saida = "N";
		}

		System.out.println(saida);
	}

}
