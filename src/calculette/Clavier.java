package calculette;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Clavier extends JPanel{
	public Clavier(){

		this.setLayout(new GridLayout(4, 3));
		for(int i =1; i<=9;i++){
			JButton bout =new JButton(""+i);
			bout.setFont(new Font("Arial", Font.ITALIC,40));
			bout.setBackground(Color.WHITE);
			this.add(bout);
		}
		JButton bout1 =new JButton("0");
		JButton bout2=new JButton(".");
		JButton bout3 =new JButton("=");
		
		bout3.setFont(new Font("Arial", Font.BOLD,40));
		bout2.setFont(new Font("Arial", Font.BOLD,40));
		bout1.setFont(new Font("Arial", Font.ITALIC,40));
		
		this.add(bout1);this.add(bout2);this.add(bout3);
		this.setVisible(true);
	}

}
