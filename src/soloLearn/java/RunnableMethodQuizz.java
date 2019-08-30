/**
 * 
 *
 */
package soloLearn.java;

/**
 * @author franck Desmedt
 *
 */
public class RunnableMethodQuizz {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class RunnableMethodQuizz
	 * @version 1.0
	 * @date mardi 20 août 2019
	 * @see
	 *
	 **/

//		How many lines of output will this code produce?
//	class BB implements Runnable {
//		@Override
//		public void run() {
//			System.out.println("B");
//		}
//	}

//	class AA extends Thread {
//		@Override
//		public void run() {
//			System.out.println("A");
//			Thread t = new Thread(new BB());
//			t.start();
//		}

	public static void main(String[] args) {
		AA object = new AA();
		object.start();
	}
}
