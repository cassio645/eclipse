/**
 * 
 */
package br.com.cassio645.cursobradesco;

/**
 *  Incrementação
 * @author cassio
 *
 */
public class Incremento {

	public static void main(String[] args) {
		double a = 8;
		double b = ++a; //pré incremento
		
		System.out.println("O valor de x é "+ a); // 9
		System.out.println("O valor de y é "+ b); // 9
		
		double x = 8;
		double y = x++; // pós incremento
		
		System.out.println("O valor de x é "+ x); // 9
		System.out.println("O valor de y é "+ y); // 8

	}

}
