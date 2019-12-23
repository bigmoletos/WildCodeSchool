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
public class SoireeOrageuse {

	/**
	 * @description Ce soir, un orage se déchaîne pas loin de chez vous et
	 *              régulièrement vous voyez des éclairs puis, quelques secondes
	 *              après, vous entendez le tonnerre. Vous aimeriez savoir à quelle
	 *              distance se trouve l'orage, afin de savoir s'il se rapproche de
	 *              vous ou, au contraire, s'éloigne.
	 *
	 *              Ce que doit faire votre programme : Votre programme devra lire
	 *              un décimal, le temps (en secondes) entre le moment où vous voyez
	 *              l'éclair et le moment où vous entendez le tonnerre. Il devra
	 *              calculer et afficher la distance entre vous et l'orage, arrondi
	 *              au kilomètre près.
	 *
	 *              On supposera que la lumière se déplace instantanément. La
	 *              vitesse du son dépend de paramètres comme l'altitude, la
	 *              température...mais on supposera qu'en cette soirée elle vaut
	 *              340,29 mètres / seconde.
	 *
	 *              Exemple
	 * @return void
	 *
	 *
	 * @method main
	 * @class SoireeOrageuse
	 * @version 1.0
	 * @date vendredi 20 déc. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nbre = scan.nextDouble();
		double result = 0;
		double nbsac = Math.round(nbre * 340.29);
//		int nbsac = (int) Math.round(nbre * 340.29);
		double distance = nbsac / 1000;

		result = (int) distance;
		System.out.println(result);

	}

}

//import algorea.Scanner;
//import static java.lang.Math.*;
//class Main
//{
//   public static void main(String[] args)
//   {
//      double vitesseSon = 340.29;
//      Scanner entrée = new Scanner(System.in);
//      double tempsParcours = entrée.nextDouble();
//      int distanceKilometres = (int)(round((tempsParcours * vitesseSon) / 1000));
//      System.out.println(distanceKilometres);
//   }
//}

//solution python
//from math import *
//vitesseSon = 340.29
//tempsParcours = float(input())
//distanceKilometres = round((tempsParcours * vitesseSon) / 1000)
//print(distanceKilometres)
