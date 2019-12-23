package clasificadores;

import java.util.List;
import java.util.Map;

import ligafutbol.Equipo;

public class ClasificadorContiene implements ClasificadorStrategy {
	private Map<Equipo, List<Equipo>> emparejamientos;

	public ClasificadorContiene(Map<Equipo, List<Equipo>> emparejamientos) {
		super();
		this.emparejamientos = emparejamientos;
	}

	@Override
	public boolean clasificar(Equipo equipo, Equipo candidato) {
		return !emparejamientos.get(equipo).contains(candidato);
	}

}
