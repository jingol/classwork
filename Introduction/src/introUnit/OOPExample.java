/**
 * 
 */
package introUnit;

/**
 * @author Student6
 * This class is designed to contrast with the ProceduralExample.
 * It embodies an Object-Oriented approach.
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// construct a student
		Student jillian = new Senior("Jillian", "Programmer");
		/** a senior is a student but not all students are seniors
		* can have Senior craig = new Senior("Craig"); 
		* but cant have Senior craig = Student("Craig");
		**/
		Student joseph = new Sophomore("Joseph", "Software");
		Student jordan = new Junior("Jordan", "stressed");
		jillian.talk();
		// cannot cast an object into a superclass bc that stuff is encapsulated inside its superclass
		// YOU CANNOT ACCESS A SUPERCLASS FROM A SUBCLASS
		// ((Student)jillian).talk();
		joseph.talk();
		jordan.talk();
	}

}
