package railwaypackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class BookTicketHome extends JFrame {

	private JPanel contentPane;
	private JTextField Trainno;
	private JTextField trainname;
	private JTextField passengername;
	private JTextField age;
	private JTextField mobileno;
	private JTextField fromplace;
	private JTextField toplace;
	private JTextField pricemoney;
	public String train_class;
	public String train_No;
	public String train_Name;
	public String passenger_name;
	public String Age;
	public String mobile_no;
	public String from_place;
	public String to_place;
	public String price;
	public String pnr_no;
	public String classtype;
	
	private ButtonGroup bg=new ButtonGroup();
	private JTextField date1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookTicketHome frame = new BookTicketHome();
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
	public BookTicketHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 569);
		
		
		
		

		MySqlConnection sqlc=new MySqlConnection();
		Connection con=sqlc.getConnection();
		
		
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Train No:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 55, 79, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Train:");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(20, 93, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Passenger Name:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(20, 126, 144, 24);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Age:");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(20, 161, 79, 24);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Mobile No:");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(20, 207, 92, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("From:");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(20, 246, 79, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("To:");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(20, 284, 79, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("Class:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBounds(20, 322, 79, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1);
		
		
		Trainno = new JTextField();
		Trainno.setBounds(174, 51, 188, 27);
		contentPane.add(Trainno);
		Trainno.setColumns(10);
		
		trainname = new JTextField();
		trainname.setColumns(10);
		trainname.setBounds(174, 89, 188, 27);
		contentPane.add(trainname);
		
		passengername = new JTextField();
		passengername.setColumns(10);
		passengername.setBounds(174, 127, 188, 27);
		contentPane.add(passengername);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(174, 165, 188, 27);
		contentPane.add(age);
		
		mobileno = new JTextField();
		mobileno.setColumns(10);
		mobileno.setBounds(174, 203, 188, 27);
		contentPane.add(mobileno);
		
		fromplace = new JTextField();
		fromplace.setColumns(10);
		fromplace.setBounds(174, 242, 188, 27);
		contentPane.add(fromplace);
		
		toplace = new JTextField();
		toplace.setColumns(10);
		toplace.setBounds(174, 280, 188, 27);
		contentPane.add(toplace);
		
		pricemoney = new JTextField();
		pricemoney.setColumns(10);
		pricemoney.setBounds(174, 432, 188, 27);
		contentPane.add(pricemoney);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Price:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setBounds(20, 436, 79, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1);
		
		JRadioButton class1A = new JRadioButton("1 A");
		class1A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				from_place=fromplace.getText();
				to_place=toplace.getText();
				train_class="1A";
				classtype="1A";
				
			
				try {
					PreparedStatement st = con.prepareStatement(" select * from classdetails where fromplace12='"+from_place+"' && toplace='"+to_place+"'&& class_name='1A'");
					ResultSet r1 = st.executeQuery();
					
					while(r1.next()) {	
						
						int price=r1.getInt("class_price");
						System.out.println(price);
						String price1=Integer.toString(price);
						pricemoney.setText(price1);
						
						
						
					}
					
					
				}
				catch(SQLException e1) {
					System.out.println(e1);
				}
				
				
				
			}
		});
		class1A.setBounds(174, 320, 111, 23);
		contentPane.add(class1A);
		
		JRadioButton class2A = new JRadioButton("2 A");
		class2A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				from_place=fromplace.getText();
				to_place=toplace.getText();
			
				classtype="2A";
				
				
			
				try {
					PreparedStatement st = con.prepareStatement(" select * from classdetails where fromplace12='"+from_place+"' && toplace='"+to_place+"'&& class_name='2A'");
					ResultSet r1 = st.executeQuery();
					
					while(r1.next()) {	
						
						int price=r1.getInt("class_price");
						System.out.println(price);
						String price1=Integer.toString(price);
						pricemoney.setText(price1);
						
						
						
					}
					
					
				}
				catch(SQLException e1) {
					System.out.println(e1);
				}
				
			}
		});
		class2A.setBounds(174, 349, 111, 23);
		contentPane.add(class2A);
		
		JRadioButton classsleeper = new JRadioButton("Sleeper");
		classsleeper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				from_place=fromplace.getText();
				to_place=toplace.getText();
				
				classtype="Sleeper";
				
			
				try {
					PreparedStatement st = con.prepareStatement(" select * from classdetails where fromplace12='"+from_place+"' && toplace='"+to_place+"'&& class_name='Sleeper'");
					ResultSet r1 = st.executeQuery();
					
					while(r1.next()) {	
						
						int price=r1.getInt("class_price");
						
						String price1=Integer.toString(price);
						pricemoney.setText(price1);
						
						
						
					}
					
					
				}
				catch(SQLException e1) {
					System.out.println(e1);
				}
				
			}
		});
		classsleeper.setBounds(299, 320, 111, 23);
		contentPane.add(classsleeper);
		
		JRadioButton class3A = new JRadioButton("3 A");
		class3A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				from_place=fromplace.getText();
				to_place=toplace.getText();
				
				classtype="3A";
				
				
			
				try {
					PreparedStatement st = con.prepareStatement(" select * from classdetails where fromplace12='"+from_place+"' && toplace='"+to_place+"'&& class_name='3A'");
					ResultSet r1 = st.executeQuery();
					
					while(r1.next()) {	
						
						int price=r1.getInt("class_price");
						System.out.println(price);
						String price1=Integer.toString(price);
						pricemoney.setText(price1);
						
						
						
					}
					
					
				}
				catch(SQLException e1) {
					System.out.println(e1);
				}
				
			}
		});
		class3A.setBounds(299, 349, 111, 23);
		contentPane.add(class3A);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(85, 487, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				train_No=Trainno.getText();
				train_Name=trainname.getText();
				passenger_name=passengername.getText();
				Age=age.getText();
				mobile_no=mobileno.getText();
				from_place=fromplace.getText();
				to_place=toplace.getText();
				price=pricemoney.getText();
				String date12=date1.getText();
				 int pnr=(int) (Math.random()*1000000);
					System.out.println(pnr);
					String pnr_no=Integer.toString(pnr);
				
				
				
				
				
				
				
				
				
				try {
					Statement stmt=con.createStatement();
					String sql="insert into confirmticket values('"+pnr_no+"','"+passenger_name+"','"+Age+"','"+date12+"','"+classtype+"','"+mobile_no+"','"+from_place+"','"+to_place+"');";		
					stmt.executeUpdate(sql);
					System.out.println("Successfull !!");
				
					
					
				}
				catch(SQLException e1) {
					System.out.println(e1);
				}
				
				
				showpnr sh=new showpnr();
				sh.setpnrno(pnr_no);
				sh.setVisible(true);
				
				
				
				
				
				
			}
		});
		btnBook.setBounds(214, 487, 89, 23);
		contentPane.add(btnBook);
		
		JButton btnNewButton_1_1 = new JButton("Reset");
		btnNewButton_1_1.setBounds(341, 487, 89, 23);
		contentPane.add(btnNewButton_1_1);
		bg.add(class1A);
		bg.add(class3A);
		bg.add(classsleeper);
		bg.add(class2A);
		
		JButton btnNewButton_1 = new JButton("Find");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String Train_no=Trainno.getText();
			try {
				PreparedStatement st = con.prepareStatement("select * from traindetails where train_no='"+Train_no+"'");
				ResultSet r1 = st.executeQuery();
				
				while(r1.next()) {	
					
					String name=r1.getString("train_name");
					String fromplace1=r1.getString("fromplace");
					String toplace1=r1.getString("toplace");
					 trainname.setText(name);
					 fromplace.setText(fromplace1);
					 toplace.setText(toplace1);
					
					
					
				}
				
				
			}
			catch(SQLException e1) {
				System.out.println(e1);
			}
				///////////////////////
			}
		});
		btnNewButton_1.setBounds(372, 53, 89, 23);
		contentPane.add(btnNewButton_1);
		
		date1 = new JTextField();
		date1.setColumns(10);
		date1.setBounds(174, 394, 188, 27);
		contentPane.add(date1);
		
		JLabel datelbl = new JLabel("Date:");
		datelbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		datelbl.setBounds(20, 400, 79, 14);
		contentPane.add(datelbl);
		
		
		
		
		
		
		
		
		
		
		
		
}

	public void setdetails() {
		/////////////////////////////////////////////
		System.out.println("Methos from Book ticket");
		
	}
}

