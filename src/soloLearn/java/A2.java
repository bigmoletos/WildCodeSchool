/**
 * 
 *
 */
package soloLearn.java;

/**
 * @author franck Desmedt
 *
 */
public class A2 extends Thread {
	@Override
	public void run() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 object = new A2();
		object.start();
	}

}
