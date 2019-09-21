/**
 * 
 *
 */
package wcs.queteJava7Heritage;

/**
 * @author franck
 *
 */
abstract class Vehicule {

	private String brand;
	private int kilometers;

	// constructeur

	/**
	 * @param brand
	 * @param kilometers
	 */
	public Vehicule(String brand, int kilometers) {
		super();
		this.brand = brand;
		this.kilometers = kilometers;
	}

	// getter et setter
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return this.brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the kilometers
	 */
	public int getKilometers() {
		return this.kilometers;
	}

	/**
	 * @param kilometers the kilometers to set
	 */
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	public abstract String doStuff();

	public abstract String giveMeKm();

}
