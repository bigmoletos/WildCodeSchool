/**
 * 
 *
 */
package queteJava06_ProgObjet;

/**
 * @author franck
 *
 */
public class Wilder {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class Wilder
	 * @version 1.0
	 * @date vendredi 13 sept. 2019
	 * @see
	 *
	 **/

	private String firstname;
	private boolean aware;

//	 constructeur par defaut

	public Wilder() {
	}

//	 constructeur avec arguments
	/**
	 * @param firstname
	 * @param aware
	 */
	public Wilder(String firstname, boolean aware) {
		super();
		this.firstname = firstname;
		this.aware = aware;
	}

	// getter
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	// setter
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	// getter
	/**
	 * @return the aware
	 */
	public boolean isAware() {
		return aware;
	}

	// setter
	/**
	 * @param aware the aware to set
	 */
	public void setAware(boolean aware) {
		this.aware = aware;
	}

	/**
	 * @description Ajoute une méthode whoAmI() retournant le texte "Je m'appelle
	 *              firstname et je suis aware" ou "Je m'appelle firstname et je ne
	 *              suis pas aware", en fonction de l'état des attributs firstname
	 *              et aware
	 * @return void
	 *
	 * @method whoAmI
	 * @class Wilder
	 * @version 1.0
	 * @param firstname
	 * @param aware
	 * @date samedi 14 sept. 2019
	 * @see
	 *
	 **/
	public void whoAmI(String firstname, boolean aware) {
		if (aware) {
			System.out.println("Je m'appelle " + firstname + " et je suis aware");
		} else {
			System.out.println("Je m'appelle " + firstname + " et je ne suis pas aware");
		}
	}
}
