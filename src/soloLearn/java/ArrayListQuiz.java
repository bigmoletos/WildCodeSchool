/**
 * 
 *
 */
package soloLearn.java;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author franck Desmedt
 *
 */
public class ArrayListQuiz {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class ArrayListQuiz
	 * @version 1.0
	 * @date mardi 20 août 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
//		What is the output of this code?
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			list.add(i);
			System.out.println(list);
		}
		int x = 0;
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
//			x += it.next();  //erreur it is not visible
			System.out.println(x);
		}
		System.out.println(x);

		System.out.println(" What is the output of the following code? ");
//		What is the output of the following code?
		int f = 1, i = 2;
		while (++i < 5) {
			f *= i;
			System.out.println(f);
		}
		System.out.println(f);
	}

}
