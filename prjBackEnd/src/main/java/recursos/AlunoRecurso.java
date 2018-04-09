package recursos;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import repositorio.AlunoRepositorio;
import dominio.Aluno;

@RestController
@RequestMapping("/aluno")
public class AlunoRecurso {
	
	@Autowired
	private AlunoRepositorio ea;
	
	@GetMapping(produces="application/jason")
	public @ResponseBody Iterable<Aluno> listaAlunos(){
		Iterable<Aluno> listaAlunos = ea.findAll();
		return listaAlunos;
	}
	
	@PostMapping()
	public Aluno cadastraAluno(@RequestBody @Valid Aluno aluno){
		return ea.save(aluno);
	}
	
	@DeleteMapping()
	public Aluno deletaEvento(@RequestBody Aluno aluno){
		ea.delete(aluno);
		return aluno;
	}
}
