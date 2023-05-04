package ar.edu.unlam.pb2.futbol;

public class Jugador {
	private String nombreDelJugador;
	private int numero;
	private int edad;
	private double precio;

	public Jugador(String nombreDelJugador, int numero, int edad, double precio) {
		this.nombreDelJugador = nombreDelJugador;
		this.numero = numero;
		this.edad = edad;
		this.precio = precio;
		
	}

	public String getNombreDelJugador() {
		return nombreDelJugador;
	}

	public int getNumero() {
		return numero;
	}

	public int getEdad() {
		return edad;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Jugador"
				+ "\n\tNombre Del Jugador:" + nombreDelJugador 
				+ "\nNumero: " + numero 
				+ "\nedad: " + edad 
				+ "\n precio:"+ precio;
	}
	
	

}
