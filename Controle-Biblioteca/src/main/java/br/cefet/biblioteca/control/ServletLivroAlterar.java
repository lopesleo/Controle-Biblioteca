package br.cefet.biblioteca.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.cefet.biblioteca.dao.GeneroDao;
import br.cefet.biblioteca.dao.LivroDao;
import br.cefet.biblioteca.model.Livro;

/**
 * Servlet implementation class ServletLivroAlterar
 */
@WebServlet("/ServletLivroAlterar")
public class ServletLivroAlterar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLivroAlterar() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		String descricao = request.getParameter("descricao");
		String autor = request.getParameter("autor");
		String ano = request.getParameter("ano");
		int idgenero = Integer.valueOf(request.getParameter("idgenero"));
		int id = Integer.valueOf(request.getParameter("id"));
		Livro livro = new Livro();

		livro.setAno(ano);
		livro.setAutor(autor);
		livro.setDescricao(descricao);
		livro.setTitulo(titulo);
		livro.setId(id);

		GeneroDao genDao = new GeneroDao();
		try {
			livro.setGenero(genDao.listarUm(idgenero));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LivroDao ldao = new LivroDao();
		try {
			ldao.AlterarLivro(livro);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
