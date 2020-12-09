package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.modelo.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer> {
	
	public abstract Usuario buscarCedula(String cedula);
	
	
	public abstract Usuario buscarU(int id_user);
	
	public List<Usuario> listaUser(String cedula);
}
