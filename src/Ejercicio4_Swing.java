/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Introducción Swing
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Ejercicio4_Swing {

	public static void main(String[] args) {
		
		MarcoConImagenes mimarco=new MarcoConImagenes();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConImagenes extends JFrame{
	
	public MarcoConImagenes() {
		
		setTitle("Prueba con imagenes");
		
		setBounds(250, 300, 300, 200);
		
		LaminaConImagenes milamina =new LaminaConImagenes();
		
		add(milamina);
		
		milamina.setForeground(Color.BLACK);
	}
}

class LaminaConImagenes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		File mimagen=new File("src/graficos/mascota.jpg");
		
		try {
			
			imagen = ImageIO.read(mimagen);
		} catch (IOException e) {
			System.out.println("La imagen no se encuentra");
			
		}
		
		g.drawImage(imagen, 5, 5, null);
	}
	private Image imagen;
	
}
