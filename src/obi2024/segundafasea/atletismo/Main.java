package obi2024.segundafasea.atletismo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int atletas [] = new int[n+1];
		for (int i = 1; i <= n; i++) {
			atletas[sc.nextInt()] = i;
		}
		for (int i = 1; i < atletas.length; i++) {
			System.out.println(atletas[i]);
		}
	}

}
