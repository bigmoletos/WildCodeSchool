/**
 * 
 *
 */
package queteJava06_ProgObjet;

import java.util.HashMap;

/**
 * @author franck Desmedt https://github.com/bigmoletos/
 *
 */
public class ClassRoom {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class ClassRoom
	 * @version 1.0
	 * @param <awareOrNot>
	 * @param <listName>
	 * @date samedi 14 sept. 2019
	 * @see
	 *
	 **/
	public static <listName, awareOrNot> void main(String[] args) {
		Wilder wilder = new Wilder();
//version classique
		System.out.println("version classique \n");
		wilder.whoAmI("roule", false);
		wilder.whoAmI("enpeugeot", true);

//version avec collection
		System.out.println("\nversion avec collection \n");
//		HashMap<String[], boolean[]> tabNameAware = new HashMap<String[], boolean[]>();

		String[] listName = { "henri", "franck", "hugo", "cher correcteur" };
		boolean[] awareOrNot = { false, true };


		for (String name : listName) {
			for (boolean aware : awareOrNot) {
				wilder.whoAmI(name, aware);
				System.out.println("");
			}
		}

		HashMap<listName, awareOrNot> tabNameAware2 = new HashMap<listName, awareOrNot>();

	}

}
