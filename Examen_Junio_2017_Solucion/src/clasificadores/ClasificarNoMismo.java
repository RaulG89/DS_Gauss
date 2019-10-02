package clasificadores;

import ligafutbol.Equipo;

public class ClasificarNoMismo implements ClasificadorStrategy {

	@Override
	public boolean clasificar(Equipo equipo, Equipo candidato) {
		return equipo != candidato;
	}

}
