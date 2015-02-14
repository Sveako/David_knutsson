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
import java.util.ArrayList;

import javax.swing.JTextArea;

public class storeGUI extends JFrame {

	private JPanel infoA;
	private JTextField nameText;
	private JTextField dogText;
	private ArrayList<Human> humanList;
	protected JTextArea infoArea;
	protected JTextArea textArea_1;
	
	JTextArea infoText;
	JTextArea erroA;

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
		
		
		
		humanList = new ArrayList<Human>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		infoA = new JPanel();
		infoA.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(infoA);
		infoA.setLayout(null);
		
		nameText = new JTextField();
		nameText.setBounds(30, 43, 86, 20);
		infoA.add(nameText);
		nameText.setColumns(10);
		
		dogText = new JTextField();
		dogText.setBounds(30, 88, 86, 20);
		infoA.add(dogText);
		dogText.setColumns(10);
		
		
		
		
		JButton nameButton = new JButton("Name");
		nameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameText.getText();
				if(name.length() > 2){
					humanList.add(new Human(name));
					infoText.append("Human added!\n");
				}else{ erroA.append("Human name must be at least 3 charaters\n");
				
				}
		
		
			}
		});
		nameButton.setBounds(166, 42, 89, 23);
		infoA.add(nameButton);
		
		JButton btnDog = new JButton("Buy Dog");
		btnDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(humanList.size() !=0){
					Human lastHuman = humanList.get(humanList.size() -1);
					if(!lastHuman.hasDog()){
						String dogName= dogText.getText();
						lastHuman.buyDog(new Dog(dogName));
						infoText.append("Dog dded!\n");
					}else{ erroA.append("Human already has dog!\n");
					}
				}
			}
			
			
			
			
		});
		btnDog.setBounds(166, 87, 89, 23);
		infoA.add(btnDog);
		
		JButton btnPrintInfo = new JButton("Print info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String info = "";
				for(Human human : humanList){
					info += human.getInfo() +"\n";
				}
				infoText.append(info);
				
			}
		});
		btnPrintInfo.setBounds(166, 131, 89, 23);
		infoA.add(btnPrintInfo);
		
		JTextArea infoText = new JTextArea();
		infoText.setBounds(30, 160, 373, 39);
		infoA.add(infoText);
		
		JTextArea erroA = new JTextArea();
		erroA.setBounds(30, 210, 373, 22);
		infoA.add(erroA);
	}
}
