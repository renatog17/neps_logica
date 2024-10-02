package faceis.FunçãoHash1949;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> cadeias = new HashSet<String>(); 
		for (int i = 0; i < n; i++) {
			String cadeia = sc.next();
			cadeias.add(cadeia);
		}
		if(cadeias.size()==n) {
			System.out.println("A funcao eh boa.");
		}else {
			System.out.println("A funcao nao eh boa.");
		}

	}

}
