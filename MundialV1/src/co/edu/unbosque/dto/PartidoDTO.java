package co.edu.unbosque.dto;

import java.time.LocalDate;

public class PartidoDTO {
	private int idPartido;
	private int localId;
	private int visitanteId;
	private LocalDate fechaPartido;
	private int marcadorLocal;
	private int marcadorVisitante;
	private boolean estadoPartido;

	public PartidoDTO(int idPartido, int localId, int visitanteId, LocalDate fechaPartido, int marcadorLocal,
			int marcadorVisitante, boolean estadoPartido) {
		this.idPartido = idPartido;
		this.localId = localId;
		this.visitanteId = visitanteId;
		this.fechaPartido = fechaPartido;
		this.marcadorLocal = marcadorLocal;
		this.marcadorVisitante = marcadorVisitante;
		this.estadoPartido = estadoPartido;
	}

	public int getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}

	public int getLocalId() {
		return localId;
	}

	public void setLocalId(int localId) {
		this.localId = localId;
	}

	public int getVisitanteId() {
		return visitanteId;
	}

	public void setVisitanteId(int visitanteId) {
		this.visitanteId = visitanteId;
	}

	public LocalDate getFechaPartido() {
		return fechaPartido;
	}

	public void setFechaPartido(LocalDate fechaPartido) {
		this.fechaPartido = fechaPartido;
	}

	public int getMarcadorLocal() {
		return marcadorLocal;
	}

	public void setMarcadorLocal(int marcadorLocal) {
		this.marcadorLocal = marcadorLocal;
	}

	public int getMarcadorVisitante() {
		return marcadorVisitante;
	}

	public void setMarcadorVisitante(int marcadorVisitante) {
		this.marcadorVisitante = marcadorVisitante;
	}

	public boolean isEstadoPartido() {
		return estadoPartido;
	}

	public void setEstadoPartido(boolean estadoPartido) {
		this.estadoPartido = estadoPartido;
	}

}
