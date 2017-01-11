package Swing1er;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Panel extends JFrame{
	JPanel Jp = new JPanel();
	
public Panel(){
	this.setTitle("Welcome");
	this.setSize(1000,800);
	JPanel Jp1 = new JPanel();
	Jp1.setLayout(new BorderLayout());
	JButton bout = new JButton("viens!!");
	Jp1.add(new JButton("bout 1"),BorderLayout.NORTH);
	Jp1.add(new JButton("bout 2"),BorderLayout.SOUTH);
	Jp1.add(new JButton("bout 3"),BorderLayout.WEST);
	Jp1.add(new JButton("bout 4"),BorderLayout.EAST);
	Jp1.add(new JButton("bout 5"),BorderLayout.CENTER);
//	for(int i =1; i<5; i++){
//		JButton bout1 = new JButton("bouton" +i);
//		Jp.add(bout1, BoxLayout.LINE_AXIS);
//	}
	JPanel Jp2 = new JPanel();
	Jp2.setLayout(new BoxLayout(Jp2, BoxLayout.LINE_AXIS));
	ButtonGroup buttonG = new ButtonGroup();
	JRadioButton rad1 = new JRadioButton("oui");
	JRadioButton rad2 = new JRadioButton("non", true);
	buttonG.add(rad2);
	buttonG.add(rad1);
	Jp2.add(rad1);
	Jp2.add(rad2);
	
	JPanel Jp3 = new JPanel();
	Jp3.setLayout(new GridLayout(3,2));
	TextField text = new TextField();
	text.setPreferredSize(new Dimension(150,50));
	Jp3.add(text);
	JComboBox<String> comboB = new JComboBox<>();
	comboB.addItem("BLACK");
	comboB.addItem("GREEN");
	comboB.addItem("RED");
	comboB.addItem("YELLOW");
	comboB.addItem("PURPLE");
	comboB.addItem("WHITE");
	comboB.setSelectedItem("RED");
	Jp3.add(comboB);
	
	Jp.setLayout(new BoxLayout(Jp, BoxLayout.LINE_AXIS));
	Jp.add(Jp1);
	Jp.add(Jp2);
	Jp.add(Jp3);
	Jp.setVisible(true);
	this.setContentPane(Jp);
	this.setVisible(true);
	
}
public void test(){
    this.setTitle("Box Layout");
    this.setSize(300, 120);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    JPanel b1 = new JPanel();
    //On définit le layout en lui indiquant qu'il travaillera en ligne
    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
    b1.add(new JButton("Bouton 1"));

    JPanel b2 = new JPanel();
    //Idem pour cette ligne
    b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
    b2.add(new JButton("Bouton 2"));
    b2.add(new JButton("Bouton 3"));

    JPanel b3 = new JPanel();
    //Idem pour cette ligne
    b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
    b3.add(new JButton("Bouton 4"));
    b3.add(new JButton("Bouton 5"));
    b3.add(new JButton("Bouton 6"));

    JPanel b4 = new JPanel();
    //On positionne maintenant ces trois lignes en colonne
    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
    b4.add(b1);
    b4.add(b2);
    b4.add(b3);
		
    this.getContentPane().add(b4);
    this.setVisible(true);
}

}
