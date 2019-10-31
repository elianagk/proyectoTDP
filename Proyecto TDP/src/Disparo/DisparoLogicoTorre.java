package Disparo;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;



public class DisparoLogicoTorre extends Torre {
	
	protected Torre mipersonaje;
	
	public DisparoLogicoTorre(MapaLogico ml, Torre p) {
		super(0, 0, 0, 0, ml, new DisparoGraficoTorre());
		mipersonaje=p;
		visitor= new VisitorAliado(this);
		velocidad=5;
		
		
	}

	
//	

	@Override
	public void accionar() {
		
		super.mover(forward_key);
		
	}
	
	@Override
	public boolean estaEnRango(GameObject g) {
		//System.out.println(" son iguales X " + (this.getX()==g.getX()) + " son iguales y " + (this.getY()==g.getY()));
		return (g.getX()==this.getX() && g.getY()==this.getY())   ;
	}


	@Override
	public void atacar(Personaje e) {
		//super.mover(forward_key);
		e.aplicarDa�o(mipersonaje.getDa�o());
		System.out.println("da�o a enemigo");
		mapaLogico.entidadAEliminar(this);
		
	}


	@Override
	public void Aceptar(Visitor visitor) {
		visitor.visitarDisparo(this);
	}


	@Override
	public Visitor getVisitor() {
		
		return visitor;
	}


	@Override
	public JLabel getGrafico() {
		return miObjetoGrafico;
	}


	@Override
	public GameObject clone() {
		
		return new DisparoLogicoTorre(mapaLogico, mipersonaje);
	}
	
	

	

}
