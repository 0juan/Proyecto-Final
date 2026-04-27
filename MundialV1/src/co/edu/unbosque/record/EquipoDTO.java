package co.edu.unbosque.record;

import java.time.LocalDate;

public class EquipoDTO {
	private short idEquipo;
	private String nombreEquipo;
	private String categoriaEquipo;
	private String ciudadEquipo;
	private boolean estadoEquipo;
	private LocalDate fechaFundacionEquipo;

	public EquipoDTO(short idEquipo, String nombreEquipo, String categoriaEquipo, String ciudadEquipo,
			boolean estadoEquipo, LocalDate fechaFundacionEquipo) {
		this.idEquipo = idEquipo;
		this.nombreEquipo = nombreEquipo;
		this.categoriaEquipo = categoriaEquipo;
		this.ciudadEquipo = ciudadEquipo;
		this.estadoEquipo = estadoEquipo;
		this.fechaFundacionEquipo = fechaFundacionEquipo;
	}

	public short getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(short idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getCategoriaEquipo() {
		return categoriaEquipo;
	}

	public void setCategoriaEquipo(String categoriaEquipo) {
		this.categoriaEquipo = categoriaEquipo;
	}

	public String getCiudadEquipo() {
		return ciudadEquipo;
	}

	public void setCiudadEquipo(String ciudadEquipo) {
		this.ciudadEquipo = ciudadEquipo;
	}

	public boolean isEstadoEquipo() {
		return estadoEquipo;
	}

	public void setEstadoEquipo(boolean estadoEquipo) {
		this.estadoEquipo = estadoEquipo;
	}

	public LocalDate getFechaFundacionEquipo() {
		return fechaFundacionEquipo;
	}

	public void setFechaFundacionEquipo(LocalDate fechaFundacionEquipo) {
		this.fechaFundacionEquipo = fechaFundacionEquipo;
	}

}
