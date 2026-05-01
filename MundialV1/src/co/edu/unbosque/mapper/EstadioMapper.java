package co.edu.unbosque.mapper;

import co.edu.unbosque.model.Estadio;
import co.edu.unbosque.record.EstadioRecord;

public final class EstadioMapper {

	private EstadioMapper() {
	}

	public static Estadio toEntity(EstadioRecord e) {
		return new Estadio(e.idEstadio(), e.nombreEstadio(), e.capacidadEstadio(), e.ciudadEstadio(), e.paisEstadio(),
				e.estadoEstadio());
	}

	public static EstadioRecord toRecord(Estadio estadio) {
		return new EstadioRecord(estadio.getIdEstadio(), estadio.getNombreEstadio(), estadio.getCapacidadEstadio(),
				estadio.getCiudadEstadio(), estadio.getPaisEstadio(), estadio.isEstadoEstadio());
	}
}