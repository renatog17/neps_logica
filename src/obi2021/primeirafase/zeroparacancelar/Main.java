package obi2021.primeirafase.zeroparacancelar;


import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Stack<Integer> numeros = new Stack<Integer>();
		
		for (int i = 0; i < n; i++) {
			int aux = sc.nextInt();
			if(aux==0) {
				if (!numeros.isEmpty()) {
					numeros.pop();
                }
			}else {
				numeros.push(aux);
			}
		}
		int total = 0;
		
		while(!numeros.isEmpty()) {
			total += numeros.pop();
		}
		System.out.println(total);
	}

}
