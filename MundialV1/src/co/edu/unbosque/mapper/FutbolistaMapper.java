package co.edu.unbosque.mapper;

import co.edu.unbosque.model.Futbolista;
import co.edu.unbosque.record.FutbolistaRecord;

public class FutbolistaMapper {

	public FutbolistaRecord toRecord(Futbolista f) {

		if (f == null)
			return null;

		return new FutbolistaRecord(f.getId(), f.getNombre(), f.getEdad(), f.getNumero(), f.getPosicion(),
				f.isEstado());
	}

	public Futbolista toEntity(FutbolistaRecord f) {

		    if (f == null)
		        return null;

		    return new Futbolista(
		        f.id(),
		        f.nombre(),
		        f.edad(),
		        f.numero(),
		        f.posicion(),
		        f.estado()
		    );
		}
}