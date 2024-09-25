package PremioDoMilhao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer acessosTotais = 0;
		Integer diaMilhaoAcesso = -1;
		for (int i = 0; i < n; i++) {
			acessosTotais = sc.nextInt()+acessosTotais;
			if(acessosTotais >= 1000000 && diaMilhaoAcesso==-1) diaMilhaoAcesso = i;
			
		}
		System.out.println(diaMilhaoAcesso+1);
	}

}
