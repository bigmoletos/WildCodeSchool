/**
 * 
 *
 */
package soloLearn.java;

/**
 * @author franck Desmedt
 *
 */
public class AA extends Thread {
	@Override
	public void run() {
		System.out.println("A");
		Thread t = new Thread(new BB());
		t.start();
	}
}
