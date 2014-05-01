package singleton;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circulo extends Figura{
	private int x;
	private int y;
	private int radio;
	
	public Circulo(){
		
	}
	
	public Circulo(int x, int y, int radio) {
		super();
		this.x = x - (radio/2);
		this.y = y - (radio/2);
		this.radio = radio;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public void dibuja(Graphics2D g) {
		g.draw(new Ellipse2D.Double(x, y, radio, radio));
	}

}
