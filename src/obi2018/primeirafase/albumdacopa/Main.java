package obi2018.primeirafase.albumdacopa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> nums = new HashSet<Integer>();		
		Integer total = sc.nextInt();
		Integer n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			nums.add(sc.nextInt());
		}
		
		System.out.println(total-nums.size());
	}

}
