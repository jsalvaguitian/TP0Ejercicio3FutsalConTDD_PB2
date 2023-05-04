package ar.edu.unlam.pb2.futbol;

import java.util.ArrayList;

public class EquipoDeFutbol {
	private String nombre;
	private ArrayList<Jugador>jugadores;
	
	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		this.jugadores = new ArrayList<Jugador>();
	}

	
	//sólo se cargarán 5 jugadores por equipo
	public void agregarUnJugador(Jugador unJugador) {
		if(this.jugadores.size()<5)
			this.jugadores.add(unJugador);
	}

	
	public Integer obtenerCantidadDeJugadores() {
		return this.jugadores.size();
	}

	
	public double calcularElValorDelEquipo() {
		double valorTotal = 0;
		
		for(Jugador jugador: jugadores) {
			valorTotal += jugador.getPrecio();
		}
		//return valorTotal;
		return Math.round(valorTotal*100.0)/100.0;
	}

	
	
	public double calcularLaEdadPromedioDelEquipo() {
		int edadTotal =0;
		double edadPromedio = 0;
		
		for(Jugador jugador: jugadores) {
			edadTotal += jugador.getEdad();
		}
		edadPromedio = (double)edadTotal/jugadores.size();
		return Math.round(edadPromedio*100.0)/100.0;
	}


	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	

	public String getNombre() {
		return nombre;
	}


	@Override
	public String toString() {
		return "EquipoDeFutbol:"+ 
					"\n\tNombre: " + nombre + 
					"\nJugadores:" + jugadores + "]";
	}


	public boolean tieneJugadores() {
		if(!this.jugadores.isEmpty())
			return true;
		return false;
	}
	
	

}
