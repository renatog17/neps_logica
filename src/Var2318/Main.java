package Var2318;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if((x>= -8 && x<=8) && (y>=0 && y<=8)) {
			System.out.println("S");
        }else {
			System.out.println("N");
		}
	}

}
