package obi2001.faseunica.calculando;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int teste = 1;
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			String expressaoNumerica = sc.next();
			int s = 0;
			int sum = 0;
			for (int i = 0; i < expressaoNumerica.length(); i++) {
				if(expressaoNumerica.substring(i, i+1).equals("+") || expressaoNumerica.substring(i, i+1).equals("-")) {
					sum += Integer.parseInt(expressaoNumerica.substring(s, i));
					s = i;
				}
			}
			sum += Integer.parseInt(expressaoNumerica.substring(s));
			System.out.println("Teste "+teste+"\n"+sum+"\n");
			teste++;
		}

	}

}
