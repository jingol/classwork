/**
 * 
 */
package introUnit;

/**
 * @author Student6
 *
 */
public class Senior extends Student {
	private String internship;
	/**
	 * @param name
	 */
	public Senior(String name, String internship) {
		super(name);
		this.internship = internship;
		/** super is a constructor
		 * the word super makes it go to the Student class
		 * a senior is a student but it cannot exist without being a student first so 
		 * you must establish the fact that senior is a superclass of student
		**/
	}
	public void talk(){
		super.talk(); // calls the super method
		System.out.println("... and I am a senior!");
		System.out.println("I intern as a "+ internship + ".");
	}
}
