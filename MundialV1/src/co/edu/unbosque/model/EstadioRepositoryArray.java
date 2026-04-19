package co.edu.unbosque.model;

public class EstadioRepositoryArray {
	private final Estadio[] data;
	private int size;

	public EstadioRepositoryArray(int capacidad) {
		if (capacidad <= 0)
			throw new IllegalArgumentException("Capacidad debe ser > 0");
		this.data = new Estadio[capacidad];
		this.size = 0;
	}

	public int capacidadTotal() {
		return data.length - size;
	}

	public int cantidadActual() {
		return size;
	}

	public boolean crear(Estadio e) {
		if (e == null)
			return false;
		if (size >= data.length)
			return false;
		if (buscarPorId(e.getIdEstadio()) != null)
			return false;
		data[size++] = e;
		return true;
	}

	public Estadio[] listar() {
		Estadio[] copia = new Estadio[size];
		for (int i = 0; i < size; i++)
			copia[i] = data[i];
		return copia;
	}

	public Estadio buscarPorId(short id) {
		int idx = indicePorId(id);
		return (idx >= 0) ? data[idx] : null;
	}

	public boolean actualizar(Estadio e) {
		if (e == null)
			return false;
		int idx = indicePorId(e.getIdEstadio());
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
		if (data[idx].isEstadoEstadio() == false) {
			return false;	
		}
		data[idx].setEstadoEstadio(false);
		return true;
	}

	private int indicePorId(short id) {
		for (int i = 0; i < size; i++) {
			if (data[i].getIdEstadio() == id)
				return i;
		}
		return -1;
	}
}
