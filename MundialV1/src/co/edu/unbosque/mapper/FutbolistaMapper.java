package co.edu.unbosque.mapper;

import co.edu.unbosque.model.Futbolista;
import co.edu.unbosque.record.FutbolistaRecord;

public final class FutbolistaMapper {

	private FutbolistaMapper() {
	}

	public static Futbolista toEntity(FutbolistaRecord f) {
		return new Futbolista(f.idFutbolista(), f.nombre(), f.edad(), f.numero(), f.posicion(), f.estado());
	}

	public static FutbolistaRecord toRecord(Futbolista futbolista) {
		return new FutbolistaRecord(futbolista.getIdFutbolista(), futbolista.getNombre(), futbolista.getEdad(),
				futbolista.getNumero(), futbolista.getPosicion(), futbolista.isEstado());
	}
}