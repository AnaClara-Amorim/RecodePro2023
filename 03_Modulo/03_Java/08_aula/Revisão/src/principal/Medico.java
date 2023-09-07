package principal;

public class Medico {

	private String crm;
	private String nome;
	private String endereco;
	
	
	public Medico(String crm, String nome, String endereco) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Medico() {
		
	}

	public void setCrm(String value) {
		crm = value;
	}
	
	public String getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
