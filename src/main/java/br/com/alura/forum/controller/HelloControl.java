package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControl {

	@RequestMapping("/")
	@ResponseBody // para que o spring não pesquise o retorno do metódo abaixo como outra página
	public String hello() {
		return "Hello World using Spring Boot.";
	}
}
