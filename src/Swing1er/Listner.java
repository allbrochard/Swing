package Swing1er;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Listner extends JFrame implements MouseListener {
//	MonBouton lol = new MonBouton("youpi");
	JPopupMenu pop = new JPopupMenu();
public Listner(){
	super("Une fenetre qui traite les clics souris");
	setSize(300,200);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	addMouseListener(this);
	pop.add(new JMenuItem("lol"));
//	this.add(lol);
}
	@Override
	public void mouseClicked(MouseEvent e) {
//		lol.setBackground(Color.BLACK);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("tu viens de rentrer dans la fenetre");
		retour fen = new retour("lol");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("tu en sort !!!!");
		retour fen = new retour("lol");
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("reste pas trop appuyer");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON3){
			pop.show(getContentPane(),e.getX(),e.getY());
			System.out.println("ça fonctionne");
		}
		
	
	}
	

}
