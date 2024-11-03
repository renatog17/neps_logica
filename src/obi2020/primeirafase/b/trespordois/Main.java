package obi2020.primeirafase.b.trespordois;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int somaTotal = 0;
		int narray[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			narray[i] = sc.nextInt();
		}

		Arrays.sort(narray);
		
		int cont = 0;
		
		for (int i = narray.length-1; i >= 0; i--) {
			
			somaTotal += narray[i]; 
			cont++;
			if(cont==2) {
				i--;
				cont = 0;
			}
		}
		System.out.println(somaTotal);
	}

}
