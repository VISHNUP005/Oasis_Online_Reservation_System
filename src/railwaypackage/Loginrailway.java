package railwaypackage;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loginrailway extends JFrame {

	private JPanel contentPane;
	private JTextField txtHello;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginrailway frame = new Loginrailway();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Loginrailway() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 424);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(245, 24, 57, 64);
		contentPane.add(lblNewLabel);
		
		
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/images/l1.png")));
		
		txtHello = new JTextField();
		txtHello.setHorizontalAlignment(SwingConstants.CENTER);
		txtHello.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		txtHello.setBounds(133, 118, 310, 38);
		contentPane.add(txtHello);
		txtHello.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String uname,password;
				uname=txtHello.getText();
				password=passwordField.getText();
				
			if(uname.equals("vishnu")&&password.equals("123456789")) {
				JOptionPane.showMessageDialog(null,"Login Sucessful");
				BookTicket book=new BookTicket();
				book.setVisible(true);
				
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Login Failed");
			}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(232, 269, 89, 31);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(133, 180, 310, 38);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("User:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 21));
		lblNewLabel_1.setBounds(52, 128, 57, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.ITALIC, 21));
		lblNewLabel_1_1.setBounds(26, 190, 97, 21);
		contentPane.add(lblNewLabel_1_1);
	}
}
