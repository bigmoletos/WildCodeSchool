/**
 * 
 *
 */
package soloLearn.java;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author franck Desmedt
 *
 */
public class IteratormethodTest2 {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");

		Iterator<String> it = animals.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}
	}

	/*
	 * fox cat dog rabbit
	 */

}
