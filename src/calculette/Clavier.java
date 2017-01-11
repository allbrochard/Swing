package calculette;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Clavier extends JPanel{
	public Clavier(){
		this.setBorder(BorderFactory.createEmptyBorder(3,0,0,0));
		this.setBackground(Color.BLACK);
		GridLayout obj= new GridLayout(4,3);
		obj.setHgap(3);
		obj.setVgap(3);
		this.setLayout(obj);
		for(int i =1; i<=9;i++){
			JButton bout =new JButton(""+i);
			bout.setFont(new Font("Arial", Font.ITALIC,40));
			bout.setBackground(Color.WHITE);
			this.add(bout);
		}
		JButton bout1 =new JButton("0");
		JButton bout2=new JButton(".");
		JButton bout3 =new JButton("=");
		Color col = new Color(222, 119, 2);
		
		bout1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		bout3.setFont(new Font("Arial", Font.BOLD,40));
		bout2.setFont(new Font("Arial", Font.BOLD,40));
		bout1.setFont(new Font("Arial", Font.ITALIC,40));
		
		bout2.setBackground(col);
		bout3.setBackground(col);
		

		
		this.add(bout1);this.add(bout2);this.add(bout3);
		this.setVisible(true);
	}

}
