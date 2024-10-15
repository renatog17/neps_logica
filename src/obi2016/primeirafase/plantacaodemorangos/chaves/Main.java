package obi2016.primeirafase.plantacaodemorangos.chaves;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		String code = "";
		for (int i = 0; i <= n; i++) {
			code += sc.nextLine();
		}
		for (int i = 0; i < code.length(); i++) {
			
			if(code.substring(i,i+1).equals("{")) {
				a++;
			}else if (code.substring(i,i+1).equals("}")) {
				b++;
			}
		}
		
		if(a==b) System.out.println("S");
		else System.out.println("N");
	}

}
