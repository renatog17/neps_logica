package MesmosNumeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		if(n.substring(0,1).equals(n.substring(1, 2))) System.out.println(1);
		else System.out.println(0);

	}

}
