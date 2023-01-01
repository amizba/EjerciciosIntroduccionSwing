/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Introducci�n Swing
*
* @author Amparo Izquierdo Ba�ez
* @mail amizba@gmail.com
*/
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class Ejercicio1_Swing {

	public static void main(String[] args) {
		MarcoCentrado mimarco= new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}
class MarcoCentrado extends JFrame {
	
	public MarcoCentrado() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanopantalla = mipantalla.getScreenSize();
		
		int alturaPantalla=tamanopantalla.height;
		
		int anchoPantalla=tamanopantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
	}
}

