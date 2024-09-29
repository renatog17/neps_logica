package PermutaChar;
public class PermutaChar {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'K';
        System.out.println("Antes da troca: a = " + a + ", b = " + b);
        a = (char) (a + b); 
        b = (char) (a - b); 
        a = (char) (a - b); 
        System.out.println("Depois da troca: a = " + a + ", b = " + b);
    }
}