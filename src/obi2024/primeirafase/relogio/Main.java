package obi2024.primeirafase.relogio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt()*3600; 
		int m = sc.nextInt()*60; 
		int s = sc.nextInt();
		
		int extraSegundos = sc.nextInt();
		
		int soma = h+m+s+extraSegundos;
		h = soma/3600;
		int restoH = soma%3600;
		m = restoH/60;
		int restoM = restoH%60;
		
		System.out.println(h%24);
		System.out.println(m);
		System.out.println(restoM);
	}

}
