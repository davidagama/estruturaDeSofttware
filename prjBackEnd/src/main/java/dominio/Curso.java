package dominio;

public class Curso {

	public String codigo;
	public String nome;
	
	
	//metodos construtores
	public Curso(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	//metodos getters e setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
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
		return "Curso [codigo=" + codigo + ", nome=" + nome + ", getCodigo()=" + getCodigo() + ", getNome()="
				+ getNome() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
}
