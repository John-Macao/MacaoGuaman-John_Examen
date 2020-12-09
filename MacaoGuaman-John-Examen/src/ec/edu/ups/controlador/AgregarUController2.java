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
 * Servlet implementation class AgregarUController2
 */
@WebServlet("/AgregarUController2")
public class AgregarUController2 extends HttpServlet {
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
	
	
	
    public AgregarUController2() {
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
		
		int usuario_id = Integer.valueOf(request.getParameter("usuario_id"));
		int number1 = Integer.valueOf(request.getParameter("number1"));
		
		String tipo1 = request.getParameter("item1");
		String oper1 = request.getParameter("item2");
		String telefono = request.getParameter("telefono");
		
		System.out.println(" ver id ***** " +  usuario_id);
		System.out.println(" ver number ***** " +  number1);
		
		user = userDao.read(usuario_id);
		
		
		System.out.println("confirmooo  : "  + user.getNombre());
		
		
		/*
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
		*/
		
		
		tipo = tipDao.buscarTipoNombre(tipo1);
		operadora = operDao.buscarOperNombre(oper1);
		
		tel = new Telefono(0, telefono, user, tipo, operadora);
		telDAO.create(tel);
		
		
		listaTipo = tipDao.find();
		listaOperadora = operDao.find();
		
		int number = number1 +1;
		request.setAttribute("listaOperadora", listaOperadora);
		request.setAttribute("listaTipo", listaTipo);
		request.setAttribute("number1", number);
		
		request.setAttribute("usuario_id", user.getId());
		request.setAttribute("ced", user.getCedula());
		request.setAttribute("nom", user.getNombre());
		request.setAttribute("ape", user.getApellido());
		request.setAttribute("corr", user.getCorreo());
		request.setAttribute("contra", user.getContrasena());
		
		
		
		this.getServletContext().getRequestDispatcher("/JSP/Crear_user2.jsp").forward(request, response);
	}

}
