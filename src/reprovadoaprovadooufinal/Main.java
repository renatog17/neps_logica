package reprovadoaprovadooufinal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media = ((sc.nextDouble()*2)+(sc.nextDouble()*3))/5;
		if(media>=7) System.out.print("Aprovado");
		else if(media>=3) System.out.print("Final");
		else System.out.print("Reprovado");

	}

}
