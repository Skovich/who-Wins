package who;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
public class FirstScreen {

	private JFrame frame;
	private JTextField txtName;
	static boolean toSecond = false ; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstScreen window = new FirstScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public FirstScreen() throws IOException {

		


		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	public JFrame initialize() throws IOException {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\MSI\\Documents\\klausur\\Who Wins\\images\\logo.png"));
		frame.setBounds(100, 100, 1330, 746);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("images/background.jpg")))));
		
		JLabel lblNewLabel = new JLabel("Welcome to The Game");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 86));
		lblNewLabel.setBounds(213, 11, 902, 223);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PLAY");
		
		btnNewButton.setBounds(510, 346, 237, 67);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(510, 485, 237, 67);
		frame.getContentPane().add(btnNewButton_1);
		
		txtName = new JTextField();
		txtName.setText("Name : ");
		txtName.setBounds(510, 282, 237, 48);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtName.getText() ; 
				if (name.equals("Name : ")||name.isEmpty() || name.equals("Enter Your name To play") )  {
					txtName.setText("Enter Your name To play");
					
					toSecond = true ; 
					
				}
				
				else {
					
					toSecond = true ; 
					
					
				}
			}
		});
		
		return frame ; 
	}
}
