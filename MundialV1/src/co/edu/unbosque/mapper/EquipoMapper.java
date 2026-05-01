package co.edu.unbosque.mapper;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Equipo;
import co.edu.unbosque.model.Futbolista;
import co.edu.unbosque.record.EquipoRecord;

public final class EquipoMapper {

	private EquipoMapper() {
	}

	public static Equipo toEntity(EquipoRecord record) {
		Equipo entidad = new Equipo();
		entidad.setIdEquipo(record.idEquipo());
		entidad.setNombreEquipo(record.nombreEquipo());
		entidad.setDirectorEquipo(record.directorEquipo());
		entidad.setFechaFundacionEquipo(record.fechaFundacionEquipo());
		entidad.setCategoriaEquipo(record.categoriaEquipo());
		entidad.setPaisEquipo(record.pais());
		entidad.setEstadoEquipo(record.estadoEquipo());

		List<Futbolista> listaFutbolistas = new ArrayList<>();
		if (record.listaIdsJugadores() != null) {
			for (String idJugador : record.listaIdsJugadores()) {
				Futbolista f = new Futbolista();
				f.setIdFutbolista(idJugador);
				listaFutbolistas.add(f);
			}
		}
		entidad.setJugadores(listaFutbolistas);

		return entidad;
	}

	public static EquipoRecord toRecord(Equipo entidad) {
		List<String> listaIds = new ArrayList<>();

		if (entidad.getJugadores() != null) {
			for (Futbolista f : entidad.getJugadores()) {
				listaIds.add(f.getIdFutbolista());
			}
		}

		return new EquipoRecord(entidad.getIdEquipo(), entidad.getNombreEquipo(), entidad.getDirectorEquipo(), listaIds,
				entidad.getFechaFundacionEquipo(), entidad.getCategoriaEquipo(), entidad.getPaisEquipo(),
				entidad.isEstadoEquipo());
	}
}