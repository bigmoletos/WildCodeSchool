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
//		chemin sous windows
//		D:\programmation\WildCodeSchool\WildCodeSchool\src\soloLearn\java\fichierTest.txt
//		chemin sous linux
//		"/home/franck/programmation/workspaceEclipse/wcs_projetJava1_dicoutils/wcs_nfs_dicoutils/
		File x = new File("D:\\programmation\\WildCodeSchool\\WildCodeSchool\\src\\soloLearn\\java\\fichierTest.txt");
//		File x = new File("D:\\programmation\\WildCodeSchool\\WildCodeSchool\\src\\soloLearn\\java\\fichierTest.txt");
		if (x.exists()) {
			System.out.println(x.getName() + " exists!");
		} else {
			System.out.println(" The file does not exist");
		}
	}

}
