package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = paciente)

public class Paciente {
	
	@Id
	@Column(name = "codigo_paciente")
	@NotNull
	private int id;
	
	
	@Column(name = "nome_paciente")
	@NotNull
	private String nome;
	
	@Column(name = "endereco_paciente")
	@NotNull
	private String endereco;
	
	@Column(name = "telefone_paciente")
	@NotNull
	private String telefone;
	
	@Column(name = "num_beneficiario_paciente")
	@NotNull
	private String numben;
	
	
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNumben() {
		return numben;
	}
	public void setNumben(String numben) {
		this.numben = numben;
	}
	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", numben=" + numben
				+ "]";
	}
	
	

}
