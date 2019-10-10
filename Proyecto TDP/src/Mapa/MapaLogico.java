package Mapa;


import GameObject.*;

import Juego.Juego;

import java.util.ArrayList;
import Jugador.Jugador;
import Tienda.TiendaLogica;

import java.awt.Point;


import GRAFICA.MapaGrafico;
import java.util.ListIterator;

public class MapaLogico  {
	private ArrayList<GameObject> entidades;
	private Jugador jugador;
	private MapaGrafico mapaGrafico;
	private int width, height;
	private TiendaLogica tienda;


	public MapaLogico (int width, int height, MapaGrafico mapag) {
		entidades= new ArrayList<GameObject> ();
		jugador= new Jugador();
		this.width=width;
		this.height=height;
		mapaGrafico= mapag;
		
		
	}
	
	public void setMapaGrafico(MapaGrafico m) {
		mapaGrafico= m;
	}
	
	public void agregarEntidad(GameObject o, int x, int y) {
		Point p = new Point (x, y);
		//System.out.println("X: "+x+" - Y: "+y);
		o.setPosicion(p);
		entidades.add(o);
		mapaGrafico.agregarEntidad(o);		
	}
	
//	public void operarconEntidades(Visitor v) {
//		for (GameObject e: entidades) {
//			e.Aceptar(v);
//		}
//	}
	
	public ArrayList hayEnElRango(GameObject g) {
		ArrayList<GameObject> toReturn = new ArrayList();
		Point posicion= g.getPosicion();
		for (GameObject e: entidades) {
			if (e.getX()+10==posicion.x ) {
				toReturn.add(e);				
			}
			
		}
		return toReturn;	
		
	}
	
	public ArrayList getEntidades() {
		return entidades;
	}
	
	
	
	
	/**
	 * recorre la lista de personajes para chequear colisiones
	 * @param x coordenada x dentro del mapa, donde se va a chequear la colision
	 * @param y coordenada y dentro del mapa, donde se va a chequear la colision
	 * @return true si hay colisiones (no se puede agregar el objeto), false caso contrario
	 */
	public boolean HayColisiones (int x, int y) {
		boolean colisiones=false;
		ListIterator<GameObject> it= entidades.listIterator();
		GameObject o;
		while (!colisiones && it.hasNext()) {
			o=it.next();
			colisiones= (x!=o.getPosicion().x && y!=o.getPosicion().y);
		}
		
		
		return colisiones;
	}
	
	/**
	 * remueve una entidad o del la lista de personajes y del mapa grafico
	 * @param o entidad a remover
	 */
	public void removerEntidad(GameObject o) {
		entidades.remove(o);
		mapaGrafico.removerEntidad(o);
	}
	
	
	
	//Sirve para matar a apu desde un boton
	public Juego getJuego() {
		return mapaGrafico.getJuego();
	}
}

