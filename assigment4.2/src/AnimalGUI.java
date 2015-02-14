import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;


public class AnimalGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 434, 261);
		contentPane.add(textArea);
		

			/**ArrayList*/
           ArrayList<Animall> animals = new ArrayList<Animall>();
           
           animals.add(new Dog("hhhh", "carpe", 4, true));
           animals.add(new Dog( "carpe", 4, false));
           
           animals.add(new Cat("carpediem", 9, 3));
           animals.add (new Cat("snony", 3, 9));
           
           animals.add (new Snakee("sebra","ormisdålmis", false));
           animals.add (new Snakee("blekman", "svenne", true));
            

                /**foretch loop*/
                for(Animall animal : animals) {

                    System.out.println(animal.getInfo());                  
                    textArea.append(animal.getInfo());

                }
		}

	}


