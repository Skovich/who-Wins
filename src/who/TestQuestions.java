package who;
import java.util.ArrayList;
import java.util.List;

public class TestQuestions {
	private List<Question> list;

	public TestQuestions() throws Exception {
		list = new ArrayList<>();

		Answer Answer1 = new Answer("2000", true);
		Answer Answer2 = new Answer("2001", false);
		Answer Answer3 = new Answer("2002", false);
		Answer Answer4 = new Answer("2003", false);

		Question question = new Question("Question", Answer1, Answer2, Answer3, Answer4);

		Answer Answer11 = new Answer("2000", false);
		Answer Answer22 = new Answer("2001", false);
		Answer Answer33 = new Answer("2002", false);
		Answer Answer44 = new Answer("2003", true);

		Question question1 = new Question("Question", Answer11, Answer22, Answer33, Answer44);

		list.add(question1);
		list.add(question);
		
		
		
		
		Answer Answer111 = new Answer("2000", true);
		Answer Answer222 = new Answer("2001", false);
		Answer Answer333 = new Answer("2002", false);
		Answer Answer444 = new Answer("2003", false);

		Question question3 = new Question("Question", Answer111, Answer222, Answer333, Answer444);
		
		
		
		
		
		Answer Answer111s = new Answer("2000", true);
		Answer Answer222s = new Answer("2001", false);
		Answer Answer333s = new Answer("2002", false);
		Answer Answer444s = new Answer("2003", false);

		Question question3s = new Question("Question", Answer111s, Answer222s, Answer333s, Answer444s);
		
		
		list.add(question3);
		
		list.add(question3s);
		
		
		
		

	}

	public List<Question> getList() {

		return list;
	}

}
