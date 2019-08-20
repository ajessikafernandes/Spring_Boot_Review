package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.controller.form.TopicoForm;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.CursoRepository;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

	@Autowired
	public TopicoRepository topicosRepository;
	
	@Autowired
	public CursoRepository cursoRepository;

	@GetMapping
	public List<TopicoDto> lista(String nomeCurso) {
		if (nomeCurso == null) {
			List<Topico> topicos = topicosRepository.findAll();
			return TopicoDto.converte(topicos);
		} else {
			List<Topico> topicos = topicosRepository.findByCurso_Nome(nomeCurso);
			return TopicoDto.converte(topicos);
		}
	}

	@PostMapping
	public void cadastrar(@RequestBody TopicoForm form) {
		//Encapsula a logica que recebe um objeto form, e salva como topico(entidade)
		Topico topico = form.converter(cursoRepository);
		topicosRepository.save(topico);
	}
}
