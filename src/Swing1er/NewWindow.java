package Swing1er;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NewWindow extends JFrame{

	public NewWindow(){
		this.setContentPane(new Panneau());
		this.setSize(800,800);
		this.setVisible(true);
		
	}

}
