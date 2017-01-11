package Swing1er;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class retour extends JFrame implements MouseListener{
public retour(String label){
	super(label);
	addMouseListener(this);
	setSize(300,200);
	this.setLocation((int)(Math.random()*1000),(int)(Math.random()*1000));
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		Listner fen = new Listner();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("tu en sort !!!!");
		Listner fen = new Listner();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
