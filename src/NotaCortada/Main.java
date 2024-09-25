package NotaCortada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer b = sc.nextInt();
		Integer t = sc.nextInt();
		
		Integer areaEsquerda = ((b+t)*70)/2;
		Integer areaDireita = (((160-b)+(160-t))*70)/2;
		if (areaEsquerda>areaDireita) {
			System.out.println(1);
		}else {
			if(areaDireita>areaEsquerda) {
				System.out.println(2);
			}else {
				System.out.println(0);
			}
		}
	}

}
