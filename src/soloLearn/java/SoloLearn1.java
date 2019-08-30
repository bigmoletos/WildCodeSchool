package soloLearn.java;

/**
 * @author franck Desmedt
 *
 */
public class SoloLearn1 {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class SoloLearn1
	 * @version 1.0
	 * @date mardi 20 août 2019
	 * @see
	 *
	 **/
	// Fill in the blanks to create a method that returns the minimum of the two
	// parameters.
	final int minFunc(int n1, int n2) {
		int min;
		if (n1 > n2) {
			min = n2;
		} else {
			min = n1;
		}
		return min;
	}

	//
	public static void main(String[] args) {
//		What is the output of this code?
		int arr[] = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = i;
		}
		int res = arr[0] + arr[2];
		System.out.println("res " + res);

//		What is the output of this code?		
		int result = 0;
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				result += 10;
			} else {
				result += i;
			}
		}
		System.out.println("result " + result);
//		Fill in the blanks to calculate the sum of all elements in the array "arr" using an enhanced for loop:

		int res2 = 0;

		for (int el : arr) {
			res2 += el;
		}
		System.out.println("res2 " + res2);

	}

}
