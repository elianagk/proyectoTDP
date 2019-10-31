package GameObjectGrafico;

import java.awt.*;
import javax.swing.*;


public abstract class GameObjectGrafico extends JLabel {
	protected String imagen;
	protected String imagenatacando;
	
	
	public GameObjectGrafico(String s) {
		imagen= s;
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource(imagen)));
		this.setSize(50, 80);
		
		
		
	}
	
	
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	public void setImagenAtacando(String s) {
		imagenatacando=s;
	}
	
	public abstract void atacar();
	
	public abstract void accionar();
	
	//public abstract void atacar(String s);
	
	
	
	
	
}
