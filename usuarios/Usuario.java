package usuarios;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {
	private String nome;
	private LocalDate nascimento;
	/* protected Endereco endereco; */
	private String endereco;
	

	public void CalcData () {
		LocalDate datalocal = LocalDate.now();
		System.out.println("Você tem: " + Period.between(nascimento, datalocal).getYears() + " anos.");
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
	/*public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}*/
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
