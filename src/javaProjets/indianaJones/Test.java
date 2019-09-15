/**
 * 
 *
 */
package javaProjets.indianaJones;

/**
 * @author franck
 *
 */
public class Test {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class Test
	 * @version 1.0
	 * @date dimanche 15 sept. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		String movie1 = "Indiana Jones and the Raiders of the Lost Ark";
		String movie2 = "Indiana Jones and the Temple of Doom";
		String movie3 = "Indiana Jones and the Last Crusade";
		String cast1 = "Harrison Ford, " + "Karen Allen, " + "Paul Freeman";
		String cast2 = "Harrison Ford, " + "Kate Capshow, " + "Jonathan Ke Quan";
		String cast3 = "Harrison Ford, " + "Sean Connery, " + "Denholm Elliott";

		String[] movie = { movie1, movie2, movie3 };
		String[] cast = { cast1, cast2, cast3 };

//		String[][] casting;
//		casting = new String[][] { { movie1 + cast1 }, { movie2 + cast2 }, { movie3 + cast3 } };
//
//		System.out.println("Dans le film " + movie[0] + ", les principaux acteurs sont: " + cast[0]);
//		System.out.println("Dans le film " + movie[1] + ", les principaux acteurs sont: " + cast[1]);
//		System.out.println("Dans le film " + movie[2] + ", les principaux acteurs sont: " + cast[2]);

//		String[][] casting2 = { { cast1 }, { cast2 }, { cast3 } };
		for (int i = 0; i < movie.length; i++) {
			System.out.println("Dans le film " + movie[i] + ", les principaux acteurs sont: " + cast[i]);
		}

	}

}
