package ContagemDeVogais1779;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		String a = sc.next();
		Integer contVogais = 0;
		for (int i = 0; i < n; i++) {
			if(a.substring(i,i+1).equals("a") || a.substring(i,i+1).equals("e") || a.substring(i,i+1).equals("i") || a.substring(i,i+1).equals("o") || a.substring(i,i+1).equals("u"))
				contVogais++;
		}
		System.out.println(contVogais);
	}

}
