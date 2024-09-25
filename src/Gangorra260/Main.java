package Gangorra260;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a, b, c, d;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		if(a*b == c*d) System.out.println("0");
		else if(a*b < c*d) System.out.println("1");
		else System.out.println("-1");
	}

}
