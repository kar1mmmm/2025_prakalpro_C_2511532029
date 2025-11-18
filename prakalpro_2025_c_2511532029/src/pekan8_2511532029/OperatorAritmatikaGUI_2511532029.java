package pekan8_2511532029;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511532029 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel ControlPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511532029 frame = new OperatorAritmatikaGUI_2511532029();
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
	public OperatorAritmatikaGUI_2511532029() {
		setTitle("OperatorAritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 262);
		ControlPane = new JPanel();
		ControlPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ControlPane);
		ControlPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 4, 292, 21);
		ControlPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(0, 36, 72, 14);
		ControlPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bilangan 2");
		lblNewLabel_2.setBounds(0, 61, 72, 14);
		ControlPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Operator");
		lblNewLabel_2_1.setBounds(0, 112, 72, 14);
		ControlPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Hasil");
		lblNewLabel_2_1_1.setBounds(0, 160, 72, 14);
		ControlPane.add(lblNewLabel_2_1_1);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(82, 33, 52, 20);
		ControlPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setColumns(10);
		txtBil2.setBounds(82, 58, 52, 20);
		ControlPane.add(txtBil2);
		
		txtHasil = new JTextField();
		txtHasil.setBounds(82, 157, 96, 20);
		ControlPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(82, 108, 37, 22);
		ControlPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan Masukkan Bilangan 1");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan Masukkan Bilangan 2");
				}else {
					try {
						int a= Integer.parseInt(txtBil1.getText());
						int b= Integer.parseInt(txtBil2.getText());
						int c= cbOperator.getSelectedIndex(); //memilih operator
						if (c==0) {
							hasil= a+b;
						}if (c==1) {
							hasil= a-b;
						}if (c==2) {
							hasil= a*b;
						}if (c==3) {
							hasil= a/b;
						}if (c==4) {
							hasil=a%b;
						}
						}catch (NumberFormatException ex) {
							pesanEror ("Bilangan 1 dan Bilangan 2 harus angka");
					}
				}
				txtHasil.setText(String.valueOf(hasil));
				int a= Integer.valueOf(txtBil1.getText());
				int b= Integer.valueOf(txtBil2.getText());
				int c= cbOperator.getSelectedIndex();
				if (c==0) {
					hasil = a+b;
				}
				if (c==1) {
					hasil = a-b;
				}
				if (c==2) {
					hasil = a*b;
				}
				if (c==3) {
					hasil = a/b;
				}
				if (c==4) {
					hasil = a%b;
				}
				txtHasil.setText(String.valueOf(hasil));
			}
		});
		btnNewButton.setBounds(156, 108, 88, 22);
		ControlPane.add(btnNewButton);

	}
}