package clasificadores;

import ligafutbol.Equipo;

public class ClasificadorSexo implements ClasificadorStrategy {

	@Override
	public boolean clasificar(Equipo equipo, Equipo candidato) {
		return equipo.isMasculino() == candidato.isMasculino();
	}

}
