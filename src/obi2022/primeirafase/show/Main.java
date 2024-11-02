package obi2022.primeirafase.show;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int saida = n;
		
		for (int i = n; i > 0; i--) {
			int maiorSequenciaLivre = 0;
			for (int j = 0; j < m; j++) {
				int sequenciaLivre = 0;
				if(sc.nextInt()==0) {
					sequenciaLivre++;
				}else {
					if(sequenciaLivre>maiorSequenciaLivre)
						maiorSequenciaLivre = sequenciaLivre;
					sequenciaLivre = 0;
				}
			}
			if(maiorSequenciaLivre>=a) {
				saida = n;
			}
		}
		System.out.println(saida);
	}

}
