/**
 * 
 *
 */
package javaProjets.indianaJones;

/**
 * @author franck desmedt
 *
 */
public class DerniereCroisade {

	/**
	 * @description quete n°3 Java pour la WildCodeSchool
	 * @return void
	 *
	 * @method main
	 * @class DerniereCroisade
	 * @version 1.0
	 * @date dimanche 01 sept. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
//		La première variable doit contenir le nom de ce film d'Indiana Jones, en VO
//		La seconde variable te permettra d'indiquer si tu as vu ou non le film en question
//		La troisième sera l'année de sortie en salle.
//		La quatrième la note du film sur le site IMDB.
//		Affiche ces valeurs les unes sous les autres (tu peux utiliser System.out.println() pour afficher une variable).
		String filmName = "Indiana Jones and the Last Crusade";
		boolean playFilm = true;
		int year = 1989;
		float note = 8.2f;
		System.out.println("Name of the film: " + filmName);
		System.out.println("Film already seen: " + playFilm);
		System.out.println("year of release of the film: " + year);
		System.out.println("Note of the film on IMDB website: " + note + "/10");
	}

}
