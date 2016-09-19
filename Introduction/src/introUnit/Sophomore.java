package introUnit;

public class Sophomore extends Student {
	private String major;
	public Sophomore(String name, String major) {
		super(name);
		this.major = major;
		// TODO Auto-generated constructor stub
	}
	public void talk(){
		super.talk();
		System.out.println("I am a sophomore");
		System.out.println("and I joined the " + major + " major.");
	}

}
