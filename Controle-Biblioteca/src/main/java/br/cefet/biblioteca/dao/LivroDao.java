package br.cefet.biblioteca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.cefet.biblioteca.model.Genero;
import br.cefet.biblioteca.model.Livro;



public class LivroDao {

	public void AdicionarLivro (Livro livro) throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		String sql = "insert livro (titulo, descricao, autor, ano, idgenero) " + " values (?,?,?,?,?)";
		PreparedStatement stmt= con.prepareStatement(sql);
		stmt.setString(1, livro.getTitulo());
		stmt.setString(2, livro.getDescricao());
		stmt.setString(3, livro.getAutor());
		stmt.setString(4, livro.getAno());
		stmt.setInt(5, livro.getGenero().getId());
		
		
		
		stmt.execute();
		
		stmt.close();
		con.close();
	}
	
	public void AlterarLivro (Livro livro) throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		String sql = "update livro set titulo = ?, descricao = ?, autor=?, ano=?, idgenero=? " + " where id= ? ";
		PreparedStatement stmt= con.prepareStatement(sql);
		stmt.setString(1, livro.getTitulo());
		stmt.setString(2, livro.getDescricao());
		stmt.setString(3, livro.getAutor());
		stmt.setString(4, livro.getAno());
		stmt.setInt(5, livro.getGenero().getId());
		stmt.setInt(6, livro.getId());		
		
		
		stmt.execute();
		
		stmt.close();
		con.close();
	}
	
	public void excluir(int id) throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		String sql = "delete from livro where id = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();
		con.close();
		}
	
	public Livro listarUm(int id) throws SQLException {
		
		Connection con = ConnectionFactory.getConnection();
		String sql = "select id, titulo, descricao, autor, ano, idgenero from  " +
		" livro where id = ?";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, id);
		
		ResultSet rs = stmt.executeQuery();
		Livro livro = null;
		
		if(rs.next()) {
			livro = new Livro();
			livro.setId(rs.getInt("id"));
			livro.setTitulo(rs.getString("titulo"));
			livro.setDescricao(rs.getString("descricao"));
			livro.setAutor(rs.getString("autor"));
			livro.setAno(rs.getString("ano"));
			int idgenero = rs.getInt("idgenero");
			Genero genero = null;
			GeneroDao genDao = new GeneroDao();
			genero = genDao.listarUm(idgenero);
			livro.setGenero(genero);
		}
		
		stmt.close();
		con.close();
		return livro;
	}

	public List<Livro> listarTodos(String titulo) throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		titulo = "%" + titulo + "%";
		String sql = "SELECT id, titulo, descricao,autor,ano,idgenero "
				+ " FROM livro WHERE titulo LIKE ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, titulo);
		
		ResultSet rs = stmt.executeQuery();

		Livro livro = null;
		List<Livro> livros = new ArrayList<Livro>();

		while (rs.next()) {
			livro = new Livro();
			livro.setId(rs.getInt("id"));
			livro.setTitulo(rs.getString("titulo"));
			livro.setDescricao(rs.getString("descricao"));
			livro.setAutor(rs.getString("autor"));
			livro.setAno(rs.getString("ano"));
			GeneroDao genDao = new GeneroDao();
			livro.setGenero(genDao.listarUm(rs.getInt("idgenero")));
			livros.add(livro);
		}
		stmt.close();
		con.close();

		return livros;

	}
	
}
