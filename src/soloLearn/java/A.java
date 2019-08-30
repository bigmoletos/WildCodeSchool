/**
 * 
 *
 */
package soloLearn.java;

/**
 * @author franck Desmedt
 *
 */
public class A {
	private void print() {
		System.out.println("a");
	}

	private void print(String str) {
		System.out.println("b");
	}

	private void print(int x) {
		System.out.println("c");
	}

	public static void main(String[] args) {
		A object = new A();
		object.print(12);
	}
}
