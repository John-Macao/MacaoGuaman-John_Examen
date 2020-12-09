package ec.edu.ups.dao;

import ec.edu.ups.modelo.Telefono;

public interface TelefonoDAO extends GenericDAO<Telefono, Integer> {

	public abstract int buscarIDU(int id);
	public abstract int buscarIDT(int id_tel, int id_user);
	public abstract int buscarIDO(int id_tel, int id_user);
	public  Telefono buscarTelefono(int id_user, int id_tel);
}
