package introUnit;

public class Junior extends Student {
	private String mood;
	public Junior(String name, String mood) {
		super(name);
		this.mood = mood;
		// TODO Auto-generated constructor stub
	}
	public void talk(){
		super.talk();
		System.out.println("I am a junior");
		System.out.println("... and I am " + mood);
	}
}
