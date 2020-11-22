import java.awt.*;
public class ButtonExample{
	public static void main(String[] args) {
		Frame f=new Frame("Exampel");
		Button b=new Button("Click on me");
		b.setBounds(80,100,80,30);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}