package java_gui;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class borderlayoutexample {
   borderlayoutexample(){
		Frame f = new Frame("Border Layout");
		Button b =new Button("India"); 
		Button b2 =new Button("Pakistan"); 
		Button b3 =new Button ("Japan"); 
		Button b4 =new Button("China");
		Button b5 =new Button("Countries");
		f.setLayout(new BorderLayout(20,20));
		f.add(b,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		f.setSize(300,300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}	
		});

	}
	public static void main(String args[]) {
		new borderlayoutexample();
	}

}
