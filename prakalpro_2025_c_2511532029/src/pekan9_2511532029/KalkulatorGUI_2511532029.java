package pekan9_2511532029;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorGUI_2511532029 {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkulatorGUI_2511532029 window = new KalkulatorGUI_2511532029();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KalkulatorGUI_2511532029() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 299, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 262, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnB = new JButton("\uF0E7");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B=null;
				if(textField.getText().length()>0) {
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					B=str.toString();
					textField.setText(B);
				}
			}
		});
		btnB.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnB.setBounds(21, 92, 58, 52);
		frame.getContentPane().add(btnB);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number = textField.getText() + btn7.getText();
			        textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(21, 143, 58, 52);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        String number = textField.getText() + btn4.getText();
		        textField.setText(number);
		    }
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(21, 195, 58, 52);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        String number = textField.getText() + btn1.getText();
		        textField.setText(number);
		    }
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(21, 245, 58, 52);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number = textField.getText() + btn0.getText();
			        textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(21, 297, 58, 52);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(81, 92, 58, 52);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number = textField.getText() + btn8.getText();
			        textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(81, 143, 58, 52);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number = textField.getText() + btn5.getText();
			        textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(81, 195, 58, 52);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number = textField.getText() + btn2.getText();
			        textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(81, 245, 58, 52);
		frame.getContentPane().add(btn2);
		
		JButton btnpoin = new JButton(".");
		btnpoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number = textField.getText() + btnpoin.getText();
			        textField.setText(number);
			}
		});
		btnpoin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpoin.setBounds(81, 297, 58, 52);
		frame.getContentPane().add(btnpoin);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number = textField.getText() + btn00.getText();
			        textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn00.setBounds(139, 92, 58, 52);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number = textField.getText() + btn9.getText();
			        textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(139, 143, 58, 52);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number = textField.getText() + btn6.getText();
			        textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(139, 195, 58, 52);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number = textField.getText() + btn3.getText();
			        textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(139, 245, 58, 52);
		frame.getContentPane().add(btn3);
		
		JButton btnequals = new JButton("=");
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second= Double.parseDouble(textField.getText());
				if (operation=="+") {
					result = first + second ;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="-") {
					result = first - second ;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="*") {
					result = first * second ;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="/") {
					result = first / second ;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="%") {
					result = first % second ;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnequals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequals.setBounds(139, 297, 58, 52);
		frame.getContentPane().add(btnequals);
		
		JButton btnplus_2511531017 = new JButton("+");
		btnplus_2511531017.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
				
			}
		});
		btnplus_2511531017.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus_2511531017.setBounds(198, 92, 58, 52);
		frame.getContentPane().add(btnplus_2511531017);
		
		JButton btnminus_2511531017 = new JButton("-");
		btnminus_2511531017.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
				
			}
		});
		btnminus_2511531017.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnminus_2511531017.setBounds(198, 143, 58, 52);
		frame.getContentPane().add(btnminus_2511531017);
		
		JButton btnmul_2511531017 = new JButton("*");
		btnmul_2511531017.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
				
			}
		});
		btnmul_2511531017.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmul_2511531017.setBounds(198, 195, 58, 52);
		frame.getContentPane().add(btnmul_2511531017);
		
		JButton btndiv_2511531017 = new JButton("/");
		btndiv_2511531017.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
				
			}
		});
		btndiv_2511531017.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndiv_2511531017.setBounds(198, 245, 58, 52);
		frame.getContentPane().add(btndiv_2511531017);
		
		JButton btnmod_2511531017 = new JButton("%");
		btnmod_2511531017.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
				
			}
		});
		btnmod_2511531017.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmod_2511531017.setBounds(198, 297, 58, 52);
		frame.getContentPane().add(btnmod_2511531017);
	}
}