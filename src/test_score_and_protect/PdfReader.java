/**
 * 
 *
 */
package test_score_and_protect;

import java.io.File;

/**
 * @author franck Desmedt https://github.com/bigmoletos/
 *
 */
public class PdfReader {
	public static void main(String[] args) {

		// Cr�ation de l'objet File
		File f = new File("src\\test_score_and_protect\\dor.pdf");
		// File file2 = new f.listRoots();
		// File listeFichiers = new file2.listFiles();
		System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
		System.out.println("Affichage des fichiers du repertoire en cours : " + f.listFiles());
		System.out.println("Nom du fichier : " + f.getName());
		System.out.println("Est-ce qu'il existe ? " + f.exists());
		System.out.println("Est-ce un r�pertoire ? " + f.isDirectory());
		System.out.println("Est-ce un fichier ? " + f.isFile());


		System.out.println("Affichage des lecteurs à la racine du PC : ");
		for (File file : f.listRoots()) {
			System.out.println(file.getAbsolutePath());
			try {
				int i = 1;
				// On parcourt la liste des fichiers et r�pertoires
				for (File nom : file.listFiles()) {
					// S'il s'agit d'un dossier, on ajoute un "/"
					System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName() + "/" : nom.getName()));

					if ((i % 4) == 0) {
						System.out.print("\n");
					}
					i++;
				}
				System.out.println("\n");
			} catch (NullPointerException e) {
				// L'instruction peut g�n�rer une NullPointerException
				// s'il n'y a pas de sous-fichier !
			}
		}

	}
}
