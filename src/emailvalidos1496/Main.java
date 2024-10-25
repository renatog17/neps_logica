package emailvalidos1496;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> emails = new HashSet<>();
		for(int i = 0; i<n;i++) {
			String aux = sc.nextLine();
			if(aux.contains("@")) {
				if(aux.startsWith(".")) {
					if(aux.endsWith(".")){
						if(!aux.contains("..")) {
							aux.replace(".", "");
							aux.toLowerCase();
							int arroba = aux.indexOf("@");
//							string saa = aux.su
							if(aux.length()>=6 && aux.length()<=30) {
								
							}
						}
					}
				}
			}
		}
	}

}
