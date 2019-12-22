/**
 *
 *
 */
package javaProjets.france_IOI;

import java.util.Scanner;

/**
 * @author franck Desmedt https://github.com/bigmoletos
 *
 */
public class PreparationOnguent {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class PreparationOnguent
	 * @version 1.0
	 * @date vendredi 20 déc. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		Scanner entrée = new Scanner(System.in);
		int[] quantite = { 500, 180, 650, 25, 666, 42, 421, 1, 370, 211 };
		int ingredient = entrée.nextInt();
		System.out.println(quantite[ingredient]);

	}

}
//import algorea.Scanner;
//class Main
//{
//   public static void main(String[] args)
//   {
//      Scanner entrée = new Scanner(System.in);
//      int[] quantite = {500, 180, 650, 25, 666, 42, 421, 1, 370, 211};
//      int ingredient = entrée.nextInt();
//      System.out.println(quantite[ingredient]);
//   }
//}
