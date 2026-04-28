package co.edu.unbosque.record;

import java.time.LocalDate;

public class PartidoRecord {
	

	public record Partidorecord (String equipoLocalId, String equipoVisitanteId, LocalDate fechaPartido, boolean estadoPartido,
			String tipoDePatido, String fase, int marcadorLocal, int marcadorVisitante, int localId) {

	}
}
