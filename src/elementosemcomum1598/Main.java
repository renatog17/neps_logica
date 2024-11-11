package elementosemcomum1598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a1  = new int[105];
		int[] a2  = new int[105];
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		for (int i = 0; i < n1; i++) {
			
			a1[sc.nextInt()] ++;
		}
		for (int i = 0; i < n2; i++) {
			a2[sc.nextInt()] ++;
		}
		
		boolean a = false;
		for (int i = 1; i <= 100; i++) {
			if(a1[i]>0 && a2[i]>0) {
				a = true;
				System.out.println(i);
			}
		}
		
		if(!a) System.out.println("*");
	}

}
