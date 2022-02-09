/**
 * Esta clase esta dedicada a implementar los metodos de resta necesarios para implementar una series de clase que compongan una calculadora.
 * Cada clase que compone los metodos de resta estan documentados para poder instruirse en caso de necesitar informacionn del metodo. 
 * @author Franco Pellizzari
 * @version version 1.0
 *
 */

public class Resta {

	/** Metodo que calcula la diferencia entre dos numeros reales.
	 * La diferencia se obtiene restando los numeros en el orden que se hayan introducido.
	 * 
	 * @param dos numeros reales de los cuales se desea obtener la diferencia.
	 * @return un numero que sera el resultado de la resta.
	 */
	  
	public double resta1(double numero) {
		double resultado = 0;
		//Inicializo a 0 para que no me de error.
		return resultado;
		}
	
	/**
	 * Metodo que calcula la diferencia entre dos numeros enteros..
	 * La diferencia se obtiene restando los numeros en el orden que se hayan introducido.
	 * En caso de que se ingresen numeros con decimales, la clase dara error. 
	 * @param dos numeros enteros de los cuales se desea obtener la diferencia.
	 * @return devolvera un numero entero que sera el resultado de la resta.
	 */
	public int resta2(int numero) {
		int resultado = 0;
				//Inicializo a 0 para que no me de error
				return resultado; 
	    }
	
	/** Metodo que calcula la diferencia entre 3 numeros reales.
	 * La diferencia se obtiene restando los n�meros en el orden que se hayan introducido.
	 * 
	 * @param tres numeros reales de los cuales se desea obtener la diferencia.
	 * @return un numero que sera el resultado de la resta.
	 */
	  
	public double restaVersion1(double numero) {
		double resultado = 0;
		//Inicializo a 0 para que no me de error
		return resultado;
		}
	
	/** 
	 * Este metodo resta el valor inicial de la variable "acumulado" (2000). Se ingresara un numero real, cada vez que se ejecute el metodo
	 * se restara el numero ingresado al valor de la variable. Este metodo permite que el valor acumulado se guarde como una propiedad 
	 * durante toda la clase. 
	 * 
	 * @param un solo numero real que se utilizara para restar a la variable.
	 * 
	 * @return devolvera el resultado de la resta cada vez que se utilice el metodo guardandose el valor tras cada resta realizada. 
	 */

	 // Este comentario es para probar Git
	
	public double restaValorAcumulado(double numero) {
		// Inicializo la variable "acumulado" para que no salte ningun error. 
		double acumulado = 2000;
		acumulado = acumulado - numero;

		return acumulado;

	    } 

}
// comentario para probar comit 
