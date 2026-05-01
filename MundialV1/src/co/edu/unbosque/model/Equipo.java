package co.edu.unbosque.model;

import java.time.LocalDate;
import java.util.List;

public class Equipo {
	private String idEquipo;
	private String nombreEquipo;
	private String directorEquipo;
	private List<Futbolista> jugadores;
	private LocalDate fechaFundacionEquipo;
	private String categoriaEquipo;
	private String pais;
	private boolean estadoEquipo;

	public Equipo() {

	}

	public Equipo(String idEquipo, String nombreEquipo, String directorEquipo, List<Futbolista> jugadores,
			LocalDate fechaFundacionEquipo, String categoriaEquipo, String paisEquipo, boolean estadoEquipo) {
		this.idEquipo = idEquipo;
		this.nombreEquipo = nombreEquipo;
		this.directorEquipo = directorEquipo;
		this.jugadores = jugadores;
		this.fechaFundacionEquipo = fechaFundacionEquipo;
		this.categoriaEquipo = categoriaEquipo;
		this.pais = paisEquipo;
		this.estadoEquipo = estadoEquipo;
	}

	public String getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(String idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getDirectorEquipo() {
		return directorEquipo;
	}

	public void setDirectorEquipo(String directorEquipo) {
		this.directorEquipo = directorEquipo;
	}

	public List<Futbolista> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Futbolista> jugadores) {
		this.jugadores = jugadores;
	}

	public LocalDate getFechaFundacionEquipo() {
		return fechaFundacionEquipo;
	}

	public void setFechaFundacionEquipo(LocalDate fechaFundacionEquipo) {
		this.fechaFundacionEquipo = fechaFundacionEquipo;
	}

	public String getCategoriaEquipo() {
		return categoriaEquipo;
	}

	public void setCategoriaEquipo(String categoriaEquipo) {
		this.categoriaEquipo = categoriaEquipo;
	}

	public String getPaisEquipo() {
		return pais;
	}

	public void setPaisEquipo(String paisEquipo) {
		this.pais = paisEquipo;
	}

	public boolean isEstadoEquipo() {
		return estadoEquipo;
	}

	public void setEstadoEquipo(boolean estadoEquipo) {
		this.estadoEquipo = estadoEquipo;
	}
}