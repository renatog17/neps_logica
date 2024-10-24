package obi2006.primeirafase.monopolio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int o = sc.nextInt();
		
		int dD, dE, dF;
		dD = dE = dF = d;
		for (int i = 0; i < o; i++) {
			String operacao = sc.next();
			if(operacao.equals("C")){
				String a = sc.next();
				if(a.equals("D")){
					dD -= sc.nextInt();
				}
				if(a.equals("E")){
					dE -= sc.nextInt();
				}
				if(a.equals("F")){
					dF -= sc.nextInt();
				}
			}
			if(operacao.equals("V")){
				String a = sc.next();
				if(a.equals("D")){
					dD += sc.nextInt();
				}
				if(a.equals("E")){
					dE += sc.nextInt();
				}
				if(a.equals("F")){
					dF += sc.nextInt();
				}
			}
			if(operacao.equals("A")){
				String a = sc.next();
				String b = sc.next();
				int z = sc.nextInt();
				if(a.equals("D")){
					dD += z;
				}
				if(a.equals("E")){
					dE += z;
				}
				if(a.equals("F")){
					dF += z;
				}
				
				if(b.equals("D")){
					dD -= z;
				}
				if(b.equals("E")){
					dE -= z;
				}
				if(b.equals("F")){
					dF -= z;
				}
			}
			
		}
		System.out.println(dD+" "+dE+" "+dF);
	}

}
