package operacoes218;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Entrada da operação ('M' para multiplicação, 'D' para divisão)
	        String operacao = sc.nextLine().trim();

	        // Entrada dos dois números reais
	        double num1 = sc.nextDouble();
	        double num2 = sc.nextDouble();

	        // Variável para armazenar o resultado
	        double resultado = 0;

	        // Verifica a operação a ser realizada
	        if (operacao.equals("M")) {
	            resultado = num1 * num2;
	        } else if (operacao.equals("D")) {
	            resultado = num1 / num2;
	        }

	        // Exibe o resultado com duas casas decimais
	        System.out.printf("%.2f%n", resultado);

	        sc.close();
	}

}
