package obi2019.primeirafase.soma;

import java.util.Scanner;

public class SomaPrefixo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Código usando soma de prefixo
		int array[] = {1,5,6,10,15,3,25,78};
		int prefixSum[] = new int[array.length];
		prefixSum[0] = array[0];
		
		//Calculando o array de soma de prefixo
		for (int i = 1; i < array.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + array[i];
		}
		
		int inicio = sc.nextInt(); 
		int fim = sc.nextInt();
		
		//complexidade de busca: O(1)
		int soma;
		if(inicio>0) {
			soma = prefixSum[fim] - prefixSum[inicio-1];
		}else {
			soma = prefixSum[fim];
		}
		
		System.out.println(soma);
	}

}
