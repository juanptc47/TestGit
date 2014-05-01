package singleton;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Rectangulo extends Figura {

	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangulo(){
		
	}
	
	public Rectangulo(int x, int y, int width, int height) {
		super();
		this.x = x - width/2;
		this.y = y - height/2;
		this.width = width;
		this.height = height;
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


	@Override
	public void dibuja(Graphics2D g) {
		g.draw(new Rectangle(x, y, width, height));
	}

}
