package co.edu.unbosque.dto;

import java.time.LocalDate;

public class EstadioDTO {
	private short idEstadio;
	private String nombreEstadio;
	private int capacidadEstadio;
	private int tamanoEstadio;
	private String ciudadEstadio;
	private String tipoEstadio;
	private LocalDate fechaFundacionEstadio; // como String para el input (YYYY-MM-DD)
	private boolean estadoEstadio;

	public EstadioDTO(short idEstadio, String nombreEstadio, int capacidadEstadio, int tamanoEstadio,
			String ciudadEstadio, String tipoEstadio, LocalDate fechaFundacionEstadio, boolean estadoEstadio) {

		this.idEstadio = idEstadio;
		this.nombreEstadio = nombreEstadio;
		this.capacidadEstadio = capacidadEstadio;
		this.tamanoEstadio = tamanoEstadio;
		this.ciudadEstadio = ciudadEstadio;
		this.tipoEstadio = tipoEstadio;
		this.fechaFundacionEstadio = fechaFundacionEstadio;
		this.estadoEstadio = estadoEstadio;
	}

	public short getIdEstadio() {
		return idEstadio;
	}

	public void setIdEstadio(short idEstadio) {
		this.idEstadio = idEstadio;
	}

	public String getNombreEstadio() {
		return nombreEstadio;
	}

	public void setNombreEstadio(String nombreEstadio) {
		this.nombreEstadio = nombreEstadio;
	}

	public int getCapacidadEstadio() {
		return capacidadEstadio;
	}

	public void setCapacidadEstadio(int capacidadEstadio) {
		this.capacidadEstadio = capacidadEstadio;
	}

	public int getTamanoEstadio() {
		return tamanoEstadio;
	}

	public void setTamanoEstadio(int tamanoEstadio) {
		this.tamanoEstadio = tamanoEstadio;
	}

	public String getCiudadEstadio() {
		return ciudadEstadio;
	}

	public void setCiudadEstadio(String ciudadEstadio) {
		this.ciudadEstadio = ciudadEstadio;
	}

	public String getTipoEstadio() {
		return tipoEstadio;
	}

	public void setTipoEstadio(String tipoEstadio) {
		this.tipoEstadio = tipoEstadio;
	}

	public LocalDate getFechaFundacionEstadio() {
		return fechaFundacionEstadio;
	}

	public void setFechaFundacionEstadio(LocalDate fechaFundacionEstadio) {
		this.fechaFundacionEstadio = fechaFundacionEstadio;
	}

	public boolean isEstadoEstadio() {
		return estadoEstadio;
	}

	public void setEstadoEstadio(boolean estadoEstadio) {
		this.estadoEstadio = estadoEstadio;
	}

}
