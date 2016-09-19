package introUnit;

public class Student {
	//fields
	private String name;
	//constructor (no return type, it creates students) has to be the name of the class
	public Student(String name) {
		//initialize fields
		this.name = name;
	}
	public void talk() {
		System.out.println("Hi, my name is " + name + ".");
	}
}
