package ar.edu.unlam.pb2.futbol;

import java.util.ArrayList;

public class Partido {

	private EquipoDeFutbol local;
	private EquipoDeFutbol visitante;
	private Integer golesParaElEquipoLocal;
	private Integer golesParaElEquipoVisitante;
	private ArrayList<Evento> amonestaciones;
	private ArrayList<Evento> expulsiones;
	private ArrayList<Evento> goles;

	public Partido(EquipoDeFutbol equipoLocal, EquipoDeFutbol equipoVisitante) {
		this.local = equipoLocal;
		this.visitante = equipoVisitante;
		this.golesParaElEquipoLocal = 0;
		this.golesParaElEquipoVisitante = 0;

		this.amonestaciones = new ArrayList<>();
		this.expulsiones = new ArrayList<>();
		this.goles = new ArrayList<>();
	}

	public EquipoDeFutbol getLocal() {
		return local;
	}

	public EquipoDeFutbol getVisitante() {
		return visitante;
	}

	public void generarUnEventoGol(Evento gol) {

		Jugador autorDelGol = gol.getJugador();

		this.goles.add(gol);

		if (local.getJugadores().contains(autorDelGol)) {
			if (gol.getEvento() == TipoDeEvento.GOL_A_FAVOR)
				this.golesParaElEquipoLocal++;
			else if (gol.getEvento() == TipoDeEvento.GOL_A_CONTRA)
				this.golesParaElEquipoVisitante++;

		} else if (visitante.getJugadores().contains(autorDelGol)) {
			if (gol.getEvento() == TipoDeEvento.GOL_A_FAVOR)
				this.golesParaElEquipoVisitante++;
			else if (gol.getEvento() == TipoDeEvento.GOL_A_CONTRA)
				this.golesParaElEquipoLocal++;

		}

	}

	public Integer getGolesParaElEquipoLocal() {
		return golesParaElEquipoLocal;
	}

	public Integer getGolesParaElEquipoVisitante() {
		return golesParaElEquipoVisitante;
	}

	public Integer amonestarUnJugador(Evento nuevaAmonestacion) {
		if (this.buscarUnAmonestadoPorNombre(nuevaAmonestacion.getJugador().getNombreDelJugador())) {
			nuevaAmonestacion.setEvento(TipoDeEvento.EXPULSION);
			this.expulsiones.add(nuevaAmonestacion);
			return 2;
		}
		this.amonestaciones.add(nuevaAmonestacion); // ¿es necesario elimimar el jugador si fue expulsado.?

		return 1;

	}

	public boolean buscarUnAmonestadoPorNombre(String nombreDelJugador) {
		if (!this.amonestaciones.isEmpty()) {
			for (Evento amonestacion : this.amonestaciones) {
				if (amonestacion.getJugador().getNombreDelJugador().equals(nombreDelJugador)) {
					return true;
				}

			}

		}
		return false;
	}

	public boolean buscarUnExpulsadoPorNombre(String nombreDelJugador) {
		if (!this.expulsiones.isEmpty()) {
			for (Evento expulsion : this.expulsiones) {
				if (expulsion.getJugador().getNombreDelJugador().equals(nombreDelJugador)) {
					return true;
				}

			}

		}
		return false;
	}

	public void expulsarUnJugador(Evento expulsionDirecta) {
		this.expulsiones.add(expulsionDirecta);
		
	}

	public Integer obtenerCantidadDeExpulsiones() {
		
		
		return this.expulsiones.size();
	}

	public String obtenerElEquipoGanador() {
		if(this.golesParaElEquipoLocal>this.golesParaElEquipoVisitante)
			return this.local.getNombre();
		
		else if(this.golesParaElEquipoLocal<this.golesParaElEquipoVisitante)
			return this.visitante.getNombre();
		
		else if(this.golesParaElEquipoLocal == this.golesParaElEquipoVisitante)
			return "Fue un empate";
		
		return "";
		
	}

}
