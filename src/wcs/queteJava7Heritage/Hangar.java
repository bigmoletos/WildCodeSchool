/**
 * 
 *
 */
package wcs.queteJava7Heritage;

/**
 * @author franck
 *
 */
public class Hangar {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class Hangar
	 * @version 1.0
	 * @date vendredi 20 sept. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
//	doit afficher:	je suis {brand} et je fais vroum vroum !" 
//	et pour Boat : "Je suis {brand} et je fais glou glou !"
		Vehicule tesla = new Car("modelX", 12500);
		Vehicule formanti = new Boat("zar75", 250);

		System.out.println(tesla.doStuff());
		System.out.println(formanti.doStuff());

		System.out.println(tesla.giveMeKm());
		System.out.println(formanti.giveMeKm());
	}

}
