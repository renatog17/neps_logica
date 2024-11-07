package obi2001.faseunica.meteoros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int teste = 1;
		while(true) {
			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y1 = sc.nextInt();
			int y2 = sc.nextInt();
			if(x1==x2 && x2 == y1 && y1==y2 && y2==0) {
				break;
			}
			int n = sc.nextInt();
			
			int menor1 = Math.min(x1, y1);
			int menor2 = Math.min(x2, y2);
			int maior1 = Math.max(x1, y1);
			int maior2 = Math.max(x2, y2);
			
			int saida = 0;
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				if(x>=menor1 && x<=maior1) {
					if(y>=menor2 && y<=maior2) {
						saida++;
					}
				}
			}
			
			System.out.println("Teste "+teste);
			System.out.println(saida);
			System.out.println();
			saida = 0;
			teste++;
			
		}

	}

}
