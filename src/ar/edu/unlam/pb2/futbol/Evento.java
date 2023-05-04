package ar.edu.unlam.pb2.futbol;

public class Evento {
	
	private TipoDeEvento evento;
	private Jugador jugador;
	private String minutosYSegundos;

	public Evento(TipoDeEvento unEvento, Jugador generadorDelEvento, String minutosYSegundos) {
		this.evento = unEvento;
		this.jugador = generadorDelEvento;
		this.minutosYSegundos = minutosYSegundos;
	}

	public TipoDeEvento getEvento() {
		return evento;
	}

	public void setEvento(TipoDeEvento evento) {
		this.evento = evento;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public String getMinutosYSegundos() {
		return minutosYSegundos;
	}
	
	

}
