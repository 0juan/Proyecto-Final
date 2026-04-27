package co.edu.unbosque.view;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import co.edu.unbosque.controller.EquipoController;
import co.edu.unbosque.controller.EstadioController;
import co.edu.unbosque.controller.PartidoController;
import co.edu.unbosque.controller.PersonaController;
import co.edu.unbosque.model.EquipoRepositoryArray;
import co.edu.unbosque.model.EstadioRepositoryArray;
import co.edu.unbosque.model.PartidoRepositoryArray;
import co.edu.unbosque.model.PersonaRepositoryArray;
import co.edu.unbosque.record.EquipoDTO;
import co.edu.unbosque.record.EstadioDTO;
import co.edu.unbosque.record.PartidoRecord;
import co.edu.unbosque.record.PersonaDTO;

public class AplMenuPpalMundial {

	private static Scanner sc = new Scanner(System.in);

	static MetodosAuxiliares metAux = new MetodosAuxiliares();

	static EstadioRepositoryArray repo1 = new EstadioRepositoryArray(10);
	static EquipoRepositoryArray repo2 = new EquipoRepositoryArray(10);
	static PersonaRepositoryArray repo3 = new PersonaRepositoryArray(10);
	static PartidoRepositoryArray repo4 = new PartidoRepositoryArray(10);

	private static EstadioController estadioController = new EstadioController(repo1);
	private static EquipoController equipoController = new EquipoController(repo2);
	private static PersonaController personaController = new PersonaController(repo3);
	private static PartidoController partidoController = new PartidoController(repo4);

	public static void main(String[] args) {
		mostrarMenuPrincipal();
	}

	public static void mostrarMenuPrincipal() {
		int opcion;

		do {
			System.out.println("╔════════════════════════════════╗");
			System.out.println("║         MENÚ PRINCIPAL         ║");
			System.out.println("╠════════════════════════════════╣");
			System.out.println("║ 1. Módulo de Equipos           ║");
			System.out.println("║ 2. Módulo de Estadios          ║");
			System.out.println("║ 3. Módulo de Personas          ║");
			System.out.println("║ 4. Módulo de Partidos          ║");
			System.out.println("║ 0. Salir                       ║");
			System.out.println("╚════════════════════════════════╝");
			System.out.print("Seleccione una opción: ");
			opcion = leerEntero("Seleccione opción: ");

			switch (opcion) {
			case 1:
				menuEquipos();
				break;
			case 2:
				menuEstadios();
				break;
			case 3:
				menuPersonas();
				break;
			case 4:
				menuPartidos();
				break;
			case 0:
				System.out.println("Saliendo del sistema...");
				break;
			default:
				System.out.println("Opción inválida.");
			}

		} while (opcion != 0);
	}

	public static void menuEquipos() {
		int opcion;

		do {
			System.out.println(metAux.devolverMenu("Equipos "));

			opcion = leerEntero("Seleccione opción: ");

			switch (opcion) {
			case 1:
				registrarEquipo();
				break;
			case 2:
				listarEquipo();
				break;
			case 3:
				buscarEquipo();
				break;
			case 4:
				actualizarEquipo();
				break;
			case 5:
				eliminarEquipo();
				break;
			case 0:
				System.out.println("Regresando al menú principal...");
				break;
			default:
				System.out.println("Opción inválida.");
			}

		} while (opcion != 0);
	}

	public static void menuEstadios() {
		int opcion;

		do {
			System.out.println(metAux.devolverMenu("Estadios"));

			opcion = leerEntero("Seleccione opción: ");

			switch (opcion) {
			case 1:
				registrarEstadio();
				break;
			case 2:
				listarEstadios();
				break;
			case 3:
				buscarEstadio();
				break;
			case 4:
				actualizarEstadio();
				break;
			case 5:
				eliminarEstadio();
				break;
			case 0:
				System.out.println("Regresando al menú principal...");
				break;
			default:
				System.out.println("Opción inválida.");
			}

		} while (opcion != 0);
	}

	public static void menuPersonas() {
		int opcion;

		do {
			System.out.println(metAux.devolverMenu("Personas"));

			opcion = leerEntero("Seleccione opción: ");

			switch (opcion) {
			case 1:
				registrarPersona();
				break;
			case 2:
				listarPersona();
				break;
			case 3:
				buscarPersona();
				break;
			case 4:
				actualizarPersona();
				break;
			case 5:
				eliminarPersona();
				break;
			case 0:
				System.out.println("Regresando al menú principal...");
				break;
			default:
				System.out.println("Opción inválida.");
			}

		} while (opcion != 0);
	}

	public static void menuPartidos() {
		int opcion;

		do {
			System.out.println(metAux.devolverMenu("Partidos"));

			opcion = leerEntero("Seleccione opción: ");

			switch (opcion) {
			case 1:
				registrarPartido();
				break;
			case 2:
				listarPartido();
				break;
			case 3:
				buscarPartido();
				break;
			case 4:
				actualizarPartido();
				break;
			case 5:
				eliminarPartido();
				break;
			case 0:
				System.out.println("Regresando al menú principal...");
				break;
			default:
				System.out.println("Opción inválida.");
			}

		} while (opcion != 0);
	}

	// ╔═══════════════════════════╗
	// ║ FUNCIONES MÓDULO EQUIPOS  ║
	// ╚═══════════════════════════╝
	public static void registrarEquipo() {
		short id = leerShort("ID: ");
		if (equipoController.buscarPorId(id) != null) {
			System.out.println("Ya existe un equipo con ese ID.");
			return;
		}
		String nombre = leerTexto("Nombre equipo: ");
		String categoria = leerTexto("Categoria equipo: ");
		String ciudad = leerTexto("Ciudad: ");
		LocalDate fecha = leerFechaISO("Fecha fundación (YYYY-MM-DD): ");
		boolean estado = true;

		EquipoDTO nuevo = new EquipoDTO(id, nombre, categoria, ciudad, estado, fecha);
		boolean ok = equipoController.crear(nuevo);
		System.out.println(ok ? "OK: equipo creado." : "No se pudo crear.");
	}

	public static void listarEquipo() {
		EquipoDTO[] lista = equipoController.listar();
		if (lista == null || lista.length == 0) {
			System.out.println("No hay registros.");
			return;
		}
		System.out.println("\n╔════════════════════════════════════════════════════════════════════╗");
		System.out.println("║                           LISTA DE EQUIPOS                         ║");
		System.out.println("╠════════════════════════════════════════════════════════════════════╣");
		System.out.println("║ ID: ║ Nombre:     ║ Categoria:  ║ Ciudad: ║ Fundación: ║ Estado:   ║");
		for (EquipoDTO e : lista)
			if (e != null)
				System.out.println(formatearEquipo(e));
	}

	public static void buscarEquipo() {
		short id = leerShort("ID a buscar: ");
		EquipoDTO dto = equipoController.buscarPorId(id);
		if (dto != null) {
			System.out.println("\n╔════════════════════════════════════════════════════════════════════╗");
			System.out.println("║                      RESULTADO DE BÚSQUEDA                         ║");
			System.out.println("╠════════════════════════════════════════════════════════════════════╣");
			System.out.println("║ ID: ║ Nombre:     ║ Categoria:  ║ Ciudad: ║ Fundación: ║ Estado:   ║");
			System.out.println(formatearEquipo(dto));
		} else {
			System.out.println("No encontrado.");
		}
	}

	public static void actualizarEquipo() {
		short id = leerShort("ID a actualizar: ");
		EquipoDTO actual = equipoController.buscarPorId(id);
		if (actual == null) {
			System.out.println("No existe un equipo con ese ID.");
			return;
		}
		System.out.println("Ingrese los nuevos datos");
		String nombre = leerTexto("Nombre equipo: ");
		String categoria = leerTexto("Categoria equipo: ");
		String ciudad = leerTexto("Ciudad: ");
		LocalDate fecha = leerFechaISO("Fecha fundación (YYYY-MM-DD): ");
		boolean estado = true;

		EquipoDTO nuevo = new EquipoDTO(id, nombre, categoria, ciudad, estado, fecha);
		boolean ok = equipoController.actualizar(nuevo);
		System.out.println(ok ? "OK: equipo actualizado." : "No se pudo actualizar.");
	}

	public static void eliminarEquipo() {
		short id = leerShort("ID a eliminar: ");
		boolean ok = equipoController.eliminar(id);
		System.out.println(ok ? "OK: eliminado." : "No se encontró el ID.");

	}

	// ╔═══════════════════════════╗
	// ║ FUNCIONES MÓDULO ESTADIOS ║
	// ╚═══════════════════════════╝
	public static void registrarEstadio() {
		short id = leerShort("ID: ");
		if (estadioController.buscarPorId(id) != null) {
			System.out.println("Ya existe un estadio con ese ID.");
			return;
		}
		String nombre = leerTexto("Nombre estadio: ");
		int capacidad = leerEntero("Capacidad estadio: ");
		int tamano = leerEntero("Tamaño estadio: ");
		String ciudad = leerTexto("Ciudad: ");
		String tipo = leerTexto("Tipo: ");
		LocalDate fecha = leerFechaISO("Fecha fundación (YYYY-MM-DD): ");
		boolean estado = true;

		EstadioDTO nuevo = new EstadioDTO(id, nombre, capacidad, tamano, ciudad, tipo, fecha, estado);
		boolean ok = estadioController.crear(nuevo);
		System.out.println(ok ? "OK: estadio creado." : "No se pudo crear.");
	}

	public static void listarEstadios() {
		EstadioDTO[] lista = estadioController.listar();
		if (lista.length == 0) {
			System.out.println("No hay registros.");
			return;
		}
		System.out.println("\n╔═════════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("║                                LISTA DE ESTADIOS                                ║");
		System.out.println("╠═════════════════════════════════════════════════════════════════════════════════╣");
		System.out.println("║ ID: ║ Nombre: ║ Capacidad: ║ Tamaño: ║ Ciudad: ║ Tipo:  ║ Fundación: ║ Estado:  ║");
		for (EstadioDTO e : lista)
			if (e != null)
				System.out.println(formatearEstadio(e));
	}

	public static void buscarEstadio() {
		short id = leerShort("ID a buscar: ");
		EstadioDTO dto = estadioController.buscarPorId(id);
		if (dto != null) {
			System.out.println("\n╔═════════════════════════════════════════════════════════════════════════════════╗");
			System.out.println("║                             RESULTADO DE BÚSQUEDA                               ║");
			System.out.println("╠═════════════════════════════════════════════════════════════════════════════════╣");
			System.out.println("║ ID: ║ Nombre: ║ Capacidad: ║ Tamaño: ║ Ciudad: ║ Tipo:  ║ Fundación: ║ Estado:  ║");
			System.out.println(formatearEstadio(dto));
		} else {
			System.out.println("No encontrado.");
		}
	}

	public static void actualizarEstadio() {
		short id = leerShort("ID a actualizar: ");
		EstadioDTO actual = estadioController.buscarPorId(id);
		if (actual == null) {
			System.out.println("No existe un estadio con ese ID.");
			return;
		}
		System.out.println("Ingrese los nuevos datos");
		String nombre = leerTexto("Nombre estadio: ");
		int capacidad = leerEntero("Capacidad estadio: ");
		int tamano = leerEntero("Tamaño estadio: ");
		String ciudad = leerTexto("Ciudad: ");
		String tipo = leerTexto("Tipo: ");
		LocalDate fecha = leerFechaISO("Fecha fundación (YYYY-MM-DD): ");
		boolean estado = true;

		EstadioDTO nuevo = new EstadioDTO(id, nombre, capacidad, tamano, ciudad, tipo, fecha, estado);
		boolean ok = estadioController.actualizar(nuevo);
		System.out.println(ok ? "OK: estadio actualizado." : "No se pudo actualizar.");
	}

	public static void eliminarEstadio() {
		short id = leerShort("ID a eliminar: ");
		boolean ok = estadioController.eliminar(id);
		System.out.println(ok ? "OK: eliminado." : "No se encontró el ID.");

	}

	// ╔═══════════════════════════╗
	// ║ FUNCIONES MÓDULO PERSONAS ║
	// ╚═══════════════════════════╝
	public static void registrarPersona() {
		short idPersona = leerShort("Id persona: ");
		if (personaController.buscarPorId(idPersona) != null) {
			System.out.println("Ya existe una persona con ese ID.");
			return;
		}
		String nombre = leerTexto("Nombre: ");
		String apellido = leerTexto("Apellido: ");
		int edad = leerEntero("Edad: ");
		String rol = leerTexto("Rol: ");
		String sexo = leerTexto("Sexo: ");
		boolean estado = true;

		PersonaDTO nuevo = new PersonaDTO(idPersona, nombre, apellido, edad, rol, sexo, estado);
		boolean ok = personaController.crear(nuevo);
		System.out.println(ok ? "OK: persona creada." : "No se pudo crear.");
	}

	public static void listarPersona() {
		PersonaDTO[] lista = personaController.listar();
		if (lista.length == 0) {
			System.out.println("No hay registros.");
			return;
		}
		System.out.println("\n╔═══════════════════════════════════════════════════════════════════════╗");
		System.out.println("║                        LISTA DE PERSONAS                              ║");
		System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
		System.out.println("║ IdPersona: ║ Nombre: ║ Apellido: ║ Edad: ║ Rol:  ║ Género: ║ Estado:  ║");
		for (PersonaDTO p : lista)
			if (p != null)
				System.out.println(formatearPersona(p));
	}

	public static void buscarPersona() {
		short id = leerShort("ID a buscar: ");
		PersonaDTO dto = personaController.buscarPorId(id);
		if (dto != null) {
			System.out.println("\n╔═══════════════════════════════════════════════════════════════════════╗");
			System.out.println("║                       RESULTADO DE BÚSQUEDA                           ║");
			System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
			System.out.println("║ IdPersona: ║ Nombre: ║ Apellido: ║ Edad: ║ Rol:  ║ Género: ║ Estado:  ║");
			System.out.println(formatearPersona(dto));
		} else {
			System.out.println("No encontrado.");
		}
	}

	public static void actualizarPersona() {
		short idPersona = leerShort("ID a actualizar: ");
		PersonaDTO actual = personaController.buscarPorId(idPersona);
		if (actual == null) {
			System.out.println("No existe una persona con ese ID.");
			return;
		}
		System.out.println("Ingrese los nuevos datos");
		String nombre = leerTexto("Nombre: ");
		String apellido = leerTexto("Apellido: ");
		int edad = leerEntero("Edad: ");
		String rol = leerTexto("Rol: ");
		String sexo = leerTexto("Sexo: ");
		boolean estado = true;

		PersonaDTO nuevo = new PersonaDTO(idPersona, nombre, apellido, edad, rol, sexo, estado);
		boolean ok = personaController.actualizar(nuevo);
		System.out.println(ok ? "OK: persona actualizada." : "No se pudo actualizar.");
	}

	public static void eliminarPersona() {
		short id = leerShort("ID a eliminar: ");
		boolean ok = personaController.eliminar(id);
		System.out.println(ok ? "OK: eliminado." : "No se encontró el ID.");

	}

	// ╔═══════════════════════════╗
	// ║ FUNCIONES MÓDULO PARTIDOS ║
	// ╚═══════════════════════════╝
	public static void registrarPartido() {
		int IdPartido = leerEntero("Ingrese el ID del Partido: ");
		if (partidoController.buscarPorId(IdPartido) != null) {
			System.out.println("Error: Ya existe un partido con ese ID.");
			return;
		}
		int localId = leerEntero("ID del Equipo local: ");
		int visitanteId = leerEntero("ID del Equipo visitante ");
		if (localId == visitanteId) {
			System.out.println("Error: El equipo local y visitante no pueden ser el mismo.");
			return;
		}
		LocalDate fecha = leerFechaISO("Fecha de partido (YYYY-MM-DD): ");
		int marcadorLocal = leerEntero("Marcador Equipo Local: ");
		int marcadorVisitante = leerEntero("Marcador Equipo Visitante: ");
		boolean estado = true;

		PartidoRecord nuevo = new PartidoRecord(IdPartido, localId, visitanteId, fecha, marcadorLocal, marcadorVisitante,
				estado);
		boolean ok = partidoController.crear(nuevo);
		System.out.println(ok ? "OK: partido creado." : "No se pudo crear.");
	}

	public static void listarPartido() {
		PartidoRecord[] lista = partidoController.listar();
		if (lista == null || lista.length == 0) {
			System.out.println("No hay registros.");
			return;
		}
		System.out.println("\n╔════════════════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("║                                  LISTA DE PARTIDOS                                     ║");
		System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════╣");
		System.out.println("║ IdPartido: ║ LocalId: ║ VisitanteId: ║ Fecha partido: ║ Marc. L: ║ Marc. V: ║ Estado:  ║");
		for (PartidoRecord p : lista)
			if (p != null)
				System.out.println(formatearPartido(p));
	}

	public static void buscarPartido() {
		int id = leerEntero("ID a buscar: ");
		PartidoRecord dto = partidoController.buscarPorId(id);
		if (dto != null) {
			System.out.println("\n╔════════════════════════════════════════════════════════════════════════════════════════╗");
			System.out.println("║                                    RESULTADO DE BÚSQUEDA                               ║");
			System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════╣");
			System.out.println("║ IdPartido: ║ LocalId: ║ VisitanteId: ║ Fecha partido: ║ Marc. L: ║ Marc. V: ║ Estado:  ║");
			System.out.println(formatearPartido(dto));
		} else {
			System.out.println("No encontrado.");
		}
	}

	public static void actualizarPartido() {
		int partidoId = leerEntero("ID a actualizar: ");
		PartidoRecord actual = partidoController.buscarPorId(partidoId);
		if (actual == null) {
			System.out.println("No existe un estadio con ese ID.");
			return;
		}
		System.out.println("Ingrese los nuevos datos");
		int localId = leerEntero("ID del Equipo local: ");
		int visitanteId = leerEntero("ID del Equipo visitante ");
		if (localId == visitanteId) {
			System.out.println("Error: El equipo local y visitante no pueden tener el mismo ID.");
			return;
		}
		LocalDate fecha = leerFechaISO("Fecha de partido (YYYY-MM-DD): ");
		int marcadorLocal = leerEntero("Marcador Equipo Local: ");
		int marcadorVisitante = leerEntero("Marcador Equipo Visitante: ");
		boolean estado = true;

		PartidoRecord nuevo = new PartidoRecord(partidoId, localId, visitanteId, fecha, marcadorLocal, marcadorVisitante,
				estado);
		boolean ok = partidoController.actualizar(nuevo);
		System.out.println(ok ? "OK: estadio actualizado." : "No se pudo actualizar.");
	}

	public static void eliminarPartido() {
		int partidoId = leerEntero("ID a eliminar: ");
		boolean ok = partidoController.eliminar(partidoId);
		System.out.println(ok ? "OK: eliminado." : "No se encontró el ID.");

	}

	// ╔═══════════════════════════╗
	// ║ MÉTODO AUXILIAR           ║
	// ╚═══════════════════════════╝

	private static String leerTexto(String msg) {
		while (true) {
			System.out.print(msg);
			String s = sc.nextLine().trim().toUpperCase();

			if (s.isEmpty()) {
				System.out.println("No puede estar vacío.");
			} 
			else if (!s.matches("[A-Z ]+")) {
				System.out.println("Solo se permiten letras.");
			} 
			else {
				return s;
			}
		}
	}

	private static int leerEntero(String msg) {
		while (true) {
			try {
				System.out.print(msg);
				String s = sc.nextLine().trim();
				int num = Integer.parseInt(s);

				if (num < 0) {
					System.out.println("El número no puede ser negativo.");
				} else {
					return num;
				}

			} catch (NumberFormatException e) {
				System.out.println("Ingrese solo números.");
			}
		}
	}

	private static short leerShort(String msg) {
		while (true) {
			try {
				System.out.print(msg);
				String s = sc.nextLine().trim();
				short num = Short.parseShort(s);

				if (num <= 0) {
					System.out.println("El número debe ser mayor que 0.");
				} else {
					return num;
				}

			} catch (NumberFormatException e) {
				System.out.println("Ingrese solo números.");
			}
		}
	}

	private static LocalDate leerFechaISO(String msg) {
		while (true) {
			System.out.print(msg);
			String s = sc.nextLine().trim();

			try {
				LocalDate fecha = LocalDate.parse(s);
				LocalDate hoy = LocalDate.now();

				if (fecha.isAfter(hoy)) {
					System.out.println("La fecha no puede ser futura.");
				} 
				else if (fecha.isBefore(LocalDate.of(1970, 1, 1))) {
					System.out.println("La fecha es demasiado antigua.");
				} 
				else {
					return fecha;
				}

			} catch (DateTimeParseException e) {
				System.out.println("Formato inválido. Use YYYY-MM-DD (ej: 1970-08-14).");
			}
		}
	}

	// ╔═══════════════════════════╗
	// ║ Listar                    ║
	// ╚═══════════════════════════╝

	private static String formatearEquipo(EquipoDTO d) {
		return String.format("║ %-3d ║ %-11s ║ %-11s ║ %-7s ║ %-9s ║ %-8s  ║", d.getIdEquipo(), d.getNombreEquipo(),
				d.getCategoriaEquipo(), d.getCiudadEquipo(), d.getFechaFundacionEquipo(),
				(d.isEstadoEquipo() ? "Activo" : "Inactivo"));
	}

	private static String formatearEstadio(EstadioDTO e) {
		return String.format("║ %-3d ║ %-7s ║ %-10s ║ %-7s ║ %-7s ║ %-7s║ %-10s ║ %-8s ║", e.getIdEstadio(), e.getNombreEstadio(),
				e.getCapacidadEstadio(), e.getTamanoEstadio(), e.getTipoEstadio(), e.getCiudadEstadio(),
				e.getFechaFundacionEstadio(), (e.isEstadoEstadio() ? "Activo" : "Inactivo"));
	}

	private static String formatearPersona(PersonaDTO p) {

		return String.format("║ %-10d ║ %-7s ║ %-9s ║ %-5d ║ %-5s ║ %-7s ║ %-8s ║", p.getIdPersona(), p.getNombrePersona(),
				p.getApellidoPersona(), p.getEdadPersona(), p.getRolPersona(), p.getSexoPersona(),
				(p.isEstadoPersona() ? "Activo" : "Inactivo"));
	}

	private static String formatearPartido(PartidoRecord p) {
		return String.format("║  %-9d ║ %-8d ║ %-12d ║ %-14s ║ %-8d ║ %-8d ║ %-8s ║", p.getIdPartido(), p.getLocalId(),
				p.getVisitanteId(), p.getFechaPartido(), p.getMarcadorLocal(), p.getMarcadorVisitante(),
				(p.isEstadoPartido() ? "Activo" : "Inactivo"));
	}

}