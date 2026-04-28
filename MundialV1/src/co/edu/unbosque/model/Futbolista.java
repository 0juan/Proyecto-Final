package co.edu.unbosque.model;

public class Futbolista {

	String id;
	String nombre;
	int edad;
	String numero;
	String posicion;
	boolean estado;
		
	public Futbolista(String id, String nombre, int edad, String numero, String posicion, boolean estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.numero = numero;
		this.posicion = posicion;
		this.estado = estado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
