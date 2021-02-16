package who;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Execut {
	  List<Question> questions;
	 List<JFrame> list;
 boolean execute = false ; 

	public Execut(List<Question> que) throws Exception {
		questions = que;
		list = new ArrayList<>();
		for (Question q : questions) {
			SecondScreen second = new SecondScreen(q);
			JFrame tmp = second.initialize();
			list.add(tmp); 

		}

	}

	public static void main(String[] args) throws Exception {
		TestQuestions x = new TestQuestions();
		Execut execut = new Execut(x.getList());
		
		
		FirstScreen first = new FirstScreen();
		JFrame firstFrame = first.initialize();
		firstFrame.setVisible(true);
		
		
	l1:	while(!first.toSecond) {
		
System.out.println(first.toSecond);
			
		}
//		
firstFrame.setVisible(false);
		
		
		
	for(Question q : execut.questions) {
		SecondScreen tmp = new SecondScreen(q) ;
		JFrame frame = tmp.initialize();
		frame.setVisible(true);
		while(!tmp.nextyes) {
			
			
		}
		
		frame.setVisible(false);
		
	
			
			
			
			
		
		
	}
		

	}

}
