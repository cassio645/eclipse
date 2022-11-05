/**
 * 
 */
package br.com.cassio645.cursobradesco;

/**
 * Estrutura de repetição While e Do while
 * @author cassio
 *
 */
public class repeticoes1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0; // contador x começando em 0
		
		// repita enquanto x for menor que 5
		while (x < 5) {
			System.out.println("O loop está funcionando");
			
			x++; // incrementa a variável x de 1 em 1
		}
		
		// Do While, faz primeiro algo e verifica depois
		
		int i = 3; // contador i começando em 3
		do {
			System.out.println("O contador está em "+ i);
			i--; // decrementa a variável i de 1 em 1
			
		} while(i >= 0); // repita enquanto i for maior ou igual a 0

	}

}
