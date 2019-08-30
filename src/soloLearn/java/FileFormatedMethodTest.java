/**
 * 
 *
 */
package soloLearn.java;

import java.util.Formatter;

/**
 * @author franck Desmedt
 *
 */
public class FileFormatedMethodTest {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class FileFormatedMzthodTest
	 * @version 1.0
	 * @date mardi 20 août 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		try {
			Formatter f = new Formatter(
					"D:\\programmation\\formation-Human-Booster\\data-eclipse\\WildCodeSchool\\src\\soloLearn\\java\\fichierTest.txt");
			f.format("%s %s %s", "1", "John", "Smith \r\n");
			f.format("%s %s %s", "2", "Amy", "Brown");
			f.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
