package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

public interface CursoRepository extends JpaRepository<Topico, Long> {

	Curso findByNome(String nomeCurso);

}
