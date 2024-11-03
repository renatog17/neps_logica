package obi2023.terceirafase.cabodeguerra;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int [6];
		for (int i = 0; i < 6; i++) {
			n[i] = sc.nextInt();
		}
		
		Arrays.sort(n);
		
		int a = n[0];
		a += n[5];
		
		int b = n[1];
		b += n[4];
		
		int maiorAB = Math.max(a, b);
		int menorAB = Math.min(a, b);
		
		int maiorN = Math.max(n[2], n[3]);
		int menorN = Math.min(n[2], n[3]);
		if(maiorAB+menorN == menorAB+maiorN) {
			System.out.println("S");
		}else {
			System.out.println("N");
		}
	}

}
