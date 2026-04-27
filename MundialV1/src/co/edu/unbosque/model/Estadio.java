package co.edu.unbosque.model;

public class Estadio {
	
	private String nombreEstadio;
	private int capacidadEstadio;
	private String ciudadEstadio;
	private String paisEstadio; 
	private boolean estadoEstadio;

	public Estadio( String nombreEstadio, int capacidadEstadio,  String ciudadEstadio,
			String b, boolean i) {
		
		this.nombreEstadio = nombreEstadio;
		this.capacidadEstadio = capacidadEstadio;
		this.ciudadEstadio = ciudadEstadio;
		this.paisEstadio = b;
		this.estadoEstadio = i;
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