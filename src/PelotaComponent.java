import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;


public class PelotaComponent extends JPanel{
	private ArrayList<Pelota> Pelotas=new ArrayList<Pelota>();
	
	public void addPelota(Pelota p){
		Pelotas.add(p);
	}
	public void component(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		for(Pelota p:Pelotas){
			g2.fill(p.getShape());
		}
	}
}
