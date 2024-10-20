package vogaiseconsoantes399;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String totalVogais = "";
		String totalConsoantes = "";
		for (int i = 0; i < s.length(); i++) {
			if(		s.substring(i, i+1).equals("a") ||
					s.substring(i, i+1).equals("e") ||
					s.substring(i, i+1).equals("i") ||
					s.substring(i, i+1).equals("o") ||
					s.substring(i, i+1).equals("u"))
				totalVogais += s.substring(i,i+1);
			else
				totalConsoantes += s.substring(i,i+1);
		}
		System.out.println("Vogais: "+totalVogais);
		System.out.println("Consoantes: "+totalConsoantes);
	}

}
