package usuarios;

public class Endereco {
	// criando atributos da classe endereço
	protected String rua;
	protected String complemento;
	protected String bairro;
	protected String cidade;
	protected String pais;
	protected String cep;
	
	//criando um contrutor da classe endereço
	public Endereco(String rua, String complemento, String bairro, String cidade, String pais, String cep) {
		super();
		this.rua = rua;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.pais = pais;
		this.cep = cep;
	}
	//criando os getters e setters

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	

	

}
