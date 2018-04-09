package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import dominio.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, String>{

}
