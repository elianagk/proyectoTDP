package GameObjectGrafico.PersonajesGrafico.EnemigosGrafico;

import javax.swing.ImageIcon;

import GameObjectGrafico.PersonajesGrafico.EnemigoGrafico;

public class ApuGrafico extends EnemigoGrafico {
	
	public ApuGrafico(String s) {
		super (s);
	}

	
	
	public void cambiarPosicion() {
		this.setImagen("apu2.png");
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource(imagen)));
	}
	
	
	
	public void avanzar() {
		
	}
	
	

}
