package obi2016.segundafase.medalhas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		
		if(t1<t2 && t1<t3) {
			System.out.println(1);
			t1 = 1001;
		}else {
			if(t2<t3) {
				System.out.println(2);
				t2 = 1001;
			}else {
				System.out.println(3);
				t3 = 1001;
			}
		}
		
		if(t2<t1 && t2<t3) {
			System.out.println(2);
			t2 = 1001;
		}else {
			if(t1<t3) {
				System.out.println(1);
				t1 = 1001;
			}else {
				System.out.println(3);
				t3 = 1001;
			}
		}
		
		if(t3<t1 && t3<t2) {
			System.out.println(3);
			t3 = 1001;
		}else {
			if(t1<t2) {
				System.out.println(1);
				t1 = 1001;
			}else {
				System.out.println(2);
				t2 = 1001;
			}
		}


	}

}
