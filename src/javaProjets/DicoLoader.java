/**
 * 
 *
 */
package javaProjets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author franck
 *
 */
public class DicoLoader {

	public void ouvreFichier() throws IOException {

		BufferedReader lecteurAvecBuffer = null;
		String ligne;

		try {
			String[] argv = null;
			lecteurAvecBuffer = new BufferedReader(new FileReader(argv[0]));
		} catch (FileNotFoundException exc) {
			System.out.println("Erreur d'ouverture");
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null)
			System.out.println(ligne);
		lecteurAvecBuffer.close();

	}

	public void ouvreFichier2() throws IOException {

//	******************

		BufferedReader reader = new BufferedReader(new FileReader("tonfichier.data"));
		String currentLine;
		while ((currentLine = reader.readLine()) != null) {
			String[] tokens = currentLine.split(":::");
			// Traiter les champ de la ligne stockés dans tokens
		}
//	**************
	}
}