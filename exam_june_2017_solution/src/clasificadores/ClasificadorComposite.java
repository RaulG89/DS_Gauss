package clasificadores;

import java.util.ArrayList;
import java.util.List;

import ligafutbol.Equipo;

public class ClasificadorComposite implements ClasificadorStrategy {

	private List<ClasificadorStrategy> list;

	public ClasificadorComposite() {
		list = new ArrayList<>();
	}

	@Override
	public boolean clasificar(Equipo equipo, Equipo candidato) {
		for (ClasificadorStrategy clasificadorStrategy : list) {
			if (!clasificadorStrategy.clasificar(equipo, candidato)) {
				return false;
			}
		}
		return true;
	}

	public void add(ClasificadorStrategy strategy) {
		list.add(strategy);
	}

}
