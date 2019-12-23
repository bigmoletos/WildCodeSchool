/**
 *
 *
 */
package javaProjets.france_IOI;

import java.util.Locale;
import java.util.Scanner;
//		import algorea.Scanner;

/**
 * @author franck Desmedt https://github.com/bigmoletos Ces dernières années, la
 *         population de votre ville a très fortement augmenté, grâce à un fort
 *         taux de natalité. Cela pose cependant un certain nombre de problèmes,
 *         notamment une pénurie de logements ! Le maire a décidé de s'occuper
 *         du problème et souhaiterait estimer l'évolution future de la
 *         population.
 *
 *         Ce que doit faire votre programme : Votre programme devra lire un
 *         entier, la population actuelle de la ville, puis un nombre décimal,
 *         la croissance prévue de la population, en pourcentage. Il devra alors
 *         afficher la nouvelle population de la ville sous la forme d'un nombre
 *         entier. On considérera, par convention, qu'une population de 31,4
 *         habitants signifie qu'il y a 31 habitants, on ne compte donc que les
 *         habitants « entiers » !
 *
 *
 */
public class AugmentationPopulation {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class AugmentationPopulation
	 * @version 1.0
	 * @date vendredi 20 déc. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
//		class Main
//		{
		// useLocale pour eviter les pb avec la confusion . ou ,
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		int nbre = scan.nextInt();
		int result = 0;
		if (scan.hasNext()) {
			scan.nextLine();
		}
		// pourcentage de croissance
		double percent = scan.nextDouble();

		double result2 = nbre + nbre * percent / 100;
//		convert double to int
		result = (int) result2;
		System.out.println(result);
		scan.close();
	}

}

//#################
//
//import algorea.Scanner;
//class Main
//{
//public static void main(String[] args) {
////class Main
////{
// // useLocale pour eviter les pb avec la confusion . ou ,
// Scanner scan = new Scanner(System.in);
// int nbre = scan.nextInt();
// int result = 0;
////   if (scan.hasNext()) {
////       scan.nextLine();
////   }
// // pourcentage de croissance
// double percent = scan.nextDouble();
//
// double result2 = nbre + nbre * percent / 100;
////convert double to int
// result = (int) result2;
// System.out.println(result);
//
//}
//}
//
//#################"""
