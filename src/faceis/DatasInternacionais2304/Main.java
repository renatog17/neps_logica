package faceis.DatasInternacionais2304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		String[] split = date.split("/");
		if(Integer.parseInt(split[0])>12) System.out.println("EU");
		else if(Integer.parseInt(split[1])>12) System.out.println("US");
		else System.out.println("either");

	}

}
