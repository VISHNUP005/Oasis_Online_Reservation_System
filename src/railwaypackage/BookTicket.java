package railwaypackage;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class BookTicket extends JFrame {

	private JPanel contentPane;
	private JTextField fromfield;
	private JTextField tofield;
	private JTextField datefield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookTicket frame = new BookTicket();
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
	public BookTicket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 463);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(170, 29, 69, 62);
		contentPane.add(lblNewLabel_1);
		MySqlConnection sqlc=new MySqlConnection();

		Connection con=sqlc.getConnection();
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/images/t1.png")));
		
		JLabel lblNewLabel = new JLabel("BlueRail.com");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(23, 50, 139, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("From:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_2.setBounds(78, 162, 69, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("To:");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_2_1.setBounds(78, 214, 55, 29);
		contentPane.add(lblNewLabel_2_1);
		
		fromfield = new JTextField();
		fromfield.setBounds(178, 166, 194, 29);
		contentPane.add(fromfield);
		fromfield.setColumns(10);
		
		tofield = new JTextField();
		tofield.setColumns(10);
		tofield.setBounds(178, 218, 194, 29);
		contentPane.add(tofield);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
				
				Listtrain t=new Listtrain();
				t.setVisible(true);
				String fromplace=fromfield.getText();
				String toplace=tofield.getText();
				t.setvalues(fromplace,toplace);
			}
		});
		btnNewButton.setBounds(333, 329, 94, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Date:");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_2_1_1.setBounds(78, 268, 55, 29);
		contentPane.add(lblNewLabel_2_1_1);
		
		datefield = new JTextField();
		datefield.setColumns(10);
		datefield.setBounds(178, 272, 194, 29);
		contentPane.add(datefield);
		
		JButton Backbtn = new JButton("Back");
		Backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage h1=new Homepage();
				h1.setVisible(true);
			}
		});
		Backbtn.setBounds(88, 332, 94, 29);
		contentPane.add(Backbtn);
	}
}

class MySqlConnection
{
    private static String dbUrl = "jdbc:mysql:// localhost:3306/";
    private static String dbUsername = "root";
    private static String dbPassword = "SYSTEM";
    private static String dbName = "trainreservation";

    public  Connection getConnection()
    {
        Connection connection = null;
        try {
            
            connection = DriverManager.getConnection(dbUrl+ dbName, dbUsername, dbPassword);
        } catch (SQLException e) {
            System.out.println("Could not connect to DB: " + e.getMessage());
        }
        return connection;
    }
}
