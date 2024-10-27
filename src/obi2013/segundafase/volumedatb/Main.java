package obi2013.segundafase.volumedatb;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int aux = sc.nextInt();
			if(v+aux>100) {
				v = 100;
			}else if(v+aux<0){
				v = 0;
			}else {
				v += aux;
			}
		}
		System.out.println(v);

	}

}
