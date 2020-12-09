package ec.edu.ups.jpa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Telefono;

public class JPATelefonoDAO extends JPAGenericDAO<Telefono, Integer> implements TelefonoDAO {
	
	public JPATelefonoDAO() {
		super(Telefono.class);
	}
	

}
