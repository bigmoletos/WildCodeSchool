/**
 *
 *
 */
package javaProjets.france_IOI;

import java.util.Scanner;

/**
 * @author franck Desmedt https://github.com/bigmoletos france IOI niveau2
 */
public class Niveau2FranceIOI {

	public static void comparatifPrix() {
//		import algorea.Scanner;
//		class Main
//		{
////		   public static void main(String[] args)
//		   {
		Scanner entree = new Scanner(System.in);
		int nombreLegumes = entree.nextInt();

		for (int loop = 1; loop <= nombreLegumes; loop = loop + 1) {
			double poids = entree.nextDouble();
			// âge
			entree.nextDouble();
			double prix = entree.nextDouble();

			System.out.println(prix / poids);
		}
	}
//		}

	public static void calculMoyenne() {
//		import algorea.Scanner;
//		class Main
//		{
////		   public static void main(String[] args)
//		   {
//		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		Scanner scan = new Scanner(System.in);
		int nbreNotes = scan.nextInt();
		double result = 0;
		double sommeNotes = 0;
		for (int i = 0; i < nbreNotes; i++) {
			int notes = scan.nextInt();
//		         double notes = scan.nextDouble();
//		         scan.nextDouble();
			sommeNotes += notes;
		}
		result = sommeNotes / nbreNotes;
		System.out.println(result);
		scan.close();
	}
//}

//	Ces dernières années, la population de votre ville a très fortement augmenté,
//	grâce à un fort taux de natalité. Cela pose cependant un certain nombre de problèmes,
//	notamment une pénurie de logements ! Le maire a décidé de s'occuper du problème et
//	souhaiterait estimer l'évolution future de la population.
//
//	Ce que doit faire votre programme :
//	Votre programme devra lire un entier, la population actuelle de la ville, puis un
//	nombre décimal, la croissance prévue de la population, en pourcentage. Il devra
//	alors afficher la nouvelle population de la ville sous la forme d'un nombre entier.
//	On considérera, par convention, qu'une population de 31,4 habitants signifie qu'il y
//	a 31 habitants, on ne compte donc que les habitants « entiers » !

	public static void augmentationPopulation() {
//		import algorea.Scanner;
//		class Main
//		{
////		   public static void main(String[] args)
//		   {
//		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		Scanner scan = new Scanner(System.in);
		int nbreNotes = scan.nextInt();
		double result = 0;
		double sommeNotes = 0;
		for (int i = 0; i < nbreNotes; i++) {
			int notes = scan.nextInt();
//		         double notes = scan.nextDouble();
//		         scan.nextDouble();
			sommeNotes += notes;
		}
		result = sommeNotes / nbreNotes;
		System.out.println(result);
		scan.close();
	}
//}

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class Moyenne
	 * @version 1.0
	 * @date vendredi 20 déc. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {

//		Niveau2FranceIOI.comparatifPrix();
		Niveau2FranceIOI.calculMoyenne();

	}

}