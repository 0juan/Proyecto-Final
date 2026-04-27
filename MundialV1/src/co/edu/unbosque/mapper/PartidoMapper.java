package co.edu.unbosque.mapper;

import co.edu.unbosque.model.*;
import co.edu.unbosque.model.Partido;
import co.edu.unbosque.record.*;

public class PartidoMapper {
	public static Partido toEntity(Partido p) {
		if (p == null)
			return null;

		return new Partido(p.getEquipoLocalId(), p.getEquipoVisitanteId(), p.getFechaPartido(),
				p.isEstadoPartido(), p.getTipoDePatido(), p.getFase(), p.getMarcadorLocal(), p.getMarcadorVisitante(),
				p.getLocalId());

	}

	public static Partido toRecord(PartidoRecord e) {
		if (e == null)
			return null;
		return new Partido(	e.getEquipoLocalId(), e.getEquipoVisitanteId(), e.getFechaPartido(),
				e.isEstadoPartido(), e.getTipoDePatido(), e.getFase(), e.getMarcadorLocal(), e.getMarcadorVisitante(),
				e.getLocalId());

	}
}
