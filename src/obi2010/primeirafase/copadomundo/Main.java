package obi2010.primeirafase.copadomundo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> fila  = new LinkedList<>();
		fila.add("A");
		fila.add("B");
		fila.add("C");
		fila.add("D");
		fila.add("E");
		fila.add("F");
		fila.add("G");
		fila.add("H");
		fila.add("I");
		fila.add("J");
		fila.add("K");
		fila.add("L");
		fila.add("M");
		fila.add("N");
		fila.add("O");
		fila.add("P");
		for (int i = 0; i < 15; i++) {
			int e = sc.nextInt();
			int d = sc.nextInt();
			if(e>d) {
				fila.add(fila.peek());
				fila.poll();
				fila.poll();
			}else {
				fila.poll();
				fila.add(fila.peek());
				fila.poll();
			}
		}
		System.out.println(fila.peek());
	}

}
