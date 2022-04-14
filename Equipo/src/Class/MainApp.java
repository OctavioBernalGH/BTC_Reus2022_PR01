
/*
 * @author:		Josep Oriol L�pez Bosch / 	David Dalmau Dieguez / Octavio Bernal Vilana
 * @fecha:		14/04/2022
 * @versi�n:	0.0.1
 */

package Class;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Instanciamos un objeto tele de la clase TelevisorClass con par�metros definidos */
		TelevisorClass tele = new TelevisorClass(250, "rojo", 'a', 120, 60, false);
		
		/*
		 * Precio bruto televisor =	250�
		 * pulgadas > 40		  = 30% m�s
		 * Calidad energ�tica A   = 100�
		 * sintonizador false	  = 0�
		 * peso > 80			  = 100�
		 * 
		 * Total comprobado 525�
		 */
		
		/* Instanciamos un objeto tele de la clase TelevisorClass con par�metros definidos */
		TelevisorClass tele2 = new TelevisorClass(100, "verde", 'b', 40, 30, true);
		
		/*
		 * Precio bruto televisor =	100�
		 * pulgadas < 40		  = 0�
		 * Calidad energ�tica B   = 80�
		 * sintonizador true	  = 50�
		 * peso > 80			  = 50�
		 * 
		 * Total comprobado 280�
		 */
		
		TelevisorClass tele3 = new TelevisorClass(100, "", 's', 40, 30, true);
		
		/*
		 * Precio bruto televisor =	100�
		 * pulgadas < 40		  = 0�
		 * Calidad energ�tica F   = 10�
		 * sintonizador true	  = 50�
		 * peso > 80			  = 50�
		 * 
		 * Total comprobado 210�
		 */
		
		/* Comprobaci�n del funcionamiento de la clase TelevisorClass con atributos definidos */
		System.out.println(tele);
		
		/* Comprobaci�n del funcionamiento de la clase TelevisorClass con atributos definidos */
		System.out.println(tele2);
		
		/* Comprobaci�n de valores por defecto de la clase abstracta heredada*/
		/* Funciona Okey */
		System.out.println(tele3);
	}

}
