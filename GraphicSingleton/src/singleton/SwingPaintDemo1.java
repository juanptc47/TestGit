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
		f.add(new SingletonPanel());

		f.setVisible(true);
	}

}






