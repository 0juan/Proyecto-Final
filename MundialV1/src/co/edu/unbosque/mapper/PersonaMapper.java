package co.edu.unbosque.mapper;

import co.edu.unbosque.model.Persona;
import co.edu.unbosque.record.PersonaDTO;

public class PersonaMapper {
	public static Persona toEntity(PersonaDTO dto) {
		if (dto == null)
			return null;

		return new Persona(dto.getIdPersona(), dto.getNombrePersona(),dto.getApellidoPersona(), dto.getEdadPersona(),
				dto.getRolPersona(),dto.getSexoPersona(),dto.isEstadoPersona());
	}

	public static PersonaDTO toDTO(Persona e) {
		if (e == null)
			return null;

		return new PersonaDTO(e.getIdPersona(), e.getNombrePersona(), e.getApellidoPersona(),
				e.getEdadPersona(), e.getRolPersona(), e.getSexoPersona(),e.isEstadoPersona());
	}

}
