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

		final String NOMBRE_EQUIPO = "River";
		Jugador jugador1, jugador2, jugador3, jugador4, jugador5;
		EquipoDeFutbol equipo;

		// Ejecucion
		jugador1 = new Jugador(NOMBRE_DEL_JUGADOR, NUMERO, EDAD, PRECIO);
		jugador2 = new Jugador(NOMBRE_DEL_JUGADOR2, NUMERO2, EDAD2, PRECIO2);
		jugador3 = new Jugador(NOMBRE_DEL_JUGADOR3, NUMERO3, EDAD3, PRECIO3);
		jugador4 = new Jugador(NOMBRE_DEL_JUGADOR4, NUMERO4, EDAD4, PRECIO4);
		jugador5 = new Jugador(NOMBRE_DEL_JUGADOR5, NUMERO5, EDAD5, PRECIO5);

		equipo = new EquipoDeFutbol(NOMBRE_EQUIPO);

		equipo.agregarUnJugador(jugador1);
		equipo.agregarUnJugador(jugador2);
		equipo.agregarUnJugador(jugador3);
		equipo.agregarUnJugador(jugador4);
		equipo.agregarUnJugador(jugador5);

		// Validacion
		assertEquals(CANTIDAD_DE_JUGADOR_ESPERADA, equipo.obtenerCantidadDeJugadores());

	}

	// 2- Calcular el valor del equipo, esto es la sumatoria del precio de cada
	// jugador.
	@Test
	public void queSePuedaCalcularElValorDeUnEquipo() {
		// Preparacion de datos del jugador
		final String NOMBRE_DEL_JUGADOR = "Lionel Messi";
		final int NUMERO = 10;
		final int EDAD = 30;
		final double PRECIO = 100.10;
		final String NOMBRE_DEL_JUGADOR2 = "Homero Simpson";
		final int NUMERO2 = 10;
		final int EDAD2 = 30;
		final double PRECIO2 = 200.20;
		final String NOMBRE_DEL_JUGADOR3 = "Carlos Tevez";
		final int NUMERO3 = 10;
		final int EDAD3 = 30;
		final double PRECIO3 = 310.30;
		final String NOMBRE_EQUIPO = "River";
		Jugador jugador1, jugador2, jugador3;
		EquipoDeFutbol equipo;

		final double PRECIO_TOTAL_DEL_EQUIPO_ESPERADO = 610.60;

		// Ejecucion
		jugador1 = new Jugador(NOMBRE_DEL_JUGADOR, NUMERO, EDAD, PRECIO);
		jugador2 = new Jugador(NOMBRE_DEL_JUGADOR2, NUMERO2, EDAD2, PRECIO2);
		jugador3 = new Jugador(NOMBRE_DEL_JUGADOR3, NUMERO3, EDAD3, PRECIO3);

		equipo = new EquipoDeFutbol(NOMBRE_EQUIPO);

		equipo.agregarUnJugador(jugador1);
		equipo.agregarUnJugador(jugador2);
		equipo.agregarUnJugador(jugador3);

		// Validación
		assertEquals(PRECIO_TOTAL_DEL_EQUIPO_ESPERADO, equipo.calcularElValorDelEquipo(), 0.00);

	}

	// 3- Calcular la edad promedio del equipo.
	@Test
	public void queSePuedaCalcularLaEdadPromedioDelEquipo() {
		final String NOMBRE_DEL_JUGADOR = "Lionel Messi";
		final int NUMERO = 10;
		final int EDAD = 30;
		final double PRECIO = 100.10;
		final String NOMBRE_DEL_JUGADOR2 = "Homero Simpson";
		final int NUMERO2 = 10;
		final int EDAD2 = 21;
		final double PRECIO2 = 200.20;
		final String NOMBRE_DEL_JUGADOR3 = "Carlos Tevez";
		final int NUMERO3 = 10;
		final int EDAD3 = 25;
		final double PRECIO3 = 310.30;
		final String NOMBRE_EQUIPO = "River";
		Jugador jugador1, jugador2, jugador3;
		EquipoDeFutbol equipo;

		final double EDAD_PROMEDIO_ESPERADO = 25.33;

		// Ejecucion
		jugador1 = new Jugador(NOMBRE_DEL_JUGADOR, NUMERO, EDAD, PRECIO);
		jugador2 = new Jugador(NOMBRE_DEL_JUGADOR2, NUMERO2, EDAD2, PRECIO2);
		jugador3 = new Jugador(NOMBRE_DEL_JUGADOR3, NUMERO3, EDAD3, PRECIO3);

		equipo = new EquipoDeFutbol(NOMBRE_EQUIPO);

		equipo.agregarUnJugador(jugador1);
		equipo.agregarUnJugador(jugador2);
		equipo.agregarUnJugador(jugador3);

		// Validación
		assertEquals(EDAD_PROMEDIO_ESPERADO, equipo.calcularLaEdadPromedioDelEquipo(), 0.00);

	}

	/*
	 * 4- Registrar un nuevo partido (tiene el equipo local y equipo visitante)
	 * tiene un conjunto de eventos GOL --> Jugador Autor y el minuto AMONESTADO -->
	 * Jugador y el minuto, si fue amonestado 2VECES se lo EXPULSA y el sistema debe
	 * informarlo EXPULSADO --> Sera expulsado si tiene doble AMONESTACION, O
	 * EXPULSION directa. Conocer el jugador
	 */

	@Test
	public void queSePuedaCrearUnPartido() {
		// Preparacion de datos
		final String NOMBRE_EQUIPO_LOCAL = "River";
		final String NOMBRE_EQUIPO_VISITANTE = "Boca";

		EquipoDeFutbol equipoVisitante;
		EquipoDeFutbol equipoLocal;

		// **************** LOCAL *************
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

		// **************** VISITANTE *************

		final String NAME_JUGADOR = "Lionel Messi";
		final int NUM = 10;
		final int AGE = 30;
		final double VALOR_PRECIO = 21996.26;

		final String NAME_JUGADOR2 = "Homero Simpson";
		final int NUM2 = 10;
		final int AGE2 = 30;
		final double VALOR_PRECIO2 = 21996.26;

		final String NAME_JUGADOR3 = "Carlos Tevez";
		final int NUM3 = 10;
		final int AGE3 = 30;
		final double VALOR_PRECIO3 = 21996.26;

		final String NAME_JUGADOR4 = "Juan Riquelme";
		final int NUM4 = 10;
		final int AGE4 = 30;
		final double VALOR_PRECIO4 = 21996.26;

		final String NAME_JUGADOR5 = "Armani";
		final int NUM5 = 10;
		final int AGE5 = 30;
		final double VALOR_PRECIO5 = 21996.26;

		Jugador jugador1, jugador2, jugador3, jugador4, jugador5;
		Jugador jugadorVisit1, jugadorVisit2, jugadorVisit3, jugadorVisit4, jugadorVisit5;

		final Integer CANTIDAD_DE_JUGADOR_ESPERADA = 5;

		// Ejecucion
		jugador1 = new Jugador(NOMBRE_DEL_JUGADOR, NUMERO, EDAD, PRECIO);
		jugador2 = new Jugador(NOMBRE_DEL_JUGADOR2, NUMERO2, EDAD2, PRECIO2);
		jugador3 = new Jugador(NOMBRE_DEL_JUGADOR3, NUMERO3, EDAD3, PRECIO3);
		jugador4 = new Jugador(NOMBRE_DEL_JUGADOR4, NUMERO4, EDAD4, PRECIO4);
		jugador5 = new Jugador(NOMBRE_DEL_JUGADOR5, NUMERO5, EDAD5, PRECIO5);

		jugadorVisit1 = new Jugador(NAME_JUGADOR, NUM, AGE, VALOR_PRECIO);
		jugadorVisit2 = new Jugador(NAME_JUGADOR2, NUM2, AGE2, VALOR_PRECIO2);
		jugadorVisit3 = new Jugador(NAME_JUGADOR3, NUM3, AGE3, VALOR_PRECIO3);
		jugadorVisit4 = new Jugador(NAME_JUGADOR4, NUM4, AGE4, VALOR_PRECIO4);
		jugadorVisit5 = new Jugador(NAME_JUGADOR5, NUM5, AGE5, VALOR_PRECIO5);

		equipoLocal = new EquipoDeFutbol(NOMBRE_EQUIPO_LOCAL);
		equipoVisitante = new EquipoDeFutbol(NOMBRE_EQUIPO_VISITANTE);

		equipoLocal.agregarUnJugador(jugador1);
		equipoLocal.agregarUnJugador(jugador2);
		equipoLocal.agregarUnJugador(jugador3);
		equipoLocal.agregarUnJugador(jugador4);
		equipoLocal.agregarUnJugador(jugador5);

		equipoVisitante.agregarUnJugador(jugadorVisit1);
		equipoVisitante.agregarUnJugador(jugadorVisit2);
		equipoVisitante.agregarUnJugador(jugadorVisit3);
		equipoVisitante.agregarUnJugador(jugadorVisit4);
		equipoVisitante.agregarUnJugador(jugadorVisit5);

		Partido partido = new Partido(equipoLocal, equipoVisitante);

		// Validacion
		assertNotNull(partido);

		assertTrue(partido.getLocal().tieneJugadores());
		assertTrue(partido.getVisitante().tieneJugadores());

		assertEquals(CANTIDAD_DE_JUGADOR_ESPERADA, partido.getLocal().obtenerCantidadDeJugadores());
		assertEquals(CANTIDAD_DE_JUGADOR_ESPERADA, partido.getVisitante().obtenerCantidadDeJugadores());

	}

	// * tiene un conjunto de eventos GOL --> Jugador Autor y el minuto
	@Test
	public void queSePuedaGenerarUnEventoDeGolAFavorEnUnPartido() {
		// Preparacion de datos
		final String NOMBRE_EQUIPO_LOCAL = "River";
		final String NOMBRE_EQUIPO_VISITANTE = "Boca";

		EquipoDeFutbol equipoVisitante;
		EquipoDeFutbol equipoLocal;

		// **************** LOCAL *************
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

		// **************** VISITANTE *************

		final String NAME_JUGADOR2 = "Homero Simpson";
		final int NUM2 = 10;
		final int AGE2 = 30;
		final double VALOR_PRECIO2 = 21996.26;

		final String NAME_JUGADOR3 = "Carlos Tevez";
		final int NUM3 = 10;
		final int AGE3 = 30;
		final double VALOR_PRECIO3 = 21996.26;

		final String NAME_JUGADOR4 = "Juan Riquelme";
		final int NUM4 = 10;
		final int AGE4 = 30;
		final double VALOR_PRECIO4 = 21996.26;

		final String NAME_JUGADOR5 = "Armani";
		final int NUM5 = 10;
		final int AGE5 = 30;
		final double VALOR_PRECIO5 = 21996.26;

		Jugador jugador1, jugador2, jugador3, jugador4, jugador5;
		Jugador jugadorVisit1, jugadorVisit2, jugadorVisit3, jugadorVisit4, jugadorVisit5;

		final Integer CANTIDAD_DE_GOLES_ESPERADA_LOCAL = 1;
		final Integer CANTIDAD_DE_GOLES_ESPERADA_VISITANTE = 0;

		// Ejecucion
		jugador1 = new Jugador(NOMBRE_DEL_JUGADOR, NUMERO, EDAD, PRECIO);
		jugador2 = new Jugador(NOMBRE_DEL_JUGADOR2, NUMERO2, EDAD2, PRECIO2);
		jugador3 = new Jugador(NOMBRE_DEL_JUGADOR3, NUMERO3, EDAD3, PRECIO3);
		jugador4 = new Jugador(NOMBRE_DEL_JUGADOR4, NUMERO4, EDAD4, PRECIO4);
		jugador5 = new Jugador(NOMBRE_DEL_JUGADOR5, NUMERO5, EDAD5, PRECIO5);

		jugadorVisit2 = new Jugador(NAME_JUGADOR2, NUM2, AGE2, VALOR_PRECIO2);
		jugadorVisit3 = new Jugador(NAME_JUGADOR3, NUM3, AGE3, VALOR_PRECIO3);
		jugadorVisit4 = new Jugador(NAME_JUGADOR4, NUM4, AGE4, VALOR_PRECIO4);
		jugadorVisit5 = new Jugador(NAME_JUGADOR5, NUM5, AGE5, VALOR_PRECIO5);

		equipoLocal = new EquipoDeFutbol(NOMBRE_EQUIPO_LOCAL);
		equipoVisitante = new EquipoDeFutbol(NOMBRE_EQUIPO_VISITANTE);

		equipoLocal.agregarUnJugador(jugador1);
		equipoLocal.agregarUnJugador(jugador2);
		equipoLocal.agregarUnJugador(jugador3);
		equipoLocal.agregarUnJugador(jugador4);
		equipoLocal.agregarUnJugador(jugador5);

		equipoVisitante.agregarUnJugador(jugadorVisit2);
		equipoVisitante.agregarUnJugador(jugadorVisit3);
		equipoVisitante.agregarUnJugador(jugadorVisit4);
		equipoVisitante.agregarUnJugador(jugadorVisit5);

		Partido partido = new Partido(equipoLocal, equipoVisitante);

		Evento gol = new Evento(TipoDeEvento.GOL_A_FAVOR, jugador1, "03:30");
		partido.generarUnEventoGol(gol);

		// Validacion
		assertEquals(CANTIDAD_DE_GOLES_ESPERADA_LOCAL, partido.getGolesParaElEquipoLocal()); // 1 - 1
		assertEquals(CANTIDAD_DE_GOLES_ESPERADA_VISITANTE, partido.getGolesParaElEquipoVisitante()); // 0 - 0

	}

	@Test
	public void queSePuedaGenerarTresEventosDeGolAFavorDelEquipoLocalYUnGolEnContraEnUnPartido() {
		// Preparacion de datos
		final String NOMBRE_EQUIPO_LOCAL = "River";
		final String NOMBRE_EQUIPO_VISITANTE = "Boca";

		EquipoDeFutbol equipoVisitante;
		EquipoDeFutbol equipoLocal;

		// **************** LOCAL *************
		final String NOMBRE_DEL_JUGADOR = "Lionel Messi";
		final int NUMERO = 10;
		final int EDAD = 30;
		final double PRECIO = 21996.26;

		final String NOMBRE_DEL_JUGADOR2 = "Homero Simpson";
		final int NUMERO2 = 10;
		final int EDAD2 = 30;
		final double PRECIO2 = 21996.26;

		// **************** VISITANTE *************
		final String NAME_JUGADOR4 = "Juan Riquelme";
		final int NUM4 = 10;
		final int AGE4 = 30;
		final double VALOR_PRECIO4 = 21996.26;

		final String NAME_JUGADOR5 = "Armani";
		final int NUM5 = 10;
		final int AGE5 = 30;
		final double VALOR_PRECIO5 = 21996.26;

		Jugador jugador1, jugador2;
		Jugador jugadorVisit4, jugadorVisit5;

		final Integer CANTIDAD_DE_GOLES_ESPERADA_LOCAL = 3;
		final Integer CANTIDAD_DE_GOLES_ESPERADA_VISITANTE = 1;
		// Ejecucion
		jugador1 = new Jugador(NOMBRE_DEL_JUGADOR, NUMERO, EDAD, PRECIO);
		jugador2 = new Jugador(NOMBRE_DEL_JUGADOR2, NUMERO2, EDAD2, PRECIO2);

		jugadorVisit4 = new Jugador(NAME_JUGADOR4, NUM4, AGE4, VALOR_PRECIO4);
		jugadorVisit5 = new Jugador(NAME_JUGADOR5, NUM5, AGE5, VALOR_PRECIO5);

		equipoLocal = new EquipoDeFutbol(NOMBRE_EQUIPO_LOCAL);
		equipoVisitante = new EquipoDeFutbol(NOMBRE_EQUIPO_VISITANTE);

		equipoLocal.agregarUnJugador(jugador1);
		equipoLocal.agregarUnJugador(jugador2);

		equipoVisitante.agregarUnJugador(jugadorVisit4);
		equipoVisitante.agregarUnJugador(jugadorVisit5);

		Partido partido = new Partido(equipoLocal, equipoVisitante);

		Evento gol1 = new Evento(TipoDeEvento.GOL_A_FAVOR, jugador1, "03:40");
		Evento gol2 = new Evento(TipoDeEvento.GOL_A_FAVOR, jugador1, "05:04");
		Evento gol3 = new Evento(TipoDeEvento.GOL_A_CONTRA, jugador2, "06:40");
		Evento gol4 = new Evento(TipoDeEvento.GOL_A_FAVOR, jugador2, "08:21");

		partido.generarUnEventoGol(gol1);
		partido.generarUnEventoGol(gol2);
		partido.generarUnEventoGol(gol3);
		partido.generarUnEventoGol(gol4);

		assertEquals(CANTIDAD_DE_GOLES_ESPERADA_LOCAL, partido.getGolesParaElEquipoLocal());
		assertEquals(CANTIDAD_DE_GOLES_ESPERADA_VISITANTE, partido.getGolesParaElEquipoVisitante());

	}

	// AMONESTADO --> Jugador y el minuto,
	@Test
	public void queSePuedaGenerarUnEventoDeAmonestacionEnUnPartido() {
		// Preparacion de datos
		final String NOMBRE_EQUIPO_LOCAL = "River";
		final String NOMBRE_EQUIPO_VISITANTE = "Boca";

		EquipoDeFutbol equipoVisitante;
		EquipoDeFutbol equipoLocal;

		// **************** LOCAL *************
		final String NOMBRE_DEL_JUGADOR = "Lionel Messi";
		final int NUMERO = 10;
		final int EDAD = 30;
		final double PRECIO = 21996.26;

		final String NOMBRE_DEL_JUGADOR2 = "Homero Simpson";
		final int NUMERO2 = 10;
		final int EDAD2 = 30;
		final double PRECIO2 = 21996.26;

		// **************** VISITANTE *************
		final String NAME_JUGADOR4 = "Juan Riquelme";
		final int NUM4 = 10;
		final int AGE4 = 30;
		final double VALOR_PRECIO4 = 21996.26;

		final String NAME_JUGADOR5 = "Armani";
		final int NUM5 = 10;
		final int AGE5 = 30;
		final double VALOR_PRECIO5 = 21996.26;

		Jugador jugador1, jugador2;
		Jugador jugadorVisit4, jugadorVisit5;

		final Integer CANTIDAD_DE_AMONESTACIONES_ESPERADA = 1;

		// Ejecucion
		jugador1 = new Jugador(NOMBRE_DEL_JUGADOR, NUMERO, EDAD, PRECIO);
		jugador2 = new Jugador(NOMBRE_DEL_JUGADOR2, NUMERO2, EDAD2, PRECIO2);

		jugadorVisit4 = new Jugador(NAME_JUGADOR4, NUM4, AGE4, VALOR_PRECIO4);
		jugadorVisit5 = new Jugador(NAME_JUGADOR5, NUM5, AGE5, VALOR_PRECIO5);

		equipoLocal = new EquipoDeFutbol(NOMBRE_EQUIPO_LOCAL);
		equipoVisitante = new EquipoDeFutbol(NOMBRE_EQUIPO_VISITANTE);

		equipoLocal.agregarUnJugador(jugador1);
		equipoLocal.agregarUnJugador(jugador2);

		equipoVisitante.agregarUnJugador(jugadorVisit4);
		equipoVisitante.agregarUnJugador(jugadorVisit5);

		Partido partido = new Partido(equipoLocal, equipoVisitante);

		Evento amonestacion = new Evento(TipoDeEvento.AMONESTACION, jugadorVisit4, "02:30");

		assertEquals(CANTIDAD_DE_AMONESTACIONES_ESPERADA, partido.amonestarUnJugador(amonestacion));
		assertTrue(partido.buscarUnAmonestadoPorNombre(amonestacion.getJugador().getNombreDelJugador()));
	}

	/*
	 * EXPULSADO --> Sera expulsado si tiene doble AMONESTACION, O EXPULSION
	 * directa. Conocer el jugador
	 */
	@Test
	public void queSePuedaGenerarUnEventoDeExpulsionPorDobleAmonestacionEnUnPartido() {
		// Preparacion de datos
		final String NOMBRE_EQUIPO_LOCAL = "River";
		final String NOMBRE_EQUIPO_VISITANTE = "Boca";

		EquipoDeFutbol equipoVisitante;
		EquipoDeFutbol equipoLocal;

		// **************** LOCAL *************
		final String NOMBRE_DEL_JUGADOR = "Lionel Messi";
		final int NUMERO = 10;
		final int EDAD = 30;
		final double PRECIO = 21996.26;

		final String NOMBRE_DEL_JUGADOR2 = "Homero Simpson";
		final int NUMERO2 = 10;
		final int EDAD2 = 30;
		final double PRECIO2 = 21996.26;

		// **************** VISITANTE *************
		final String NAME_JUGADOR4 = "Juan Riquelme";
		final int NUM4 = 10;
		final int AGE4 = 30;
		final double VALOR_PRECIO4 = 21996.26;

		final String NAME_JUGADOR5 = "Armani";
		final int NUM5 = 10;
		final int AGE5 = 30;
		final double VALOR_PRECIO5 = 21996.26;

		Jugador jugador1, jugador2;
		Jugador jugadorVisit4, jugadorVisit5;

		final Integer CANTIDAD_DE_AMONESTACIONES_ESPERADA = 2;

		// Ejecucion
		jugador1 = new Jugador(NOMBRE_DEL_JUGADOR, NUMERO, EDAD, PRECIO);
		jugador2 = new Jugador(NOMBRE_DEL_JUGADOR2, NUMERO2, EDAD2, PRECIO2);

		jugadorVisit4 = new Jugador(NAME_JUGADOR4, NUM4, AGE4, VALOR_PRECIO4);
		jugadorVisit5 = new Jugador(NAME_JUGADOR5, NUM5, AGE5, VALOR_PRECIO5);

		equipoLocal = new EquipoDeFutbol(NOMBRE_EQUIPO_LOCAL);
		equipoVisitante = new EquipoDeFutbol(NOMBRE_EQUIPO_VISITANTE);

		equipoLocal.agregarUnJugador(jugador1);
		equipoLocal.agregarUnJugador(jugador2);

		equipoVisitante.agregarUnJugador(jugadorVisit4);
		equipoVisitante.agregarUnJugador(jugadorVisit5);

		Partido partido = new Partido(equipoLocal, equipoVisitante);

		Evento amonestacion = new Evento(TipoDeEvento.AMONESTACION, jugadorVisit4, "02:30");
		Evento amonestacion2 = new Evento(TipoDeEvento.AMONESTACION, jugadorVisit4, "09:40");

		partido.amonestarUnJugador(amonestacion);

		assertEquals(CANTIDAD_DE_AMONESTACIONES_ESPERADA, partido.amonestarUnJugador(amonestacion2));
		// assertTrue(partido.buscarUnAmonestadoPorNombre(amonestacion.getJugador().getNombreDelJugador()));
		assertTrue(partido.buscarUnExpulsadoPorNombre(amonestacion2.getJugador().getNombreDelJugador()));

	}

	@Test
	public void queSePuedaGenerarUnEventoDeExpulsionDeFormaDirectaEnUnPartido() {
		// Preparacion de datos
		final String NOMBRE_EQUIPO_LOCAL = "River";
		final String NOMBRE_EQUIPO_VISITANTE = "Boca";

		EquipoDeFutbol equipoVisitante;
		EquipoDeFutbol equipoLocal;

		// **************** LOCAL *************
		final String NOMBRE_DEL_JUGADOR = "Lionel Messi";
		final int NUMERO = 10;
		final int EDAD = 30;
		final double PRECIO = 21996.26;

		final String NOMBRE_DEL_JUGADOR2 = "Homero Simpson";
		final int NUMERO2 = 10;
		final int EDAD2 = 30;
		final double PRECIO2 = 21996.26;

		// **************** VISITANTE *************
		final String NAME_JUGADOR4 = "Juan Riquelme";
		final int NUM4 = 10;
		final int AGE4 = 30;
		final double VALOR_PRECIO4 = 21996.26;

		final String NAME_JUGADOR5 = "Armani";
		final int NUM5 = 10;
		final int AGE5 = 30;
		final double VALOR_PRECIO5 = 21996.26;

		Jugador jugador1, jugador2;
		Jugador jugadorVisit4, jugadorVisit5;

		final Integer CANTIDAD_DE_AMONESTACIONES_ESPERADA = 2;
		final Integer CANTIDAD_DE_EXPULSIONES_ESPERADA = 2;
		// Ejecucion
		jugador1 = new Jugador(NOMBRE_DEL_JUGADOR, NUMERO, EDAD, PRECIO);
		jugador2 = new Jugador(NOMBRE_DEL_JUGADOR2, NUMERO2, EDAD2, PRECIO2);

		jugadorVisit4 = new Jugador(NAME_JUGADOR4, NUM4, AGE4, VALOR_PRECIO4);
		jugadorVisit5 = new Jugador(NAME_JUGADOR5, NUM5, AGE5, VALOR_PRECIO5);

		equipoLocal = new EquipoDeFutbol(NOMBRE_EQUIPO_LOCAL);
		equipoVisitante = new EquipoDeFutbol(NOMBRE_EQUIPO_VISITANTE);

		equipoLocal.agregarUnJugador(jugador1);
		equipoLocal.agregarUnJugador(jugador2);

		equipoVisitante.agregarUnJugador(jugadorVisit4);
		equipoVisitante.agregarUnJugador(jugadorVisit5);

		Partido partido = new Partido(equipoLocal, equipoVisitante);

		Evento amonestacion = new Evento(TipoDeEvento.AMONESTACION, jugadorVisit4, "02:30");
		Evento amonestacion2 = new Evento(TipoDeEvento.AMONESTACION, jugadorVisit4, "09:40");

		Evento expulsionDirecta = new Evento(TipoDeEvento.EXPULSION, jugador1, "10:23");

		partido.amonestarUnJugador(amonestacion);
		partido.expulsarUnJugador(expulsionDirecta);

		assertEquals(CANTIDAD_DE_AMONESTACIONES_ESPERADA, partido.amonestarUnJugador(amonestacion2));
		assertTrue(partido.buscarUnAmonestadoPorNombre(amonestacion.getJugador().getNombreDelJugador()));
		assertTrue(partido.buscarUnExpulsadoPorNombre(amonestacion2.getJugador().getNombreDelJugador()));

		assertEquals(CANTIDAD_DE_AMONESTACIONES_ESPERADA, partido.obtenerCantidadDeExpulsiones());

	}

	/*
	 * 5- Ver el resumen:Conocer el resultado del partido Detalle de los autores de
	 * goles Amonestados Expulsados
	 */
	@Test
	public void queSePuedaVerElResumenDelPartido() {
		// Preparacion de datos
				final String NOMBRE_EQUIPO_LOCAL = "River";
				final String NOMBRE_EQUIPO_VISITANTE = "Boca";

				EquipoDeFutbol equipoVisitante;
				EquipoDeFutbol equipoLocal;

				// **************** LOCAL *************
				final String NOMBRE_DEL_JUGADOR = "Lionel Messi";
				final int NUMERO = 10;
				final int EDAD = 30;
				final double PRECIO = 21996.26;

				final String NOMBRE_DEL_JUGADOR2 = "Homero Simpson";
				final int NUMERO2 = 10;
				final int EDAD2 = 30;
				final double PRECIO2 = 21996.26;

				// **************** VISITANTE *************
				final String NAME_JUGADOR4 = "Juan Riquelme";
				final int NUM4 = 10;
				final int AGE4 = 30;
				final double VALOR_PRECIO4 = 21996.26;

				final String NAME_JUGADOR5 = "Armani";
				final int NUM5 = 10;
				final int AGE5 = 30;
				final double VALOR_PRECIO5 = 21996.26;

				Jugador jugador1, jugador2;
				Jugador jugadorVisit4, jugadorVisit5;

				final String NOMBRE_DEL_EQUIPO_GANADOR_ESPERADO = "River";
				// Ejecucion
				jugador1 = new Jugador(NOMBRE_DEL_JUGADOR, NUMERO, EDAD, PRECIO);
				jugador2 = new Jugador(NOMBRE_DEL_JUGADOR2, NUMERO2, EDAD2, PRECIO2);

				jugadorVisit4 = new Jugador(NAME_JUGADOR4, NUM4, AGE4, VALOR_PRECIO4);
				jugadorVisit5 = new Jugador(NAME_JUGADOR5, NUM5, AGE5, VALOR_PRECIO5);

				equipoLocal = new EquipoDeFutbol(NOMBRE_EQUIPO_LOCAL);
				equipoVisitante = new EquipoDeFutbol(NOMBRE_EQUIPO_VISITANTE);

				equipoLocal.agregarUnJugador(jugador1);
				equipoLocal.agregarUnJugador(jugador2);

				equipoVisitante.agregarUnJugador(jugadorVisit4);
				equipoVisitante.agregarUnJugador(jugadorVisit5);

				Partido partido = new Partido(equipoLocal, equipoVisitante);
				
				Evento gol1 = new Evento(TipoDeEvento.GOL_A_FAVOR, jugador1, "03:40");
				Evento gol2 = new Evento(TipoDeEvento.GOL_A_FAVOR, jugador1, "05:04");
				Evento gol3 = new Evento(TipoDeEvento.GOL_A_CONTRA, jugador2, "06:40");
				Evento gol4 = new Evento(TipoDeEvento.GOL_A_FAVOR, jugador2, "08:21");

				partido.generarUnEventoGol(gol1);
				partido.generarUnEventoGol(gol2);
				partido.generarUnEventoGol(gol3);
				partido.generarUnEventoGol(gol4);
				
				assertEquals(NOMBRE_DEL_EQUIPO_GANADOR_ESPERADO, partido.obtenerElEquipoGanador());

	}

}
