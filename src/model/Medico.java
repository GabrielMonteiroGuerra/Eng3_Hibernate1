package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Medico")

public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_medico")
	@NotNull
	private int codigo;
	
	@Column(name = "nome_medico")
	@NotNull
	private String nome;
	
	@Column(name = "endereco_medico")
	@NotNull
	private String endereco;
	
	@Column(name = "contato_medico")
	@NotNull
	private String contato;
	
	@Column(name = "especialidade_medico")
	@NotNull
	private String especialidade;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	@Override
	public String toString() {
		return "Especialidade [codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + ", contato=" + contato
				+ ", especialidade=" + especialidade + "]";
	}
}
