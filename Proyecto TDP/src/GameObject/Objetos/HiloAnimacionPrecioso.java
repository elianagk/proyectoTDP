package GameObject.Objetos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.GameObject;
import Mapa.MapaLogico;
import State.Jugando;

public abstract class HiloAnimacionPrecioso extends Thread {
	
	protected MapaLogico mapaLogico;
	protected MapaGrafico mapa;
	protected JLabel label;
	protected int tiempo;
	protected ObjetoPrecioso miobjeto;
	
	public HiloAnimacionPrecioso(MapaLogico mapa, ObjetoPrecioso g) {
		mapaLogico=mapa;
		this.mapa= mapaLogico.getMapaGrafico();
		miobjeto=g;
		this.label =g.getGrafico();
		this.label.setBounds(miobjeto.getX(), miobjeto.getY(), 100, 100);
		
		
	}
	
	
	@SuppressWarnings("deprecation")
	public void run() {
		mapa.add(label);
		miobjeto.activar();
		
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		mapa.remove(label);;
		
		this.stop();
		mapaLogico.getJuego().cambiarEstado(new Jugando(mapaLogico.getJuego()));
	}
	
}