package stringcomplexa2007;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		Set<String> ss = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			ss.add(s.substring(i,i+1));
		}
		if(ss.size()>=3)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
