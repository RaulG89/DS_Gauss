package clasificadores;

import ligafutbol.Equipo;

public class ClasificadorComposite implements ClasificadorStrategy {

	@Override
	public boolean clasificar(Equipo equipo, Equipo candidato) {
		return new ClasificarNoMismo().clasificar(equipo, candidato)
				&& new ClasificadorEdad().clasificar(equipo, candidato)
				&& new ClasificadorSexo().clasificar(equipo, candidato);
	}

}
