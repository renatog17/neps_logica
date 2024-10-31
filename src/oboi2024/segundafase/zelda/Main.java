package oboi2024.segundafase.zelda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		Map<String, String> musica = new HashMap<String, String>();
		
		for (int i = 0; i < n; i++) {
			String nomeMusica = sc.next();
			String notas = "";
			for (int j = 0; j < 6; j++) {
				notas += sc.next();
			}
			musica.put(notas, nomeMusica);
		}
		
		for (int i = 0; i < q; i++) {
			String notas = "";
			for (int j = 0; j < 6; j++) {
				notas += sc.next();
			}
			
			if(musica.containsKey(notas)) {
				System.out.println(musica.get(notas));
			}else {
				System.out.println("Nao existe musica");
			}
		}
	}
}
