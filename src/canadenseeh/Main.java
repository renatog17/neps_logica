package canadenseeh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.endsWith("eh?"))
			System.out.println("Canadian!");
		else
			System.out.println("Imposter!");
	}

}
