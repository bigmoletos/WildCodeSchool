/**
 * 
 *
 */
package test_score_and_protect;

/**
 * @author franck Desmedt https://github.com/bigmoletos/
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pdf {

//	public class Scan {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		int val = 0;
		int k = 0;
		Scanner scanner = new Scanner(new File("src\\test_score_and_protect\\dor.pdf"));
		while (scanner.hasNext()) {
			String monString = scanner.next();
			if (monString.endsWith("volume")) {
				k = Integer.parseInt(monString.substring(0, monString.indexOf(val)));
			} else if (k <= val) {
				System.out.println("l'entier cherché est:" + k);

			}
		}

	}

}
