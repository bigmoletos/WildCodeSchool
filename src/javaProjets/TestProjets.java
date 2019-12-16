/**
 * 
 *
 */
package javaProjets;

/**
 * @author franck Desmedt https://github.com/bigmoletos/
 *
 */
public class TestProjets {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class TestProjets
	 * @version 1.0
	 * @date samedi 14 sept. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
//		String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
//		String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
//		
//		System.out.print(decodeMessage(message1));
//		System.out.print(decodeMessage(message2));
//		System.out.print(decodeMessage(message3));
//
//	}
//
//
//	    public static String decodeMessage(String codeMessage) {
//	        String uncodeTotalMessage = "";
//	        String subMessage = codeMessage.substring(5, (codeMessage.length() / 2) + 5);
//	        StringBuffer uncodeSplitMessage = (new StringBuffer(subMessage.replace("@#?", " "))).reverse();
//	        uncodeTotalMessage = uncodeSplitMessage + " ";
//	        return uncodeTotalMessage;
//	    }
//
//		String[] Messages = { "0@sn9sirppa@#?ia'jgtvryko1", "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
//				"aopi?sedohtém@#?sedhtmg+p9l!" };
//		for (int i = 0; i < Messages.length; i++) {
//			System.out.println(Deciphere(Messages[i]));
//		}
//	}
//
//	public static String Deciphere(String message) {
//		int lenght = message.length() / 2;
//		String substring = message.substring(5, 5 + lenght);
//		substring = substring.replace("@#?", " ");
//		substring = new StringBuilder(substring).reverse().toString();
//		return (substring);
//	}

		// Déclaration des variables
		double money = 12.4;
		double price = 1.2;
		int candies = 0;

		// résolution
		if (money > 0 && price > 0) {
			while (money - price >= 0) {
				candies = candies + 1;
				money = money - price;
			}
		}
		System.out.println(candies);
	}

}
