package obi2012.primeirafase.frequencianaaula;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Set<Integer> numeros = new HashSet<Integer>();
		
		for (int i = 0; i < n; i++) {
			numeros.add(sc.nextInt());
		}
		System.out.println(numeros.size());
	}

}
