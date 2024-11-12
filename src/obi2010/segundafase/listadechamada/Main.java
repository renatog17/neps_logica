package obi2010.segundafase.listadechamada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		List<String> nomes = new ArrayList<String>();
		
		for (int i = 0; i < n; i++) {
			nomes.add(sc.next());
		};
		
		Collections.sort(nomes);
		
//		for (int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//		}
		System.out.println(nomes.get(s-1));
	}

}
