package obi2019.primeirafase.soma;
import java.util.Scanner;

public class SemSomaPrefixo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Código sem soma de prefixo
		int array[] = {1,5,6,10,15,3,25,78};
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		
		int soma = 0;
		//Complexidade de busca: O(n)
		for (int i = inicio; i < fim; i++) {
			soma += array[i];
		}
		System.out.println(soma);
	}
}
