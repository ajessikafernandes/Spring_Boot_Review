package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
public class TopicosController {

	@Autowired
	public TopicoRepository topicosrepository;

	@RequestMapping("/topicos")
	public List<TopicoDto> lista(String nomeCurso) {
		if (nomeCurso == null) {
			List<Topico> topicos = topicosrepository.findAll();
			return TopicoDto.converte(topicos);
		} else {
			List<Topico> topicos = topicosrepository.findByCurso_Nome(nomeCurso);
			return TopicoDto.converte(topicos);
		}
	}
}
