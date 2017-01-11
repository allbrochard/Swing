package calculette;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panneau extends JPanel{
public Panneau(){
	
	this.setLayout(new GridLayout(0, 1));
	this.setVisible(true);
	
	JButton cancel = new JButton("C");
	JButton plus = new JButton("+");
	JButton	moins = new JButton("-");
	JButton fois = new JButton("*");
	JButton divi = new JButton("/");
	
	cancel.setForeground(Color.red);
	cancel.setFont(new Font("Arial", Font.BOLD,40));
	plus.setFont(new Font("Arial", Font.BOLD,40));
	moins.setFont(new Font("Arial", Font.BOLD,40));
	fois.setFont(new Font("Arial", Font.BOLD,40));
	divi.setFont(new Font("Arial", Font.BOLD,40));
	
	this.add(cancel);
	this.add(plus);
	this.add(moins);
	this.add(fois);
	this.add(divi);
}
}
