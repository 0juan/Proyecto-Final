package co.edu.unbosque.record;


public class EstadioDTO {

	private String nombreEstadio;
	private int capacidadEstadio;
	private String ciudadEstadio;
	private boolean estadoEstadio;
	private String paisEstadio;

	public EstadioDTO( String nombreEstadio, int capacidadEstadio, 
			String ciudadEstadio, String paisEstadio,  boolean estadoEstadio) {

		this.nombreEstadio = nombreEstadio;
		this.capacidadEstadio = capacidadEstadio;
		this.ciudadEstadio = ciudadEstadio;
		this.estadoEstadio = estadoEstadio;
		this.paisEstadio = paisEstadio;
	}

	public String getNombreEstadio() {
		return nombreEstadio;
	}

	public void setNombreEstadio(String nombreEstadio) {
		this.nombreEstadio = nombreEstadio;
	}

	public String getPaisEstadio() {
		return paisEstadio;
	}

	public void setPaisEstadio(String paisEstadio) {
		this.paisEstadio = paisEstadio;
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

	public boolean isEstadoEstadio() {
		return estadoEstadio;
	}

	public void setEstadoEstadio(boolean estadoEstadio) {
		this.estadoEstadio = estadoEstadio;
	}


}
