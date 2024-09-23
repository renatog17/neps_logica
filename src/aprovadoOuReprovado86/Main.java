package aprovadoOuReprovado86;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		Double ad = Double.parseDouble(a);
		String b = sc.next();
		Double bd = Double.parseDouble(b);
		double media = (ad+bd)/2;
		if(media>=7) System.out.println("Aprovado");
		else {
			if(media>=4) System.out.println("Recuperacao");
			else System.out.println("Reprovado");
		}
		
	}
}
