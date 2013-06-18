import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Rebote extends JFrame {
	private PelotaComponent comp;
	
	public static int DEFAULT_WIDTH=450;
	public static int DEFAULT_HEIGTH=350;
	public static final int PASOS=1000;
	public static final int RETRASO=3;
	
	public Rebote(){
		this.setSize(DEFAULT_WIDTH,DEFAULT_HEIGTH);
		this.setTitle("Salto Rebote");
		comp=new PelotaComponent();
		
		
		JPanel buttonPanel = new JPanel();
		this.addButton(buttonPanel,"iniciar",new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addPelota();
			}
		});	
		
		this.addButton(buttonPanel,"cerrar",new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		this.add(buttonPanel,BorderLayout.SOUTH);
		this.add(comp,BorderLayout.CENTER);
	}
	
	public void addButton(Container c,String titulo,ActionListener listener){
		JButton btn=new JButton(titulo);
		c.add(btn);
		btn.addActionListener(listener);
	}
	
	public void addPelota(){
		Pelota p=new Pelota();
		comp.addPelota(p);
		for(int i=1;i<PASOS;i++){
			p.move(comp.getBounds());
			comp.paint(comp.getGraphics());
			try {
				Thread.sleep(RETRASO);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
		}
	}
}
