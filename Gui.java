package lab;

import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Gui {
	
	static int x;

	public static void main(String[] args) {
		
		JFrame frame=new JFrame();
		frame.setName("window");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel= new JPanel();
		
		frame.add(panel);
		
		JLabel label1 = new JLabel("Name:    ");
		label1.setBounds(10,10,30,25);
		panel.add(label1);
		
		JTextField text1 = new JTextField();
		text1.setColumns(20);
		text1.setBounds(40,10,20,25);
		panel.add(text1);
		
		JLabel label2 = new JLabel("Telephon:");
		label2.setBounds(10,40,20,25);
		panel.add(label2);
		
		JTextField text2 = new JTextField();
		text2.setColumns(20);
		panel.add(text2);
		
		JLabel label3 = new JLabel("Email:    ");
		label3.setBounds(10,70,20,25);
		panel.add(label3);
		
		JTextField text3= new JTextField();
		text3.setColumns(20);
		panel.add(text3);
		
		JButton b1 = new JButton("Check!");
		panel.add(b1);
		
		
		
		JTextArea ta= new JTextArea("");
		panel.add(ta);
		
				
		ActionListener bl = e-> {
			String a = text1.getText();
			String b = text2.getText();
			String c = text3.getText();
			
			finder(a,"\\d{4}");
			if (x==1) {
			 
			  finder(b,"[A-Za-z]");
			  
			  if (x==1) {
			  
			  finder(c,"^(.+)@(.+)$");
			  }
			}
			
			ta.setText("Name: "+a+" , "+"Tel: "+b+" , "+"Email: "+c);
		};
		
		b1.addActionListener(bl);
		
		frame.setVisible(true);

	}
	
	
	static int finder (String myString , String pattern){
		 Pattern p = Pattern.compile(pattern);
		 Matcher matcher = p.matcher(myString);
		 while (matcher.find()) {
			 if(matcher.group().length()!=0) {
				
				return x =1;
			 }
		 }
		return x=0;
		
	}
	

}
