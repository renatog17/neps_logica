package estrategiagulosa244;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s[] = {1,5,10,25,50,100};
		
		int n = sc.nextInt();
		
		int i = 5;
		int cont = 0;
		while(n>0) {
			if(s[i]<=n) {
				cont++;
				n -= s[i];
			}else {
				i--;
			}
		}
		System.out.println(cont);
	}

}
