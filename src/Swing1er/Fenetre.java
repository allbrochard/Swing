package Swing1er;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Fenetre extends JFrame{
	public Fenetre(){
		this.setTitle("JE SUIS TROP FORT");//le titre de la fenetre
		this.setSize(1000,800);//dimension
		JPanel Jp = new JPanel();
		Jp.setPreferredSize(new Dimension(50,50));
		Jp.setBackground(Color.red);
		Jp.add(new Label("LOL JE SUIS AUSSI ICI"));
		//	this.setContentPane(Jp);
		this.setLocationRelativeTo(null);//centrer la fenetre 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//pour fermer la fenetre grace a la croix
		this.add(Jp);
		Jp.setBackground(Color.red);
		Jp.setSize(new Dimension(1000, 800));
		this.setResizable(false);
		JButton bouton = new JButton();
		bouton.setText("Click ici :p");
//		bouton.setBackground(Color.WHITE);
		bouton.setPreferredSize(new Dimension(100,50));
		Jp.add(bouton);
		for(int i=1; i<6; i++){
			if(i%2==0){
			JCheckBox Jc = new JCheckBox("test " + i, true);
			Jp.add(Jc);}
			else{
			JCheckBox Jc = new JCheckBox("test " + i, false);
			Jp.add(Jc);}
		}


		ButtonGroup buttonG = new ButtonGroup();
		JRadioButton rad1 = new JRadioButton("oui");
		JRadioButton rad2 = new JRadioButton("non", true);
		buttonG.add(rad2);
		buttonG.add(rad1);
		Jp.add(rad1);
		Jp.add(rad2);


		TextField text = new TextField();
		text.setPreferredSize(new Dimension(150,50));
		Jp.add(text);
		JComboBox<String> comboB = new JComboBox<>();

		comboB.addItem("BLACK");
		comboB.addItem("GREEN");
		comboB.addItem("RED");
		comboB.addItem("YELLOW");
		comboB.addItem("PURPLE");
		comboB.addItem("WHITE");
		comboB.setSelectedItem("RED");
		Jp.add(comboB);

		
		if(comboB.getSelectedItem().equals("BLACK"))Jp.setBackground(Color.BLACK);
		else if(comboB.getSelectedItem().equals("GREEN"))Jp.setBackground(Color.GREEN);
		else if(comboB.getSelectedItem().equals("RED"))Jp.setBackground(Color.RED);
		else if(comboB.getSelectedItem().equals("YELLOW"))Jp.setBackground(Color.YELLOW);
		else if(comboB.getSelectedItem().equals("PURPLE"))Jp.setBackground(Color.MAGENTA);
		else if(comboB.getSelectedItem().equals("WHITE"))Jp.setBackground(Color.WHITE);
		
		Jp.setVisible(true);
		this.setContentPane(Jp);
		this.setVisible(true);//pour pouvoir voir la fenetre 

	}

}
