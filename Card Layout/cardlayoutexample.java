package java_gui;
import java.awt.*;
import java.awt.event.*;
public class cardlayoutexample implements ActionListener {
	CardLayout c ;
	Frame f = new Frame("Card Layout");
	cardlayoutexample(){
		c=new CardLayout();
		Button b1 = new Button("India");
		Button b2 = new Button("Pakistan");
		Button b3 = new Button("Japan");
		Button b4 = new Button("China");
		Button b5 = new Button("Countries");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.setLayout(c);
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}	
		});
	}
	public void actionPerformed(ActionEvent e)  { 
		c.next(f);
 }
	public static void main(String args[]) {
		new cardlayoutexample();
	}

}
