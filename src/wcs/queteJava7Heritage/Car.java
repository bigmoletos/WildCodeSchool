/**
 * 
 *
 */
package wcs.queteJava7Heritage;

/**
 * @author franck
 *
 */
public class Car extends Vehicule {

	/**
	 * @param brand
	 * @param kilometers
	 */
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Description redefinition de la methode doStuff()
	 *
	 *
	 */
	@Override
	public String doStuff() {
		String message = "Je suis " + getBrand() + " et je fais Vroum Vroum!";
		return message;
	}

	/**
	 * @Description redefinition de la methode giveMeKm()
	 *
	 *
	 */
	@Override
	public String giveMeKm() {
		String message = "Je suis " + getBrand() + " j'ai " + getKilometers() + " km et je fais Vroum Vroum!";
		return message;
	}

}
