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

		double money = 12.5f;
		double price = 1.2f;
		int candies = 0;

		// Conditions

		if (money > 0 && price > 0 || money-price>=0) {
				candies++;
				money = money - price;
			System.out.println(candies);
			}
		}
		
//		String movie = "Indiana Jones et la dernière croisade";
//		boolean view = false;
//		int releaseDate = 1989;
//		float notation = 8.2f;
//		System.out.println("titre: " + movie);
//		System.out.println("vue: " + (view == true ? "oui" : "non")); // ternaire java
//		System.out.println("sortie: " + releaseDate);
//		System.out.println("note: " + notation);
	}

