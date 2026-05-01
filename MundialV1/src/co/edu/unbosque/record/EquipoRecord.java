package co.edu.unbosque.record;

import java.time.LocalDate;
import java.util.List;

public record EquipoRecord(String idEquipo, String nombreEquipo, String directorEquipo, List<String> listaIdsJugadores,
		LocalDate fechaFundacionEquipo, String categoriaEquipo, String pais, boolean estadoEquipo) {

}