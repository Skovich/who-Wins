package who;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;

public class SecondScreen {
	static int score = 0;
	boolean gotoNext = false;
	boolean nextyes = false;

	private JFrame frame;
	Question question;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SecondScreen window = new SecondScreen();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 * 
	 * @throws Exception
	 */
	public SecondScreen(Question question) throws Exception {

		this.question = question;

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	public JFrame initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 1330, 746);
		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("images/background.jpg")))));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setTitle("Who Wins the Million");
		frame.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		frame.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\logo.png"));
		frame.setBounds(100, 100, 1330, 746);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("images/background.jpg")))));
		frame.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("File");

		JMenuItem menuItemExit = new JMenuItem(new AbstractAction("Exit") {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}

		});

		menuFile.add(menuItemExit);

		menuBar.add(menuFile);

		// adds menu bar to the frame
		frame.setJMenuBar(menuBar);
		setQuestions();
		return frame;
	}

	public void setQuestions() {

		Question q = question;

		JButton answer1 = new JButton("");
		JButton answer2 = new JButton("");
		JButton answer3 = new JButton("");
		JButton answer4 = new JButton("");
		answer4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (question.getAnswer().get(3).isTrueAnswer()) {
					answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));

					score++;

				} else {

					answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\false.png"));
					int trueAnswer = question.getTrueAnswerNum();
					switch (trueAnswer) {
					case 0:
						answer1.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 1:
						answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 2:
						answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 3:
						answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;

					}

				}
				gotoNext = true;

			}
		});
		answer2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (question.getAnswer().get(1).isTrueAnswer()) {
					answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));

					score++;

				} else {

					answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\false.png"));
					int trueAnswer = question.getTrueAnswerNum();
					switch (trueAnswer) {
					case 0:
						answer1.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 1:
						answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 2:
						answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 3:
						answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;

					}

				}

				gotoNext = true;

			}
		});

		answer3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (question.getAnswer().get(2).isTrueAnswer()) {
					answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));

					score++;

				} else {

					answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\false.png"));
					int trueAnswer = question.getTrueAnswerNum();
					switch (trueAnswer) {
					case 0:
						answer1.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 1:
						answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 2:
						answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 3:
						answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;

					}

				}

				gotoNext = true;

			}
		});

		answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\reponsen.png"));

		answer1.setOpaque(false);
		answer1.setContentAreaFilled(false);
		answer1.setBorderPainted(false);

		answer3.setOpaque(false);
		answer3.setContentAreaFilled(false);
		answer3.setBorderPainted(false);

		answer4.setOpaque(false);
		answer4.setContentAreaFilled(false);
		answer4.setBorderPainted(false);

		answer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (question.getAnswer().get(0).isTrueAnswer()) {
					answer1.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));

					score++;

				} else {

					answer1.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\false.png"));
					int trueAnswer = question.getTrueAnswerNum();
					switch (trueAnswer) {
					case 0:
						answer1.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
					case 1:
						answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
					case 2:
						answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
					case 3:
						answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));

					}

				}
				gotoNext = true;
			}
		});

		answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\reponsen.png"));

		answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\reponsen.png"));

		answer1.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\reponsen.png"));

		answer2.setContentAreaFilled(false);
		answer2.setBorderPainted(false);

//		JButton button = new JButton("Edit"); 

		answer1.setBounds(661, 490, 385, 143);
		answer2.setBounds(661, 342, 385, 143);
		answer3.setBounds(97, 361, 431, 83);
		answer4.setBounds(97, 515, 431, 83);

		JLabel ans1 = new JLabel(q.getAnswer().get(0).getAnswer());
		ans1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question.getAnswer().get(0).isTrueAnswer()) {
					answer1.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));

					score++;

				}

				else {

					answer1.setIcon(
							new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\reponsen.png"));
					int trueAnswer = question.getTrueAnswerNum();
					switch (trueAnswer) {
					case 0:
						answer1.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
					case 1:
						answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
					case 2:
						answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
					case 3:
						answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));

					}

				}
				gotoNext = true;
			}
		});

		JLabel ans2 = new JLabel(q.getAnswer().get(1).getAnswer());
		ans2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (question.getAnswer().get(1).isTrueAnswer()) {
					answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));

					score++;

				} else {

					answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\false.png"));
					int trueAnswer = question.getTrueAnswerNum();
					switch (trueAnswer) {
					case 0:
						answer1.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 1:
						answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 2:
						answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 3:
						answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;

					}

				}
				gotoNext = true;
			}
		});

		JLabel lblNewLabel = new JLabel(q.getQuestion());
		lblNewLabel.setFont(new Font("Traditional Arabic", Font.PLAIN, 40));
		lblNewLabel.setBounds(354, 82, 647, 124);
		frame.getContentPane().add(lblNewLabel);

		JLabel ans3 = new JLabel(q.getAnswer().get(2).getAnswer());
		ans3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (question.getAnswer().get(2).isTrueAnswer()) {
					answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));

					score++;

				} else {

					answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\false.png"));
					int trueAnswer = question.getTrueAnswerNum();
					switch (trueAnswer) {
					case 0:
						answer1.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 1:
						answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 2:
						answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 3:
						answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;

					}

				}
				gotoNext = true;
			}
		});

		ans3.setToolTipText("");
		ans3.setBounds(238, 347, 364, 97);
		frame.getContentPane().add(ans3);

		JLabel ans4 = new JLabel(q.getAnswer().get(3).getAnswer());
		ans4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (question.getAnswer().get(3).isTrueAnswer()) {
					answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));

					score++;

				} else {

					answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\false.png"));
					int trueAnswer = question.getTrueAnswerNum();
					switch (trueAnswer) {
					case 0:
						answer1.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 1:
						answer2.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 2:
						answer3.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;
					case 3:
						answer4.setIcon(new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\rr.png"));
						break;

					}

				}
				gotoNext = true;
			}
		});

		ans4.setToolTipText("");
		ans4.setBounds(238, 515, 364, 97);
		frame.getContentPane().add(ans4);
		ans2.setBounds(792, 384, 254, 60);
		frame.getContentPane().add(ans2);
		ans1.setToolTipText("");
		ans1.setLabelFor(answer1);
		ans1.setBounds(792, 515, 364, 97);
		frame.getContentPane().add(ans1);
		frame.getContentPane().add(answer1);
		frame.getContentPane().add(answer2);
		frame.getContentPane().add(answer3);
		frame.getContentPane().add(answer4);

		JLabel questionLabel = new JLabel("");
		questionLabel.setIcon(
				new ImageIcon("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\kyv97bareurlq2uyik1s.png"));
		questionLabel.setBounds(48, 21, 1078, 257);
		frame.getContentPane().add(questionLabel);

		JLabel Scorei = new JLabel("Your Score is : " + score);
		Scorei.setBounds(1119, 11, 151, 69);
		frame.getContentPane().add(Scorei);

		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (gotoNext) {

					nextyes = true;

				}
			}
		});
		btnNewButton.setBounds(1115, 331, 119, 40);
		frame.getContentPane().add(btnNewButton);

	}

}
