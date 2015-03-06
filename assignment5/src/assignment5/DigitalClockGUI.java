package assignment5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Set;

public class DigitalClockGUI extends JFrame {
	
	private ClockLogic clockLogic;
	
	private JPanel contentPane;
	private JTextField textHour;
	private JTextField minText;
	public JLabel Time = new JLabel("");
	public static JLabel alarmAT = new JLabel("");
	
	public boolean alarm = false;
	
	

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setTitle("VAKNA!!");
		clockLogic = new ClockLogic(this);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		textHour = new JTextField();
		textHour.setBounds(45, 230, 46, 20);
		getContentPane().add(textHour);
		textHour.setColumns(10);
		
		minText = new JTextField();
		minText.setBounds(157, 230, 46, 20);
		getContentPane().add(minText);
		minText.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hour");
		lblNewLabel.setBounds(10, 233, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setBounds(101, 233, 46, 14);
		getContentPane().add(lblMinutes);
		
		JButton setTimeBtn = new JButton("Set Time");
		setTimeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
           String setHour = textHour.getText();
           String setMinute = minText.getText();
           
           clockLogic.setAlarm(Integer.valueOf(setHour), (Integer.valueOf(setMinute)));
           System.out.println("allllllll");
          
           
					
			}
		});
		setTimeBtn.setBounds(228, 229, 89, 23);
		getContentPane().add(setTimeBtn);
		
		JButton clearTimeBtn = new JButton("Clear Alarm");
		clearTimeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clockLogic.clearAlarm();
				
		
				
			}
		});
		clearTimeBtn.setBounds(327, 229, 89, 23);
		getContentPane().add(clearTimeBtn);
		
		
		Time.setOpaque(true);
		Time.setBackground(Color.LIGHT_GRAY);
		Time.setBounds(171, 55, 80, 34);
		getContentPane().add(Time);
		
		
		alarmAT.setOpaque(true);
		alarmAT.setBackground(Color.LIGHT_GRAY);
		alarmAT.setBounds(171, 114, 80, 20);
		getContentPane().add(alarmAT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

	}
		// kallar på setarlarm//
	public void setAlarm(String alarmIN){
		alarmAT.setText(alarmIN);
		System.out.println("alarm");
		
		
	}
		//clear metod //
		public static void clear() {
		alarmAT.setText("");
		
	}
		
	
				public void setTimeOnLabel(String time){
					
				}
		
				public void alarm( boolean activate){
					if(activate){
						contentPane.setBackground(Color.red);
						
					}else{
						contentPane.setBackground(Color.green);
						
					}
				}
			}	


