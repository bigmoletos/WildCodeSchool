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
		String[] movies = { "Indiana Jones et le Royaume du Crâne de Cristal", "Indiana Jones et la Dernière Croisade",
				"Indianan Jones et le Temple maudit" };

		String[] actorsRCC = { "Harrison Ford", "Cate Blanchett", "Karen Allen" };
		String[] actorsDC = { "Harrison Ford", "Sean Connery", "Denholm Elliott" };
		String[] actorsTM = { "Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan" };

		String[][] actors;
		actors = new String[][] { actorsRCC, actorsDC, actorsTM };

		for (int i = 0; i < movies.length; i++) {
			System.out.println("Dans le film " + movies[i] + ", les principaux acteurs sont : " + actors[i][0] + ", "
					+ actors[i][1] + " et " + actors[i][2] + ".");
		}
	}
}
