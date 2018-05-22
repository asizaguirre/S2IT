package br.com.s2teste;

import java.util.Scanner;

public class TesteComS2 {

	private static String cStr;
	private static Scanner s;
	private static int a;
	private static int b;
	private static BinaryTree nozes;

	public static void main(String[] args) {
		System.out.print("C para criar C e T para somar a Arvore  (C/T):");
		s = new Scanner(System.in);
		if (s.hasNext("C")) {
			System.out.println("Digite um valor para A :");
			if (s.hasNextBigInteger()) {
				setA(s.nextInt());
			} else {
				System.err.println("Valor deve ser inteiro");
			}
			System.out.println("Digite um valor para B :");
			if (s.hasNextBigInteger()) {
				setB(s.nextInt());
			} else {
				System.err.println("Valor deve ser inteiro");
			}
			// CriarC(125, 12367);
			CriarC(a, b);
			System.out
					.println("o valor de C é :" + cStr == null ? -1 : cStr.equals("*_*") ? -1 : Integer.parseInt(cStr));

		} else if (s.hasNext("T")) {
			System.out.println("Criar nó ou somar? (N/S) ");
			if (s.hasNext("N")) {
				System.out.println(" Left ou Right (L/R) ");
				if (s.hasNext("L")) {
					System.out.println(" Valor inteiro ");
					if (s.hasNextInt()) {
						nozes.left.valor = s.nextInt();
					}
				} else if (s.hasNext("R")) {
					System.out.println(" Valor inteiro ");
					if (s.hasNextInt()) {
						nozes.right.valor = s.nextInt();
					}
				}

			}else if (s.hasNext("S")) {
				System.out.println(" Qual raiz ? ");
				if (s.hasNextInt()) {
					SomaBinaryTree(nozes);
					//nozes.left.valor = s.nextInt();
				}else {
					System.out.println("Somos nozes...");
				}
			}

		}

	}

	public static void CriarC(int a, int b) {
		String aStr = a + "";
		String bStr = b + "";
		String calc = "";
		int max = Math.max(a != 0 ? a + "".length() : 0, b != 0 ? b + "".length() : 0);
		if (max > 0) {
			for (int i = 0; i < max; i++) {
				calc = calc
						+ (i < aStr.length() ? aStr.charAt(i) + "" : (i < bStr.length() ? bStr.charAt(i) + "" : ""));
				setcStr(calc.length() < 6 ? calc : "*_*");
			}

		}

	}

	public static int SomaBinaryTree(BinaryTree T) {

		// BinaryTree tree = new BinaryTree();
		// tree.valor = valor;
		// tree.left= new BinaryTree().left;
		// tree.right = new BinaryTree().right;
		// int soma =
		// valor!=null?SomaBinaryTree(valor.left)+SomaBinaryTree(valor.right)+valor.valor:0;
		int soma = 0;
		if (T != null) {
			soma = SomaBinaryTree(T.left) + SomaBinaryTree(T.right) + T.valor;
		}
		return soma;

	}

	public class BinaryTree {
		int valor;
		BinaryTree left;
		BinaryTree right;
	}

	public static String getcStr() {
		return cStr;
	}

	public static void setcStr(String cStr) {
		TesteComS2.cStr = cStr;
	}

	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		TesteComS2.a = a;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		TesteComS2.b = b;
	}

	public static BinaryTree getNozes() {
		return nozes;
	}

	public static void setNozes(BinaryTree nozes) {
		TesteComS2.nozes = nozes;
	}

}
