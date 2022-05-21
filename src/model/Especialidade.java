package model;

@Entity
@Table(name = "Especialidade")

public class Especialidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_especialidade")
	@NotNull
	private int codigo;
	
	@Column(name = "nome_especialidade")
	@NotNull
	private String nome;
	
	
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
	@Override
	public String toString() {
		return "Especialidade [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
	
	
}
