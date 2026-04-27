package co.edu.unbosque.mapper;

import co.edu.unbosque.model.Estadio;
import co.edu.unbosque.record.EstadioDTO;

public class EstadioMapper { // DTO --- Entidad

	public static Estadio toEntity(EstadioDTO dto) {
		if (dto == null)
			return null;

		return new Estadio(dto.getIdEstadio(), dto.getNombreEstadio(), dto.getCapacidadEstadio(),
				dto.getTamanoEstadio(), dto.getCiudadEstadio(), dto.getTipoEstadio(), dto.getFechaFundacionEstadio(),
				dto.isEstadoEstadio());
	}

	public static EstadioDTO toDTO(Estadio e) {
		if (e == null)
			return null;

		return new EstadioDTO(e.getIdEstadio(), e.getNombreEstadio(), e.getCapacidadEstadio(), e.getTamanoEstadio(),
				e.getCiudadEstadio(), e.getTipoEstadio(), e.getFechaFundacionEstadio(), e.isEstadoEstadio());
	}
}
