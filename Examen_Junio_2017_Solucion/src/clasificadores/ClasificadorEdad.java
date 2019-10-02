package clasificadores;

import ligafutbol.Equipo;

public class ClasificadorEdad implements ClasificadorStrategy {

	@Override
	public boolean clasificar(Equipo equipo, Equipo candidato) {
		return equipo.getEdad() == candidato.getEdad();
	}

}
