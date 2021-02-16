package who;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question {
	private final String Question;
	private List<Answer> Answer;

	public Question(String Question, Answer Answer1, Answer Answer2, Answer Answer3, Answer Answer4) throws Exception {
		this.Question = Question;
		Answer = new ArrayList<>();
		Answer.add(Answer1);
		Answer.add(Answer2);
		Answer.add(Answer3);
		Answer.add(Answer4);
		int i = 0;
		for (Answer a : Answer) {
			if (a.isTrueAnswer())
				i++;

		}
		if (i > 1)
			throw new Exception("there is more then one true Answer");

	}
	
	
	

	public String getQuestion() {
		return Question;
	}




	public List<Answer> getAnswer() {
		return Answer;
	}
	
	
	public int getTrueAnswerNum() {
		
		for(int i=0 ; i<4 ; i++) {
			Answer tmp = Answer.get(i);
			if(tmp.isTrueAnswer()) {
				return i ; 
				
				
			}
			
			
		}
		return 0 ; 
		
	}




	public Answer getTrueAnswer() throws Exception {

		for (Answer a : Answer) {

			if (a.isTrueAnswer())
				return a;

		}

		throw new Exception("no Valid Answer");
	}
	
	
	@Override
	public String toString() {
		String AnswerOnString = "" ; 
			for (int i=1 ; i<5 ; i++) {
				AnswerOnString+="Answer"+i+" is :" + Answer.get(i-1).getAnswer()+System.lineSeparator() ;
				
				
			}
		
		
		return "Question is :" + Question + System.lineSeparator() +AnswerOnString ;
	}
	

	public static void main(String[] args) throws Exception {
		Answer Answer1 = new Answer("2000", true);
		Answer Answer2 = new Answer("2001", false);
		Answer Answer3 = new Answer("2002", false);
		Answer Answer4 = new Answer("2003", false);
		
	Question question= new Question("Waktech touled Skander" , Answer1, Answer2, Answer3, Answer4);
	System.out.println(question.getTrueAnswerNum());
	
	

	}

}
