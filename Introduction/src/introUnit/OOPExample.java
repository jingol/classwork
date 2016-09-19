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
		Student jillian = new Senior("Jillian");
		Student joseph = new Student("Joseph");
		Student jordan = new Student("Jordan");
		jillian.talk();
		joseph.talk();
		jordan.talk();
	}

}
