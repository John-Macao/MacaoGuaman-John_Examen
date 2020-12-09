package ec.edu.ups.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.OperadoraDAO;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.TipoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Operadora;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Tipo;
import ec.edu.ups.modelo.Usuario;

/**
 * Servlet implementation class ListarNumerosController
 */
@WebServlet("/ListarNumerosController")
public class ListarNumerosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private OperadoraDAO operDao;
	private TipoDAO tipDao;
	private UsuarioDAO userDao;
	private TelefonoDAO telDAO;
	
	
    private List<Tipo> listaTipo;
    private List<Operadora> listaOperadora;
    private List<Usuario> listaUsuarios;
    private List<Telefono> listaTelefonos;
    
    private Tipo tipo;
    private Operadora operadora;
    private Usuario user;
	private Telefono tel;
	
	
    public ListarNumerosController() {
    	
    	operDao = DAOFactory.getFactory().getOperadoraDAO();
        tipDao = DAOFactory.getFactory().getTipoDAO();
        userDao = DAOFactory.getFactory().getUsuarioDAO();
        telDAO = DAOFactory.getFactory().getTelefonoDAO();
        
    	tipo = new Tipo();
    	operadora = new Operadora();
    	user = new Usuario();
    	tel = new Telefono();
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id_user = Integer.valueOf(request.getParameter("u_id"));
		
		System.out.println("ver id usuario confirmooo    "  +  id_user);
		
		listaTelefonos = telDAO.listaTELEFONOS(id_user);
		
		List<Telefono> listaTelefonos2 = new ArrayList<Telefono>();
		
		for (int i = 0; i<listaTelefonos.size(); i++ ) {
			tel = listaTelefonos.get(i);
			
			//Telefono tel2 = new Telefono();
			//tel2 = telDAO.buscarTelefono(id_user, tel.getId());
			
			int id_tipo = telDAO.buscarIDT(tel.getId());
			int id_oper = telDAO.buscarIDO(tel.getId());
			//int id_user =  telDAO.buscarIDU(tel.getId());
			
			
			//user = userDao.buscarU(id_user);
			tipo = tipDao.buscarT(id_tipo);
	    	operadora = operDao.buscarO(id_oper);
	    	
	    	tel.setUsuario(user);
	    	tel.setTipo(tipo);
	    	tel.setOperadora(operadora);
			
	    	System.out.println("		" + tel.getTel());
	    	System.out.println("		" + tel.getTipo().getTip());
	    	System.out.println("		" + tel.getOperadora().getOper());
	    	
	    	
	    	listaTelefonos2.add(new Telefono(tel.getId(), tel.getTel(), tel.getUsuario(), tel.getTipo(), tel.getOperadora() ));
		}
		
		
		//System.out.println("tamaño list tel2  "  + listaTelefonos2.size());
		request.setAttribute("listaTelefonos2", listaTelefonos2);
		
		
		this.getServletContext().getRequestDispatcher("/JSP/Ver_numeros.jsp").forward(request, response);
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
