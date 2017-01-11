package Swing1er;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel{

	
	private int i =0;
	public void paintComponent(Graphics g){
		int larg= this.getWidth()/10;
		int haut= this.getHeight()/10;
		int sort=Math.max(Math.min(this.getWidth(), this.getHeight())/2-100,0);
		g.setColor(Color.BLUE);
		g.drawRect((this.getWidth()/2)+larg, (haut), (this.getWidth()/2)-(larg*2), (this.getHeight()/2)-(haut*2));
		g.setColor(Color.GREEN);
		g.drawPolygon(new int[] {(this.getWidth()/4),(larg),(this.getWidth()/2)-larg} ,new int[] {haut,(this.getHeight()/2)-haut,(this.getHeight()/2)-haut} , 3);
		g.setColor(Color.YELLOW);
		g.fillOval(this.getWidth()/4-sort/2, this.getHeight()/4*3-sort/2,sort,sort);
		
		try {
			Image img = ImageIO.read(new File("DarthVader.jpg"));
			g.drawImage(img,(this.getWidth()/2)+50,(this.getHeight()/2)+50,sort,sort,this );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 