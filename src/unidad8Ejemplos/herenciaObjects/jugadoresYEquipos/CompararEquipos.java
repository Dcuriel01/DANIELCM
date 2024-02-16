package unidad8Ejemplos.herenciaObjects.jugadoresYEquipos;

public class CompararEquipos {

	public static void main(String[] args) {
		
		Jugador [] jugadores1 = new Jugador [5];
		jugadores1[0]=new Jugador("Eden","Hazard","Delantero");
		jugadores1[1]=new Jugador("Kyliam","Mbappe","Delantero");
		jugadores1[2]=new Jugador("Iker","Casillas","Portero");
		jugadores1[3]=new Jugador("Peter","Crouch","Delantero");
		jugadores1[4]=new Jugador("Sergio","Ramos","Defensa");
		Equipo equipo1 = new Equipo(jugadores1,"Real Madrid","Madrid");
		Jugador [] jugadores2 = new Jugador [5];
		jugadores2[0]=new Jugador("Eden","Hazard","Delantero");
		jugadores2[1]=new Jugador("Kyliam","Mbappe","Delantero");
		jugadores2[2]=new Jugador("Iker","Casillas","Portero");
		jugadores2[3]=new Jugador("Peter","Crouch","Delantero");
		jugadores2[4]=new Jugador("Sergio","Ramos","Defensa");
		Equipo equipo2 = new Equipo(jugadores2,"Real Madrid","Madrid");
		
			if (equipo1.equals(equipo2)) {
				System.out.println("Los equipos son exactamente iguales");
			}else {
				System.out.println("Los equipos no son exactamente iguales");
			}
			
		}
	}
