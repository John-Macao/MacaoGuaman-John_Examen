package ec.edu.ups.dao;

import ec.edu.ups.modelo.Tipo;

public interface TipoDAO extends GenericDAO<Tipo, Integer> {

	public abstract Tipo buscarTipoNombre(String nombre_tipo);
	
	public abstract Tipo buscarT(int id_tipo);
	
}
