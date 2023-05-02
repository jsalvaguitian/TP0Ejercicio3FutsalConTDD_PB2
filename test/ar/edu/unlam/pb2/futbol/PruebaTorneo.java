package ar.edu.unlam.pb2.futbol;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * 1- Agregar los jugadores a los equipos
 * 2- Calcular el valor del equipo, esto es la sumatoria del precio de cada jugador.
 * 3- Calcular la edad promedio del equipo.
 * 4- Registrar un nuevo partido 
 * 		(tiene el equipo local y equipo visitante)
 * 		tiene un conjunto de eventos
 * 			GOL --> Jugador Autor y el minuto
 * 			AMONESTADO --> Jugador y el minuto, 
 * 					si fue amonestado 2VECES se lo EXPULSA 
 * 					y el sistema debe informarlo
 * 			EXPULSADO --> Sera expulsado si tiene doble AMONESTACION,
 * 						O EXPULSION directa. Conocer el jugador
 * 5- Ver el resumen: Conocer el resultado del partido
 * 					Detalle de los autores de goles
 * 					Amonestados
 * 					Expulsados
 * 			
 * */
public class PruebaTorneo {

	@Test
	public void queSePuedaAgregarUnJugadorAlEquipo() {
		// Preparacion de datos del jugador
		final String NOMBRE_DEL_JUGADOR = "Lionel Messi";
		final int numero = 10;
		final int edad = 30;
		final double precio = 2111996.26;
		final Integer CANTIDAD_DE_JUGADOR_ESPERADA = 1;
		Jugador unJugador;
		EquipoDeFutbol equipo;

		// Ejecucion
		equipo = new EquipoDeFutbol("River");
		unJugador = new Jugador(NOMBRE_DEL_JUGADOR, numero, edad, precio);
		equipo.agregarUnJugador(unJugador);

		// Validacion
		assertEquals(CANTIDAD_DE_JUGADOR_ESPERADA, equipo.obtenerCantidadDeJugadores());

	}

	@Test
	public void queSePuedaAgregarCincoJugadoresEnElEquipo() {

	}

	@Test
	public void queSePuedaCalcularElValorDeUnEquipo() {
		
		// Preparacion de datos del jugador
		final String NOMBRE_DEL_JUGADOR = "Lionel Messi";
		final int NUMERO = 10;
		final int EDAD = 30;
		final double PRECIO = 21996.26;
		
		final String NOMBRE_DEL_JUGADOR2 = "Homero Simpson";
		final int NUMERO2 = 10;
		final int EDAD2 = 30;
		final double PRECIO2 = 21996.26;
		
		final String NOMBRE_DEL_JUGADOR3 = "Carlos Tevez";
		final int NUMERO3 = 10;
		final int EDAD3 = 30;
		final double PRECIO3 = 21996.26;
		
		final String NOMBRE_DEL_JUGADOR4 = "Juan Riquelme";
		final int NUMERO4 = 10;
		final int EDAD4 = 30;
		final double PRECIO4 = 21996.26;
		
		final String NOMBRE_DEL_JUGADOR5 = "Armani";
		final int NUMERO5 = 10;
		final int EDAD5 = 30;
		final double PRECIO5 = 21996.26;
		
		final Integer CANTIDAD_DE_JUGADOR_ESPERADA = 5;
		
		Jugador jugador1, jugador2, jugador3, jugador4, jugador5;
		EquipoDeFutbol equipo;
		
		//Ejecucion
		jugador1 = new Jugador(NOMBRE_DEL_JUGADOR, NUMERO, EDAD, PRECIO);
		jugador2 = new Jugador(NOMBRE_DEL_JUGADOR2, NUMERO2, EDAD2, PRECIO2);
		jugador3 = new Jugador(NOMBRE_DEL_JUGADOR3, NUMERO3, EDAD3, PRECIO3);
		jugador4 = new Jugador(NOMBRE_DEL_JUGADOR4, NUMERO4, EDAD4, PRECIO4);
		jugador5 = new Jugador(NOMBRE_DEL_JUGADOR5, NUMERO5, EDAD5, PRECIO5);
		
		//Validacion
	}

	/*
	 * @Test public void queSePuedaRegis
	 */

}
