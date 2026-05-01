package co.edu.unbosque.record;

import java.time.LocalDate;

public record PartidoRecord(String equipoLocalId, String equipoVisitanteId, LocalDate fechaPartido,
		boolean estadoPartido, String tipoDePartido, String fase, int marcadorLocal, int marcadorVisitante,
		int localId) {
}