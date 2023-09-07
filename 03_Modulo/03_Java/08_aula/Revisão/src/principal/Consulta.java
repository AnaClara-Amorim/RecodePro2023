package principal;

import java.util.Date;

public class Consulta {
	
	private int id;
	private Date data;
	private Medico medico;
	private Paciente paciente;
	
	public Consulta(int id, Date data, Medico medico, Paciente paciente) {
		super();
		this.id = id;
		this.data = data;
		this.medico = medico;
		this.paciente = paciente;
	}

	public Consulta() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	} 
	
	public Medico getPaciente() {
		return medico;
	}
	public void setPaciente(Paciente paciente) {
		this.medico = medico;
	} 

	

}
