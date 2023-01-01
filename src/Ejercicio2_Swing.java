/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Introducción Swing
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import javax.swing.*;

import java.awt.*;

public class Ejercicio2_Swing {

	public static void main(String[] args) {
		MarcoConTexto mimarco = new MarcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoConTexto extends JFrame {
	
	public MarcoConTexto() {
		
		setVisible(true);
		
		setSize(600, 450);
		
		setLocation(400, 200);
		
		setTitle("Mi primer texto");
		
		Lamina milamina=new Lamina();
		
		add(milamina);
	}
}
class Lamina extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Bienvenidos al blog de Java", 50, 50);
	}
}

