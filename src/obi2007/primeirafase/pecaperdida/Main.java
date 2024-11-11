package obi2007.primeirafase.pecaperdida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] n = new int[1010];
		for (int i = 0; i < a-1; i++) {
			n[sc.nextInt()] = 1;
		}
		
		for (int i = 1; i < n.length; i++) {
			if(n[i]==0) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
