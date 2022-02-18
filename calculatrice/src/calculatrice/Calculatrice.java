package calculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import javax.crypto.BadPaddingException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.GridLayout;

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
	private JButton btn_three=new JButton("3");
	private JButton btn_four=new JButton("4");
	private JButton btn_five=new JButton("5");
	private JButton btn_six=new JButton("6");
	private JButton btn_seven=new JButton("7");
	private JButton btn_eight=new JButton("8");
	private JButton btn_nine=new JButton("9");
	private JButton btn_zero=new JButton("0");
	private final JLabel label = new JLabel("");
	//private final JPanel panel=new JPanel();
	private final JPanel pad = new JPanel();
	

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
		//container.setLayout(new FlowLayout());
		screen=new JLabel("0");
		screen.setFont(policeFont);
		
		screen.setHorizontalAlignment(JLabel.RIGHT);
		screen.setPreferredSize(new Dimension(100,30));
		
		JPanel panScreen=new JPanel();
		panScreen.setPreferredSize(new Dimension(100,30));
		
		//ajout ecran
		panScreen.add(screen);
		panScreen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		container.add(panScreen,BorderLayout.NORTH);
		
		//ajout boutton
		CreateButtons();
		
		
		container.add(pad,BorderLayout.CENTER);
		
		container.add(label);
	}
	private void CreateButtons() {
		btn_one.addActionListener((e)->OneListener(e));
		btn_two.addActionListener((e)->TwoListener(e));
		btn_three.addActionListener((e)->ThreeListener(e));
		btn_four.addActionListener((e)->FourListener(e));
		btn_five.addActionListener((e)->FiveListener(e));
		btn_six.addActionListener((e)->SixListener(e));
		btn_seven.addActionListener((e)->SevenListener(e));
		btn_eight.addActionListener((e)->EightListener(e));
		btn_nine.addActionListener((e)->NineListener(e));
		btn_zero.addActionListener((e)->ZeroListener(e));
		
		
		pad.add(btn_one);
		pad.add(btn_two);
		pad.add(btn_three);
		pad.add(btn_four);
		pad.add(btn_five);
		pad.add(btn_six);
		pad.add(btn_seven);
		pad.add(btn_eight);
		pad.add(btn_nine);
		pad.add(btn_zero);
		pad.setLayout(new GridLayout(5,3,10,10));
	}
	private void OneListener(ActionEvent e) {
		screen.setText("1");
	}
	private void TwoListener(ActionEvent e) {
		screen.setText("2");
	}
	private void ThreeListener(ActionEvent e) {
		screen.setText("3");
	}
	private void FourListener(ActionEvent e) {
		screen.setText("4");
	}
	private void FiveListener(ActionEvent e) {
		screen.setText("6");
	}
	private void SixListener(ActionEvent e) {
		screen.setText("6");
	}
	private void SevenListener(ActionEvent e) {
		screen.setText("7");
	}
	private void EightListener(ActionEvent e) {
		screen.setText("8");
	}
	private void NineListener(ActionEvent e) {
		screen.setText("9");
	}
	private void ZeroListener(ActionEvent e) {
		screen.setText("0");
	}
	

}
