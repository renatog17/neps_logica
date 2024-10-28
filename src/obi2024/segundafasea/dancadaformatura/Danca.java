package obi2024.segundafasea.dancadaformatura;

import java.util.Scanner;

public class Danca
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int c = in.nextInt();
		int p = in.nextInt();
		
		int[] ordemLinhas = new int[l + 1];
		for(int i = 1; i <= l; i++) ordemLinhas[i] = i;
		
		int[] ordemColunas = new int[c + 1];
		for(int j = 1; j <= c; j++) ordemColunas[j] = j;
		
		for(int pp = 1; pp <= p; pp++) {
		  String o = in.next();
		  int a = in.nextInt(), b = in.nextInt();
		  if(o.equals("L")) {
		    int temp = ordemLinhas[a];
		    ordemLinhas[a] = ordemLinhas[b];
		    ordemLinhas[b] = temp;
		  } else {
		    int temp = ordemColunas[a];
		    ordemColunas[a] = ordemColunas[b];
		    ordemColunas[b] = temp;
		  }
		}
		
		for(int i = 1; i <= l; i++) {
		  for(int j = 1; j <= c; j++) {
		    int num = ordemColunas[j] + (ordemLinhas[i] - 1) * c;
		    System.out.print(num + " ");
		  }
		  System.out.println();
		}
	}
}