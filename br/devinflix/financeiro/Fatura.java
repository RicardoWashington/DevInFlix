package br.devinflix.financeiro;

import java.time.LocalDate;
import java.time.Period;

import br.devinflix.usuarios.Usuario;

public class Fatura {
	private Usuario usuario;
	private double valorFatura;
	private LocalDate dataPgtoFatura;
	
	public Fatura(Usuario usuario, double valorFatura, LocalDate dataPgtoFatura) {
		this.usuario = usuario;
		this.valorFatura = valorFatura;
		this.dataPgtoFatura = dataPgtoFatura;
		
		
	}
	
	
	public boolean validainadimplencia(Usuario usuario) {
		LocalDate dataatual = LocalDate.now();
		
		if (Period.between(dataatual, this.dataPgtoFatura).getMonths() < 0) {
			return true;
		}
			
		return false;
		
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getValorFatura() {
		return valorFatura;
	}

	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}

	public LocalDate getDataPgtoFatura() {
		return dataPgtoFatura;
	}

	public void setDataPgtoFatura(LocalDate dataPgtoFatura) {
		this.dataPgtoFatura = dataPgtoFatura;
	}
	
	
}
