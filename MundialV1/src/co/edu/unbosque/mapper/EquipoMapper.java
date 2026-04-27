package co.edu.unbosque.mapper;

import co.edu.unbosque.model.Equipo;
import co.edu.unbosque.record.EquipoDTO;

public class EquipoMapper { // DTO --- Entidad

	public static Equipo toEntity(EquipoDTO dto) {
		if (dto == null)
			return null;

		return new Equipo(dto.getIdEquipo(), dto.getNombreEquipo(), dto.getCategoriaEquipo(), dto.getCiudadEquipo(),
				dto.isEstadoEquipo(), dto.getFechaFundacionEquipo());
	}

	public static EquipoDTO toDTO(Equipo e) {
		if (e == null)
			return null;

		return new EquipoDTO(e.getIdEquipo(), e.getNombreEquipo(), e.getCategoriaEquipo(), e.getCiudadEquipo(),
				e.isEstadoEquipo(), e.getFechaFundacionEquipo());
	}
}