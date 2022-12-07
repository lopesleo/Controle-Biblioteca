package br.cefet.biblioteca.model;

public class Livro {
	private int id;
	private String titulo;
	private String descricao;
	private String autor;
	private String ano;
	private Genero genero;
	
	
	public Livro() {
		
	}
	
	public Livro (String titulo, String descricao, String autor, String ano,Genero genero) {
		this.titulo=titulo;
		this.descricao=descricao;
		this.autor=autor;
		this.ano=ano;
		this.genero=genero;
		
		
	}

	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public Genero getGenero() {
		return genero;
	}

	public void setGenero (Genero genero) {
		this.genero = genero;
	}

}
	

