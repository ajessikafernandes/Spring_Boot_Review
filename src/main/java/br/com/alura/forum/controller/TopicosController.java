package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		Topico topico = new Topico(
				"Dúvida sobre o Spring Framework", 
				"O que é o Spring Framework?",
				new Curso("Spring Boot","Programação"));
		Topico topico2 = new Topico(
				"Dúvida sobre MVC?",  
				"O que é o MVC?",
				new Curso("Arquitetura de Software","Programação"));
		return TopicoDto.converte(Arrays.asList(topico, topico2));
	}
}
