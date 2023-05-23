package railwaypackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class showpnr extends JFrame {

	private JPanel contentPane;
	private JTextField pnrfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showpnr frame = new showpnr();
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
	public showpnr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 315);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your PNR NO is ");
		lblNewLabel.setBackground(SystemColor.inactiveCaption);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblNewLabel.setBounds(82, 37, 347, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Vishnu Prasad\\OneDrive\\Desktop\\t1.png"));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_1.setBounds(119, 126, 70, 39);
		contentPane.add(lblNewLabel_1);
		
		pnrfield = new JTextField();
		pnrfield.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		pnrfield.setHorizontalAlignment(SwingConstants.CENTER);
		pnrfield.setText("123456");
		pnrfield.setBackground(Color.BLACK);
		pnrfield.setForeground(Color.CYAN);
		pnrfield.setBounds(119, 126, 294, 39);
		contentPane.add(pnrfield);
		pnrfield.setColumns(10);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage hm=new Homepage();
				hm.setVisible(true);
			}
		});
		btnNewButton.setBounds(182, 217, 89, 23);
		contentPane.add(btnNewButton);
	}

	public void setpnrno(String pnr_no) {
		pnrfield.setText(pnr_no);
		// TODO Auto-generated method stub
		
	}
}
