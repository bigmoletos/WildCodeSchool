/**
 * 
 *
 */
package javaProjets.france_IOI;

import java.util.Scanner;

/**
 * @author franck Desmedt https://github.com/bigmoletos/
 *
 */
public class TraverseeDuPont {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class TraverseeDuPont
	 * @version 1.0
	 * @date mercredi 04 sept. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		int resultatLancerDes1 = keyboardInput.nextInt();
		int resultatLancerDes2 = keyboardInput.nextInt();
		if ((resultatLancerDes1 + resultatLancerDes2) >= 10) {
			System.out.println("Taxe spéciale !");
			System.out.println(36);
		} else {
			System.out.println("Taxe régulière");
			System.out.println((resultatLancerDes1 + resultatLancerDes2) * 2);

		}

	}

}
