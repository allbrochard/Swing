package calculette;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

public class Fenetre extends JFrame implements MouseListener {
	String text = "CALCULATOR";
	Color col ;
	JPanel ecran;
	JLabel lab;

	boolean cPlus;
	boolean cMoins;
	boolean cFois;
	boolean cDivi;
	int ope=0;
	int operation=0;

	JButton cancel = new JButton("C");
	JButton plus = new JButton("+");
	JButton	moins = new JButton("-");
	JButton fois = new JButton("*");
	JButton divi = new JButton("/");
	JButton bout1 =new JButton("0");
	JButton bout2=new JButton(".");
	JButton bout3 =new JButton("=");
	JPanel clavier = Clavier();
	JPanel pane = Panneau();
	BorderLayout obj= new BorderLayout();
	JPanel pan = new JPanel();
	JPopupMenu pop = new JPopupMenu();
	JMenuBar barreMenu = new JMenuBar();
	JMenu couleur = new JMenu("Theme");


	public Fenetre(){

		this.getContentPane().setLayout(new BorderLayout());
		this.setTitle("Calculatrice");
		this.setSize(800,1000);
		this.setBackground(Color.RED);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pan.setLayout(new BorderLayout());
		this.setContentPane(pan);
		lab = new JLabel(text);
		ecran = new JPanel();




		lab.setFont(new Font("Arial", Font.BOLD,40));
		lab.setForeground(Color.WHITE);

		//	clav.setBackground(Color.BLUE);

		ecran.setLayout(obj);
		ecran.setBackground(Color.DARK_GRAY);
		ecran.add(lab,BorderLayout.EAST);
		ecran.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()/5));
		ecran.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 50));

		pane.setPreferredSize(new Dimension(this.getWidth()/5, this.getHeight()));

		pan.setBackground(Color.BLACK);
		pan.add(ecran, BorderLayout.NORTH);
		pan.add(clavier, BorderLayout.CENTER);
		pan.add(pane, BorderLayout.EAST);
		pan.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));


		setJMenuBar(barreMenu);
		barreMenu.add(couleur);

		barreMenu.setBackground(col);
		couleur.setBackground(col);
		couleur.setForeground(Color.WHITE);
		JMenuItem dark = new JMenuItem("Hell");
		dark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				col=new Color(150,0,0);
				for (Component loop : pane.getComponents()) {
					if (loop instanceof JButton) { 
						((JButton)loop).setBackground(col);
					}
				}

				for (Component loop : clavier.getComponents()) {
					if (loop instanceof JButton) { 
						((JButton)loop).setBackground(Color.DARK_GRAY);
						((JButton)loop).setForeground(Color.WHITE);
					}
				}
				ecran.setBackground(Color.BLACK);
				lab.setForeground(Color.WHITE);
				barreMenu.setBackground(col);
				bout2.setBackground(col);
				bout3.setBackground(col);
				cancel.setForeground(new Color(229,130,0));
			}
		});
		couleur.add(dark);
		couleur.addSeparator();

		JMenuItem light = new JMenuItem("Winter");
		light.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				col=new Color(89,160,253);
				for (Component loop : pane.getComponents()) {
					if (loop instanceof JButton) { 
						((JButton)loop).setBackground(col);
					}
				}

				for (Component loop : clavier.getComponents()) {
					if (loop instanceof JButton) { 
						((JButton)loop).setBackground(new Color(150,205,255));
						((JButton)loop).setForeground(Color.DARK_GRAY);
					}
				}
				ecran.setBackground(Color.WHITE);
				lab.setForeground(Color.BLACK);
				barreMenu.setBackground(col);
				bout2.setBackground(col);
				bout3.setBackground(col);
				bout2.setForeground(Color.white);
				bout3.setForeground(Color.WHITE);
				cancel.setForeground(col = new Color(255,50,50));
			}
		});
		couleur.add(light);

		JMenuItem classic = new JMenuItem("Classic");
		classic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				col=new Color(222, 119, 2);
				for (Component loop : pane.getComponents()) {
					if (loop instanceof JButton) { 
						((JButton)loop).setBackground(col);
					}
				}

				for (Component loop : clavier.getComponents()) {
					if (loop instanceof JButton) { 
						((JButton)loop).setBackground(Color.WHITE);
						((JButton)loop).setForeground(Color.DARK_GRAY);
					}
				}
				ecran.setBackground(Color.DARK_GRAY);
				lab.setForeground(Color.WHITE);
				barreMenu.setBackground(col);
				bout2.setBackground(col);
				bout3.setBackground(col);
				cancel.setForeground(Color.red);
			}	
		});
		couleur.add(classic);

		JMenuItem click = new JMenuItem("Clicker ici");
		pop.add(click);
		click.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
				col= new Color(255,255,255);
				setBackground(Color.WHITE);
				pane.setVisible(false);
				clavier.setVisible(false);
				pan.setBackground(Color.WHITE);

				ecran.setBackground(col);
				lab.setForeground(Color.BLACK);
				lab.setText("Ceci n'est pas une calculatrice");
				barreMenu.setBackground(col);
				bout2.setBackground(col);
				bout3.setBackground(col);
				cancel.setForeground(col);
				for (Component loop : pane.getComponents()) {

					if (loop instanceof JButton) { 
						((JButton)loop).setBackground(col);
					}
				}

				for (Component loop : clavier.getComponents()) {

					if (loop instanceof JButton) { 
						((JButton)loop).setBackground(col);
						((JButton)loop).setForeground(col);
					}
				}
			}
		});
		pan.setVisible(true);
		this.setVisible(true);
		addMouseListener(this);
		bout3.addActionListener(new ActionListener(
				) {

			@Override
			public void actionPerformed(ActionEvent e) {
				col= new Color(255,255,255);
				setBackground(Color.WHITE);
				pane.setVisible(false);
				clavier.setVisible(false);
				pan.setBackground(Color.WHITE);

				ecran.setBackground(col);
				lab.setForeground(Color.BLACK);
				lab.setText("Ceci n'est pas une calculatrice ;p  ");
				barreMenu.setBackground(col);
				bout2.setBackground(col);
				bout3.setBackground(col);
				cancel.setForeground(col);
				for (Component loop : pane.getComponents()) {

					if (loop instanceof JButton) { 
						((JButton)loop).setBackground(col);
					}
				}

				for (Component loop : clavier.getComponents()) {

					if (loop instanceof JButton) { 
						((JButton)loop).setBackground(col);
						((JButton)loop).setForeground(col);
					}
				}
			}
		});
	}
	public JPanel Panneau(){
		JPanel pan = new JPanel();

		pan.setBorder(BorderFactory.createEmptyBorder(2, 3, 0, 0));
		pan.setBackground(Color.BLACK);
		col = new Color(222, 119, 2);


		GridLayout obj= new GridLayout(0,1);


		cancel.setToolTipText("pour remetre a zero");
		plus.setToolTipText("addition");
		moins.setToolTipText("soustraction");
		fois.setToolTipText("multiplication");
		divi.setToolTipText("division");

		obj.setHgap(0);
		obj.setVgap(3);
		pan.setLayout(obj);

		cancel.setForeground(Color.red);
		plus.setForeground(Color.WHITE);
		moins.setForeground(Color.WHITE);
		fois.setForeground(Color.WHITE);
		divi.setForeground(Color.WHITE);

		cancel.setFont(new Font("Arial", Font.BOLD,40));
		plus.setFont(new Font("Arial", Font.BOLD,40));
		moins.setFont(new Font("Arial", Font.BOLD,40));
		fois.setFont(new Font("Arial", Font.BOLD,40));
		divi.setFont(new Font("Arial", Font.BOLD,40));

		cancel.setBackground(col);
		plus.setBackground(col);
		moins.setBackground(col);
		fois.setBackground(col);
		divi.setBackground(col);

		cancel.addActionListener(new OperationClick());
		plus.addActionListener(new OperationClick());
		moins.addActionListener(new OperationClick());
		fois.addActionListener(new OperationClick());
		divi.addActionListener(new OperationClick());

		pan.add(cancel);
		pan.add(plus);
		pan.add(moins);
		pan.add(fois);
		pan.add(divi);

		pan.setVisible(true);
		return pan;



	}

	public JPanel Clavier(){
		JPanel clav = new JPanel();
		clav.setBorder(BorderFactory.createEmptyBorder(3,0,0,0));
		clav.setBackground(Color.BLACK);
		GridLayout obj= new GridLayout(4,3);
		obj.setHgap(3);
		obj.setVgap(3);
		clav.setLayout(obj);
		for(int i =1; i<=9;i++){
			JButton bout =new JButton(""+i);
			bout.setFont(new Font("Arial", Font.ITALIC,40));
			bout.setBackground(Color.WHITE);
			bout.setToolTipText("votre chiffre a selectionner");
			bout.addActionListener(new clickCalculette());
			clav.add(bout);
		}

		Color col = new Color(222, 119, 2);

		bout1.addActionListener(new clickCalculette());
		bout2.addActionListener(new clickCalculette());
		bout3.addActionListener(new EgalOperation());

		bout3.setFont(new Font("Arial", Font.BOLD,40));
		bout2.setFont(new Font("Arial", Font.BOLD,40));
		bout1.setFont(new Font("Arial", Font.ITALIC,40));

		bout1.setToolTipText("votre chiffre a selectionner");
		bout2.setToolTipText("pour un chiffre decimal");
		bout3.setToolTipText("pour le résultat de votre calcul");

		bout2.setBackground(col);
		bout3.setBackground(col);

		bout2.setForeground(Color.WHITE);
		bout3.setForeground(Color.WHITE);

		clav.add(bout1);clav.add(bout2);clav.add(bout3);
		clav.setVisible(true);
		return clav;
	}

	/*
	 * 
	 * 		click.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
				col= new Color(255,255,255);
				setBackground(Color.WHITE);
				pane.setVisible(false);
				clavier.setVisible(false);
				pan.setBackground(Color.WHITE);

				ecran.setBackground(col);
				lab.setForeground(Color.BLACK);
				lab.setText("Ceci n'est pas une calculatrice");
				barreMenu.setBackground(col);
				bout2.setBackground(col);
				bout3.setBackground(col);
				cancel.setForeground(col);
				for (Component loop : pane.getComponents()) {

				    if (loop instanceof JButton) { 
				       ((JButton)loop).setBackground(col);
				    }
				}

				for (Component loop : clavier.getComponents()) {

				    if (loop instanceof JButton) { 
				       ((JButton)loop).setBackground(col);
				       ((JButton)loop).setForeground(col);
				    }
				}
			}
		});
	 */

	class clickCalculette  implements ActionListener{

		String ecr;
		public void actionPerformed(ActionEvent e) {
			ecr =((JButton) e.getSource()).getText();
			//			if(ecr.equals("0")||ecr.equals("1")||ecr.equals("2")||ecr.equals("3")||ecr.equals("4")||ecr.equals("5")||ecr.equals("6")||ecr.equals("7")||ecr.equals("8")||ecr.equals("9")/*||ecr.equals("."*/){
			if(text.equals("80085")||text.equals("")||text.equals("CALCULATOR")){text=((JButton) e.getSource()).getText();}
			else text=text.concat(((JButton) e.getSource()).getText());
			lab.setText(text);
			//}
		}
	}
	class OperationClick implements ActionListener{
		String opec;
		public void actionPerformed(ActionEvent e) {
			opec=((JButton) e.getSource()).getText();
			switch(opec){
				
			case "-":
				System.out.println("moins");
				text="";
				cMoins=true;
				ope-=operation;
				break;
			case "*":
				System.out.println("multiplier");
				text="";
				cFois=true;
				break;
			case "/":
				System.out.println("diviser");
				text="";
				cDivi=true;
				break;
			case "C":
				System.out.println("Cancel");
				text="";
				lab.setText(text);
				cPlus=false;cMoins=false;cFois=false;cDivi=false;
				break;
			default: text="";
			}

			System.out.println(ope);
		}
	}
	class EgalOperation implements ActionListener{

		String egal;
		public void actionPerformed(ActionEvent e) {

			egal =((JButton) e.getSource()).getText();

			if (cPlus){
				System.out.println("plus");
				ope+=operation;
				cPlus=false;
			}
			else if(cMoins){
				System.out.println("moins");
				cMoins=false;
			}
			else if (cFois){
				System.out.println("multiplier");
				cMoins=false;
			}
			else if (cDivi){
				System.out.println("diviser");
				cDivi=false;
			}	


		}

	}
	@Override
	public void mouseClicked(MouseEvent e) {

		String equal=((JButton) e.getSource()).getText();
		if (equal.equals("=")){
			col= new Color(255,255,255);
			setBackground(Color.WHITE);
			pane.setVisible(false);
			clavier.setVisible(false);
			pan.setBackground(Color.WHITE);

			ecran.setBackground(col);
			lab.setForeground(Color.BLACK);
			lab.setText("Ceci n'est pas une calculatrice");
			barreMenu.setBackground(col);
			bout2.setBackground(col);
			bout3.setBackground(col);
			cancel.setForeground(col);
			for (Component loop : pane.getComponents()) {

				if (loop instanceof JButton) { 
					((JButton)loop).setBackground(col);
				}
			}

			for (Component loop : clavier.getComponents()) {

				if (loop instanceof JButton) { 
					((JButton)loop).setBackground(col);
					((JButton)loop).setForeground(col);
				}
			}
		}
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON3){
			pop.show(getContentPane(),e.getX(),e.getY());
		}
		System.out.println("ça fonctionne");
	}
}