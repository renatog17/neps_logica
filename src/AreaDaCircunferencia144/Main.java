package AreaDaCircunferencia144;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Double r = sc.nextDouble();
		
		Double areaCirculo = r*r*3.1416;
		
		System.out.println(String.format("%.80f", areaCirculo));
	}
}
