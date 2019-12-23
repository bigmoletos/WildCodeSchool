/**
 *
 *
 */
package javaProjets.france_IOI;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author franck Desmedt https://github.com/bigmoletos Pour la construction de
 *         votre nouvelle maison, vous avez calculé la quantité de ciment
 *         nécessaire pour construire les fondations. De nature économe, vous
 *         souhaitez acheter exactement la quantité nécessaire mais
 *         malheureusement le magasin ne vend le ciment qu'en gros sacs. Vous
 *         souhaitez calculer combien tout cela va vous coûter.
 *
 *         Ce que doit faire votre programme : Votre programme devra lire un
 *         nombre décimal, la quantité de ciment nécessaire pour les fondations
 *         de votre nouvelle maison, en kilos. Sachant que le ciment n'est vendu
 *         qu'en sacs de 60 kilos et que un sac coûte 45 euros, votre programme
 *         devra afficher le coût total du ciment.
 *
 */
public class ConstructionMaison {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class ConstructionMaison
	 * @version 1.0
	 * @date vendredi 20 déc. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		double nbre = scan.nextDouble();
		int result = 0;
		int nbsac = (int) Math.ceil(nbre / 60);
		double prixCiment = nbsac * 45;
		result = (int) prixCiment;
		System.out.println(result);
		scan.close();

	}

}
//#################
//import algorea.Scanner;
//class Main
//{
//public static void main(String[] args) {
//
//Scanner scan = new Scanner(System.in);
//double nbre = scan.nextDouble();
//int result = 0;
//int nbsac = (int) Math.ceil(nbre / 60);
//double prixCiment = nbsac * 45;
//
//result = (int) prixCiment;
//System.out.println(result);
//}
//}
//
//#################"""