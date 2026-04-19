package co.edu.unbosque.model;

public class EquipoRepositoryArray {
	private final Equipo[] data;
	private int size;

	public EquipoRepositoryArray(int capacidad) {
		if (capacidad <= 0)
			throw new IllegalArgumentException("Capacidad debe ser > 0");
		this.data = new Equipo[capacidad];
		this.size = 0;
	}

	public int capacidadTotal() {
		return data.length - size;
	}

	public int cantidadActual() {
		return size;
	}

	public boolean crear(Equipo e) {
		if (e == null)
			return false;
		if (size >= data.length)
			return false;
		if (buscarPorId(e.getIdEquipo()) != null)
			return false;
		data[size++] = e;
		
		return true;
	}

	public Equipo[] listar() {
		Equipo[] copia = new Equipo[size];
		for (int i = 0; i < size; i++)
			copia[i] = data[i];
		return copia;
	}

	public Equipo buscarPorId(short id) {
		int idx = indicePorId(id);
		return (idx >= 0) ? data[idx] : null;
	}
	
	public Equipo buscarPorNombre(String nom) {
		for (int i = 0; i < size; i++) {
			if (data[i].getNombreEquipo().equalsIgnoreCase(nom))
			return data[i];
		}return null;
	}
	
	public Equipo buscarPorEstado(boolean est) {
		for (int i = 0; i < size; i++) {
			if (data[i].isEstadoEquipo() == est) {
				return data[i];
			}
			
		}return null;
	}
	

	public boolean actualizar(Equipo e) {
		if (e == null)
			return false;
		int idx = indicePorId(e.getIdEquipo());
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
		if (data[idx].isEstadoEquipo() == false) {
			return false;	
		}
		data[idx].setEstadoEquipo(false);
		return true;
	}

	private int indicePorId(short id) {
		for (int i = 0; i < size; i++) {
			if (data[i].getIdEquipo() == id)
				return i;
		}
		return -1;
	}
}
