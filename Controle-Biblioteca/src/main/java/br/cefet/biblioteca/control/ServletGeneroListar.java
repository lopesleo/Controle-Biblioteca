package br.cefet.biblioteca.control;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.cefet.biblioteca.dao.GeneroDao;
import br.cefet.biblioteca.model.Genero;

/**
 * Servlet implementation class ServletGeneroListar
 */
@WebServlet("/ServletGeneroListar")
public class ServletGeneroListar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGeneroListar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GeneroDao generoDao = new GeneroDao();
		String nextPage=request.getParameter("nextpage");
		List<Genero> generos = null;
		try {
		generos=generoDao.listarTodos();
	}
		catch(SQLException e){
			e.printStackTrace();
			}
		request.setAttribute("generos", generos);
		RequestDispatcher rd = request.getRequestDispatcher(nextPage);
		rd.forward(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
