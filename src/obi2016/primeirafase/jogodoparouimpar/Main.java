package obi2016.primeirafase.jogodoparouimpar;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Se P P = 0 então Alice gritou “par”, ao passo que se P P = 1 então Bob gritou “par”
		int p = sc.nextInt();
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		if(p==0) {
			if((d1+d2)%2==0) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		}else {
			if((d1+d2)%2==1) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		}
	}
}
