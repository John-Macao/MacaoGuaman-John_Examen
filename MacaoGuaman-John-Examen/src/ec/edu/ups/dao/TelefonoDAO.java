package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.modelo.Telefono;

public interface TelefonoDAO extends GenericDAO<Telefono, Integer> {

	public abstract int buscarIDU(int id);
	public abstract int buscarIDT(int id_tel);
	public abstract int buscarIDO(int id_tel);
	public  Telefono buscarTelefono(int id_user, int id_tel);
	
	public List<Telefono> listaTELEFONOS(int id_user);
	public int obtenerIDUSER(String telefono);
}
