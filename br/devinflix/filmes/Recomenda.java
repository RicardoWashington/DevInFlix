package br.devinflix.filmes;

import java.time.LocalDate;

import br.devinflix.usuarios.Usuario;

public class Recomenda {
	
	Filme filme;
	Usuario usuarioRecomendou;
	Usuario usuarioRecomendado;
	private LocalDate dataRecomendacao;
	private String comentario;
	
	//Construtor para recomendaçoes	
	public Recomenda(Filme filme, Usuario usuRecomendou, Usuario usuRecomendado, LocalDate dataRecomendacao, String coment) {
		this.filme = filme;
		this.usuarioRecomendou = usuRecomendou;
		this.usuarioRecomendado = usuRecomendado;
		this.dataRecomendacao = dataRecomendacao;
		this.comentario = coment;
	}

	public LocalDate getDataRecomendacao() {
		return dataRecomendacao;
	}

	public void setDataRecomendacao(LocalDate dataRecomendacao) {
		this.dataRecomendacao = dataRecomendacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	

	
}
