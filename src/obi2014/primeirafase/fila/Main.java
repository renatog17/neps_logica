package obi2014.primeirafase.fila;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fila[] = new int[n];
		for (int i = 0; i < fila.length; i++) {
			fila[i] = sc.nextInt();
		}
		//fazer um array de estado para saber se o número ainda está na fila e antes de imprimir, apenas consultar neste array
		int s = sc.nextInt();
		int sairam[] = new int[s];
		for (int i = 0; i < sairam.length; i++) {
			sairam[i] = sc.nextInt();
		}
	}
}
