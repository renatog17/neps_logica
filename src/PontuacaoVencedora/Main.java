package PontuacaoVencedora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer maca;
		Integer tresP = sc.nextInt();
		Integer doisP = sc.nextInt();
		Integer umP = sc.nextInt();
		maca = 3*tresP + 2*doisP + umP;
		
		Integer banana;
		tresP = sc.nextInt();
		doisP = sc.nextInt();
		umP = sc.nextInt();
		banana = 3*tresP + 2*doisP + umP;
		if(maca>banana) {
			System.out.println("A");
		}else {
			if(banana>maca) {
				System.out.println("B");
			}else {
				System.out.println("T");
			}
		}
		
	}

}
