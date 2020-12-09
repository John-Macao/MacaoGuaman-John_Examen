package ec.edu.ups.jpa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.OperadoraDAO;
import ec.edu.ups.modelo.Operadora;

public class JPAOperadoraDAO extends JPAGenericDAO<Operadora, Integer> implements OperadoraDAO {
	
	public JPAOperadoraDAO() {
		super(Operadora.class);
	}
	

}
