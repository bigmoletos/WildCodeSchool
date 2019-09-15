/**
 * 
 *
 */
package javaProjets.indianaJones;

/**
 * @author franck Desmedt https://github.com/bigmoletos/
 *
 */
public class TestMovies {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class TestMovies
	 * @version 1.0
	 * @date dimanche 15 sept. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {

		String[] indianaMovies = { "Indiana Jones and the Kingdom of the Crystal Skull",
				"Indiana Jones and the Last Crusade", "Indiana Jones and the Temple of Doom" };

		String[][] mainActorsMovie = { { "Harrison Ford, Cate Blanchett, Karen Allen" },
				{ "Harrison Ford, Kate Capshaw, Jonathan Ke Quan" },
				{ "Harrison Ford, Sean Connery, Denholm Elliott" } };

		for (int i = 0; i < indianaMovies.length; i++) {

			System.out.println(
					"In the " + indianaMovies[i] + " movie, the main actors are: " + mainActorsMovie[i][0] + ".");
		}

	}

}
