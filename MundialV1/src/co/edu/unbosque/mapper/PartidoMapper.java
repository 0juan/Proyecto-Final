package co.edu.unbosque.mapper;

import co.edu.unbosque.model.Partido;
import co.edu.unbosque.record.PartidoRecord;

public final class PartidoMapper {

	private PartidoMapper() {
	}

	public static Partido toEntity(PartidoRecord p) {
		return new Partido(p.equipoLocalId(), p.equipoVisitanteId(), p.fechaPartido(), p.estadoPartido(),
				p.tipoDePartido(), p.fase(), p.marcadorLocal(), p.marcadorVisitante(), p.localId());
	}

	public static PartidoRecord toRecord(Partido e) {
		return new PartidoRecord(e.getEquipoLocalId(), e.getEquipoVisitanteId(), e.getFechaPartido(),
				e.isEstadoPartido(), e.getTipoDePartido(), e.getFase(), e.getMarcadorLocal(), e.getMarcadorVisitante(),
				e.getLocalId());
	}
}