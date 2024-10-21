package obi2024.primeirafase.placasdecarro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String p = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.substring(i, i+1).equals("0")||
					s.substring(i, i+1).equals("1")||
					s.substring(i, i+1).equals("2")||
					s.substring(i, i+1).equals("3")||
					s.substring(i, i+1).equals("4")||
					s.substring(i, i+1).equals("5")||
					s.substring(i, i+1).equals("6")||
					s.substring(i, i+1).equals("7")||
					s.substring(i, i+1).equals("8")||
					s.substring(i, i+1).equals("9")) {
				p += "N";
			}else if(s.substring(i, i+1).equals("-")) {
				p += "-";
			}else {
				p += "L";
			}
		}
		if(p.equals("LLL-NNNN")) {
			System.out.println(1);
		}else if(p.equals("LLLNLNN")){
			System.out.println(2);
		}else {
			System.out.println(0);
		}
	}
}
