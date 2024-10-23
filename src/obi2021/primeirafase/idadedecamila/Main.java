package obi2021.primeirafase.idadedecamila;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max;
		int min;
		if(a>b && a>c) {
			max = a;
		}else {
			if(b>c) {
				max = b;
			}else {
				max = c;
			}
		}
		
		if(a<b && a<c) {
			min = a;
		}else {
			if(b<c) {
				min = b;
			}else {
				min = c;
			}
		}
		System.out.println(a +b +c - max-min);
		
	}

}
