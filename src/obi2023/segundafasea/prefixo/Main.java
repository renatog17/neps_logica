package obi2023.segundafasea.prefixo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String pa = sc.next();
		int b = sc.nextInt();
		String pb = sc.next();
		
		boolean isBreak = false;
		
		int min = Math.min(a, b);
		int i;
		for (i = 0; i < min; i++) {
			//System.out.println(i);
			if(!pa.substring(i, i+1).equals(pb.substring(i, i+1))) {
				System.out.println(i);
				isBreak = true;
				break;
			}
		}
		if(!isBreak) System.out.println(i);
	}

}
