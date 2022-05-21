package model;

public class Consultas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_consulta")
	@NotNull
	private int codigo;
	
	@Column(name = "nome_consulta")
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
		return "Consultas [codigo=" + codigo + ", nome=" + nome + "]";
	}
		
}
