package obi2012.primeirafase.colchao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int array [] = new int [301];
		
		array[sc.nextInt()] = 1;
		array[sc.nextInt()] = 1;
		array[sc.nextInt()] = 1;
		
		for (int i = 0; i < 2; i++) {
			int aux = sc.nextInt();
			if(array[aux]==1) {
				array[aux] = 3;
			}else {
				array[aux] = 2;
			}
		}
		
		int array2[] = new int[5];
		int indiceArray2 = 0;
		for (int i = 1; i < array.length; i++) {
			if(array[i]==1) {
				array2[indiceArray2] = 1;
				indiceArray2++;
			}else if(array[i]==2) {
				array2[indiceArray2] = 2;
				indiceArray2++;
			}else if(array[i]==3) {
				array2[indiceArray2] = 1;
				indiceArray2++;
				array2[indiceArray2] = 2;
				indiceArray2++;
			}
		}
		
		int cont1 = 0;
		int cont2 = 0;
		String saida = "S";
		for (int i = 0; i < array2.length; i++) {
			if(array2[i]==1) cont1++;
			else cont2++;
			if(cont2>cont1) {
				saida = "N";
				break;
			}
			
		}
		System.out.println(saida);
	}
	
}
