package br.cefet.biblioteca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.cefet.biblioteca.model.Genero;


public class GeneroDao {

	public void adicionar (Genero genero) throws SQLException {
		
		Connection con = ConnectionFactory.getConnection();
		String sql = "insert genero(nome) values (?)";
		PreparedStatement stmt = con.prepareCall(sql);
		stmt.setString(1, genero.getNome());
		stmt.execute();
		stmt.close();
		con.close();
		
	}
	
	public List <Genero> listarTodos() throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		String sql = "select id, nome from genero";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		Genero genero = null;
		List<Genero> generos = new ArrayList<Genero>();
		
		while (rs.next()) {
			genero = new Genero();
			genero.setId(rs.getInt("id"));
			genero.setNome(rs.getString("nome"));
			generos.add(genero);
		}
		stmt.close();
		con.close();
		return generos;
	}
	
	public Genero listarUm(int id) throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		String sql = "select id, nome from genero where id = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		
		Genero genero = null;
		
		if(rs.next()) {
			genero = new Genero();
			genero.setId(rs.getInt("id"));
			genero.setNome(rs.getString("nome"));
		}
		stmt.close();
		con.close();
		
		
		return genero;
		
	}
}
