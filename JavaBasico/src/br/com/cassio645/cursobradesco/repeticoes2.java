/**
 * 
 */
package br.com.cassio645.cursobradesco;

/**
 * Estrutura de repetição For
 * Com bubble sort
 * @author cassio
 *
 */
public class repeticoes2 {

	public static void main(String[] args) {
		
		int[] myNum = {52, 3, 43, 12, 8, 14}; // Criando um array fora de ordem
				
		int aux; // variavel auxiliar
		
		for (int i = 0; i < (myNum.length); i++) {
			for (int j = 0; j < (myNum.length-1); j++) {
				
				// Comparando se o numero da posicao j é maior que o proximo(j+1)
				if (myNum[j] > myNum[j + 1]) {
					
					// Caso seja, vao mudar de lugar
					aux = myNum[j];
					myNum[j] = myNum[j+1];
					myNum[j+1] = aux;
				}
			}
		}
		// printando cada numero do vetor, agora ordenado
		for (int i = 0; i < myNum.length; i++) {
			  System.out.print(myNum[i]+ " ");
			}

	}

}
