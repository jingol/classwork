package chatBot;

public class VickiHello implements Topic {
	
	private boolean inHelloLoop;
	private String helloResponse;
	private int helloCount;
	
	private static String[] calmResponses = {"We've already said our hello's. Remember?", "Yes, hello to you"
			+ " too.", "Let's actually talk!"};
	private static String[] angryResponses = {"Seriously, this has to stop.", "You are beginning to annoy"
			+ " me.", "WE'VE ALREADY SAID HELLO."};
	
	public VickiHello() {
		helloCount = 0;
	}
	public void talk() {
		inHelloLoop = true;
		while (inHelloLoop) {
			helloCount++;
			printResponse();
			helloResponse = VickiMain.getInput();
			if (!isTriggered(helloResponse)) {
				inHelloLoop = false;
				VickiMain.talkForever();
			}
		}
	}
	private void printResponse() {
		int responseIndex = 0;
		if(helloCount < 3) {
			responseIndex = (int)(Math.random()*calmResponses.length);
			VickiMain.print(calmResponses[responseIndex]);
		}
		else {
			responseIndex = (int)(Math.random()*angryResponses.length);
			VickiMain.print(angryResponses[responseIndex]);
		}
	}
	public boolean isTriggered(String userInput) {
		if (VickiMain.findKeyword(userInput, "hi", 0) >= 0) {
			return true;
		}
		if (VickiMain.findKeyword(userInput, "hello", 0) >= 0) {
			return true;
		}
		return false;
	}

}
