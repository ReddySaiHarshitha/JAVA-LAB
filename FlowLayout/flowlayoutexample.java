package java_gui;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class flowlayoutexample {
	flowlayoutexample(){
		Frame f = new Frame("Flow Layout");
		Button b1 = new Button("India");
		Button b2 = new Button("Pakistan");
		Button b3 = new Button("Japan");
		Button b4 = new Button("China");
		Button b5 = new Button("Countries");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}	
		});
	}
	public static void main(String args[]) {
		new flowlayoutexample();
	}

}
