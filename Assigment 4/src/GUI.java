import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField humanText;
	private JTextField dogText;
	/**deklaration of human*/
	Human human;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
	

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        contentPane.setLayout(null);
        
        /**textFields and textArea*/
        
        humanText = new JTextField();
        humanText.setBounds(28, 39, 123, 20);
        contentPane.add(humanText);
        humanText.setColumns(10);
        
        dogText = new JTextField();
        dogText.setBounds(28, 77, 123, 20);
        contentPane.add(dogText);
        dogText.setColumns(10);
        
        JTextArea infoText = new JTextArea();
        infoText.setBounds(28, 153, 376, 55);
        contentPane.add(infoText);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(28, 232, 376, 22);
        contentPane.add(scrollPane);
        
        JTextArea erroText = new JTextArea();
        scrollPane.setViewportView(erroText);
        
        /**button for new human with if statment for human class*/
        JButton btnHuman = new JButton("New Human");
        btnHuman.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {

        		if (humanText.getText().length() < 3){

                erroText.setText(erroText.getText()+ "Name to short \n");
                }else{ human = new Human(humanText.getText());
                	infoText.setText(human.getName());
                }

        	}
        });
        btnHuman.setBounds(215, 38, 144, 23);
        contentPane.add(btnHuman);
        
        
        /**button for Buy Dog with if statment dog class*/
        JButton btnDog = new JButton("Buy Dog");
        btnDog.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {

        		if (human == null){
                    erroText.setText("erro \n");
                }
                else{ Dog doog = new Dog(dogText.getText());
                        human.buyDog(doog);
                        infoText.setText(doog.getName());
                }
        		
        	}
        });
        btnDog.setBounds(215, 76, 144, 23);
        contentPane.add(btnDog);
        
        /**button for Print info with infotext fron human class*/
        JButton btnInfo = new JButton("Print Info");
        btnInfo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {

        		infoText.setText(human.getInfo());

            }
        });
        btnInfo.setBounds(28, 108, 376, 23);
        contentPane.add(btnInfo);
        
        JLabel lblInfo = new JLabel("INFO");
        lblInfo.setBounds(28, 138, 46, 14);
        contentPane.add(lblInfo);
        
        JLabel lblErro = new JLabel("ERRO");
        lblErro.setBounds(28, 219, 46, 14);
        contentPane.add(lblErro);

       
		}
	}


