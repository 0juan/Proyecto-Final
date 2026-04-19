package co.edu.unbosque.controller;

import co.edu.unbosque.dto.EquipoDTO;
import co.edu.unbosque.mapper.EquipoMapper;
import co.edu.unbosque.model.Equipo;
import co.edu.unbosque.model.EquipoRepositoryArray;
// jijijijiji
public class EquipoController {
	private final EquipoRepositoryArray repo;

	public EquipoController(EquipoRepositoryArray repo) {
		this.repo = repo;
	}

	public boolean crear(EquipoDTO dto) {
		Equipo e = EquipoMapper.toEntity(dto);
		return repo.crear(e);
	}

	public EquipoDTO[] listar() {
		Equipo[] entidades = repo.listar();
		EquipoDTO[] dtos = new EquipoDTO[entidades.length];
		for (int i = 0; i < entidades.length; i++)
			dtos[i] = EquipoMapper.toDTO(entidades[i]);
		return dtos;
	}

	public EquipoDTO buscarPorId(short id) {
		return EquipoMapper.toDTO(repo.buscarPorId(id));
	}

	public EquipoDTO buscarPorNombre(String nom) {
		return EquipoMapper.toDTO(repo.buscarPorNombre(nom));
	}

	public EquipoDTO buscarPorEstado(boolean est) {
		return EquipoMapper.toDTO(repo.buscarPorEstado(est));
	}

	public boolean actualizar(EquipoDTO dto) {
		Equipo e = EquipoMapper.toEntity(dto);
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
