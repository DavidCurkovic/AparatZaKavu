import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AparatZaKavu {

	private JFrame frmCoffeMachine;
	private JTextField moneyTF;
	private JTextField changeTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AparatZaKavu window = new AparatZaKavu();
					window.frmCoffeMachine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AparatZaKavu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCoffeMachine = new JFrame();
		frmCoffeMachine.setTitle("Coffe Machine");
		frmCoffeMachine.setBounds(100, 100, 450, 300);
		frmCoffeMachine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCoffeMachine.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coffee Machine");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(141, 0, 150, 33);
		frmCoffeMachine.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Pick a coffee", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 88, 414, 111);
		frmCoffeMachine.getContentPane().add(panel);
		
		JRadioButton cappuccinoRB = new JRadioButton("cappuccino $1.25");
		panel.add(cappuccinoRB);
		
		JRadioButton macchiatoRB = new JRadioButton("macchiato $1.20");
		panel.add(macchiatoRB);
		
		JRadioButton cafelatteRB = new JRadioButton("cafe latte $1.50");
		panel.add(cafelatteRB);
		
		JRadioButton americanoRB = new JRadioButton("americano $1.30");
		panel.add(americanoRB);
		
		JRadioButton longblackRB = new JRadioButton("long black $2.00");
		panel.add(longblackRB);
		
		JRadioButton irishcoffeeRB = new JRadioButton("irish coffee $2.00");
		panel.add(irishcoffeeRB);
		
		JRadioButton espressoRB = new JRadioButton("espresso $1.00");
		panel.add(espressoRB);
		
		JRadioButton flatwhiteRB = new JRadioButton("flat white $1.50");
		panel.add(flatwhiteRB);
		
		JRadioButton mochaccinoRB = new JRadioButton("mochaccino $2.00");
		panel.add(mochaccinoRB);
		
		cappuccinoRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (cappuccinoRB.isSelected()) {
					macchiatoRB.setSelected(false);
					cafelatteRB.setSelected(false);
					americanoRB.setSelected(false);
					longblackRB.setSelected(false);
					irishcoffeeRB.setSelected(false);
					espressoRB.setSelected(false);
					flatwhiteRB.setSelected(false);
					mochaccinoRB.setSelected(false);
				}	
			}
		});
		macchiatoRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (macchiatoRB.isSelected()) {
					cappuccinoRB.setSelected(false);
					cafelatteRB.setSelected(false);
					americanoRB.setSelected(false);
					longblackRB.setSelected(false);
					irishcoffeeRB.setSelected(false);
					espressoRB.setSelected(false);
					flatwhiteRB.setSelected(false);
					mochaccinoRB.setSelected(false);
				}	
			}
		});
		cafelatteRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (cafelatteRB.isSelected()) {
					macchiatoRB.setSelected(false);
					cappuccinoRB.setSelected(false);
					americanoRB.setSelected(false);
					longblackRB.setSelected(false);
					irishcoffeeRB.setSelected(false);
					espressoRB.setSelected(false);
					flatwhiteRB.setSelected(false);
					mochaccinoRB.setSelected(false);
				}	
			}
		});
		americanoRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (americanoRB.isSelected()) {
					macchiatoRB.setSelected(false);
					cafelatteRB.setSelected(false);
					cappuccinoRB.setSelected(false);
					longblackRB.setSelected(false);
					irishcoffeeRB.setSelected(false);
					espressoRB.setSelected(false);
					flatwhiteRB.setSelected(false);
					mochaccinoRB.setSelected(false);
				}	
			}
		});
		longblackRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (longblackRB.isSelected()) {
					macchiatoRB.setSelected(false);
					cafelatteRB.setSelected(false);
					americanoRB.setSelected(false);
					cappuccinoRB.setSelected(false);
					irishcoffeeRB.setSelected(false);
					espressoRB.setSelected(false);
					flatwhiteRB.setSelected(false);
					mochaccinoRB.setSelected(false);
				}	
			}
		});
		irishcoffeeRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (irishcoffeeRB.isSelected()) {
					macchiatoRB.setSelected(false);
					cafelatteRB.setSelected(false);
					americanoRB.setSelected(false);
					longblackRB.setSelected(false);
					cappuccinoRB.setSelected(false);
					espressoRB.setSelected(false);
					flatwhiteRB.setSelected(false);
					mochaccinoRB.setSelected(false);
				}	
			}
		});
		espressoRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (espressoRB.isSelected()) {
					macchiatoRB.setSelected(false);
					cafelatteRB.setSelected(false);
					americanoRB.setSelected(false);
					longblackRB.setSelected(false);
					irishcoffeeRB.setSelected(false);
					cappuccinoRB.setSelected(false);
					flatwhiteRB.setSelected(false);
					mochaccinoRB.setSelected(false);
				}	
			}
		});
		flatwhiteRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (flatwhiteRB.isSelected()) {
					macchiatoRB.setSelected(false);
					cafelatteRB.setSelected(false);
					americanoRB.setSelected(false);
					longblackRB.setSelected(false);
					irishcoffeeRB.setSelected(false);
					espressoRB.setSelected(false);
					cappuccinoRB.setSelected(false);
					mochaccinoRB.setSelected(false);
				}	
			}
		});
		mochaccinoRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (mochaccinoRB.isSelected()) {
					macchiatoRB.setSelected(false);
					cafelatteRB.setSelected(false);
					americanoRB.setSelected(false);
					longblackRB.setSelected(false);
					irishcoffeeRB.setSelected(false);
					espressoRB.setSelected(false);
					flatwhiteRB.setSelected(false);
					cappuccinoRB.setSelected(false);
				}	
			}
		});
		
		JButton purchaseBTN = new JButton("Purchase");
		purchaseBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double money = 0;
				
				money = Double.parseDouble(moneyTF.getText());
				
				if(cappuccinoRB.isSelected()) {
					money = money - 1.25;
				}else if(macchiatoRB.isSelected()) {
					money = money - 1.20;
				}else if(cafelatteRB.isSelected()) {
					money = money - 1.50;
				}else if(americanoRB.isSelected()) {
					money = money - 1.30;
				}else if(longblackRB.isSelected()) {
					money = money - 2.00;
				}else if(irishcoffeeRB.isSelected()) {
					money = money - 2.00;
				}else if(espressoRB.isSelected()) {
					money = money - 1.00;
				}else if(flatwhiteRB.isSelected()) {
					money = money - 1.50;
				}else if(mochaccinoRB.isSelected()) {
					money = money - 2.00;
				}
				
				if(money < 0) {
					JOptionPane.showMessageDialog(null,"Sorry, you don't have enough money!");
				}else {
					changeTF.setText(Double.toString(money));
				}
				
			}
		});
		purchaseBTN.setBounds(24, 227, 89, 23);
		frmCoffeMachine.getContentPane().add(purchaseBTN);
		
		JButton clearBTN = new JButton("Clear");
		clearBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cappuccinoRB.setSelected(false);
				macchiatoRB.setSelected(false);
				cafelatteRB.setSelected(false);
				americanoRB.setSelected(false);
				longblackRB.setSelected(false);
				irishcoffeeRB.setSelected(false);
				espressoRB.setSelected(false);
				flatwhiteRB.setSelected(false);
				mochaccinoRB.setSelected(false);
				moneyTF.setText("");
				changeTF.setText("");
				
			}
		});
		clearBTN.setBounds(175, 227, 89, 23);
		frmCoffeMachine.getContentPane().add(clearBTN);
		
		JButton CancelBTN = new JButton("Cancel");
		CancelBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		CancelBTN.setBounds(321, 227, 89, 23);
		frmCoffeMachine.getContentPane().add(CancelBTN);
		
		JLabel lblNewLabel_1 = new JLabel("Money:");
		lblNewLabel_1.setBounds(97, 38, 48, 14);
		frmCoffeMachine.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Change:");
		lblNewLabel_2.setBounds(97, 63, 48, 14);
		frmCoffeMachine.getContentPane().add(lblNewLabel_2);
		
		moneyTF = new JTextField();
		moneyTF.setBounds(168, 35, 96, 20);
		frmCoffeMachine.getContentPane().add(moneyTF);
		moneyTF.setColumns(10);
		
		changeTF = new JTextField();
		changeTF.setEditable(false);
		changeTF.setBounds(168, 60, 96, 20);
		frmCoffeMachine.getContentPane().add(changeTF);
		changeTF.setColumns(10);
	}
}
