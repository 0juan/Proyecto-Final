package co.edu.unbosque.mapper;

import co.edu.unbosque.model.Estadio;
import co.edu.unbosque.record.EstadioDTO;

public class EstadioMapper { 

	public static Estadio toEntity(EstadioDTO dto) {
		if (dto == null)
			return null;

		return new Estadio(dto.getNombreEstadio(), dto.getCapacidadEstadio(),
				 dto.getCiudadEstadio(),
				 dto.getPaisEstadio(), dto.isEstadoEstadio());
	}

	public static EstadioDTO toDTO(Estadio e) {
		if (e == null)
			return null;

		return new EstadioDTO( e.getNombreEstadio(), e.getCapacidadEstadio(), 
				e.getCiudadEstadio(), e.getPaisEstadio(), e.isEstadoEstadio());
	}
}
