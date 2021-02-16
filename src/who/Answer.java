package who;

public class Answer {
	private final String answer;
	private final boolean trueAnswer;

	public Answer(String answer, boolean trueAnswer) {
		this.answer = answer;
		this.trueAnswer = trueAnswer;

	}

	public String getAnswer() {
		return answer;
	}

	public boolean isTrueAnswer() {
		return trueAnswer;
	}
	
	

}
