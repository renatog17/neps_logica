package obi2022.primeirafase.cinema;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int soma = 0;
		if(i<18) soma = 15;
		else if(i<60) soma = 30;
		else soma = 20;
		if(j<18) soma += 15;
		else if(j<60) soma += 30;
		else soma += 20;
		System.out.println(soma);
	}

}
