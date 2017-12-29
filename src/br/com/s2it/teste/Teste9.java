package br.com.s2it.teste;

public class Teste9 {

	public static int calcularSomaNos(BinaryTree arvore) {
		int soma = 0;
		if (arvore.left != null) {
			soma += calcularSomaNos(arvore.left);
		}
		if (arvore.right != null) {
			soma += calcularSomaNos(arvore.right);
		}
		return soma + arvore.valor;
	}

	private static BinaryTree montarArvore() {
		BinaryTree arvore = new BinaryTree();
		BinaryTree galho1 = new BinaryTree();
		galho1.valor = 12;
		BinaryTree galho2 = new BinaryTree();
		galho2.valor = 4;
		arvore.left = galho1;
		arvore.right = galho2;
		return arvore;
	}

	public static void main(String[] args) {
		BinaryTree arvore = montarArvore();
		System.out.println(calcularSomaNos(arvore));
	}


}
