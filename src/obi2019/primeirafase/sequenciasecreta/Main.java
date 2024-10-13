package obi2019.primeirafase.sequenciasecreta;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Stack<Integer> numeros = new Stack<Integer>();
		
		
		for (int i = 0; i < n; i++) {
			if(numeros.empty()) numeros.add(sc.nextInt());
			else {
				int aux = sc.nextInt();
				if(numeros.peek()!= aux) {
					numeros.add(aux);
				}
			}
		}
		System.out.println(numeros.size());
	}

}
