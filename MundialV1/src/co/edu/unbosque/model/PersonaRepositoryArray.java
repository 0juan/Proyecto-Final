package co.edu.unbosque.model;

public class PersonaRepositoryArray {
	private final Persona[] data;
	private int size;

	public PersonaRepositoryArray(int capacidad) {
		if (capacidad <= 0)
			throw new IllegalArgumentException("Capacidad debe ser > 0");
		this.data = new Persona[capacidad];
		this.size = 0;
	}

	public int capacidadTotal() {
		return data.length - size;
	}

	public int cantidadActual() {
		return size;
	}

	public boolean crear(Persona e) {
		if (e == null)
			return false;
		if (size >= data.length)
			return false;
		if (buscarPorId(e.getIdPersona()) != null)
			return false;
		data[size++] = e;
		
		return true;
	}

	public Persona[] listar() {
		Persona[] copia = new Persona[size];
		for (int i = 0; i < size; i++)
			copia[i] = data[i];
		return copia;
	}

	public Persona buscarPorId(short id) {
		int idx = indicePorId(id);
		return (idx >= 0) ? data[idx] : null;
	}
	
	public Persona buscarPorNombre(String nom) {
		for (int i = 0; i < size; i++) {
			if (data[i].getNombrePersona().equalsIgnoreCase(nom))
			return data[i];
		}return null;
	}
	
	public Persona buscarPorEstado(boolean est) {
		for (int i = 0; i < size; i++) {
			if (data[i].isEstadoPersona() == est) {
				return data[i];
			}
			
		}return null;
	}
	

	public boolean actualizar(Persona e) {
		if (e == null)
			return false;
		int idx = indicePorId(e.getIdPersona());
		if (idx < 0)
			return false;
		data[idx] = e;
		return true;
	}

	public boolean eliminar(short id) {
		int idx = indicePorId(id);
		if (idx < 0) {
			return false;
	}
		if (data[idx].isEstadoPersona() == false) {
			return false;	
		}
		data[idx].setEstadoPersona(false);
		return true;
	}

	private int indicePorId(short id) {
		for (int i = 0; i < size; i++) {
			if (data[i].getIdPersona() == id)
				return i;
		}
		return -1;
	}
}