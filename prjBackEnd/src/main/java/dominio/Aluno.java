package dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Aluno {	
	
	@Id
	private String matricula;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private EstadoCivil estadoCivil;
	
	@NotBlank
	public Curso curso;
	
	

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aluno(String matricula, String nome, EstadoCivil estadoCivil, Curso curso) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.estadoCivil = estadoCivil;
		this.curso = curso;
	}
	
	
	
	//metodos getters e setters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", estadoCivil=" + estadoCivil + ", curso=" + curso
				+ ", getMatricula()=" + getMatricula() + ", getNome()=" + getNome() + ", getEstadoCivil()="
				+ getEstadoCivil() + ", getCurso()=" + getCurso() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
