/**
 *
 *
 */
package javaProjets.france_IOI;

import java.util.Scanner;

/**
 * @author franck Desmedt https://github.com/bigmoletos
 *
 */
public class BanquetMunicipal {
	public static void main(String[] args) {
		Scanner entrée = new Scanner(System.in);
		int nbPersonnes = entrée.nextInt();
		int nbChangements = entrée.nextInt();
		int[] identifiant = new int[nbPersonnes];

		for (int idPersonne = 0; idPersonne < nbPersonnes; idPersonne = idPersonne + 1) {
			identifiant[idPersonne] = entrée.nextInt();
		}

		for (int idChang = 0; idChang < nbChangements; idChang = idChang + 1) {
			int premier = entrée.nextInt();
			int second = entrée.nextInt();
			int temp = identifiant[premier];
			identifiant[premier] = identifiant[second];
			identifiant[second] = temp;
		}

		for (int idPersonne = 0; idPersonne < nbPersonnes; idPersonne = idPersonne + 1) {
			System.out.println(identifiant[idPersonne]);
		}
	}

}

//import algorea.Scanner;
//class Main
//{
//   public static void main(String[] args)
//   {
//      Scanner entrée = new Scanner(System.in);
//      int nbPersonnes = entrée.nextInt();
//      int nbChangements = entrée.nextInt();
//      int[] identifiant = new int[nbPersonnes];
//
//      for (int idPersonne = 0; idPersonne < nbPersonnes; idPersonne = idPersonne + 1)
//      {
//         identifiant[idPersonne] = entrée.nextInt();
//      }
//
//      for (int idChang= 0; idChang < nbChangements; idChang = idChang + 1)
//      {
//         int premier = entrée.nextInt();
//         int second = entrée.nextInt();
//         int temp = identifiant[premier];
//         identifiant[premier] = identifiant[second];
//         identifiant[second] = temp;
//      }
//
//      for (int idPersonne = 0; idPersonne < nbPersonnes; idPersonne = idPersonne + 1)
//      {
//         System.out.println(identifiant[idPersonne]);
//      }
//   }
//}
