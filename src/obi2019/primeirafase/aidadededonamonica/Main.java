package obi2019.primeirafase.aidadededonamonica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int im = sc.nextInt();
		int f1 = sc.nextInt();
		int f2 = sc.nextInt();
		
		int f3 = im-(f1+f2);
		if(f1>f2 & f1>f3) {
			System.out.println(f1);
		}else {
			if(f2>f3) {
				System.out.println(f2);
			}else {
				System.out.println(f3);
			}
		}

	}

}
