package Swing1er;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreClick extends JFrame{
	
	private Button bouton;
	private Button bouton2;
	private JPanel panneau = new JPanel();
	
	public FenetreClick() {
		super("une fenetre");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		bouton = new Button("mon bouton 2");
		bouton2 = new Button("mon bouton 2");
		
		bouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bouton.setLabel("tu a cliquer");
			}
			});
		bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			bouton2.setLabel("connard! ");
			}
		});
		panneau.add(bouton);
		panneau.add(bouton2);
		setContentPane(panneau);
		setVisible(true);
		
	}

	

}
