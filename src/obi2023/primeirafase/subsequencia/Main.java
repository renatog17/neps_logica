package obi2023.primeirafase.subsequencia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int seq [] = new int[a];
		int subSeq [] = new int[b];
		
		for (int i = 0; i < a; i++) {
			seq[i] = sc.nextInt();
		}
		
		for (int i = 0; i < b; i++) {
			subSeq[i] = sc.nextInt();
		}
		
		int i = 0;
		int j = 0;
		while(i<a) {
			if(seq[i]==subSeq[j]) {
				i++;
				j++;
				if(j>=subSeq.length) {
					break;
				}
			}else {
				i++;
			}
		}
		if(j==subSeq.length)System.out.println("S");
		else System.out.println("N");
	}

}
