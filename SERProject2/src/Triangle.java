import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Path2D;

/**
 * @author Rishika Bera
 * @version 1.0
 */
public class Triangle extends Shapes {
	double x, y;
	Path2D path = null;
	public Triangle(double x, double y) {
		// TODO Auto-generated constructor stub
		this.x = x - 50;
		this.y = y + 50;
	}
	/**
	 * Draw a triangle using Path2D
	 * @param graphic
	 * @param x - x coordinate for the shape
	 * @param y - y coordinate for the shape
	 */
	@Override
	public void drawShape(Graphics graphic) {
		double x1 = x , y1 = y ;
		
		path = new Path2D.Double();
		path.moveTo(x1, y1);
		path.lineTo(x1 + 100, y1 - 150);
		path.lineTo(x1 + 200, y1);
		path.closePath();
		Graphics2D g2 = (Graphics2D) graphic;
		new Dot(x1+15, y1-15).drawShape(g2);
		new Dot(x1+175, y1-15).drawShape(g2);
		new Dot(x1+94, y1-135).drawShape(g2);
		g2.draw(path);
		
		
	}

	@Override
	public boolean containsPoint(int x, int y) {
		// TODO Auto-generated method stub
		return path.contains(x, y);
	}
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return (int) x;
	}
	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x = x -50 ;
	}
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return (int) y;
	}
	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.y = y + 50;
	}
	
}
