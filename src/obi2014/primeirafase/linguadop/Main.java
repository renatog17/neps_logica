package obi2014.primeirafase.linguadop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int m = 0;
		for (int i = 0; i < s.length(); i++) {
			m++;
			if(m%2==0)
			System.out.print(s.substring(i,i+1));
			if(s.substring(i, i+1).equals(" ")) {
				m = 0;
				System.out.print(" ");
			}
				
		}
	}

}
