package faceis.Xadrez164;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int c = sc.nextInt();
		int la = l%2;
		int ca = c%2;
		if(la==ca) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
