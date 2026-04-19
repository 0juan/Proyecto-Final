package co.edu.unbosque.controller;

import co.edu.unbosque.dto.EstadioDTO;
import co.edu.unbosque.mapper.EstadioMapper;
import co.edu.unbosque.model.Estadio;
import co.edu.unbosque.model.EstadioRepositoryArray;

public class EstadioController {
	private final EstadioRepositoryArray repo;

	public EstadioController(EstadioRepositoryArray repo) {
		this.repo = repo;
	}

	public boolean crear(EstadioDTO dto) {
		Estadio e = EstadioMapper.toEntity(dto);
		return repo.crear(e);
	}

	public EstadioDTO[] listar() {
		Estadio[] entidades = repo.listar();
		EstadioDTO[] dtos = new EstadioDTO[entidades.length];
		for (int i = 0; i < entidades.length; i++)
			dtos[i] = EstadioMapper.toDTO(entidades[i]);
		return dtos;
	}

	public EstadioDTO buscarPorId(short id) {
		return EstadioMapper.toDTO(repo.buscarPorId(id));
	}

	public boolean actualizar(EstadioDTO dto) {
		Estadio e = EstadioMapper.toEntity(dto);
		return repo.actualizar(e);
	}

	public boolean eliminar(short id) {
		return repo.eliminar(id);
	}

	public int capacidadTotal() {
		return repo.capacidadTotal();
	}

	public int cantidadActual() {
		return repo.cantidadActual();
	}
}
