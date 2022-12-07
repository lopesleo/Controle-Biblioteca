package br.cefet.biblioteca.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.cefet.biblioteca.dao.ClienteDao;
import br.cefet.biblioteca.model.Cliente;

/**
 * Servlet implementation class ServletClienteAdicionar
 */
@WebServlet("/ServletClienteAdicionar")
public class ServletClienteAdicionar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletClienteAdicionar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setLogin(login);
		cliente.setSenha(senha);
		
		ClienteDao clienteDao = new ClienteDao();
		try {
			clienteDao.adicionar(cliente);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String nextPage="index.jsp";
		
		
		RequestDispatcher rd = request.getRequestDispatcher(nextPage);
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
