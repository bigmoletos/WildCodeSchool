/**
 * 
 *
 */
package javaProjets.indianaJones;

/**
 * @author franck Desmedt https://github.com/bigmoletos/
 *
 */
public class Testcan {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class Testcan
	 * @version 1.0
	 * @date mercredi 04 sept. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		// Déclarations des variables

		double money = 12.5;
		double price = 1.2;
		int candies = 0;

		// Conditions

		if (money > 0 && price > 0) {

			// boucle while
			while (money - price >= 0) {
				candies++;
				money = money - price;
			}
		}
		System.out.println(candies);
	}

}
