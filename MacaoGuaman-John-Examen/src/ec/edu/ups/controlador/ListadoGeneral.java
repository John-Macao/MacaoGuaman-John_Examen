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
 * Servlet implementation class ListadoGeneral
 */
@WebServlet("/ListadoGeneral")
public class ListadoGeneral extends HttpServlet {
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
	
	
    public ListadoGeneral() {
    	
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
		
		listaUsuarios = userDao.find();
		
		request.setAttribute("listaUsuarios", listaUsuarios);
		
		
		this.getServletContext().getRequestDispatcher("/JSP/Ver_listaCompleta.jsp").forward(request, response);
		
		
	}

}
