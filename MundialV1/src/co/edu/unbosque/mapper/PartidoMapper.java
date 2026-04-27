package co.edu.unbosque.mapper;
import co.edu.unbosque.model.*;
import co.edu.unbosque.model.Partido;
import co.edu.unbosque.record.*;

public class PartidoMapper {
	public static Partido toEntity(Partido p) {
		if (p == null)
			return null;

		return new PartidoRecord toRecord (p.getFechaPartido(), p.isEstadoPartido(),p.getTipoDePatido(), p.getFase(),
				p.getMarcadorLocal(), p.getMarcadorVisitante(), p.getLocalId());
	}

	public static PartidoRecord toEntity(PartidoRecord e) {
		if (e == null)
			return null;
		
		return new PartidoRecord(e.setFechaPartido(), e.setEstadoPartido(), e.setTipoDePatido(), e.setFase(),
				e.setMarcadorLocal(), e.setMarcadorVisitante(), e.setLocalId());
		
		return e;
	}
}