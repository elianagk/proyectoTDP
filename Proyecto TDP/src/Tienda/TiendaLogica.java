package Tienda;

import GRAFICA.MapaGrafico;
import GameObject.GameObject;
import Mapa.MapaLogico;
import Tienda.Botones.*;

public class TiendaLogica {
	
	
	private MapaLogico mapal;
	private GameObject g;
	
	
	
	public TiendaLogica(MapaLogico mapa) {
		g= null;
		mapal= mapa;
	}
	
	public void revisarTienda(int x, int y) {
		if (ProximaEntidad()) {
			mapal.agregarEntidad(g, x, y);
			g= null;
		}
	}
	
	
	
	public void setEntidad(GameObject o) {
		g= o;
	}
	
	public GameObject getEntidad() {
		return g;
	}
	
	public boolean ProximaEntidad() {
		return g!=null;
	}

}
