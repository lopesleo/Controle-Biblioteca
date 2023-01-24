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
import br.cefet.biblioteca.dao.LivroDao;
import br.cefet.biblioteca.model.Genero;
import br.cefet.biblioteca.model.Livro;

/**
 * Servlet implementation class ServletLivroListarUm
 */
@WebServlet("/ServletLivroListarUm")
public class ServletLivroListarUm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLivroListarUm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LivroDao livroDao = new LivroDao();
		Livro livro = new Livro();
		int id = Integer.valueOf(request.getParameter("id"));
		
		try {
			livro = livroDao.listarUm(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GeneroDao genDao = new GeneroDao();
		List<Genero> generos =null;
		try {
			generos = genDao.listarTodos();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("generos", generos);
		request.setAttribute("livro", livro);
		
		RequestDispatcher rd = request.getRequestDispatcher("livroalterar.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
