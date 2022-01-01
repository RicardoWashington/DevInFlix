package filmes;

public class Filme {
	
	private String Nome;
	private String Sinopse;
	private String Link;
	private boolean curtiu;
	private GeneroFilme Genero;
	
	public void curtir() {
		if (curtiu) {
			System.out.println("Gostei! --> Que bom que gostou!");
		}else {
			System.out.println("Não Gostei! --> Que pena! Temos outros filmes que vai gostar!");
		}
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSinopse() {
		return Sinopse;
	}
	public void setSinopse(String sinopse) {
		Sinopse = sinopse;
	}
	public String getLink() {
		return Link;
	}
	public void setLink(String link) {
		Link = link;
	}
	public GeneroFilme getGenero() {
		return Genero;
	}
	public void setGenero(GeneroFilme genero) {
		Genero = genero;
	}
	public boolean isCurtiu() {
		return curtiu;
	}
	public void setCurtiu(boolean curtiu) {
		this.curtiu = curtiu;
	}
	
	

}
