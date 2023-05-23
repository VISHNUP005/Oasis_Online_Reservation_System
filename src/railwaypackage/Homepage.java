package railwaypackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Homepage extends JFrame {

	private JPanel contentPane;
	private JTextField txtFreeCancelationPolicy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 428);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BlueRail.com");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(32, 33, 139, 29);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Buy Tickets");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginrailway l=new Loginrailway();
				l.setVisible(true);
			}
		});
		btnNewButton.setBounds(217, 133, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCencelTickets = new JButton("Cancel Ticket");
		btnCencelTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelTicket ct=new CancelTicket();
				ct.setVisible(true);
			}
		});
		btnCencelTickets.setBounds(217, 181, 127, 23);
		contentPane.add(btnCencelTickets);
		
//		ImageIcon img=new ImageIcon(this.getClass().getResource("/train.jpeg"));
		
		txtFreeCancelationPolicy = new JTextField();
		txtFreeCancelationPolicy.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtFreeCancelationPolicy.setHorizontalAlignment(SwingConstants.CENTER);
		txtFreeCancelationPolicy.setForeground(Color.YELLOW);
		txtFreeCancelationPolicy.setBackground(Color.BLACK);
		txtFreeCancelationPolicy.setText("Introducing Free Cancelation Policy with 100% Refundment");
		txtFreeCancelationPolicy.setBounds(60, 249, 459, 46);
		contentPane.add(txtFreeCancelationPolicy);
		txtFreeCancelationPolicy.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(165, 11, 69, 62);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/images/t1.png")));
	}
}
