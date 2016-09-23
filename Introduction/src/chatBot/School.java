package chatBot;

public class School implements Topic {
	
	private boolean inSchoolLoop;
	private String schoolsResponse;
	
	public void talk() {
		inSchoolLoop = true;
		while (inSchoolLoop) {
			VickiMain.print("Tell me about school.");
			schoolsResponse = VickiMain.getInput();
			if (schoolsResponse.indexOf("Stop") >= 0) {
				inSchoolLoop = false;
				VickiMain.talkForever();
			}
			VickiMain.print("That's my favorite part about school too.");
		}

	}

}
