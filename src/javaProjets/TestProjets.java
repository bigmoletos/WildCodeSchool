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
		// TODO Auto-generated method stub
		String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
		String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
		String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
		
		System.out.print(decodeMessage(message1));
		System.out.print(decodeMessage(message2));
		System.out.print(decodeMessage(message3));

	}


	    public static String decodeMessage(String codeMessage) {
	        String uncodeTotalMessage = "";
	        String subMessage = codeMessage.substring(5, (codeMessage.length() / 2) + 5);
	        StringBuffer uncodeSplitMessage = (new StringBuffer(subMessage.replace("@#?", " "))).reverse();
	        uncodeTotalMessage = uncodeSplitMessage + " ";
	        return uncodeTotalMessage;
	    }

	}

