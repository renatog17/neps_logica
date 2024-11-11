package quantidadedeinteirosdiferentes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> ns = new HashSet<Integer>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			ns.add(sc.nextInt());
		}
		System.out.println(ns.size());
	}

}
