package calculatrice;

import java.awt.EventQueue;
import java.awt.Font;

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
	private JFrame frame;
	private JPanel container = new JPanel();
	
	private JLabel screen = new JLabel();
	
	
	

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
		

	}

}
