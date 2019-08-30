/**
 * 
 *
 */
package soloLearn.java;

/**
 * @author franck Desmedt
 *
 */
public class App {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class App
	 * @version 1.0
	 * @date mardi 20 août 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		Thread ob = new Thread(new A3());
		ob.start();
	}

}
