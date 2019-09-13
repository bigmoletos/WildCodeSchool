/**
 * 
 *
 */
package javaProjets.indianaJones;

/**
 * @author franck Desmedt
 *
 */
//Entre deux smoothies et parties de chifoumi, Indiana Jones, le célèbre 
//professeur/archéologue/aventurier, a récupéré trois papyrus antiques contenant chacun
//un message codé ! Heureusement, il a également découvert la manière de les déchiffrer,
//mais c'est un peu compliqué de le faire à la main.
//
//Il te donne alors les instructions pour que tu développes un programme permettant 
//d'automatiser le processus. Cela pourra être d'autant plus utile s'il rencontre à 
//nouveau ce système de chiffrement plus tard.
//
//Voici comment procéder :
//
//Calcule la longueur de la chaîne et divise-la par 2, tu obtiendras ainsi le "chiffre-clé".
//Récupère ensuite la sous-chaîne de la longueur du chiffre-clé, en commençant à partir
//du 6ème caractère.
//Remplace les chaînes '@#?' par un espace.
//Pour finir, inverse la chaîne de caractères.
//Pour ceci, crée une classe Decipherer (c'est-à-dire un fichier Decipherer.java) 
//		où tu dois définir ta méthode.
//
//Appelle ensuite ta méthode dans une méthode main sur chacun des messages suivants, 
//et poste le code Java que tu as écrit, ainsi que les textes déchiffrés sur un Gist.
//
//message 1 : 0@sn9sirppa@#?ia'jgtvryko1
//message 2 : q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj
//message 3 : aopi?sedohtém@#?sedhtmg+p9l!
//Ressources
//Java Methods
//Critères de validation
//Le fichier Decipherer.java est disponible depuis un lien Gist,
//Les bons types sont appliqués au paramètre et au retour,
//Le mot clé return est utilisé dans la méthode pour renvoyer le résultat,
//L'affichage du résultat se fait bien à l’extérieur de la méthode et non directement dedans,
//Le message secret est bien déchiffré. Il faudra appeler la méthode trois fois, 
//une fois pour chaque message, pour confirmer que tout fonctionne correctement.

public class Decipherer {

	/**
	 * @description quete n°5 Java pour la WildCodeSchool
	 * @return void
	 *
	 * @method main
	 * @class Decipherer
	 * @version 1.0
	 * @date mardi 03 sept. 2019
	 * @see
	 *
	 **/

	public static StringBuffer decrypteMessage(String message) {

//		String messageDecode = "null";
		//
		int longeurmessage = message.length();
		System.out.println("le message " + message + " à une longeur de: " + longeurmessage + " caractéres");

		//
		int chiffreCle = longeurmessage / 2;
		String sousChaine = message.substring(5, chiffreCle+5);
		System.out.println("La sous chaine du  message " + message + " du 6 éme caractére au: " + chiffreCle
				+ " éme caractére est: " + sousChaine);
		//
//		StringBuffer buffer = new StringBuffer(sousChaine);
//		buffer.replaceAll("@#?", " ");
		String regex = "@#?";
		String NewsousChaine = sousChaine.replaceAll(regex, " ");
//		String regex2 = "?";
//		String NewsousChaine2 = NewsousChaine.replaceAll(regex2, " ");
//		String NewsousChaine = buffer.toString();

		System.out.println("remplacement des caractéres @#? par un espace dans la sous chaine  " + sousChaine
				+ " nous donne :" + NewsousChaine);

//		regex=[**-1];
		StringBuffer messageDecode = (new StringBuffer(NewsousChaine)).reverse();
//		messageDecode = NewsousChaine.revert();
		System.out
				.println("l'inversion de la nouvelle sous chaine  " + NewsousChaine + " nous donne :" + messageDecode);
		System.out.println("message initial: " + message + " message décodé: " + messageDecode);
		return messageDecode;

	}

	public static void main(String[] args) {

		String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
		String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
		String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
		decrypteMessage(message1);
		decrypteMessage(message2);
		decrypteMessage(message3);

	}

}
