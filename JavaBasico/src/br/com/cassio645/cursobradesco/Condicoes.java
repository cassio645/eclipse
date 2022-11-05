/**
 * 
 */
package br.com.cassio645.cursobradesco;

/**
 * Estrutura de condição if else
 * @author cassio
 *
 */
public class Condicoes {

	public static void main(String[] args) {
		int idade = 25;
		
		if (idade <= 12) {
			System.out.println("É uma criança");
		}
		else if (idade > 12 && idade < 18) {
			System.out.println("É um adolescente");
		}
		else if (idade >= 18 && idade < 60) {
			System.out.println("É um adulto");
		}
		else {
			System.out.println("É um idoso");
		}

	}

}
