/**
 * Clase CalculadoraGITXX
 * 
 * Permite realizar operaciones matemáticas básicas.
 * Proyecto de prácticas de Git y GitHub.
 * 
 * @author iker
 */

/**
 * @version 1.1
 */

package calculadora10;

public class Calculadora10 {
	
	/**
	 * Suma dos números enteros.
	 * 
	 * @param a primer número
	 * @param b segundo número
	 * @return resultado de la suma
	 */
	
	public int sumar(int a, int b) {
		return a + b;
	}

	/**
	 * Resta dos números enteros.
	 * 
	 * @param a primer número
	 * @param b segundo número
	 * @return resultado de la resta
	 */
	
	public int restar(int a, int b) {
		return a - b;
	}
	
	/**
	 * Multiplica dos números enteros.
	 * 
	 * @param a primer número
	 * @param b segundo número
	 * @return resultado de la multiplicacion
	 */
	
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	/**
	 * Divide dos números enteros.
	 * 
	 * @param a primer número
	 * @param b segundo número
	 * @return resultado de la division
	 */
	
	public double dividir(int a, int b) {
		if (b == 0) {
		System.out.println("Error: división entre cero");
		return 0;
		}
		return (double) a / b;
	}
	
	/**
	 * Potencia de dos números enteros.
	 * 
	 * @param a primer número
	 * @param b segundo número
	 * @return resultado de la potencia
	 */
	
	public int potencia(int base, int exponente) {
		int resultado = 1;
		for (int i = 0; i < exponente; i++) {
		resultado *= base;
		}
		return resultado;
	}
	
	/**
	 * Modulo dos números enteros.
	 * 
	 * @param a primer número
	 * @param b segundo número
	 * @return resultado del modulo
	 */
	
	public int modulo(int a, int b) {
		return a % b;
	}
}
