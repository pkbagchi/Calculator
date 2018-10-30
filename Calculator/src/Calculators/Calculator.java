package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secnum;
	double result;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 249, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 218, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		 //Row - 1..............
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				 String EnterNumber = textField.getText() + btn7.getText();
				 textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 54, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNumber = textField.getText() + btn8.getText();
				 textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(66, 54, 50, 50);
		frame.getContentPane().add(btn8);
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNumber = textField.getText() + btn9.getText();
				 textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(122, 54, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(178, 54, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		
		
		
 //Row - 2..............
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNumber = textField.getText() + btn4.getText();
				 textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 110, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNumber = textField.getText() + btn5.getText();
				 textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(66, 110, 50, 50);
		frame.getContentPane().add(btn5);
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNumber = textField.getText() + btn6.getText();
				 textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(122, 110, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(178, 110, 50, 50);
		frame.getContentPane().add(btnSub);
		
		
		
 //Row - 3..............
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNumber = textField.getText() + btn1.getText();
				 textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 166, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNumber = textField.getText() + btn2.getText();
				 textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(66, 166, 50, 50);
		frame.getContentPane().add(btn2);
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String EnterNumber = textField.getText() + btn3.getText();
				 textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(122, 166, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(178, 166, 50, 50);
		frame.getContentPane().add(btnMult);
		
		
		//Row - 4..............
		
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 String EnterNumber = textField.getText() + btn0.getText();
						 textField.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn0.setBounds(10, 222, 50, 50);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton("C");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText(null);
					}
				});
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnDot.setBounds(66, 222, 50, 50);
				frame.getContentPane().add(btnDot);
				
				
				JButton btnPM = new JButton("/");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "/";
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnPM.setBounds(178, 222, 50, 50);
				frame.getContentPane().add(btnPM);
				
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String answer;
						secnum = Double.parseDouble(textField.getText());
						if(operations == "+") {
							result = firstnum+secnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operations == "-") {
							result = firstnum- secnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operations == "*") {
							result = firstnum * secnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operations == "/") {
							result = firstnum / secnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						
					}
				});
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnEqual.setBounds(122, 222, 50, 50);
				frame.getContentPane().add(btnEqual);
				
		
		
	}
}
