
/**
 * 
 *
 */

package soloLearn.java;

import java.util.HashMap;

/**
 * @author franck Desmedt
 *
 */
public class HasmapCollectionTest {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class HasmapCollectionTest
	 * @version 1.0
	 * @date mardi 20 août 2019
	 * @see
	 *
	 **/

	public static void main(String[] args) {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("A", "First");
		m.put("B", "Second");
		m.put("C", "Third");
		System.out.println(m.get("B"));
	}
}
