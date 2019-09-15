/**
 * 
 *
 */
package javaProjets.france_IOI;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author franck Desmedt https://github.com/bigmoletos/
 *
 */
public class ComparatifPrix {

	/**
	 * @description france_IOI level2 -6
	 * @return void
	 *
	 * @method main
	 * @class ComparatifPrix
	 * @version 1.0
	 * @date jeudi 12 sept. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		Scanner KeyboardInput = new Scanner(System.in).useLocale(Locale.US);
		int nbreLegumeEnVente = KeyboardInput.nextInt();
		for (int i = 0; i < nbreLegumeEnVente; i++) {

			double poids = KeyboardInput.nextDouble();
			double age = KeyboardInput.nextDouble();
			double prix = KeyboardInput.nextDouble();
			System.out.println(prix / poids);

		}
		KeyboardInput.close();

	}

}
