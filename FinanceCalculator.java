
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;




public class A1 extends JFrame implements ItemListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JComboBox<String> dropDown1;
	
	public JPanel currentRatioPanel;
	public JPanel workingCapitalRatioPanel;
	public JPanel debtToEquityRatioPanel;
	public JPanel grossProfitMarginRatioPanel;
	
	public JPanel midPanel2;
	
	public JPanel tab2Panel;
	final static String CURRENTRATIOPANEL = "CurrentRatio";
	final static String WORKINGCAPITALRATIOPANEL = "WorkingCapitalRatio";
	final static String DEBTTOEQUITYRATIOPANEL = "DebtToEquityRatio";
	final static String GROSSPROFITMARGINRATIO = "GrossProfitMarginRatio";
	
	//tab1
	public static JButton button1;
	public static JTextField text1;
	public static JTextField text2;
	public static JTextField text3;
	public static JLabel label4;	
	public static JButton button2;
	
	//tab2
	public static JLabel label5;
	public static JLabel label6;
	public static JLabel label7;
	public static JLabel label8;
	
	public static JTextField text4;
	public static JTextField text5;
	public static JButton button3;
	
	public static JTextField text6;
	public static JTextField text7;
	public static JButton button4;
	
	public static JTextField text8;
	public static JTextField text9;
	public static JButton button5;
	
	public static JTextField text10;
	public static JTextField text11;
	public static JButton button6;
	
	

	public A1(String title) {
		super(title);
		this.setSize(500, 500);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.CYAN));
		
		Container mainContainer = this.getContentPane();
		
		
		
		//tab1 labels,buttons,fields
		JLabel label1 = new JLabel("Amount");
		JLabel label2 = new JLabel("Number of years");
		JLabel label3 = new JLabel("Interest");
		label4 = new JLabel("<html><span style='font-size:20px'>"+"OUTPUT"+"</span></html>");
		
		
		Clicklistener click= new Clicklistener();
		button1 = new JButton("Future");
		button1.addActionListener(click);
		
		
		button2 = new JButton("Present");
		button2.addActionListener(click);
		
		text1 = new JTextField();
		text2 = new JTextField();
		text3 = new JTextField();
		
		
		//tab2 labels,buttons,fields
		label5 = new JLabel("OUTPUT");
		label6 = new JLabel("OUTPUT");
		label7 = new JLabel("OUTPUT");
		label8 = new JLabel("OUTPUT");
		
		JLabel label9 = new JLabel("Current Assets");
		JLabel label10 = new JLabel("Current Liabilities");
		text4 = new JTextField();
		text5 = new JTextField();
		button3 = new JButton("Calculate");
		button3.addActionListener(click);
		
		JLabel label11 = new JLabel("Revenue");
		JLabel label12 = new JLabel("Avg. Working Capital");
		text6 = new JTextField();
		text7 = new JTextField();
		button4 = new JButton("Calculate");
		button4.addActionListener(click);
		
		JLabel label13 = new JLabel("Total Debt");
		JLabel label14 = new JLabel("Total Equity");
		text8 = new JTextField();
		text9 = new JTextField();
		button5 = new JButton("Calculate");
		button5.addActionListener(click);
		
		JLabel label15 = new JLabel("Gross Profit Margin");
		JLabel label16 = new JLabel("Revenue");
		text10 = new JTextField();
		text11 = new JTextField();
		button6 = new JButton("Calculate");
		button6.addActionListener(click);
		
		//set up tab environment
		JTabbedPane tabbedPane = new JTabbedPane();
	    tabbedPane.setBackground(Color.CYAN);
	    tabbedPane.setForeground(Color.BLACK);
	    tabbedPane.setFont(new Font("Century Gothic", Font.BOLD, 14));
	    
	    
	    //tab1
	    //main panel
	    JPanel tab1Panel = new JPanel();
	    tab1Panel.setLayout(new BorderLayout(6,6));
	    tab1Panel.setBackground(Color.CYAN);
	    
	    
	    //top tab1
	    JPanel topPanel1 = new JPanel();
	    topPanel1.setBackground(Color.CYAN);
	    topPanel1.setLayout(new GridLayout(3,2));
	    topPanel1.add(label1);
	    topPanel1.add(text1);
	    topPanel1.add(label2);
	    topPanel1.add(text2);
	    topPanel1.add(label3);
	    topPanel1.add(text3);
	    
	    
	    //mid tab1
	    JPanel midPanel1 = new JPanel();
	    midPanel1.setBackground(Color.WHITE);
	    midPanel1.add(label4);
	    
	    
	    	    
	    //bottom tab1
	    JPanel bottomPanel1 = new JPanel();
	    bottomPanel1.add(button1);
	    bottomPanel1.add(button2);
	  
	    
	    //add to the tab1 main pane
	    tab1Panel.add(topPanel1, BorderLayout.NORTH);
	    tab1Panel.add(midPanel1);
	    tab1Panel.add(bottomPanel1, BorderLayout.SOUTH);
	    
	    
	    
	    //tab2
	    tab2Panel = new JPanel();
	    tab2Panel.setLayout(new BorderLayout(6,6));
	    tab2Panel.setBackground(Color.CYAN);
	    
	    JPanel topPanel2 = new JPanel();
	    topPanel2.setLayout(new FlowLayout(1));
	    topPanel2.setBackground(Color.WHITE);
	    
	    midPanel2 = new JPanel(new CardLayout());
	    	    
	    dropDown1 = new JComboBox<String>();	    
	    dropDown1.addItem(CURRENTRATIOPANEL);
	    dropDown1.addItem(WORKINGCAPITALRATIOPANEL);
	    dropDown1.addItem(DEBTTOEQUITYRATIOPANEL);
	    dropDown1.addItem(GROSSPROFITMARGINRATIO);
	    
	    dropDown1.addItemListener(this);
	    
	    currentRatioPanel = new JPanel(new BorderLayout(6,6));
	    currentRatioPanel.setBackground(Color.CYAN);
	    workingCapitalRatioPanel = new JPanel(new BorderLayout(6,6));
	    workingCapitalRatioPanel.setBackground(Color.CYAN);
	    debtToEquityRatioPanel = new JPanel(new BorderLayout(6,6));
	    debtToEquityRatioPanel.setBackground(Color.CYAN);
	    grossProfitMarginRatioPanel = new JPanel(new BorderLayout(6,6));
	    grossProfitMarginRatioPanel.setBackground(Color.CYAN);
	    
	    //start of the midPanel2
	    //CURRENT RATIO
	    JPanel topCurrent = new JPanel(new GridLayout(2,2));
	    topCurrent.setBackground(Color.CYAN);
	    topCurrent.add(label9);
	    topCurrent.add(text4);
	    topCurrent.add(label10);
	    topCurrent.add(text5);
	    
	    JPanel bottomCurrent = new JPanel();
	    bottomCurrent.add(button3);
	    
	    JPanel midCurrent = new JPanel();
	    midCurrent.setBackground(Color.WHITE);
	    midCurrent.add(label5);
	    
	    	    
	    currentRatioPanel.add(topCurrent, BorderLayout.NORTH);
	    currentRatioPanel.add(bottomCurrent, BorderLayout.SOUTH);
	    currentRatioPanel.add(midCurrent);
	    	    
	    //WORKING RATIO
	    JPanel topWorking = new JPanel(new GridLayout(2,2));
	    topWorking.setBackground(Color.CYAN);
	    topWorking.add(label11);
	    topWorking.add(text6);
	    topWorking.add(label12);
	    topWorking.add(text7);
	    
	    JPanel bottomWorking = new JPanel();
	    bottomWorking.add(button4);
	    
	    JPanel midWorking = new JPanel();
	    midWorking.setBackground(Color.WHITE);
	    midWorking.add(label6);
	    
	    	    
	    workingCapitalRatioPanel.add(topWorking, BorderLayout.NORTH);
	    workingCapitalRatioPanel.add(bottomWorking, BorderLayout.SOUTH);
	    workingCapitalRatioPanel.add(midWorking);
	    	    
	    //DEBT RATIO
	    JPanel topDebt = new JPanel(new GridLayout(2,2));
	    topDebt.setBackground(Color.CYAN);
	    topDebt.add(label13);
	    topDebt.add(text8);
	    topDebt.add(label14);
	    topDebt.add(text9);
	    
	    JPanel bottomDebt = new JPanel();
	    bottomDebt.add(button5);
	    
	    JPanel midDebt = new JPanel();
	    midDebt.setBackground(Color.WHITE);
	    midDebt.add(label7);
	    
	    	    
	    debtToEquityRatioPanel.add(topDebt, BorderLayout.NORTH);
	    debtToEquityRatioPanel.add(bottomDebt, BorderLayout.SOUTH);
	    debtToEquityRatioPanel.add(midDebt);
	    
	    //GROSS RATIO
	    JPanel topGross = new JPanel(new GridLayout(2,2));
	    topGross.setBackground(Color.CYAN);
	    topGross.add(label15);
	    topGross.add(text10);
	    topGross.add(label16);
	    topGross.add(text11);
	    
	    JPanel bottomGross = new JPanel();
	    bottomGross.add(button6);
	    
	    JPanel midGross = new JPanel();
	    midGross.setBackground(Color.WHITE);
	    midGross.add(label8);
	    
	    	    
	    grossProfitMarginRatioPanel.add(topGross, BorderLayout.NORTH);
	    grossProfitMarginRatioPanel.add(bottomGross, BorderLayout.SOUTH);
	    grossProfitMarginRatioPanel.add(midGross);
	    
	    
	    //end of the midPanel2
	    
	    
	    
	    midPanel2.add(currentRatioPanel, CURRENTRATIOPANEL);
	    midPanel2.add(workingCapitalRatioPanel, WORKINGCAPITALRATIOPANEL);
	    midPanel2.add(debtToEquityRatioPanel, DEBTTOEQUITYRATIOPANEL);
	    midPanel2.add(grossProfitMarginRatioPanel, GROSSPROFITMARGINRATIO);
	    
	   
	        
	    topPanel2.add(dropDown1);
	       	    
	    tab2Panel.add(topPanel2, BorderLayout.NORTH);
	    tab2Panel.add(midPanel2);
	    
	    
	    
	    	    	    
	    //make the tabs
		tabbedPane.addTab("Future/Present Value", tab1Panel);
		tabbedPane.addTab("Financial Ratios", tab2Panel);
	    
		//add every tab to the main frame
		mainContainer.add(tabbedPane);
		
				
	}
	
		
	public void itemStateChanged(ItemEvent e) {
	    CardLayout cl = (CardLayout)(midPanel2.getLayout());
	    cl.show(midPanel2, (String)e.getItem());
	    
	   

	}
			
		
	
	public static void main(String[] args) {
		A1 launch = new A1("Financial Calculator");
		launch.setVisible(true);
		
		
		
	}

}
class Clicklistener implements ActionListener {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	public void actionPerformed(ActionEvent e) {
			
		
		if (e.getSource() == A1.button1 ) {
			try {
	        //button1.setText("The button has been clicked");
			String text1 = A1.text1.getText();
			String text2 = A1.text2.getText();
			String text3 = A1.text3.getText();
			double intText1 = Double.parseDouble(text1);
			double intText2 = Double.parseDouble(text2);
			double intText3 = Double.parseDouble(text3);
	    	double intResult = intText1*Math.pow((1+intText3),intText2);
	    	String result = String.valueOf(df2.format(intResult));
	    	A1.label4.setText("<html><span style='font-size:20px'>"+"£"+result+"</span></html>"); 
			}catch ( NumberFormatException exc ) {
				A1.label4.setText("<html><span style='font-size:20px'>"+"Please enter a valid input!"+"</span></html>");
			}
	    }
		if(e.getSource() == A1.button2) {
			try {
			String text1 = A1.text1.getText();
			String text2 = A1.text2.getText();
			String text3 = A1.text3.getText();
			double intText1 = Double.parseDouble(text1);
			double intText2 = Double.parseDouble(text2);
			double intText3 = Double.parseDouble(text3);
			double intResult = intText1/Math.pow((1+intText3),intText2);
			String result = String.valueOf(df2.format(intResult));
			A1.label4.setText("<html><span style='font-size:20px'>"+"£"+result+"</span></html>");	
			}catch ( NumberFormatException exc ) {
				A1.label4.setText("<html><span style='font-size:20px'>"+"Please enter a valid input!"+"</span></html>");
			}
		}
		//current ratio
		if(e.getSource() == A1.button3) {
			try {
			String text4 = A1.text4.getText();
			String text5 = A1.text5.getText();
			double intText4 = Double.parseDouble(text4);
			double intText5 = Double.parseDouble(text5);
			double intResultCurrent = intText4/intText5;
			String resultCurrent = String.valueOf(df2.format(intResultCurrent));
			A1.label5.setText("<html><span style='font-size:20px'>"+"£"+resultCurrent+"</span></html>");	
			}catch ( NumberFormatException exc ) {
				A1.label5.setText("<html><span style='font-size:20px'>"+"Please enter a valid input!"+"</span></html>");
			}
		}
		//to be completed
		if(e.getSource() == A1.button4) {
			try {
			String text6 = A1.text6.getText();
			String text7 = A1.text7.getText();
			double intText6 = Double.parseDouble(text6);
			double intText7 = Double.parseDouble(text7);
			double intResultWorking = intText6 - intText7;
			String resultWorking = String.valueOf(df2.format(intResultWorking));
			A1.label6.setText("<html><span style='font-size:20px'>"+"£"+resultWorking+"</span></html>");
			}catch ( NumberFormatException exc ) {
				A1.label6.setText("<html><span style='font-size:20px'>"+"Please enter a valid input!"+"</span></html>");
			}
		}
		if(e.getSource() == A1.button5) {
			try {
			String text8 = A1.text8.getText();
			String text9 = A1.text9.getText();
			double intText8 = Double.parseDouble(text8);
			double intText9 = Double.parseDouble(text9);
			double intResultDebt = intText8/intText9;
			String resultDebt = String.valueOf(df2.format(intResultDebt));
			A1.label7.setText("<html><span style='font-size:20px'>"+"£"+resultDebt+"</span></html>");	
			}catch ( NumberFormatException exc ) {
				A1.label7.setText("<html><span style='font-size:20px'>"+"Please enter a valid input!"+"</span></html>");
			}
		}
		if(e.getSource() == A1.button6) {
			try {
			String text10 = A1.text10.getText();
			String text11 = A1.text11.getText();
			double intText10 = Double.parseDouble(text10);
			double intText11 = Double.parseDouble(text11);
			double intResultGross = intText10/intText11;
			String resultGross = String.valueOf(df2.format(intResultGross));
			A1.label8.setText("<html><span style='font-size:20px'>"+"£"+resultGross+"</span></html>");			
			}catch ( NumberFormatException exc ) {
				A1.label8.setText("<html><span style='font-size:20px'>"+"Please enter a valid input!"+"</span></html>");
			}
		}
		
	}
	
}
