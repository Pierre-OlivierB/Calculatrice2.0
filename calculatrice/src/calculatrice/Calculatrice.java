package calculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Calculatrice extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3900224470578951048L;
	//private JFrame frame;
	private JPanel container = new JPanel();
	
	private JLabel screen = new JLabel();
	
	private JButton btn_one=new JButton("1");
	private JButton btn_two=new JButton("2");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new NimbusLookAndFeel()); 
					Calculatrice window = new Calculatrice();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculatrice() {
		this.setSize(800, 500);
		this.setTitle("Calculatrice");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		container.setLayout(new FlowLayout());
		initialize();
		this.setContentPane(container);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Font policeFont = new Font("Arial", Font.BOLD, 20);
		screen=new JLabel("0");
		screen.setFont(policeFont);
		
		screen.setHorizontalAlignment(JLabel.RIGHT);
		screen.setPreferredSize(new Dimension(100,30));
		
		JPanel panScreen=new JPanel();
		panScreen.setPreferredSize(new Dimension(100,30));
		//ajout boutton
		
		btn_one.addActionListener((e)->OneListener(e));
		container.add(btn_one,BorderLayout.EAST);
		
		//ajout ecran
		panScreen.add(screen);
		panScreen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		container.add(panScreen,BorderLayout.NORTH);
	}
	private void OneListener(ActionEvent e) {
		screen.setText("1");
	}

}
