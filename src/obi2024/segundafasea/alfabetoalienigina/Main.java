package obi2024.segundafasea.alfabetoalienigina;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		String aa = sc.next();
		String msg = sc.next();
		String saida = "S";
		
		for (int i = 0; i < msg.length(); i++) {
			boolean controle = false;
			for (int j = 0; j < aa.length(); j++) {
				if(msg.substring(i, i+1).equals(aa.substring(j, j+1))) {
					controle = true;
				}
			}
			if(controle==false) saida = "N";
		}
		System.out.println(saida);

	}

}
