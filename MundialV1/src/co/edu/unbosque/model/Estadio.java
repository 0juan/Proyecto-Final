package co.edu.unbosque.model;

public class Estadio {

	private String idEstadio;
	private String nombreEstadio;
	private int capacidadEstadio;
	private String ciudadEstadio;
	private String paisEstadio;
	private boolean estadoEstadio;

	public Estadio(String idEstadio, String nombreEstadio, int capacidadEstadio, String ciudadEstadio,
			String paisEstadio, boolean estadoEstadio) {
		this.idEstadio = idEstadio;
		this.nombreEstadio = nombreEstadio;
		this.capacidadEstadio = capacidadEstadio;
		this.ciudadEstadio = ciudadEstadio;
		this.paisEstadio = paisEstadio;
		this.estadoEstadio = estadoEstadio;
	}

	public String getIdEstadio() {
		return idEstadio;
	}

	public void setIdEstadio(String idEstadio) {
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

	public String getCiudadEstadio() {
		return ciudadEstadio;
	}

	public void setCiudadEstadio(String ciudadEstadio) {
		this.ciudadEstadio = ciudadEstadio;
	}

	public String getPaisEstadio() {
		return paisEstadio;
	}

	public void setPaisEstadio(String paisEstadio) {
		this.paisEstadio = paisEstadio;
	}

	public boolean isEstadoEstadio() {
		return estadoEstadio;
	}

	public void setEstadoEstadio(boolean estadoEstadio) {
		this.estadoEstadio = estadoEstadio;
	}

}
