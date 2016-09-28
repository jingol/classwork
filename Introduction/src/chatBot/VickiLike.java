package chatBot;

public class VickiLike implements Topic{
	private boolean inLikeLoop;
	private String likeResponse; 
	
	public void talk() {
		
		VickiMain.print("What are some things you like?");
		inLikeLoop = true;
		while (inLikeLoop) { 
			likeResponse = VickiMain.getInput();
			int likePsn = VickiMain.findKeyword(likeResponse, "like", 0);
			if (likePsn >= 0) {
				String thingsLiked = likeResponse.substring(likePsn + 5);
				VickiMain.print("You are such an interesting person because you like " + thingsLiked);
				if(VickiMain.findKeyword(thingsLiked, "school", 0) >= 0) {
					inLikeLoop = false;
					VickiMain.school.talk();
				}
				else {
					inLikeLoop = false;
					VickiMain.talkForever();
				}
			}
			else {
				VickiMain.print("I don't understand you");
			}
		}
	}
	public boolean isTriggered(String userInput) {
		if (VickiMain.findKeyword(userInput, "like", 0) >= 0) {
			return true;
		}
		return false;
	}

}
