package PetiscosParaCaes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		
		if(1*s+2*m+3*l>=10) System.out.println("happy");
		else System.out.println("sad");
	}

}
