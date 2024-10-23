package obi2021.segundafase.robo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdEstacoes = sc.nextInt();
		int qtdComandos = sc.nextInt();
		int estacaoMaisProxima = sc.nextInt();
		int estacoes[] = new int[qtdEstacoes];
		int estacaoAtual = 0;
		estacoes[0]++;
		
		for (int i = 0; i < qtdComandos; i++) {
			int comando = sc.nextInt();
			if(comando==-1 && estacaoAtual==0)
				estacaoAtual = qtdEstacoes-1;
			else if( comando==1 && estacaoAtual==qtdEstacoes-1) {
				estacaoAtual = 0;
			}else {
				estacaoAtual += comando;
			}
			estacoes[estacaoAtual]++;
		}
		int r = estacoes[estacaoMaisProxima-1];
		System.out.println(r);

	}

}
