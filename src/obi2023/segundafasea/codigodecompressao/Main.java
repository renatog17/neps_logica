package obi2023.segundafasea.codigodecompressao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String p = sc.next();
		
		
		String aux = p.substring(0, 1);
		int cont = 1;
		for (int i = 1; i < p.length(); i++) {
		
			if(p.substring(i,i+1).equals(aux)) {
				cont++;
			}else {
				System.out.print(cont+" "+aux+" ");
				aux = p.substring(i, i+1);
				cont = 1;
			}
			
		}
		System.out.print(cont+" "+aux+" ");
	}

}
