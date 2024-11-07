package obi2008.primeirafase.telefonep1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String saida = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("1")) {
				saida += "1";
			} else if (s.substring(i, i + 1).equals("2") || s.substring(i, i + 1).equals("A")
					|| s.substring(i, i + 1).equals("B") || s.substring(i, i + 1).equals("C")) {
				saida += "2";
			} else if (s.substring(i, i + 1).equals("3") || s.substring(i, i + 1).equals("D")
					|| s.substring(i, i + 1).equals("E") || s.substring(i, i + 1).equals("F")) {
				saida += "3";
			} else if (s.substring(i, i + 1).equals("4") || s.substring(i, i + 1).equals("G")
					|| s.substring(i, i + 1).equals("H") || s.substring(i, i + 1).equals("I")) {
				saida += "4";
			} else if (s.substring(i, i + 1).equals("5") || s.substring(i, i + 1).equals("J")
					|| s.substring(i, i + 1).equals("K") || s.substring(i, i + 1).equals("L")) {
				saida += "5";
			} else if (s.substring(i, i + 1).equals("6") || s.substring(i, i + 1).equals("M")
					|| s.substring(i, i + 1).equals("N") || s.substring(i, i + 1).equals("O")) {
				saida += "6";
			} else if (s.substring(i, i + 1).equals("7") || s.substring(i, i + 1).equals("P")
					|| s.substring(i, i + 1).equals("Q") || s.substring(i, i + 1).equals("R")
					|| s.substring(i, i + 1).equals("S")) {
				saida += "7";
			} else if (s.substring(i, i + 1).equals("8") || s.substring(i, i + 1).equals("T")
					|| s.substring(i, i + 1).equals("U") || s.substring(i, i + 1).equals("V")) {
				saida += "8";
			} else if (s.substring(i, i + 1).equals("9") || s.substring(i, i + 1).equals("W")
					|| s.substring(i, i + 1).equals("X") || s.substring(i, i + 1).equals("Y")
					|| s.substring(i, i + 1).equals("Z")) {
				saida += "9";
			} else if (s.substring(i, i + 1).equals("0")) {
				saida += "0";
			} else {
				saida += "-";
			}
		}
		System.out.println(saida);
	}

}
