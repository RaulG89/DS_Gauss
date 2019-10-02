package clasificadores;

import ligafutbol.Equipo;

public interface ClasificadorStrategy {
	boolean clasificar(Equipo equipo, Equipo candidato);
}
