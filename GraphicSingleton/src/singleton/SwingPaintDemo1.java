package singleton;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SwingPaintDemo1 {

	public static void main(String[] args) {
		SwingPaintDemo1.createAndShowGUI();	
	}

	private static void createAndShowGUI() {
		JFrame f = new JFrame("Swing Paint Demo");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(250, 250);
		f.add(new MyPanel());

		f.setVisible(true);
	}

}

class MyPanel extends JPanel {

	private static final long serialVersionUID = -1648357941970694830L;
	Hashtable<Integer, Figura> figurasADibujar = new Hashtable<Integer,Figura>();
	
	private static int i = 1;
	
	public MyPanel() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		
		this.addMouseListener(new miListener());
	}
	
	public static int getI() {
		return i;
	}
	
	public static void setI(int i) {
		MyPanel.i = i;
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Figura f;
		Enumeration<Integer> enumKey = figurasADibujar.keys();
		
		if (figurasADibujar.isEmpty()) {
			System.out.println("La tabla esta vacia\n");
		} else {
			while (enumKey.hasMoreElements()) {
				Integer key = (Integer) enumKey.nextElement();
				f = figurasADibujar.get(key);
				f.dibuja(g2);
				
			}
		}
	}
	
	class miListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int j;
			j = getI();
			
			System.out.println(e.getX() + " " + e.getY());
			if (j%2 == 0) {
				figurasADibujar.put(j, new Circulo(e.getX(), e.getY(), 20));
			} else {
				figurasADibujar.put(j, new Rectangulo(e.getX(), e.getY(),20,20));
			}
			setI(j + 1);
			repaint();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}



