package ec.edu.ups.controlador;

import java.io.IOException;
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
 * Servlet implementation class AgregarUController
 */
@WebServlet("/AgregarUController")
public class AgregarUController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private OperadoraDAO operDao;
	private TipoDAO tipDao;
	private UsuarioDAO userDao;
	private TelefonoDAO telDAO;
	
	
    private List<Tipo> listaTipo;
    private List<Operadora> listaOperadora;
    
    private Tipo tipo;
    private Operadora operadora;
    private Usuario user;
	private Telefono tel;
	
	
	
	
	
    public AgregarUController() {
    	operDao = DAOFactory.getFactory().getOperadoraDAO();
        tipDao = DAOFactory.getFactory().getTipoDAO();
        userDao = DAOFactory.getFactory().getUsuarioDAO();
        telDAO = DAOFactory.getFactory().getTelefonoDAO();
        
    	tipo = new Tipo();
    	operadora = new Operadora();
    	user = new Usuario();
    	tel = new Telefono();
    	
    }

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cedula = request.getParameter("cedula");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String correo = request.getParameter("correo");
		String contrasena = request.getParameter("contrasena");
		String telefono = request.getParameter("telefono");
		String tipo1 = request.getParameter("item1");
		String oper1 = request.getParameter("item2");
		
		System.out.println("ced " +  cedula);
		System.out.println("nom " +  nombre);
		System.out.println("ape  "  + apellido);
		System.out.println("corr "  + correo);
		System.out.println("contr "  + contrasena);
		System.out.println("tipo  "+ tipo1 );
		System.out.println("oper  "+ oper1 );
		
		user = new Usuario(0, cedula, nombre, apellido, correo, contrasena);
		userDao.create(user);
		
		Usuario user2 = new Usuario();
		user2 = userDao.buscarCedula(cedula);
		
		
		tipo = tipDao.buscarTipoNombre(tipo1);
		operadora = operDao.buscarOperNombre(oper1);
		
		System.out.println("tipooooo      "+ tipo.getId() + tipo.getTip() );
		System.out.println("operrrrrrr     "+ operadora.getId() + operadora.getOper() );
		
		
		tel = new Telefono(0, telefono, user2, tipo, operadora);
		telDAO.create(tel);
		
		
		listaTipo = tipDao.find();
		listaOperadora = operDao.find();
		
		int number =1;
		request.setAttribute("listaOperadora", listaOperadora);
		request.setAttribute("listaTipo", listaTipo);
		request.setAttribute("number1", number);
		
		
		request.setAttribute("usuario_id", user2.getId());
		request.setAttribute("ced", user2.getCedula());
		request.setAttribute("nom", user2.getNombre());
		request.setAttribute("ape", user2.getApellido());
		request.setAttribute("corr", user2.getCorreo());
		request.setAttribute("contra", user2.getContrasena());
		
		
		this.getServletContext().getRequestDispatcher("/JSP/Crear_user2.jsp").forward(request, response);
	}

}
