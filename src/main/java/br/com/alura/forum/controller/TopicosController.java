package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

@Controller
public class TopicosController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> lista(){
		Topico topico = new Topico(
				"O que é o Spring Framework?", 
				"O Spring é um framework open source para a plataforma Java criado por Rod Johnson."
				+ " Trata-se de um framework não intrusivo, baseado nos padrões de projeto "
				+ "inversão de controle (IoC) e injeção de dependência.",
				new Curso("Spring Boot","Programação"));
		Topico topico2 = new Topico(
				"O que é MVC?",  
				"É um padrão de arquitetura de software que separa a representação da informação da "
				+ "interação do usuário com ela. As camadas s'ao Model, View e Controller",
				new Curso("Arquitetura de Software","Programação"));
		return Arrays.asList(topico, topico2);
	}
}
