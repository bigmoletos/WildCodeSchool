/**
 * 
 *
 */
package soloLearn.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author franck Desmedt
 *
 */
public class iteratorMethodTest {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class iteratorMethodTest
	 * @version 1.0
	 * @date mardi 20 août 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
//		What is the output of this code?
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		Iterator<Integer> it = list.iterator();
		it.next();
		System.out.println(it.next());

	}

}
