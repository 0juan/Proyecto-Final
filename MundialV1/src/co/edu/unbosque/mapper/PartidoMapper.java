package co.edu.unbosque.mapper;

import co.edu.unbosque.dto.PartidoDTO;
import co.edu.unbosque.model.Partido;

public class PartidoMapper {
	public static Partido toEntity(PartidoDTO dto) {
		if (dto == null)
			return null;

		return new Partido(dto.getIdPartido(), dto.getLocalId(), dto.getVisitanteId(), dto.getFechaPartido(),
				dto.getMarcadorLocal(), dto.getMarcadorVisitante(), dto.isEstadoPartido());
	}

	public static PartidoDTO toDTO(Partido e) {
		if (e == null)
			return null;

		return new PartidoDTO(e.getIdPartido(), e.getLocalId(), e.getVisitanteId(), e.getFechaPartido(),
				e.getMarcadorLocal(), e.getMarcadorVisitante(), e.isEstadoPartido());
	}
}