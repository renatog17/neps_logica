package obi2001.faseunica.domino;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int teste = 1;
		while(true) {
			int n = sc.nextInt();
			int ns [] = new int [7];
			int iguais [] = new int[7];
			if(n==0) break;
			
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(a==b) {				
					iguais[a]++;
				}else {
					ns[a]++;
					ns[b]++;					
				}
			}
//			for (int i = 0; i < ns.length; i++) {
//				System.out.print(ns[i]+" ");
//			}
			String saida = "sim";
			int impares = 0;
			
			
			
			for (int i = 0; i < ns.length; i++) {
				if(ns[i]%2==1) impares++;
			}
			if(impares!=2 && impares!=0) {
				saida="nao";
			}
			
			for (int i = 0; i < iguais.length; i++) {
				if(ns[i]>0 && iguais[i]>0) {
					iguais[i] = 0;
				}
			}
			for (int i = 0; i < iguais.length; i++) {
				if(iguais[i]>0)
				saida = "nao";
			}
			System.out.println("Teste "+teste+"\n"+saida+"\n");
			teste++;
			
		}
	}

}
