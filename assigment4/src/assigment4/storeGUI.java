package assigment4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class storeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField nameText;
	private JTextField dogText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					storeGUI frame = new storeGUI();
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
	public storeGUI() {
		
		Human allaDjur = new Human();
		System.out.println( allaDjur.getInfo());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nameText = new JTextField();
		nameText.setBounds(30, 43, 86, 20);
		contentPane.add(nameText);
		nameText.setColumns(10);
		
		dogText = new JTextField();
		dogText.setBounds(30, 88, 86, 20);
		contentPane.add(dogText);
		dogText.setColumns(10);
		
		
		
		JButton nameButton = new JButton("Name");
		nameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
		
			}
		});
		nameButton.setBounds(166, 42, 89, 23);
		contentPane.add(nameButton);
		
		JButton btnDog = new JButton("Buy Dog");
		btnDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDog.setBounds(166, 87, 89, 23);
		contentPane.add(btnDog);
		
		JButton btnPrintInfo = new JButton("Print info");
		btnPrintInfo.setBounds(166, 131, 89, 23);
		contentPane.add(btnPrintInfo);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(30, 172, 364, 22);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(30, 216, 364, 22);
		contentPane.add(textArea_1);
	}
}
