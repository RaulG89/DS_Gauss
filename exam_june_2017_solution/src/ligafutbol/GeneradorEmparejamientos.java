package ligafutbol;

import java.util.*;

import clasificadores.ClasificadorComposite;
import clasificadores.ClasificadorContiene;
import clasificadores.ClasificadorEdad;
import clasificadores.ClasificadorSexo;
import clasificadores.ClasificadorStrategy;
import clasificadores.ClasificarNoMismo;

// Devuelve una tabla hash en la que cada equipo (clave) tiene asociada
// una lista de equipos (valor) con los que tiene que jugar
public class GeneradorEmparejamientos {
	public Map<Equipo, List<Equipo>> empareja(List<Equipo> equipos) {
		Map<Equipo, List<Equipo>> emparejamientos = new HashMap<>();

		// inicializa la estructura de datos (inicialmente cada equipo tiene una
		// lista vacía de contrincantes)
		for (Equipo equipo : equipos) {
			emparejamientos.put(equipo, new ArrayList<Equipo>());
		}

		// emparejamientos.get(equipo_N) --> devuelve la lista de equipos contra
		// los que tiene que jugar 'equipo_N'
		for (Equipo equipo : equipos) {
			for (Equipo candidato : equipos) {
				if (getClasificador(emparejamientos).clasificar(equipo,
						candidato)) {
					emparejamientos.get(equipo).add(candidato);
					emparejamientos.get(candidato).add(equipo);
				}
			}
		}

		return emparejamientos;
	}

	private ClasificadorStrategy getClasificador(
			Map<Equipo, List<Equipo>> emparejamientos) {
		ClasificadorComposite composite = new ClasificadorComposite();
		composite.add(new ClasificarNoMismo());
		composite.add(new ClasificadorEdad());
		composite.add(new ClasificadorSexo());
		composite.add(new ClasificadorContiene(emparejamientos));
		return composite;
	}

}
