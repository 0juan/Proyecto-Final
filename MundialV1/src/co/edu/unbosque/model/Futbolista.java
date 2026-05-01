package co.edu.unbosque.model;

public class Futbolista {

	private String idFutbolista;
	private String nombre;
	private int edad;
	private String numero;
	private String posicion;
	private boolean estado;

	public Futbolista(String idFutbolista, String nombre, int edad, String numero, String posicion, boolean estado) {
		this.idFutbolista = idFutbolista;
		this.nombre = nombre;
		this.edad = edad;
		this.numero = numero;
		this.posicion = posicion;
		this.estado = estado;

	}

	public Futbolista() {

	}

	public String getIdFutbolista() {
		return idFutbolista;
	}

	public void setIdFutbolista(String idFutbolista) {
		this.idFutbolista = idFutbolista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}