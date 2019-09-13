/**
 * 
 *
 */
package javaProjets.indianaJones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author franck Desmedt https://github.com/bigmoletos/
 *
 */
public class Movies {

	/**
	 * @description quete n°4 Java pour la WildCodeSchool
	 * @return void
	 *
	 * @method main
	 * @class Movies
	 * @version 1.0
	 * @date lundi 02 sept. 2019
	 * @see
	 *
	 **/

	static void tableauFilm0() {
		ArrayList<String> titleMovie = new ArrayList<String>();
		titleMovie.add("Indiana Jones et les Aventuriers de l'arche perdue");
		titleMovie.add("Indiana Jones et le Royaume du crâne de cristal");
		titleMovie.add("Indiana Jones et la Dernière Croisade");

		ArrayList<String> nameActor = new ArrayList<String>();
		nameActor.add("harrison Ford");
		nameActor.add("Kate Capshaw");
		nameActor.add("Jonathan Ke Quan");

		nameActor.add("harrison Ford");
		nameActor.add("Ray Winstone");
		nameActor.add("Karen Allen");

		nameActor.add("harrison Ford");
		nameActor.add("Denholm Elliott");
		nameActor.add("John Rhys-Davies");
		int i = 0, j = 0;

//		for (String title : titleMovie.toArray()) {
////		i++;
//			System.out.println("Dans le film: " + title + ", les principaux acteurs sont :");
//			for (String name : nameActor) {
////			j++;
//				System.out.println(name);
//			}
//		}
//		for (String title : titleMovie) {
//			i++;
//			System.out.println("Dans le film: " + title + ", les principaux acteurs sont :");
//			for (String name : nameActor) {
//				j++;
//				System.out.println(name);
//			}
//		}

	}

	static void tableauFilm() {
		String[][] titleMovie2;
//	int i, j;

		titleMovie2 = new String[3][4];

		titleMovie2[0][0] = "Indiana Jones et le Temple maudit";
		titleMovie2[0][1] = "harrison Ford";
		titleMovie2[0][2] = "Kate Capshaw";
		titleMovie2[0][3] = "Jonathan Ke Quan";

		titleMovie2[1][0] = "Indiana Jones et le Royaume du crâne de cristal";
		titleMovie2[1][1] = "harrison Ford";
		titleMovie2[1][2] = "Ray Winstone";
		titleMovie2[1][3] = "Karen Allen";

		titleMovie2[2][0] = "Indiana Jones et la Dernière Croisade";
		titleMovie2[2][1] = "harrison Ford";
		titleMovie2[2][2] = "Denholm Elliott";
		titleMovie2[2][3] = "John Rhys-Davies";

		for (int i = 0; i < titleMovie2.length; i++) {
//			System.out.print("titre " + titleMovie2[i][0] + "\n");
			for (int j = 0; j < titleMovie2[i].length; j++) {
				System.out.print(" actor" + titleMovie2[i][j] + "\n");
			}
		}
		System.out.println(titleMovie2);
	}

//version avec List<List
	static void tableauFilm2() {
		List<String> titleMovie3 = new ArrayList<String>();
		titleMovie3.clear();
//		for (int i = 0; i < 3; i++) {
//			titleMovie3.add("Indiana Jones et le Royaume du crâne de cristal");
//			titleMovie3.add("Indiana Jones et les Aventuriers de l'arche perdue");
//			titleMovie3.add("Indiana Jones et la Dernière Croisade");
//		}
//		List<List<String>> titleAndNameMovie = new ArrayList<List<String>>();
		List<List<String>> titleAndNameMovie = new ArrayList<List<String>>();
		List<String> nameActor2 = new ArrayList<String>();
		nameActor2.clear();
		for (int i1 = 0; i1 < 3; i1++) {
			titleMovie3.add("Indiana Jones et le Royaume du crâne de cristal");
			titleMovie3.add("Indiana Jones et les Aventuriers de l'arche perdue");
			titleMovie3.add("Indiana Jones et la Dernière Croisade");

			for (int j = 0; j < 3; j++) {
				nameActor2.add("harrison Ford");
				nameActor2.add("Denholm Elliott");
				nameActor2.add("John Rhys-Davies");

//				titleMovie3.add(nameActor2);
				titleAndNameMovie.add(nameActor2);
				System.out.println("nameActor2" + nameActor2);
				System.out.println("titlemovie31" + titleAndNameMovie);
			}
		}

		for (int a = 0; a < titleAndNameMovie.size(); a++)
			for (int b = 0; b < titleAndNameMovie.get(a).size(); b++)
				System.out.printf("Element films (%d,%d) %s\n", a, b, titleAndNameMovie.get(a).get(b));
	}

//version Hashmap
	static void tableauFilm3() {
		// ************
		ArrayList<String> titleMovie = new ArrayList<String>();
		titleMovie.add("Indiana Jones et les Aventuriers de l'arche perdue");
		titleMovie.add("Indiana Jones et le Royaume du crâne de cristal");
		titleMovie.add("Indiana Jones et la Dernière Croisade");

		// ****************
		ArrayList<String> nameActor = new ArrayList<String>();
		nameActor.add("harrison Ford");
		nameActor.add("Kate Capshaw");
		nameActor.add("Jonathan Ke Quan");

		nameActor.add("harrison Ford");
		nameActor.add("Ray Winstone");
		nameActor.add("Karen Allen");

		nameActor.add("harrison Ford");
		nameActor.add("Denholm Elliott");
		nameActor.add("John Rhys-Davies");

		// ***************
		List<Map<String, List<String>>> list = new ArrayList<Map<String, List<String>>>();
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		List<String> arraylist1 = new ArrayList<String>();

		arraylist1.add("texte1");
		map1.put("key1", arraylist1);
		list.add(map1);

		// *********************************
		// ***************
		List<Map<String, List<String>>> listTiles = new ArrayList<Map<String, List<String>>>();
		List<String> nameActor11 = new ArrayList<String>();

		nameActor11.add("harrison Ford");
		nameActor11.add("Kate Capshaw");
		nameActor11.add("Jonathan Ke Quan");

		List<String> nameActor12 = new ArrayList<String>();
		nameActor12.add("harrison Ford");
		nameActor12.add("Ray Winstone");
		nameActor12.add("Karen Allen");

		List<String> nameActor13 = new ArrayList<String>();
		nameActor13.add("harrison Ford");
		nameActor13.add("Denholm Elliott");
		nameActor13.add("John Rhys-Davies");

		Map<String, List<String>> titleMovie5 = new HashMap<String, List<String>>();
		titleMovie5.put("Indiana Jones et les Aventuriers de l'arche perdue", nameActor11);
		titleMovie5.put("Indiana Jones et le Royaume du crâne de cristal", nameActor12);
		titleMovie5.put("Indiana Jones et la Dernière Croisade", nameActor13);

		listTiles.add(titleMovie5);

		// *********************************
//		for (List<String> acteur : titleMovie5.values()) {
//			System.out.println("film" + titleMovie5.entrySet() + "actor" + acteur + "\n");
//		}
		for (Map.Entry<String, List<String>> entry : titleMovie5.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
			System.out.println("Dans le film \"" + key + "\" les principaux acteurs sont : " + values);
//			System.out.println("Acteurs = " + values);
		}

	}

	static void tableauFilm4() {
		// ************
		ArrayList<String> titleMovie = new ArrayList<String>();
		titleMovie.add("Indiana Jones et les Aventuriers de l'arche perdue");
		titleMovie.add("Indiana Jones et le Royaume du crâne de cristal");
		titleMovie.add("Indiana Jones et la Dernière Croisade");
		// ***************
		List<Map<String, List<String>>> list = new ArrayList<Map<String, List<String>>>();
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		List<String> arraylist1 = new ArrayList<String>();
		// *********************************

		HashMap<String, ArrayList<String>> titleMovie4 = new HashMap<String, ArrayList<String>>();
		List<String> nameActor3 = new ArrayList<String>();

		for (int i1 = 0; i1 < 3; i1++) {
//			titleMovie4.put("Indiana Jones et les Aventuriers de l'arche perdue", nameActor);
//			titleMovie4.put("Indiana Jones et le Royaume du crâne de cristal", nameActor);
//			titleMovie4.put("Indiana Jones et la Dernière Croisade", nameActor);
//			titleMovie4.put("Indiana Jones et les Aventuriers de l'arche perdue", new Array)
//			
//			titleMovie4.put(titleMovie.get(i1), nameActor3);
		}
//			for (String string : nameActor3) {
//				nameActor3.add("harrison Ford");
//				nameActor3.add("Kate Capshaw");
//				nameActor3.add("Jonathan Ke Quan");
//
//				nameActor3.add("harrison Ford");
//				nameActor3.add("Ray Winstone");
//				nameActor3.add("Karen Allen");
//
//				nameActor3.add("harrison Ford");
//				nameActor3.add("Denholm Elliott");
//				nameActor3.add("John Rhys-Davies");
//				titleMovie4.add(nameActor3);

		System.out.println("actor" );

//				for (String variable : titleMovie4.) {
//					System.out.println("film" + titleMovie4+ nameActor);
//				}
	}

//		}
//	}

	public static void main(String[] args) {
//		Dans la méthode main d'une classe Movies.java, crée :
//		un premier tableau contenant 3 titres de films dans lesquels joue notre ami Indiana (Hint),
//		un second tableau contenant, pour chaque film que tu as choisi, les 3 principaux acteurs (Hint : pense aux tableaux à plusieurs dimensions).
//		Une fois les tableaux créés, réalise une boucle pour afficher la liste des titres de films, ainsi que les acteurs associés de la manière suivante :
//
//		Dans le film title, les principaux acteurs sont : actor1, actor2, actor3
//
//		La liste devra s'afficher à la compilation, puis exécution du code dans le terminal.
//
//		Pour soumettre tes solutions, uploade le fichier dans un gist, puis poste le lien de ce dernier.
//		Critères de validation
//		Le fichier contient les tableaux, et on y retrouve bien 3 films, ainsi que 3 acteurs par film.
//		Une boucle est utilisée pour afficher les films et leurs acteurs.
//		Lorsque tu exécutes le script depuis ton terminal, le résultat affiché est bien : "Dans le film title, les principaux acteurs sont : actor1, actor2, actor3".
//		ArrayList<String> titleMovie = new ArrayList<String>();
//		titleMovie.add("Indiana Jones et les Aventuriers de l'arche perdue");
//		titleMovie.add("Indiana Jones et le Royaume du crâne de cristal");
//		titleMovie.add("Indiana Jones et la Dernière Croisade");
//
//		ArrayList<String> nameActor = new ArrayList<String>();
//		nameActor.add("harrison Ford");
//		nameActor.add("Denholm Elliott");
//		nameActor.add("John Rhys-Davies");
//
//		nameActor.add("harrison Ford");
//		nameActor.add("Ray Winstone");
//		nameActor.add("Karen Allen");
//
//		nameActor.add("harrison Ford");
//		nameActor.add("Denholm Elliott");
//		nameActor.add("John Rhys-Davies");
//		int i = 0, j = 0;
//
//		for (String title : titleMovie) {
////			i++;
//			System.out.println("Dans le film: " + title + ", les principaux acteurs sont :");
//			for (String name : nameActor) {
////				j++;
//				System.out.println(name);
//			}
//		}
//		for (String title : titleMovie) {
//			i++;
//			System.out.println("Dans le film: " + title + ", les principaux acteurs sont :");
//			for (String name : nameActor) {
//				j++;
//				System.out.println(name);
//			}
//		}
//		tableauFilm0();
//		tableauFilm();
//		tableauFilm2();
		tableauFilm3();
//		tableauFilm4();
	}

}
