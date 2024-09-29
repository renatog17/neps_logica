package Movimento2006;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt()*60;
		int y = sc.nextInt()*60;
		int z = sc.nextInt()*60;

		if(x+y <= z+30)System.out.println(1);
		else System.out.println(0);
	}

}
