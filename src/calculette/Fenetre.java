package calculette;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	
	
public Fenetre(){
	JPanel pan = new JPanel();
	this.getContentPane().setLayout(new BorderLayout());
	this.setTitle("Calculatrice");
	this.setSize(800,1000);
	this.setBackground(Color.RED);
	this.setLocationRelativeTo(null);
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pan.setLayout(new BorderLayout());
	this.setContentPane(pan);
	
	JLabel lab = new JLabel("80085");
	JPanel ecran = new JPanel();
	Clavier clav = new Clavier();
	Panneau pane = new Panneau();
	
	lab.setFont(new Font("Arial", Font.BOLD,40));
	lab.setForeground(Color.WHITE);
	
//	clav.setBackground(Color.BLUE);
	
	ecran.setLayout(new BorderLayout());
	ecran.setBackground(Color.DARK_GRAY);
	ecran.add(lab,BorderLayout.EAST);
	ecran.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()/5));
	ecran.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 50));
	
	pane.setPreferredSize(new Dimension(this.getWidth()/5, this.getHeight()));
	
	pan.add(ecran, BorderLayout.NORTH);
	pan.add(clav, BorderLayout.CENTER);
	pan.add(pane, BorderLayout.EAST);
	
	pan.setVisible(true);
	this.setVisible(true);
	
}
}
