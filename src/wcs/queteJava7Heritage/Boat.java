/**
 * 
 *
 */
package wcs.queteJava7Heritage;

/**
 * @author franck
 *
 */
public class Boat extends Vehicule {

	/**
	 * @param brand
	 * @param kilometers
	 */
	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
	}

	/**
	 * @Description redefinition de la methode doStuff()
	 *
	 *
	 */
	@Override
	public String doStuff() {
		String message = "Je suis " + getBrand() + " et je fais GlouGlou!";
		return message;
	}

	/**
	 * @Description redefinition de la methode giveMeKm()
	 *
	 *
	 */
	@Override
	public String giveMeKm() {
		String message = "Je suis " + getBrand() + " j'ai " + getKilometers() + " heures et je fais Vroum Vroum!";
		return message;
	}
}