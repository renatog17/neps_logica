package obi2021.segundafase.pangrama;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> letrasUsadas = new HashSet<String>();
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if(!(s.substring(i, i+1).equals(" ") || s.substring(i, i+1).equals(",") || s.substring(i, i+1).equals(":")))
				letrasUsadas.add(s.substring(i, i+1));
		}
		//System.out.println(letrasUsadas.size());
		if(letrasUsadas.size()==23)
			System.out.println("S");
		else
			System.out.println("N");
	}

}
