package main;

import java.time.LocalDate;

import filmes.Filme;
import filmes.GeneroFilme;
import usuarios.Usuario;

public class Main{
	public static void main(String[] args) {
		Filme filme = new Filme();
		Usuario usuario = new Usuario();
		
		
		/* Primeiro cliente / filme */
		usuario.setNome("Pedro da Silva");
		usuario.setNascimento(LocalDate.of(1981,12,12));
		usuario.setEndereco("Rua Joao de Souza, 23 - Centro - Sao Paulo/SP - CEP: 03765-987");
		filme.setNome("Um lugar Silencioso");
		filme.setGenero(GeneroFilme.TERROR);
		filme.setLink("devinflix.com.br/um-lugar-silencioso");
		filme.setSinopse("Em uma fazenda nos Estados Unidos, uma fam�lia do Meio-Oeste � perseguida por uma entidade fantasmag�rica assustadora. Para se protegerem, eles devem permanecer em sil�ncio absoluto, a qualquer custo, pois o perigo � ativado pela percep��o do som.");
		filme.setCurtiu(true);
		
		/* Impress�o Primeiro */
		System.out.println("Ol� "+ usuario.getNome() + ". Como vai?");
			/* Impirme a idade */
		usuario.CalcData();
		System.out.println("Detalhes do filme que assitiu: ");
		System.out.println("Filme: " + filme.getNome());
		System.out.println("Gen�ro: " + filme.getGenero());
		System.out.println("Sinopse: " + filme.getSinopse());
		System.out.println("Link do filme: " + filme.getLink());
		filme.curtir();
		
		
		
	}

}
