package br.devinflix.usuarios;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {
	private String nome;
	private LocalDate nascimento;
	protected Endereco endereco;
	private int idade;
	
	//Construtor usuario
	public Usuario(String nome, LocalDate nasc, Endereco endereco) {
		this.nome = nome;
		this.nascimento = nasc;
		this.endereco = endereco;
	}
	
	
	
	//metodo CalcIdade, utilizado para saber a idade do usuário
	public void CalcIdade(LocalDate nasc) {
		LocalDate datalocal = LocalDate.now();
		this.setIdade(Period.between(nasc, datalocal).getYears()) ;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
}
