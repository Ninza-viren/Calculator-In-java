package mycal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Cal {

	private JFrame frame;
	private JTextField txtplay;
	double num1;
	double num2;
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
					Cal window = new Cal();
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
	public Cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 269, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtplay = new JTextField();
		txtplay.setHorizontalAlignment(SwingConstants.LEFT);
		txtplay.setBounds(0, 0, 252, 31);
		frame.getContentPane().add(txtplay);
		txtplay.setColumns(10);
		//-------------row1------------------
		JButton btnrow = new JButton("<-");
		btnrow.setBackground(Color.DARK_GRAY);
		btnrow.setForeground(Color.WHITE);
		btnrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(txtplay.getText().length()>0)
				{
					StringBuilder sbr=new StringBuilder(txtplay.getText());
					sbr.deleteCharAt(txtplay.getText().length()-1);
					backspace=sbr.toString();
					txtplay.setText(backspace);
					
					
				}
				
			}
		});
		btnrow.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnrow.setBounds(0, 42, 62, 50);
		frame.getContentPane().add(btnrow);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.DARK_GRAY);
		btnC.setForeground(Color.WHITE);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String text=txtplay.getText()+btnC.getText();
				txtplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(63, 42, 62, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnpresentag = new JButton("%");
		btnpresentag.setBackground(Color.DARK_GRAY);
		btnpresentag.setForeground(Color.WHITE);
		
		btnpresentag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtplay.getText());
				txtplay.setText("");
				operations="%";
			}
		});
		btnpresentag.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnpresentag.setBounds(127, 42, 62, 50);
		frame.getContentPane().add(btnpresentag);
		
		JButton btnplus = new JButton("+");
		btnplus.setBackground(Color.BLUE);
		btnplus.setForeground(Color.WHITE);
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtplay.getText());
				txtplay.setText("");
				operations="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnplus.setBounds(190, 42, 62, 50);
		frame.getContentPane().add(btnplus);
		
		//-------------row4------------------
				JButton btn7 = new JButton("7");
				btn7.setBackground(Color.DARK_GRAY);
				btn7.setForeground(Color.WHITE);
				btn7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text=txtplay.getText()+btn7.getText();
						txtplay.setText(text);
						
						
					}
				});
				btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn7.setBounds(0, 90, 62, 50);
				frame.getContentPane().add(btn7);
				
				JButton btn8 = new JButton("8");
				btn8.setBackground(Color.DARK_GRAY);
				btn8.setForeground(Color.WHITE);
				btn8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text=txtplay.getText()+btn8.getText();
						txtplay.setText(text);
					}
				});
				btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn8.setBounds(63, 90, 62, 50);
				frame.getContentPane().add(btn8);
				
				JButton btn9 = new JButton("9");
				btn9.setBackground(Color.DARK_GRAY);
				btn9.setForeground(Color.WHITE);
				btn9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text=txtplay.getText()+btn9.getText();
						txtplay.setText(text);
					}
				});
				btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn9.setBounds(127, 90, 62, 50);
				frame.getContentPane().add(btn9);
				
				JButton btnsub = new JButton("-");
				btnsub.setBackground(Color.BLUE);
				btnsub.setForeground(Color.WHITE);
				btnsub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						num1=Double.parseDouble(txtplay.getText());
						txtplay.setText("");
						operations="-";
					}
				});
				btnsub.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnsub.setBounds(190, 90, 62, 50);
				frame.getContentPane().add(btnsub);
				
				//-------------row3------------------
				JButton btn4 = new JButton("4");
				btn4.setBackground(Color.DARK_GRAY);
				btn4.setForeground(Color.WHITE);
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text=txtplay.getText()+btn4.getText();
						txtplay.setText(text);
					}
				});
				btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn4.setBounds(0, 138, 62, 50);
				frame.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.setBackground(Color.DARK_GRAY);
				btn5.setForeground(Color.WHITE);
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text=txtplay.getText()+btn5.getText();
						txtplay.setText(text);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn5.setBounds(63, 138, 62, 50);
				frame.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.setBackground(Color.DARK_GRAY);
				btn6.setForeground(Color.WHITE);
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text=txtplay.getText()+btn6.getText();
						txtplay.setText(text);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn6.setBounds(127, 138, 62, 50);
				frame.getContentPane().add(btn6);
				
				JButton btnmul = new JButton("*");
				btnmul.setBackground(Color.BLUE);
				btnmul.setForeground(Color.WHITE);
				btnmul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						num1=Double.parseDouble(txtplay.getText());
						txtplay.setText("");
						operations="*";
					}
				});
				btnmul.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnmul.setBounds(190, 138, 62, 50);
				frame.getContentPane().add(btnmul);
				
				//-------------row4------------------
				JButton btn1 = new JButton("1");
				btn1.setBackground(Color.DARK_GRAY);
				btn1.setForeground(Color.WHITE);
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text=txtplay.getText()+btn1.getText();
						txtplay.setText(text);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn1.setBounds(0, 186, 62, 50);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.setBackground(Color.DARK_GRAY);
				btn2.setForeground(Color.WHITE);
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text=txtplay.getText()+btn2.getText();
						txtplay.setText(text);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn2.setBounds(63, 186, 62, 50);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.setBackground(Color.DARK_GRAY);
				btn3.setForeground(Color.WHITE);
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text=txtplay.getText()+btn3.getText();
						txtplay.setText(text);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn3.setBounds(127, 186, 62, 50);
				frame.getContentPane().add(btn3);
				
				JButton btndiv = new JButton("/");
				btndiv.setBackground(Color.BLUE);
				btndiv.setForeground(Color.WHITE);
				btndiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						num1=Double.parseDouble(txtplay.getText());
						txtplay.setText("");
						operations="/";
					}
				});
				btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
				btndiv.setBounds(190, 186, 62, 50);
				frame.getContentPane().add(btndiv);
				
				//-------------row5------------------
				JButton btn0 = new JButton("0");
				btn0.setBackground(Color.DARK_GRAY);
				btn0.setForeground(Color.WHITE);
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text=txtplay.getText()+btn0.getText();
						txtplay.setText(text);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn0.setBounds(0, 234, 62, 50);
				frame.getContentPane().add(btn0);
				
				JButton btndot = new JButton(".");
				btndot.setBackground(Color.DARK_GRAY);
				btndot.setForeground(Color.WHITE);
				btndot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text=txtplay.getText()+btndot.getText();
						txtplay.setText(text);
					}
				});
				btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
				btndot.setBounds(63, 234, 62, 50);
				frame.getContentPane().add(btndot);
				
				JButton btnpm = new JButton("+\r\n-");
				btnpm.setBackground(Color.DARK_GRAY);
				btnpm.setForeground(Color.WHITE);
				btnpm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops=Double.parseDouble(String.valueOf(txtplay.getText()));
						ops=ops*(-1);
						txtplay.setText(String.valueOf(ops));
					}
				});
				btnpm.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnpm.setBounds(127, 234, 62, 50);
				frame.getContentPane().add(btnpm);
				
				JButton btnequal = new JButton("=");
				btnequal.setBackground(Color.RED);
				btnequal.setForeground(Color.WHITE);
				btnequal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						num2=Double.parseDouble(txtplay.getText());
						if(operations=="+")
						{
							result=num1+num2;
							answer=String.format("%.2f", result);
							txtplay.setText(answer);
						}
						
						else if(operations=="-")
						{
							result=num1-num2;
							answer=String.format("%.2f", result);
							txtplay.setText(answer);
						}
						
						else if(operations=="*")
						{
							result=num1*num2;
							answer=String.format("%.2f", result);
							txtplay.setText(answer);
						}
						
						else if(operations=="/")
						{
							result=num1/num2;
							answer=String.format("%.2f", result);
							txtplay.setText(answer);
						}
						
						else if(operations=="%")
						{
							result=(int)(num1%num2);
							answer=String.format("%.i", result);
							txtplay.setText(answer);
						}
					}
				});
				btnequal.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnequal.setBounds(190, 234, 62, 50);
				frame.getContentPane().add(btnequal);
		
		
	}

}
