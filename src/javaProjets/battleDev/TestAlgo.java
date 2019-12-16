/**
 * 
 *
 */
package javaProjets.battleDev;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author franck Desmedt (github:bigmoletos) https://github.com/bigmoletos/
 *
 */
public class TestAlgo {

	public void decalageLettreAlphabet() {

		System.out.println("hello");
	}

	public void conjectureCollatzSyracuse() {
//		La conjecture de Syracuse (ou Collatz)  utilise l'algorithme suivant : Si n est pair, le diviser par 2, sinon multiplier par 3 et ajouter 1. Recommencer jusque obtenir 1.
//
//		Exemple : n=10, 10 est pair, le diviser par 2 et on obtient 5,
//		5 est impair le multiplier par 3 et ajouter 1 pour obtenir 16,
//		La suite se continue par 8, 4, 2 et 1.
//		D'autres noms de la conjecture de Syracuse sont utilisés dans la littérature :
//		- conjecture de Collatz
//		- conjecture d'Ulam
//		- conjecture tchèque
//		- problème 3x+1
//		- algorithme de Hasse
//		- problème de Kakutani
//		- conjecture de Thwaite

		Scanner in = new Scanner(System.in);
		Long n = in.nextLong();

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");
		int result = 0;

		while (n > 1) {
			if (n % 2 == 0)
				n /= 2;
			else
				n = (n * 3) + 1;
			result++;
		}

		System.out.println("nb calculs " + result + " reste: " + n);

	}

	public void lettreIdentiqueDansunMot() {

		int nombre = 0;
		String resp = "false";
//		char valeur null  par defaut '\u0000'
		char lettre = '\u0000';
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		// 1er lettre en Maj puis le reste en minuscules
		word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		System.out.println(word);
		// Tout en minuscules
		word = word.substring(0, word.length()).toLowerCase();
		System.out.println(word);
		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");
		for (int i = 0; i < word.length(); i++) {
			// mise en minuscules du charactere
			lettre = Character.toLowerCase(word.charAt(i));
			System.out.println(lettre);
			System.out.println("taille " + word.length());

			int result = word.length() - word.replace(Character.toLowerCase(word.charAt(i)), '\u0000').length();
//			word = word.replace(Character.toLowerCase(word.charAt(i)), ' ');
			// regex on recherche au moins 2 occurrences du caractére {2,}
			// String regex="[a-z]{2,100}";
			String regex = "[" + Character.toLowerCase(word.charAt(i)) + "]{2,}";

			System.out.println("regex " + regex);
			boolean match = word.matches(regex);
			System.out.println("match " + match);

			String word2 = "AERFGTeeTRFaGs";
			String regex2 = "[a]{2,}";
			boolean match2 = word2.matches(regex2);
			System.out.println("match2 " + match2);

			System.out.println(result);
			System.out.println(word);
			System.out.println("taille apres " + word.length());
			if (result >= 0) {
				resp = "true";
			}
//			if (lettre == word.charAt(i)) {
//				nombre++;
//				if (nombre > 1) {
//					resp = "true";
//				}
			System.out.println(resp);
//		}
		}
		in.close();

	}

	public void matchRegex(String word) {
		// String word2 = "aaERFGTeeTRFAGs";
		System.out.println(word);
		String regex2 = "a";
		boolean match2 = word.matches(regex2);
		boolean match3 = word.matches("[a-c]");
		boolean match4 = Pattern.matches("a+", word);
		word = word.replace(regex2, "");
		System.out.println(word);
		System.out.println("match2 " + match2);
		System.out.println("match3 " + match3);
		System.out.println("match4 " + match4);

//		Pattern p = Pattern.compile("f{2,}");
		Pattern regex = Pattern.compile("[a-z]");
		Matcher m = regex.matcher("aaERFGTeeTRFAGs");
		boolean b = m.matches();
		System.out.println("b= " + b);
	}

//	fscanf(STDIN, "%d", $N);
//	for ($i = 0; $i < $N; $i++)
//	{
//	    fscanf(STDIN, "%d", $E);
//	    if($E=='-1')echo ' '; else
//	    echo strtolower(chr(ord('Z')-$E));
//	    
//	}

//	fscanf(STDIN, "%d", $N);
//
//	$r = "";
//	for ($i = 0; $i < $N; $i++)
//	{
//	    fscanf(STDIN, "%d", $E);
//	    $diff = 26 - $E;
//	    if($E == -1) $r .= " ";
//	    else $r .= chr($diff+96);
//	}
//
//	// Write an action using echo(). DON'T FORGET THE TRAILING \n
//	// To debug (equivalent to var_dump): error_log(var_export($var, true));
//
//	echo $r;
//	?>

	public void adresseIPV4Convert() {
		String ipv4 = "192.168.0.0";
		System.out.println("adresse " + ipv4);
		int result = 0;
		String[] parts = ipv4.split("\\.");
		// System.err.println(parts);
		StringBuilder concat = new StringBuilder();

		for (int i = 0; i < parts.length; i++) {
//			convertir chaque partie en binaire base 8
			parts[i] = Integer.toBinaryString(Integer.parseInt(parts[i]));
			System.err.println(parts[i]);
//			mettre le meme format pour toutes les parties en rajoutant les 0 manquant
			parts[i] = String.format("%8s", parts[i]).replace(" ", "0");
			System.out.println(parts[i]);
//			concatener la chaine avec le stringBuilder, le resultat est en binaire base 32
			concat.append(parts[i]);

		}

		System.out.println("final: " + concat.toString());
//		convertir le binaire base 32 en integer
		long answer = Integer.parseUnsignedInt(concat.toString(), 2);
//		on affiche la valeur absolue du resultat
		System.out.println("resp: " + Math.abs(answer));

//		**************
//	    Scanner in = new Scanner(System.in);
//        String ipv4 = in.nextLine();
//        System.err.println(ipv4);
//        String result[] = ipv4.split("[.]");
//        //System.err.println(result);
//        //System.err.println(result.length);
//        for (int i = 0; i < result.length; i++) {
//            result[i] = Integer.toBinaryString(Integer.parseInt(result[i]));
//            result[i] = String.format("%8s", result[i]).replace(" ", "0");
//            //System.err.println(result[i]);
//        }
//        String concat = String.join("", result);
//        System.err.println(concat);
//        long answer = Integer.parseUnsignedInt(concat, 2);
		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");
		// System.out.println(result);
	}

//	01 Test 1
//	1
//	192.168.0.0/24	//sortie	254
//	02 Test 2
//	1
//	192.168.1.128/26	//sortie	62
//	03 Test 3
//	3
//	172.16.0.0/16	//sortie	65534
//	192.168.0.0/23	//sortie	510
//	192.168.100.52/30//sortie	2

//	04 Test 4
//	1
//	0.0.0.0/1	//sortie	2147483646
//	

	public void reverseCodeAdresseIp() {

	}

// 	Objectif
//In a town there are X men, each man has X wives and each wife has X kids, you should print the total T number of people in this town.
//Entrée
//One line: The integer X
//Sortie
//One line: The total T number of people in this town
//Contraintes
//0 ≤ X ≤ 300
//Exemple
//Entrée
//7
//Sortie
	public void numberOfPeopleInTown() {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");
		int result = x + (x * x) + (x * x * x);
		System.out.println(result);
	}

	public void biggestHighlyCompositeNumber() {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
//		A highly composite number is a number that has more divisors than any other number less than it.
//		Given a number n, print the biggest highly composite number less than or equal to n and the number of divisors it has.
//
//		Ex 1: n=5: print: 4 3
//		1 -> 1 divisor
//		2 -> 1, 2 = 2 divisors
//		3 -> 1, 3 = 2
//		4 -> 1, 2, 4 = 3
//		5 -> 1, 5 = 2
//		Therefore 4 is the biggest highly composite number less than 5.
//
//		Ex 2: n=11, print: 6 4
//		6 -> 1, 2, 3, 6 = 4 divisors
//		10 -> 1, 2, 5, 10 = 4 divisors
//		Here, 6 is the biggest highly composite number under 11. 10 is not the answer because it has the same amount of divisors as 6.
//		Entrée
//		Line 1: An integer n.
//		Sortie
//		Line 1: The biggest highly composite number less than or equal to n and number of divisors separated by a space.
//		Contraintes
//		1 ≤ n ≤ 7000
//		Exemple
//		Entrée
//		5
//		Sortie
//		4 3

//	solution python:
//		n = int(input())
//		ind = 0
//		maxi =0
//		for i in range(1,n+1):
//		    nb=0
//		    for j in range(1,i+1):
//		        if(i%j == 0):
//		            nb+=1
//		    if(nb>maxi):
//		        maxi = nb
//		        ind = i
//
//		print(ind,maxi)

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");
		int highlyCompositeNumber = 0;
		int divisor = 0;

		for (int i = 1; i < x + 1; i++) {
			int nb = 0;
			for (int j = 1; j < i + 1; j++) {
				if (i % j == 0) {
					nb += 1;
				}
				if (nb > divisor) {
					divisor = nb;
					highlyCompositeNumber = i;
				}
			}
		}
		System.out.println(highlyCompositeNumber + " " + divisor);
	}

//	Le mode de jeu est REVERSE : Vous n'avez pas accès à l'énoncé. Vous devez trouver quoi faire en observant les jeux de tests suivants :
//		01 Test 1
//		9
//		1
//		3
//		5
//		7
//		9

//		02 Test 2
//		101
//		1
//		3
//		5
//		7
//		9
//		11
//		13
//		15
//		17
//		19
//		21
//		23
//		25
//		27
//		29
//		31
//		33
//		35
//		37
//		39
//		41
//		43
//		45
//		47
//		49
//		51
//		53
//		55
//		57
//		59
//		61
//		63
//		65
//		67
//		69
//		71
//		73
//		75
//		77
//		79
//		81
//		83
//		85
//		87
//		89
//		91
//		93
//		95
//		97
//		99
//		101

//		03 Test 3
//		20
//		1
//		3
//		5
//		7
//		9
//		11
//		13
//		15
//		17
//		19

//		04 Test 4
//		2
//		1
	public void rajouteDeux() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");
		int result = 1;
		while (N >= result) {
			System.out.println(1);
			for (int i = 1; i < N - 1; i++) {
				result = result + 2;
				System.out.println(result);
				N = N - 1;
			}
		}
	}

// 	Objectif
//A message is encoded in a square N by N grid. The first character of the message is 
//	in the top-left corner of the grid and the remaining characters are placed 
//	in the grid in an inwards clockwise spiral pattern.
//
//Decode the message.
//Entrée
//Line 1: One integer N, the side length of the square grid.
//Next N Lines: N characters on each line.
//Sortie
//Line 1: The decoded message.
//Contraintes
//1 ≤ N ≤ 25
//Exemple
//Entrée
//3
//Cod
//mei
//aGn
//Sortie
//CodinGame
	public void decodeInQuarter() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		// in.close();
//		int N = 3;
		String code1 = "Cod";
		String code2 = "mei";
		String code3 = "aGn";
		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");
		String result = "";
		char lettre = '\u0000';
		StringBuilder concat = new StringBuilder();
		if (in.hasNextLine()) {
			in.nextLine();
		}
		for (int i = 0; i < N; i++) {
			String line = in.nextLine();
			System.out.println("line n:" + i + " " + line);
			for (int j = 0; j < line.length(); j++) {
//				System.out.println("line n:" + j + " " + line);
				lettre = line.charAt(j);
				System.out.println(lettre);
				concat.append(lettre);
//				for (int j2 = 0; j2 < line.length(); j2++) {
//					lettre = line.charAt(j2);
//					System.out.println(lettre);
//					concat.append(lettre);
//				}
				System.out.println("concat " + concat);
			}
		}
		in.close();
		System.out.println(result);
	}

//	********************
//	 Test 1
//	0 1 =1
//	 Test 2
//	001 011 =010
//	 Test 3
//	011 001 =010
//	 Test 4
//	00000000000111 10101010111100=10101010111011

	// ********************

//	correction python
//	n_1, n_2 = input().split()
//
//	out = ""
//	for i in range(len(n_1)):
//	    if n_1[i] == n_2[i] == "1" or n_1[i] == n_2[i] == "0":
//	       out += "0"
//	    else:
//	        out += "1"
//
//	print(out)

//	********************
//	correction2 python
//	n_1, n_2 = input().split()
//
//			# Write an action using print
//			# To debug: print("Debug messages...", file=sys.stderr)
//
//			s=''
//			for i,v in enumerate(n_1):
//			    s+=str(int(n_1[i])^int(n_2[i]))
//			print(s)

	public void soustractBinary() {
		Scanner in = new Scanner(System.in);
//		int N = in.nextInt();
		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");
		String n1 = in.next();
		String n2 = in.next();
		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");
		int result = 0;
//        n1=binaryIntegerStrin
		int result1 = Integer.parseInt(n1, 2);
		int result2 = Integer.parseInt(n2, 2);
		result = result1 - result2;
//n1= Integer.parseInt(binaryIntegerString, 2);
		result = Integer.toString(result, 2);

		System.out.println("binary digits");
		System.out.println(result);
	}

	public static void main(String[] args) {

		TestAlgo test = new TestAlgo();

		// test.decalageLettreAlphabet();
		// test.conjectureCollatzSyracuse();
//		test.lettreIdentiqueDansunMot();
		// test.matchRegex("affTeffeAaatHee");
//		test.adresseIPV4Convert();
//		test.reverseCodeAdresseIp();
//		test.numberOfPeopleInTown();
		// test.biggestHighlyCompositeNumber();
//		test.rajouteDeux();
//		test.decodeInQuarter();
		test.soustractBinary();

	}

}
