package ec.edu.ups.dao;

import ec.edu.ups.modelo.Operadora;

public interface OperadoraDAO extends GenericDAO<Operadora, Integer> {
	
	public abstract Operadora buscarOperNombre(String nombre_oper);
	
	public abstract Operadora buscarO(int id_oper);
}
