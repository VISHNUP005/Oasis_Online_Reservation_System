package railwaypackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class CancelTicket extends JFrame {

	private JPanel contentPane;
	private JTextField pnrfield;
	public JLabel msg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelTicket frame = new CancelTicket();
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
	public CancelTicket() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 387);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter your PNR NO.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Vishnu Prasad\\OneDrive\\Desktop\\t1.png"));
		lblNewLabel.setBounds(73, 62, 390, 47);
		contentPane.add(lblNewLabel);
		
		pnrfield = new JTextField();
		pnrfield.setFont(new Font("Times New Roman", Font.ITALIC, 38));
		pnrfield.setHorizontalAlignment(SwingConstants.CENTER);
		pnrfield.setBounds(135, 146, 281, 47);
		contentPane.add(pnrfield);
		pnrfield.setColumns(10);
		MySqlConnection sqlc=new MySqlConnection();
		Connection con=sqlc.getConnection();
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pnr_no=pnrfield.getText();

				try {
					Statement stmt=con.createStatement();
					String sql="delete from confirmticket where pnr_no='"+pnr_no+"'";	
					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(null,"Ticket Cancel Successfull!");
					msg.setText("Your Ticket Amount will be refunded with 48hrs ");
				
					
					
				}
				catch(SQLException e1) {
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(351, 258, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnHome = new JButton("Home");
		btnHome.setForeground(Color.YELLOW);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage hm=new Homepage();
				hm.setVisible(true);
			}
		});
		btnHome.setBackground(Color.BLACK);
		btnHome.setBounds(102, 258, 89, 23);
		contentPane.add(btnHome);
		
		msg = new JLabel("");
		msg.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		msg.setHorizontalAlignment(SwingConstants.CENTER);
		msg.setBounds(84, 308, 373, 31);
		contentPane.add(msg);
	}

}
