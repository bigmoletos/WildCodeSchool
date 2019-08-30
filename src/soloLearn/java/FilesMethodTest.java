/**
 * 
 *
 */
package soloLearn.java;

import java.io.File;

/**
 * @author franck Desmedt
 *
 */
public class FilesMethodTest {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class FilesMethodTest
	 * @version 1.0
	 * @date mardi 20 août 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		File x = new File(
				"D:\\programmation\\formation-Human-Booster\\data-eclipse\\WildCodeSchool\\src\\soloLearn\\java\\fichierTest.txt");
		if (x.exists()) {
			System.out.println(x.getName() + " exists!");
		} else {
			System.out.println(" The file does not exist");
		}
	}

}
