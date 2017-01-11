package calculette;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	static String text = "80085";

	JPanel ecran;
	JLabel lab;

	boolean cPlus;
	boolean cMoins;
	boolean cFois;
	boolean cDivi;
	int ope=0;
	int operation=0;

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

		lab = new JLabel(text);
		ecran = new JPanel();
		JPanel clavier = Clavier();
		JPanel pane = Panneau();
		BorderLayout obj= new BorderLayout();



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

		pan.setVisible(true);
		this.setVisible(true);

	}
	public JPanel Panneau(){
		JPanel pan = new JPanel();

		pan.setBorder(BorderFactory.createEmptyBorder(2, 3, 0, 0));
		pan.setBackground(Color.BLACK);
		pan.setVisible(true);

		JButton cancel = new JButton("C");
		JButton plus = new JButton("+");
		JButton	moins = new JButton("-");
		JButton fois = new JButton("*");
		JButton divi = new JButton("/");
		GridLayout obj= new GridLayout(0,1);
		Color col = new Color(222, 119, 2);

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
			bout.addActionListener(new clickCalculette());
			clav.add(bout);
		}
		JButton bout1 =new JButton("0");
		JButton bout2=new JButton(".");
		JButton bout3 =new JButton("=");
		Color col = new Color(222, 119, 2);

		bout1.addActionListener(new clickCalculette());
		//bout2.addActionListener(new clickCalculette());
		bout3.addActionListener(new EgalOperation());

		bout3.setFont(new Font("Arial", Font.BOLD,40));
		bout2.setFont(new Font("Arial", Font.BOLD,40));
		bout1.setFont(new Font("Arial", Font.ITALIC,40));

		bout2.setBackground(col);
		bout3.setBackground(col);

		bout2.setForeground(Color.WHITE);
		bout3.setForeground(Color.WHITE);

		clav.add(bout1);clav.add(bout2);clav.add(bout3);
		clav.setVisible(true);
		return clav;
	}
	public static String getText() {
		return text;
	}
	public static void setText(String text) {
		Fenetre.text = text;
	}
//fonction split


	class clickCalculette  implements ActionListener{

		String ecr;
		public void actionPerformed(ActionEvent e) {
			ecr =((JButton) e.getSource()).getText();
			//			if(ecr.equals("0")||ecr.equals("1")||ecr.equals("2")||ecr.equals("3")||ecr.equals("4")||ecr.equals("5")||ecr.equals("6")||ecr.equals("7")||ecr.equals("8")||ecr.equals("9")/*||ecr.equals("."*/){
			if(text.equals("80085")||text.equals("")){text=((JButton) e.getSource()).getText();}
			else text=text.concat(((JButton) e.getSource()).getText());
			lab.setText(text);
			//}
		}
	}
	class OperationClick implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {

				switch(((JButton) e.getSource()).getText()){
				case "+":
					System.out.println("plus");
					cPlus=true;
					operation = Integer.parseInt(lab.getText());
					
					break;
				case "-":
					System.out.println("moins");
					cMoins=true;
					operation = Integer.parseInt(lab.getText());
					
					ope-=operation;
					break;
				case "*":
					System.out.println("multiplier");
					operation = Integer.parseInt(lab.getText());
					cFois=true;
					
					
					
					break;
				case "/":
					System.out.println("diviser");
					operation = Integer.parseInt(lab.getText());
					cDivi=true;
					
					break;
				case "C":
					System.out.println("Cancel");
					operation = Integer.parseInt(lab.getText());
					text="";
					lab.setText(text);
					cPlus=false;cMoins=false;cFois=false;cDivi=false;
					break;
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
}