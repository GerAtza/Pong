import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


public class Pelota {
	private static final int xsize=15;
	private static final int ysize=15;
	private double x=0;
	private double y=0;
	private double dx=1;
	private double dy=1;
	
	public void move(Rectangle2D bounds){
		x+=dx;
		y+=dy;
		if(x<bounds.getMinX()){
			x=bounds.getMinX();
			dx=-dx;
		}
		if(x+xsize>=bounds.getMaxX()){
			x=bounds.getMaxX()-xsize;
			dx=-dx;
		}
		if(y<bounds.getMinY()){
			y=bounds.getMinY();
			dy=-dy;
		}
		if(y+ysize>=bounds.getMaxY()){
			y=bounds.getMaxY()-ysize;
			dy=-dy;
		}
	}
	
	public Ellipse2D getShape(){
		return new Ellipse2D.Double(x,y,xsize,ysize);
	}
}
