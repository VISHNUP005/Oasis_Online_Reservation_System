package railwaypackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listtrain extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	
	String fromplacedetails,toplacedetails;/////////////////////////////////////
	
	public void setvalues(String fromplace,String toplace) {
		MySqlConnection sqlc=new MySqlConnection();

		Connection con=sqlc.getConnection();
		fromplacedetails=fromplace;
		toplacedetails=toplace;

		
		try {
			Statement stmt=con.createStatement();
			
			PreparedStatement st = con.prepareStatement("select * from traindetails where fromplace='"+fromplacedetails+"' && toplace='"+toplace+"'; ");
			ResultSet r1 = st.executeQuery();
			while(r1.next()) {
				
				
				 String trainno=r1.getString("train_no") ;
			 String trainname=r1.getString("train_name");
				 String from_place=r1.getString("fromplace");
				 String to_place=r1.getString("toplace");
				 String Time=r1.getString("time1");
				String data[]= {trainno,trainname,Time};
				
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(data);
				
			}
			System.out.println("Successfull !!");
		
			
			
		}
		catch(SQLException e1) {
			System.out.println(e1);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listtrain frame = new Listtrain();
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
	public Listtrain() {
		
		
		
	
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Vishnu Prasad\\OneDrive\\Desktop\\t1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 442);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 107, 453, 213);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Train No", "Train", "Time"
			}
		));
		
		
		JLabel lblNewLabel = new JLabel("Please Note The Train No.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 25, 451, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookTicket b1=new BookTicket();
				b1.setVisible(true);
			}
		});
		btnNewButton.setBounds(52, 355, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookTicketHome b1=new BookTicketHome();
				b1.setdetails();
				b1.setVisible(true);
			}
		});
		btnContinue.setBounds(410, 355, 89, 23);
		contentPane.add(btnContinue);
	}
}
