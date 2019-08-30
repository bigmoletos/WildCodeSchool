/**
 * 
 *
 */
package soloLearn.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author franck Desmedt
 *
 */
public class ReadindFileTest {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class ReadindFileTest
	 * @version 1.0
	 * @date mardi 20 août 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		try {
			File x = new File(
					"D:\\programmation\\formation-Human-Booster\\data-eclipse\\WildCodeSchool\\src\\soloLearn\\java\\fichierTest.txt");
			Scanner sc = new Scanner(x);
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		}
		System.out.println("************** another test **************");
		try {
			File f = new File(
					"D:\\programmation\\formation-Human-Booster\\data-eclipse\\WildCodeSchool\\src\\soloLearn\\java\\fichierTest.txt");
			Scanner sc = new Scanner(f);
			while (sc.hasNext()) {
				String a = sc.next();
				String b = sc.next();
				System.out.println(a + " " + b);
			}
			sc.close();
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
