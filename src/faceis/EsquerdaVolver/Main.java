package faceis.EsquerdaVolver;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String comandos = sc.next();
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < n; i++) {

			if (stack.isEmpty()) {
				stack.push(comandos.substring(i, i + 1));
			} else {
				if (!comandos.substring(i, i + 1).equals(stack.peek())) {
					stack.pop();
				} else {
					stack.push(comandos.substring(i, i + 1));
				}
			}
		}

		int resto = stack.size() % 4;
		if (resto == 0) {
			System.out.println("N");
		} else if (resto == 2) {
			System.out.println("S");
		} else if (resto == 1) {
			if (stack.peek().equals("E"))
				System.out.println("L");
			else
				System.out.println("O");
		} else if (resto == 3) {
			if (stack.peek().equals("D"))
				System.out.println("O");
			else
				System.out.println("L");
		}
	}

}
