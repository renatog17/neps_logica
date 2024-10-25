package inversaodeumastring1782;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		String p = s.substring(0, a-1);
		String se = s.substring(a-1,b);
		String t = s.substring(b);
		
		System.out.print(p);
		for (int i = se.length()-1; i >=0 ; i--) {
			System.out.print(se.substring(i, i+1));
		}
		System.out.print(t);

	}

}
