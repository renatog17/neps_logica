package faceis.EscolhaDificil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f, b, m;
		f = sc.nextInt();
		b = sc.nextInt();
		m = sc.nextInt();
		
		int fa, ba, ma;
		fa = sc.nextInt();
		ba = sc.nextInt();
		ma = sc.nextInt();
		
		int sum = 0;
		
		fa = fa-f;
		ba = ba-b;
		ma = ma-m;
		
		if(fa>0) {
			sum += fa;
		}
		if(ma>0) {
			sum += ma;
		}
		if(ba>0) {
			sum += ba;
		}
		
		System.out.println(sum);
	}

}
