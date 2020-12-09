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
import ec.edu.ups.dao.TipoDAO;
import ec.edu.ups.modelo.Operadora;
import ec.edu.ups.modelo.Tipo;

/**
 * Servlet implementation class ListadoTipoOperadora
 */
@WebServlet("/ListadoTipoOperadora")
public class ListadoTipoOperadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private OperadoraDAO operDao;
	private TipoDAO tipDao;
    private List<Tipo> listaTipo;
    private List<Operadora> listaOperadora;
    
    private Tipo tipo;
    private Operadora operadora;
    
    
    public ListadoTipoOperadora() {
        operDao = DAOFactory.getFactory().getOperadoraDAO();
        tipDao = DAOFactory.getFactory().getTipoDAO();
    	tipo = new Tipo();
    	operadora = new Operadora();
        
    }

	
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		listaTipo = tipDao.find();
		System.out.println("lista tamaño tipo : " + listaTipo.size() );
		
		listaOperadora = operDao.find();
		System.out.println("lista tamaño oper : " + listaOperadora.size() );
		
		request.setAttribute("listaOperadora", listaOperadora);
		request.setAttribute("listaTipo", listaTipo);
		
		
		this.getServletContext().getRequestDispatcher("/JSP/Crear_user.jsp").forward(request, response);
	}

}
