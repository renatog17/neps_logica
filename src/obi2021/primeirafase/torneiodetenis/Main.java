package obi2021.primeirafase.torneiodetenis;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		for (int i = 0; i < 6; i++) {
			if(sc.next().equals("V")) cont++;
		}
		
		if(cont>=5) System.out.println(1);
		else if(cont>=3) System.out.println(2);
		else if(cont>=1) System.out.println(3);
		else System.out.println(-1);
	}

}
