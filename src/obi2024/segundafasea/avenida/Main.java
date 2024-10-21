package obi2024.segundafasea.avenida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = n%400;
		if(r>200) {
			System.out.println(400-r);
		}else {			
			System.out.println(r);
		}
	}

}
