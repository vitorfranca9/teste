package br.com.s2it.teste;

public class Teste8 {
	
	public static int criarC(int a, int b) {
		String strA = String.valueOf(a);
		String strB = String.valueOf(b);
		int size = strA.length() + strB.length();
		String c = "";
		
		for (int i = 0; i < size; i++) {
			if (strA.length() > i) {
				c += strA.charAt(i);
			}
			if (strB.length() > i) {
				c += strB.charAt(i);
			}
		}
		
		Integer numeroC = Integer.valueOf(c);
		if (numeroC > 1000000) {
			return -1;
		} else {
			return numeroC;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(criarC(2, 4));
	}
	
}
