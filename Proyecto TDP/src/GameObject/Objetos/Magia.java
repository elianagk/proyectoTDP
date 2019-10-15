package GameObject.Objetos;

import javax.swing.JLabel;

import GameObject.Objeto;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import Mapa.MapaLogico;

public abstract class Magia extends Objeto {
	protected int duracion;
	
	public Magia(MapaLogico mapaLogico, GameObjectGrafico aumentoDeDaņoGrafico, int duracion) {
		super(mapaLogico, aumentoDeDaņoGrafico);
		this.duracion= duracion;
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JLabel getGrafico() {
		last_dir= still_key;
		return miObjetoGrafico;
	}
}
