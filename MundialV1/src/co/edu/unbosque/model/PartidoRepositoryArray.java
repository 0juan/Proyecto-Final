package co.edu.unbosque.model;

public class PartidoRepositoryArray {
	private final Partido[] data;
	private int size;

	public PartidoRepositoryArray(int capacidad) {
		if (capacidad <= 0)
			throw new IllegalArgumentException("Capacidad debe ser > 0");
		this.data = new Partido[capacidad];
		this.size = 0;
	}

	public int capacidadTotal() {
		return data.length - size;
	}

	public int cantidadActual() {
		return size;
	}

	public boolean crear(Partido e) {
		if (e == null)
			return false;
		if (size >= data.length)
			return false;
		if (buscarPorId(e.getIdPartido()) != null)
			return false;
		data[size++] = e;

		return true;
	}

	public Partido[] listar() {
		Partido[] copia = new Partido[size];
		for (int i = 0; i < size; i++)
			copia[i] = data[i];
		return copia;
	}

	public Partido buscarPorId(int i) {
		int idx = indicePorId(i);
		return (idx >= 0) ? data[idx] : null;
	}

	public boolean actualizar(Partido e) {
		if (e == null)
			return false;
		int idx = indicePorId(e.getIdPartido());
		if (idx < 0)
			return false;
		data[idx] = e;
		return true;
	}

	public boolean eliminar(int id) {
		int idx = indicePorId(id);
		if (idx < 0) {
			return false;
	}
		if (data[idx].isEstadoPartido() == false) {
			return false;	
		}
		data[idx].setEstadoPartido(false);
		return true;
	}

	public Partido buscarPorEstado(boolean est) {
		for (int i = 0; i < size; i++) {
			if (data[i].isEstadoPartido() == est) {
				return data[i];
			}
		}
		return null;
	}

	private int indicePorId(int i2) {
		for (int i = 0; i < size; i++) {
			if (data[i].getIdPartido() == i2)
				return i;
		}
		return -1;
	}
}
