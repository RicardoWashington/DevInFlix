package br.devinflix.main;

import java.time.LocalDate;

import br.devinflix.filmes.FaixaEtaria;
import br.devinflix.filmes.Filme;
import br.devinflix.filmes.GeneroFilme;
import br.devinflix.filmes.Indica;
import br.devinflix.filmes.Recomenda;
import br.devinflix.financeiro.Fatura;
import br.devinflix.usuarios.Endereco;
import br.devinflix.usuarios.Usuario;

public class Main{
	public static void main(String[] args) {
		Filme filme;
		Filme filme2;
		Filme filme3;
		Filme filme4;
		Filme filme5;
		Filme filme6;
		Usuario usuario;
		Usuario usuario2;
		Usuario usuario3;
		Usuario usuario4;
		Usuario usuario5;
		Recomenda recomenda;
		Recomenda recomenda2;
		Indica indica;
		Indica indica2;
		Indica indica3;
		Endereco endereco;
		Fatura fatura;
		Fatura fatura2;
		Fatura fatura3;
		Fatura fatura4;
		
		/*CATALOGO DE FILMES*/
		//Filme 1
		filme = new Filme("C�digo de Conduta", 
						  "Quando um dos suspeitos do assassinato de sua mulher e filha � solto, Clyde quer vingan�a e decide fazer \n "
						+ "justi�a com as pr�prias m�os. Clyde � preso e dentro da cadeia organiza uma matan�a para desmascarar o \n"
						+ "sistema judicial corrupto.",
				        "devinflix.com.br/codigo-de-conduta",
				        GeneroFilme.POLICIAL,
				        FaixaEtaria.DOZE);
		
		//Filme 2
		filme2 = new Filme("O Exorcismo de Emily Rose",
						    "A jovem estudante Emily Rose come�a a alucinar e ter surtos cada vez mais frequentes, que causam \n "
						  + "perda de mem�ria. Cat�lica praticante, ela aceita ser submetida a uma sess�o de exorcismo. Quem a \n"
						  + "realiza � o sacerdote de sua par�quia, o padre Richard Moore. Por�m, Emily morre durante o exorcismo, \n"
						  + "o que faz com que o padre seja acusado de assassinato. A advogada Erin Bruner aceita pegar a defesa \n"
						  + "do padre e argumenta que a condi��o de Emily n�o pode ser explicada somente pela ci�ncia.",
						  "devinflix.com.br/exorcismo-emily-rose",
						    GeneroFilme.TERROR,
						    FaixaEtaria.DEZOITO);
		
		//Filme 3
		filme3 = new Filme("Casa de Vidro",
						   "Ap�s os pais de Ruby e de seu irm�o mais novo Rhett serem mortos em um acidente de carro, os melhores \n"+
						  "amigos de seus pais, Erin e Terry Glass, tornam-se seus guardi�es. As crian�as ouvem promessas de um \n" +
						  "mundo de opul�ncia e divers�o na Calif�rnia e tudo o que eles t�m de fazer � mudarem-se para a casa da \n"+
						  "fam�lia Glass. Logo, Ruby suspeita que Erin e Terry n�o s�o os guardi�es ideais que pareciam ser.",
						  "devinflix.com.br/casa-de-vidro",
						  GeneroFilme.TERROR,
						  FaixaEtaria.DEZESSEIS);
		
		//Filme 4 
		filme4 = new Filme("Os Mercenarios",
						  "Um grupo de mercen�rios, liderado por Barney Ross e composto de seus homens de confian�a, aceita uma \n"+
						  "miss�o que parece ser rotineira: uma opera��o secreta, a mando da Igreja, para invadir o pa�s sul- \n"+
						  "americano de Vilena e derrubar seu ditador. N�o demora muito para o grupo perceber que a miss�o � uma \n"+
						  "opera��o suicida. Presos em uma perigosa teia de trai��es, mas sabendo que um inocente est� em perigo, \n"+
						  "Barney e seus homens decidem finalizar o trabalho.",
						  "devinflix.com.br/os-mercenarios",
						  GeneroFilme.A��O_AVENTURA,
						  FaixaEtaria.QUATORZE);

		//Filme 5
		filme5 = new Filme("O Alvo",
				           "Um estivador ajuda uma advogada a encontrar seu pai desaparecido. Durante a investiga��o, eles descobrem \n"+
						   "um grupo de s�dicos que se diverte ca�ando mendigos e ex-combatentes de guerra em um jogo mortal.",
						   "devinflix.com.br/um-lugar-silencioso",
						   GeneroFilme.A��O_AVENTURA,
						   FaixaEtaria.LIVRE);
		
		//Filme 6
		filme6 = new Filme("O Menino que Descobriu o Vento",
						  "Sempre esfor�ando-se para adquirir conhecimentos diversificados, um jovem de Malawi se cansa de assistir \n"+
						  "todos os colegas de seu vilarejo passando por dificuldades e come�a a desenvolver uma inovadora turbina de \n"+
						  "vento.",
						  "devinflix.com.br/o-menino-que-decobriu-o-vento",
						  GeneroFilme.DRAMA,
						  FaixaEtaria.LIVRE);

		
		/* Primeiro usuario */
		usuario = new Usuario("Pedro da Silva",
							  LocalDate.of(1981,12,12),
							  endereco = new Endereco("Rua Joao de Souza, 23","","Centro","S�o Paulo","SP","BR", "03765-987"));
		

		//Segundo usuario
		usuario2 = new Usuario("Luis da Almeida Favaro",
				               LocalDate.of(1997,03,29),
				               endereco = new Endereco("Rua Tres de Maio, 99", "AP 201", "Jd das Bomelias", "Curitiba", "PR", "BR", "43098-001" ));
		
		//Terceiro usuario
		usuario3 = new Usuario("Fabio Moura",
							   LocalDate.of(2001,01,23),
							   endereco = new Endereco("Rua Quintino Bocaiuva, 25", "Casa", "Novo Horizonte", "Belo Horizonte", "MG", "BR", "39458-859"));
		
		//Quarto Usuario
		usuario4 = new Usuario("Fabricio Castanhares",
							   LocalDate.of(1976,5,6),
							   endereco = new Endereco("Rua dos Afogados, 586", "", "Vila de S Jose", "Rio Grande", "RS", "BR", "78596-001"));
		
		//Quinto Usuario
		usuario5 = new Usuario("Patricia Chagas",
				               LocalDate.of(1999,07,12),
				               endereco = new Endereco("Av. Gra�a Aranha, 1456", "", "Copacabana", "Rio de Janeiro", "RJ", "BR", "14256-965"));
		
		
		//Curtidas / Descurtidas
		filme.curtir(filme, usuario5, false);
		filme6.curtir(filme6, usuario4, true);
		filme3.curtir(filme3, usuario, true);
		
		//recomenda��es de filmes
		recomenda = new Recomenda(filme, usuario4, usuario, LocalDate.of(2021, 5, 2), "Pode assistir que voc� vai gostar!");
		recomenda2 = new Recomenda(filme5, usuario2, usuario5, LocalDate.of(2019, 11, 29), "Mano, vai que � top!");
		 
		//Indicacoes de filmes
		indica = new Indica(usuario, "N�o olhe para o alto", /*LocalDate.now()*/LocalDate.of(2021, 12, 29));
		indica2 = new Indica(usuario4, "A M�mia", /*LocalDate.now()*/ LocalDate.of(2022, 1, 1));
		indica3 = new Indica(usuario3, "Olhos Famintos 2", /*LocalDate.now()*/ LocalDate.of(2021, 5, 5));
		
		//Faturas pagas
		fatura = new Fatura(usuario, 49.90, LocalDate.of(2021, 12, 18));
		fatura2 = new Fatura(usuario3, 49.90, LocalDate.of(2022, 1, 10));
		fatura3 = new Fatura(usuario5, 49.90, LocalDate.of(2021, 11, 25));
		fatura4 = new Fatura(usuario2, 49.90, LocalDate.of(2022, 1, 14));
		
		//Assistir filmes
		filme6.assitir(usuario5, filme6, fatura3);
		filme4.assitir(usuario3, filme2, fatura2);
		filme.assitir(usuario, filme, fatura);
		filme3.assitir(usuario2, filme3, fatura4);
		
		
	}

}
