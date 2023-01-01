/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Introducción Swing
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class Ejercicio3_Swing {

	public static void main(String[] args) {
		
		MarcoConColor mimarco=new MarcoConColor();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		
		setTitle("Ejercicio3");
		
		setSize(400, 400);
		
		LaminaConColor milamina =new LaminaConColor();
		
		add(milamina);
		
		milamina.setBackground(SystemColor.window);
	}
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.setPaint(Color.BLUE);
		
		g2.fill(rectangulo);
		
		g2.draw(rectangulo);

		
	}
	
	
}
