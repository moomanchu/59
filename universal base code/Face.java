import pkg.*;
public class Face{
	private Ellipse e;
	private Color c;
	public Face(double x, double y,double a, double b){
		e = new Ellipse(x,y,a,b);
		c = new Color(Canvas.rand(255),Canvas.rand(255),Canvas.rand(255));
		e.setColor(c);
	}
	// public Face(double x, double y, c){
		// this(x,y);
		// e.setColor(c);
	// }
	public void translate(int x, int y){
		e.translate(x,y);
	}
	public void draw(){
		e.fill();
	}
}