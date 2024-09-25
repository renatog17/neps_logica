package EstadosdoNorte;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String estado = sc.next();
		if(estado.equals("roraima") || 
				estado.equals("acre") ||  
				estado.equals("amapa") || 
				estado.equals("amazonas")|| 
				estado.equals("para")|| 
				estado.equals("rondonia")|| 
				estado.equals("tocantins"))
			System.out.println("Regiao Norte");
		else System.out.println("Outra regiao");
	}

}
