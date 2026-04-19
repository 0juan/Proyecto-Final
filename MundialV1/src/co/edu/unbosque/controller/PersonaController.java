package co.edu.unbosque.controller;

import co.edu.unbosque.dto.PersonaDTO;
import co.edu.unbosque.mapper.PersonaMapper;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.PersonaRepositoryArray;

public class PersonaController {
	private final PersonaRepositoryArray repo;

	public PersonaController(PersonaRepositoryArray repo) {
		this.repo = repo;
	}

	public boolean crear(PersonaDTO dto) {
		Persona e = PersonaMapper.toEntity(dto);
		return repo.crear(e);
	}

	public PersonaDTO[] listar() {
		Persona[] entidades = repo.listar();
		PersonaDTO[] dtos = new PersonaDTO[entidades.length];
		for (int i = 0; i < entidades.length; i++)
			dtos[i] = PersonaMapper.toDTO(entidades[i]);
		return dtos;
	}

	public PersonaDTO buscarPorId(short id) {
		return PersonaMapper.toDTO(repo.buscarPorId(id));
	}

	public PersonaDTO buscarPorNombre(String nom) {
		return PersonaMapper.toDTO(repo.buscarPorNombre(nom));
	}

	public PersonaDTO buscarPorEstado(boolean est) {
		return PersonaMapper.toDTO(repo.buscarPorEstado(est));
	}

	public boolean actualizar(PersonaDTO dto) {
		Persona e = PersonaMapper.toEntity(dto);
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
