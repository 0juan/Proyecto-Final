package co.edu.unbosque.controller;

import co.edu.unbosque.mapper.PartidoMapper;
import co.edu.unbosque.model.Partido;
import co.edu.unbosque.model.PartidoRepositoryArray;
import co.edu.unbosque.record.PartidoRecord;

public class PartidoController {
	private final PartidoRepositoryArray repo;

	public PartidoController(PartidoRepositoryArray repo) {
		this.repo = repo;
	}

	public boolean crear(PartidoRecord dto) {
		Partido e = PartidoMapper.toEntity(dto);
		return repo.crear(e);
	}

	public PartidoRecord[] listar() {
		Partido[] entidades = repo.listar();
		PartidoRecord[] dtos = new PartidoRecord[entidades.length];
		for (int i = 0; i < entidades.length; i++)
			dtos[i] = PartidoMapper.toDTO(entidades[i]);
		return dtos;
	}

	public PartidoRecord buscarPorId(int id) {
		return PartidoMapper.toDTO(repo.buscarPorId(id));
	}

	public int capacidadTotal() {
		return repo.capacidadTotal();
	}

	public int cantidadActual() {
		return repo.cantidadActual();
	}

	public boolean actualizar(PartidoRecord dto) {
		Partido e = PartidoMapper.toEntity(dto);
		return repo.actualizar(e);
	}

	public boolean eliminar(int id) {
		return repo.eliminar(id);
	}
}