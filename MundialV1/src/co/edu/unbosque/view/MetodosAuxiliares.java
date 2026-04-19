package co.edu.unbosque.view;

public class MetodosAuxiliares {

	public String devolverMenu(String obj) {
		System.out.println("\n╔═════════════════════════════╗");
		System.out.println("║      Submenu "+obj+"       ║");
		String cadena = "╠═════════════════════════════╣";
		cadena += "\n║ 1.Registrar ".concat(obj)+"        ║";
		cadena += "\n║ 2.Listar ".concat(obj)+"           ║";
		cadena += "\n║ 3.Buscar ".concat(obj)+"           ║";
		cadena += "\n║ 4.Actualizar ".concat(obj)+"       ║";
		cadena += "\n║ 5.Eliminar ".concat(obj)+"         ║";
		cadena += "\n║ 0.Volver                    ║";
		cadena += "\n╚═════════════════════════════╝";
		return cadena;
	}
	

}
