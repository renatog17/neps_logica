package faceis.codigo47;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cont = 0;
		int entrada;
		
		int a = -1;
		int b = -1;
		int c = -1;
		
		for (int i = 0; i < n; i++) {
			entrada = sc.nextInt();
			if(a==-1 && b==-1 && c==-1) {
				a = entrada;
			}else
			if(a!=-1 && b==-1 && c==-1) {
				b = entrada;
			}else
			if(a!=-1 && b!=-1 && c==-1) {
				c = entrada;
			}else
			if(a!=-1 && b!=-1 && c!=-1) {
				if(a==1 && b==0 && c==0) {
					cont++;
				}
				a=b;
				b=c;
				c=entrada;
			}
		}
		if(a==1 && b==0 && c==0) {
			cont++;
		}
		System.out.println(cont);
	}

}
