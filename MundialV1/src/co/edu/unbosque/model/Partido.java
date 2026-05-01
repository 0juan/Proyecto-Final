package co.edu.unbosque.model;

import java.time.LocalDate;

public class Partido {
	private String idPartido;
	private String equipoLocalId;
	private String equipoVisitanteId;
	private LocalDate fechaPartido;
	private boolean estadoPartido;
	private String tipoDePartido;
	private String fase;
	private int marcadorLocal;
	private int marcadorVisitante;
	private int localId;

	public Partido(String equipoLocalId, String equipoVisitanteId, LocalDate fechaPartido, boolean estadoPartido,
			String tipoDePatido, String fase, int marcadorLocal, int marcadorVisitante, int localId) {

		this.equipoLocalId = equipoLocalId;
		this.equipoVisitanteId = equipoVisitanteId;
		this.fechaPartido = fechaPartido;
		this.estadoPartido = estadoPartido;
		this.tipoDePartido = tipoDePatido;
		this.fase = fase;
		this.marcadorLocal = marcadorLocal;
		this.marcadorVisitante = marcadorVisitante;
		this.localId = localId;

	}

	public String getEquipoLocalId() {
		return equipoLocalId;
	}

	public void setEquipoLocalId(String equipoLocalId) {
		this.equipoLocalId = equipoLocalId;
	}

	public String getEquipoVisitanteId() {
		return equipoVisitanteId;
	}

	public void setEquipoVisitanteId(String equipoVisitanteId) {
		this.equipoVisitanteId = equipoVisitanteId;
	}

	public LocalDate getFechaPartido() {
		return fechaPartido;
	}

	public void setFechaPartido(LocalDate fechaPartido) {
		this.fechaPartido = fechaPartido;
	}

	public boolean isEstadoPartido() {
		return estadoPartido;
	}

	public void setEstadoPartido(boolean estadoPartido) {
		this.estadoPartido = estadoPartido;
	}

	public String getTipoDePartido() {
		return tipoDePartido;
	}

	public void setTipoDePartido(String tipoDePatido) {
		this.tipoDePartido = tipoDePatido;
	}

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
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

	public int getLocalId() {
		return localId;
	}

	public void setLocalId(int localId) {
		this.localId = localId;
	}

	public String getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(String idPartido) {
		this.idPartido = idPartido;
	}

}