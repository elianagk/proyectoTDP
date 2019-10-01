package GameObject.Personajes.Torres;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.MargeGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public class Marge extends Torre {
	
	public Marge(MapaLogico mapaLogico) {
		super(80, 30, 50, 1, mapaLogico, new MargeGrafico());
	}
	
	
	@Override
	public void atacar() {
		// gif atacando
		
		
	}
	
	public GameObject clone() {
		return new Marge(mapaLogico);
	}


	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
		
	}


	@Override
	public void aplicarDa�o(int da�o) {
		// TODO Auto-generated method stub
		
	}
	
}
