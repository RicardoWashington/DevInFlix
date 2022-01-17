package br.devinflix.filmes;

import java.time.LocalDate;
import java.time.Period;

import br.devinflix.usuarios.Usuario;

public class Indica {
	Usuario usuario;
	String filme;
	LocalDate dataIndica;
	
	//Construtor Indicações de filmes
	public Indica(Usuario usuario, String filme, LocalDate dataIndica) {
		this.usuario = usuario;
		this.filme = filme;
		this.dataIndica = dataIndica;
		validaRecomendacao(this.usuario, this.dataIndica);
	}
	
	private void validaRecomendacao(Usuario usuario, LocalDate dataIndica) {
		LocalDate dataatual = LocalDate.now();		
		
		if (Period.between(dataIndica, dataatual).getMonths() <= 1) {
			System.out.println("Em " + Period.between(dataatual.minusDays(30), dataIndica).getDays() + " dias você poderá indicar outro filme.");
		}else {
			System.out.println("Indicação realizada.");
		}
		
		
	}
	
	// getter and setters
	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	
}
