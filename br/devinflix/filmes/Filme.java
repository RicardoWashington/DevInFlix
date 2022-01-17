package br.devinflix.filmes;

import br.devinflix.financeiro.Fatura;
import br.devinflix.usuarios.Usuario;

public class Filme {
	
	private String titulo;
	private String sinopse;
	private String link;
	private boolean curtiu;
	private GeneroFilme genero;
	private FaixaEtaria faixaEtaria;
	
	//Construtor Filme
	public Filme (String titulo, String sinopse, String link, GeneroFilme genero, FaixaEtaria faixaEtaria) {
		this.titulo = titulo;
		this.sinopse = sinopse;
		this.link = link;
		this.genero = genero;
		this.faixaEtaria = faixaEtaria;
		armazenaGenero(this.genero);
	}
	
	//Metodo curtir
	public void curtir(Filme filme, Usuario usuario, boolean curtida) {
		if (curtida) {
			System.out.println("O usuario " + usuario.getNome() + ", curtiu o filme "+ filme.titulo); //Criar uma lista para guardar as curtidas
		}else {
			System.out.println("O usuario " + usuario.getNome() + ", descurtiu o filme "+ filme.titulo);
		}
	}
	
	public void assitir(Usuario usuario, Filme filme, Fatura fatura) {
		if (fatura.validainadimplencia(usuario)) {
			System.out.println("Erro 001 ao tentar carregar o filme "+ filme.getTitulo() + ". Contate o Depto Financeiro" );
		}else {
			System.out.println("Filme iniciando...");
		}
		
	}
	
	//metodo armazena genero mais visto na plataforma
	private void armazenaGenero(GeneroFilme genero) {
		int acumulaGenero;
		//Criar uma lista de genero
	}
	
	//Criação de getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public boolean isCurtiu() {
		return curtiu;
	}

	public void setCurtiu(boolean curtiu) {
		this.curtiu = curtiu;
	}

	public GeneroFilme getGenero() {
		return genero;
	}

	public FaixaEtaria getFaixaEtaria() {
		return faixaEtaria;
	}
	

}
