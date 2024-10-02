package faceis.PlanejandoaEnergia2116;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String saida = "";
		for (int i = 0; i < n; i++) {
			int ai = sc.nextInt();
			int ci = sc.nextInt();
			int af = sc.nextInt();
			int cf = sc.nextInt();

			int dc = cf - ci;
			int da = af - ai;
			double t = (double) dc / da;
			BigDecimal bd = new BigDecimal(t).setScale(2, RoundingMode.DOWN);
			saida = saida + bd;
		}
		System.out.println( saida.replace(".", ","));
	}

}
