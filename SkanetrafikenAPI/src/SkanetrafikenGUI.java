import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JScrollPane;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;


public class SkanetrafikenGUI extends JFrame {

	private JPanel contentPane;
	public JTextField sökText;
	public JTextArea resultat = new JTextArea();
	public JTextField frånText;
	public JTextField tillText;
	public JTextArea resultText = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkanetrafikenGUI frame = new SkanetrafikenGUI();
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
	public SkanetrafikenGUI() {
		setBackground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 498);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		sökText = new JTextField();
		sökText.setBounds(80, 70, 86, 20);
		contentPane.add(sökText);
		sökText.setColumns(10);
		
		JButton btnSk = new JButton("S\u00F6k");
		btnSk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
		
				
				
				StationThread t= new StationThread(SkanetrafikenGUI.this);
				t.start();
				
				
				
				
			}
				
				
		});
		btnSk.setBounds(190, 69, 89, 23);
		contentPane.add(btnSk);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 101, 414, 149);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(resultat);
		
		JLabel lblSkStation = new JLabel("S\u00F6k Station");
		lblSkStation.setBounds(10, 73, 84, 14);
		contentPane.add(lblSkStation);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 261, 414, 149);
		contentPane.add(panel);
		panel.setLayout(null);
		
		frånText = new JTextField();
		frånText.setBounds(48, 11, 86, 20);
		panel.add(frånText);
		frånText.setColumns(10);
		
		JLabel lblFrn = new JLabel("Fr\u00E5n");
		lblFrn.setBounds(10, 14, 46, 14);
		panel.add(lblFrn);
		
		tillText = new JTextField();
		tillText.setBounds(177, 11, 86, 20);
		panel.add(tillText);
		tillText.setColumns(10);
		
		JLabel lblTill = new JLabel("Till");
		lblTill.setBounds(144, 14, 46, 14);
		panel.add(lblTill);
		
		JButton sokresaButton = new JButton("S\u00F6k Resa");
		sokresaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				depaturThread p= new depaturThread(SkanetrafikenGUI.this);
				p.start();
					
				}
			
		});
		sokresaButton.setBounds(300, 10, 89, 23);
		panel.add(sokresaButton);
		
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(48, 42, 341, 96);
		panel.add(scrollPane_1);
		
		
		scrollPane_1.setViewportView(resultText);
	}
}
