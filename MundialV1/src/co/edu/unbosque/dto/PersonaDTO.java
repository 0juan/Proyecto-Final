package co.edu.unbosque.dto;

public class PersonaDTO {
	private short idPersona;
	private String nombrePersona;
	private String apellidoPersona;
	private int edadPersona;
	private String rolPersona;
	private String sexoPersona;
	private boolean estadoPersona;

	public PersonaDTO(short idPersona, String nombrePersona, String apellidoPersona, int edad,
			String rolPersona, String sexoPersona, boolean estadoPersona) {
		this.idPersona = idPersona;
		this.nombrePersona = nombrePersona;
		this.apellidoPersona = apellidoPersona;
		this.edadPersona = edad;
		this.rolPersona = rolPersona;
		this.sexoPersona = sexoPersona;
		this.estadoPersona = estadoPersona;
	}

	public short getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(short idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getApellidoPersona() {
		return apellidoPersona;
	}

	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}

	public int getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(int edadPersona) {
		this.edadPersona = edadPersona;
	}

	public String getRolPersona() {
		return rolPersona;
	}

	public void setRolPersona(String rolPersona) {
		this.rolPersona = rolPersona;
	}

	public String getSexoPersona() {
		return sexoPersona;
	}

	public void setSexoPersona(String generoPersona) {
		this.sexoPersona = generoPersona;
	}

	public boolean isEstadoPersona() {
		return estadoPersona;
	}

	public void setEstadoPersona(boolean estadoPersona) {
		this.estadoPersona = estadoPersona;
	}

}
