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
public class ConversionDistance {

	/**
	 * @description france_IOI level2/3
	 * @return void
	 *
	 * @method main
	 * @class ConversionDistance
	 * @version 1.0
	 * @date jeudi 12 sept. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		double nbreLieu = scan.nextDouble();
		double unLieu = 0.707;
		double distance = nbreLieu / unLieu;
		scan.close();
		System.out.println(distance);
	}

}
