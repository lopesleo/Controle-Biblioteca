package br.cefet.biblioteca.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.cefet.biblioteca.dao.ClienteDao;
import br.cefet.biblioteca.model.Cliente;

/**
 * Servlet implementation class ServletClienteLogar
 */
@WebServlet("/ServletClienteLogar")
public class ServletClienteLogar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletClienteLogar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Extrair a variável do formulário
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		//Criar cliente
		Cliente cliente = null;
		
		// Verificar login do cliente
		ClienteDao cltDao = new ClienteDao();
		try {
			cliente = cltDao.logar(login,senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String nextPage = null;
		String erro = null;
		
		if (cliente!= null) {
			nextPage = "menu.jsp";
		}
		else {
			nextPage ="index.jsp";
			erro = "Login inválido";
			request.setAttribute("erro", erro);

		}
		
		// Pegando a session e pendurando um cliente
		HttpSession session = request.getSession();
		session.setAttribute("cliente", cliente);
		
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
