package obi2022.segundafase.trofeu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p[] = new int [110];
		for (int i = 0; i < 5; i++) {
			p[sc.nextInt()]++;
		}
		int i = 0;
		int indice = 100;
		while(i<2) {
			if(p[indice]!=0) {
				System.out.print(p[indice]+" ");
				i++;
			}
			if(indice==0) {
				System.out.println(0);
				i++;
			}
			indice--;
			//System.out.println("asdfasdf");
		}
	}

}
