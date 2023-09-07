package principal;

import java.util.Date;

public class Paciente {

	private int id;
	private String nome;
	private String endereço;
	private String sexo;
	private Date data;
	
	
		public Paciente(int id, String nome, String endereço, String sexo, Date data) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereço = endereço;
		this.sexo = sexo;
		this.data = data;
	}
		
		public Paciente(){
			
		}
		
	public void setId (int value) {
		id = value;
	}
	
	public int getId() {
		return id;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	
	
}
