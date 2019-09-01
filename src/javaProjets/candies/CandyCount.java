package javaProjets.candies;

/**
 * @author franck Desmedt
 *
 */
public class CandyCount {

	/**
	 * @description quete n°2 Java pour la WildCodeSchool
	 *
	 * @method main
	 * @class CandyCount
	 * @version 1.0
	 * @param args
	 * @date dimanche 01 sept. 2019
	 *
	 **/

	public static void main(String[] args) {
//
////		réel money ← 12.4; 
////		   réel price ← 1.2
////		   entier candies ← 0
////		   Si money > 0 ET price > 0
////		       Tant que (money - price) >= 0
////		           candies ← candies + 1
////		           money ← money - price
////		       Fin Tant que
////		   Fin Si
////		   afficher candies
//

		float money = 12.4f;
		float price = 1.2f;
		int candies = 0;

		if (money > 0 && price > 0) {
			while ((money - price) >= 0) {
//				candies = candies + 1;
				candies += 1;
				money = money - price;
			}
		}
		System.out.printf("candies= %d", candies);
	}

}
