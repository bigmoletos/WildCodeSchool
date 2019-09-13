/**
 * 
 *
 */
package javaProjets;

/**
 * @author franck
 *
 */
public class Wilder {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class Wilder
	 * @version 1.0
	 * @date vendredi 13 sept. 2019
	 * @see
	 *
	 **/
	
	 String firstname;
	 boolean aware;
	 
	 
//	 constructeur avec arguments
	/**
	 * @param firstname
	 * @param aware
	 */
	public Wilder(String firstname, boolean aware) {
		super();
		this.firstname = firstname;
		this.aware = aware;
	}


//getter
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}


//setter
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	/**
	 * @return the aware
	 */
	public boolean isAware() {
		return aware;
	}



	/**
	 * @param aware the aware to set
	 */
	public void setAware(boolean aware) {
		this.aware = aware;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
