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

}
