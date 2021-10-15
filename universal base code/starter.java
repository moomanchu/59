import pkg.*;
import java.util.ArrayList;
import java.util.Random;

public class starter implements InputControl, InputKeyControl {
	
	static Face f;
	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		Color co = new Color(Canvas.rand(255),Canvas.rand(255),Canvas.rand(255));
		Car c = new Car(1,1,"AC/DC",co);
		c.draw();
		
		f = new Face(10,10,20,20);
		f.draw();
		
		while(true){
			c.Drive(1,8);
		}
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here
		if(s.equals("a")){
			f.translate(-5,0);
		}
		if(s.equals("w")){
			f.translate(0,-5);
		}
		if(s.equals("s")){
			f.translate(0,5);
		}
		if(s.equals("d")){
			f.translate(5,0);
		}

	}
}
